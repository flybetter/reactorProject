package com.michael.reactorProject.Enum;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

public enum SexEnum {

    MALE(0,"男"),FEMALE(1,"女");

    private int code;

    private String name;

    SexEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static SexEnum getSexEnum(int code){

        SexEnum  sexEnum=Arrays.stream(SexEnum.values()).filter(nums -> nums.getCode()==code).findFirst().orElse(null);
        return sexEnum;
    }


}
