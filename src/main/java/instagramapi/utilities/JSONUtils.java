package instagramapi.utilities;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JSONUtils {

    private static String json;

    public JSONUtils(String json){
        JSONUtils.json = json;
    }
    public String get(String item){
        JSONTokener t = new JSONTokener(json);
        JSONObject obj = new JSONObject(t);
        return obj.getString(item);
    }

    public int getInt(String item){
        JSONTokener t = new JSONTokener(json);
        JSONObject obj = new JSONObject(t);
        return obj.getInt(item);
    }
}
