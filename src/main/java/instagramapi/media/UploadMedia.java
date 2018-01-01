package instagramapi.media;

import instagramapi.utilities.Response;

public class UploadMedia {

    private String username;
    private String password;

    public UploadMedia(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void uploadPhoto(String caption, String filedir){
        Response.postPhoto(username, password, caption, filedir);
    }

    public void uploadVideo(String caption, String filedir){
        Response.postPhoto(username, password, caption, filedir);
    }

    public void uploadAlbum(String caption, String filedir){
        Response.postPhoto(username, password, caption, filedir);
    }
}
