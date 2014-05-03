package com.fullwish.mode;

import java.lang.String;

/**
 * Created by ok on 14-5-2.
 */
public class MyObject {
    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

//    public MyObject(String first) {
//        this.first = first;
//    }

    private String first;

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public MyObject(String first, String extra) {
        this.first = first;
        this.extra = extra;
    }

    private String extra;
}