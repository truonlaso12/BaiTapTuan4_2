package com.phuoctruong.bai4;

public class Item {
   public String theLoai;
   public Integer image;

    public Item(String theLoai, Integer image) {
        this.theLoai = theLoai;
        this.image = image;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
