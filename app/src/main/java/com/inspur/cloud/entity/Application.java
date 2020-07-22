package com.inspur.cloud.entity;



public class Application {
    private String name;
    private int img_id;
    private String detail;
    private boolean flag;

    public Application(String name, int img_id){
        this.img_id = img_id;
        this.name = name;
    }
    public Application(String name, int img_id, String detail, boolean flag){
        this.name = name;
        this.img_id = img_id;
        this.detail = detail;
        this.flag = flag;
    }
    public void setImg_id(int img_id) {
        this.img_id = img_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getImg_id() {
        return img_id;
    }

    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }

    public boolean isAdded() {
        return flag;
    }
}
