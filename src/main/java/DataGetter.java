import org.json.simple.JSONObject;

import java.util.ArrayList;

public class DataGetter {
    public Object getDescription(JSONObject json) {
        JSONObject json_weather = (JSONObject) ((ArrayList) json.get("weather")).get(0);
        return json_weather.get("description");

    }
    public double getTempKelvin(JSONObject json) {
        double temp = (double)((JSONObject) json.get("main")).get("temp");
        return temp;

    }
    public double getTempCelsius(JSONObject json) {
        double tempCelsius = getTempKelvin(json) - 273.15;
        return tempCelsius;
    }
}
