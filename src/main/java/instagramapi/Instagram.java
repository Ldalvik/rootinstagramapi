package instagramapi;

import instagramapi.edit.EditAccount;
import instagramapi.edit.EditPosts;

public class Instagram {

    private static String username;
    private static String password;

    public Instagram(){

    }

    public Instagram username(String username){
        this.username = username;
        return this;
    }

    public Instagram password(String password){
        this.password = password;
        return this;
    }

    public Account getAccount(){
        return new Account(username, password);
    }

    public EditAccount editAccount(){
        return new EditAccount(username, password);
    }

    public Posts getPosts(){
        return new Posts(username, password);
    }

    public EditPosts editPosts(){
        return new EditPosts(username, password);
    }
}
