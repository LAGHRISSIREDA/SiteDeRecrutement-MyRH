package com.codesigne.myrh.responses;

public class RecruterResponse {
    private String recruterId;
    private String adress;
    private String email;
    private String phone;
    private String picture;

    //getters and setters -----------------------------


    public String getRecruterId() {
        return recruterId;
    }

    public void setRecruterId(String recruterId) {
        this.recruterId = recruterId;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
