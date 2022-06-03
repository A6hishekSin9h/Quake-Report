package com.example.android.quakereport;

public class Earthquake {

    private Double mMagnitude;
    private String mLocation;
    private Long mDate;
    private String mUrl;
    Earthquake(Double magnitude, String location, Long date, String url){
        mMagnitude=magnitude;
        mLocation=location;
        mDate=date;
        mUrl=url;
    }

    public Double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }
}
