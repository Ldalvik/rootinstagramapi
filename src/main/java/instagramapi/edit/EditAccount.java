package instagramapi.edit;

import instagramapi.Instagram;
import instagramapi.JSONUtils;
import instagramapi.Response;
import org.json.JSONObject;

public class EditAccount {

    private JSONObject obj;
    private String username;
    private String password;

    public EditAccount(String username, String password){
        this.username = username;
        this.password = password;
        Instagram i = new Instagram()
                .username(username)
                .password(password);

       String url = i.getAccount().getUrl();
       String phone = i.getAccount().getPhone();
       String name = i.getAccount().getName();
       String biography = i.getAccount().getBiography();
       String email = i.getAccount().getEmail();
       int gender = i.getAccount().getGender();

        obj.put("url", url);
        obj.put("phone", phone);
        obj.put("name", name);
        obj.put("biography", biography);
        obj.put("email", email);
        obj.put("gender", gender);
    }

    public void setUrl(String url){
        obj.put("url", url);
        Response.Response("account/edit/profile/", username, password, obj.toString());
    }

    public void setPhone(String phone){
        obj.put("phone", phone);
        Response.Response("account/edit/profile/", username, password, obj.toString());
    }

    public void setName(String name) {
        obj.put("name", name);
        Response.Response("account/edit/profile/", username, password, obj.toString());
    }

    public void setBiography(String biography){
        obj.put("biography", biography);
        Response.Response("account/edit/profile/", username, password, obj.toString());
    }

    public void setEmail(String email){
        obj.put("email", email);
        Response.Response("account/edit/profile/", username, password, obj.toString());
    }

    public void setGender(int gender){
        obj.put("gender", gender);
        Response.Response("account/edit/profile/", username, password, obj.toString());
    }
}
