package com.example.anwar.myrecyclerview;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

public class President implements Parcelable {
    private String name, remarks, photo, date, height, deskripsi, wafat;

    protected President(Parcel in) {
        name = in.readString();
        remarks = in.readString();
        photo = in.readString();
        date = in.readString();
        height = in.readString();
        wafat = in.readString();

    }


    public static final Creator<President> CREATOR = new Creator<President>() {
        @Override
        public President createFromParcel(Parcel in) {
            return new President(in);
        }

        @Override
        public President[] newArray(int size) {
            return new President[size];
        }
    };

    public President() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWafat(){
        return wafat;
    }

    public void setWafat(String wafat){
        this.wafat = wafat;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(remarks);
        dest.writeString(photo);
        dest.writeString(date);
        dest.writeString(height);
        dest.writeString(wafat);
    }
}
