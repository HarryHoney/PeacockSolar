package com.example.harpreet.peacocksolar.UtilsClasses;

public class Form {

    String mail_text;
    String mobile_text;
    String address_text;
    String name_text;
    public Form(String mail_text, String mobile_text, String address_text, String name_text) {
        this.mail_text = mail_text;
        this.mobile_text = mobile_text;
        this.address_text = address_text;
        this.name_text = name_text;
    }


    public String getMail_text() {
        return mail_text;
    }

    public void setMail_text(String mail_text) {
        this.mail_text = mail_text;
    }

    public String getMobile_text() {
        return mobile_text;
    }

    public void setMobile_text(String mobile_text) {
        this.mobile_text = mobile_text;
    }

    public String getAddress_text() {
        return address_text;
    }

    public void setAddress_text(String address_text) {
        this.address_text = address_text;
    }

    public String getName_text() {
        return name_text;
    }

    public void setName_text(String name_text) {
        this.name_text = name_text;
    }


}
