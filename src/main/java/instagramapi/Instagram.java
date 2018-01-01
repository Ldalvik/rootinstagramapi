package instagramapi;

import instagramapi.account.Account;
import instagramapi.account.EditAccount;
import instagramapi.media.EditPosts;
import instagramapi.media.UploadMedia;
import instagramapi.media.Posts;

public class Instagram {

    private String username;
    private String password;

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

    public UploadMedia uploadMedia(){
        return new UploadMedia(username, password);
    }
}
