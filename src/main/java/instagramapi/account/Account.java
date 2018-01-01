package instagramapi.account;

import instagramapi.utilities.JSONUtils;
import instagramapi.utilities.Response;

public class Account {

    private JSONUtils u;
    private String json;

    public Account(String username, String password){
        json = Response.Response("account/", username, password);
        u = new JSONUtils(json);
    }

    public String getBiography(){
        return u.get("biography");
    }

    public String getEmail(){
        return u.get("email");
    }

    public String getName(){
        return u.get("full_name");
    }

    public String getPhone(){
        return u.get("phone_number");
    }

    public String getUrl(){
        return u.get("external_url");
    }

    public int getGender(){
        return u.getInt("gender");
    }

    @Override
    public String toString(){
        return json;
    }
}
