package com.gl.sid.entity;

public interface Mainterface {
    String message ="Hello";
    static void print(){
        System.out.println(message);
    }
    default void print2(){}
    
}
