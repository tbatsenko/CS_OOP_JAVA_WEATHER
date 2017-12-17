import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.net.*;
import java.io.*;


class URLReader {
    JSONObject getJsonFromURL(URL url) throws IOException, ParseException {
        BufferedReader in = new BufferedReader(
                new InputStreamReader(url.openStream()));

        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(in.readLine());
        in.close();

        return json;
    }
}
