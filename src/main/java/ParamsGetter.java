import java.util.HashMap;

class ParamsGetter {
    private String city = "";

    private String getAPPID() {
        return "5496614f4ca95e6dcc0445c1e7f3916d";
    }

    String getCity() {
        return city;
    }

    void setCity(String city) {
        this.city = city;
    }

    String getURL() {
        return "http://api.openweathermap.org/data/2.5/weather";

    }

    HashMap<String, String> getParams(){
        HashMap<String, String> params = new HashMap<>();
        params.put("q", this.getCity());
        params.put("APPID", this.getAPPID());
        return params;
    }




}
