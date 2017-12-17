import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class URLReader {
    public static void main(String[] args) throws Exception {
        String APPID = "5496614f4ca95e6dcc0445c1e7f3916d";
        String URL = "http://api.openweathermap.org/data/2.5/weather";

        //change city here:
        String city = "Lviv";

        HashMap<String, String> params = new HashMap<>();
        params.put("q", city);
        params.put("APPID", APPID);

        URL weather = new URL(URL + "?" + "q=" + params.get("q") + "&" + "APPID=" + params.get("APPID"));
        BufferedReader in = new BufferedReader(
                new InputStreamReader(weather.openStream()));

        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(in.readLine());
        in.close();

        JSONObject json_weather = (JSONObject) ((ArrayList) json.get("weather")).get(0);
        System.out.format("description: %s \n", json_weather.get("description"));


        double temp = (double)((JSONObject) json.get("main")).get("temp");
        double tempCelsius = temp - 273.15;
        System.out.format("temperature in Kelvin: %.2f \n", temp);
        System.out.format("temperature in Celsius: %.2f \n", tempCelsius);
    }
}
