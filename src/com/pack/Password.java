package com.pack;

public class Password {
    private String value = new String();
    private Integer attempts;

    Password(String value, Integer attempts){
        this.value = value;
        this.attempts = attempts;
    }

    public String getValue(){
        return this.value;
    }

    public Integer getAttempts(){
        return this.attempts;
    }
}
