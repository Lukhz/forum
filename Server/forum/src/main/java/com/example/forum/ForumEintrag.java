package com.example.forum;

import java.util.List;

public class ForumEintrag {
    
    int id;
    String betreff;
    String text;
    List<String> comments;

    ForumEintrag(){}

    ForumEintrag(int id, String betreff, String text){
        this.id=id;
        this.betreff=betreff;
        this.text=text;
    }
    ForumEintrag(String betreff, String text){
        this.betreff=betreff;
        this.text=text;
    }

    
    @Override
    public String toString() {
        String result = "id=" + id + " betreff=" + betreff + " text=" + text;
        return result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBetreff() {
        return betreff;
    }

    public void setBetreff(String betreff) {
        this.betreff = betreff;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }
}
