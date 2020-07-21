package com.inspur.cloud.entity;



public class Application {
    private String name;
    private int img_id;

    public Application(String name, int img_id){
        this.img_id = img_id;
        this.name = name;
    }
    public void setImg_id(int img_id) {
        this.img_id = img_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg_id() {
        return img_id;
    }

    public String getName() {
        return name;
    }
}
