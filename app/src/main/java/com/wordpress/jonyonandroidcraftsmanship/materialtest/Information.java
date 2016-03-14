package com.wordpress.jonyonandroidcraftsmanship.materialtest;

public class Information {
    private int iconId=0;
    private String title=null;

    public Information(String title, int iconId) {
        this.title = title;
        this.iconId = iconId;
    }

    public int getIconId() {
        return iconId;
    }

    public String getTitle() {
        return title;
    }
}
