package com.example.t027_api;

public class Model {
    int id , userId ;
    String Title , PostDesc ;

    public Model() {
    }

    public Model(int id, int userId, String title, String postDesc) {
        this.id = id;
        this.userId = userId;
        Title = title;
        this.PostDesc = postDesc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPostDesc() {
        return PostDesc;
    }

    public void setPostDesc(String postDesc) {
        PostDesc = postDesc;
    }

}
