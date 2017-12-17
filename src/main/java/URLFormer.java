import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class URLFormer {
    public URL getWeatherURL(ParamsGetter pg, HashMap<String, String> params) throws MalformedURLException {
        return new URL(pg.getURL() + "?" + "q=" + params.get("q") + "&" + "APPID=" + params.get("APPID"));
    }
}
