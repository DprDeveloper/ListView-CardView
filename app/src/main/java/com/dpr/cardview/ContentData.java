package com.dpr.cardview;

/**
 * Created by jjimenez on 07/07/2015.
 */
public class ContentData {
    String title;
    String description;

    public ContentData(String title,String content){
        this.title=title;
        this.description=content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getdescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
