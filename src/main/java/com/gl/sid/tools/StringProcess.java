package com.gl.sid.tools;

public class StringProcess {
    public  String capitalize(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    /*
    public String replaceWordsStartWithDollar(String s, String[] args){
        String d = s;
        for (String arg : args) {
            d = d.replaceFirst("\\$", arg);
        }
        return d;
    }
    */
}
