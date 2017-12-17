import org.json.simple.JSONObject;

import java.net.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ParamsGetter paramsGetter = new ParamsGetter();
        URLFormer urlFormer = new URLFormer();
        DataGetter dataGetter = new DataGetter();
        URLReader urlReader = new URLReader();

        paramsGetter.setCity("Lviv");

        URL weatherURL = urlFormer.getWeatherURL(paramsGetter, paramsGetter.getParams());

        JSONObject weatherJson = urlReader.getJsonFromURL(weatherURL);

        System.out.format("Weather data for %s:\n", paramsGetter.getCity());
        System.out.format("    description: %s \n", dataGetter.getDescription(weatherJson));
        System.out.format("    temperature in Kelvin: %.2f \n", dataGetter.getTempKelvin(weatherJson));
        System.out.format("    temperature in Celsius: %.2f \n", dataGetter.getTempCelsius(weatherJson));
    }
}
