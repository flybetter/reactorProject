package com.michael.reactorProject.entity;

import com.michael.reactorProject.Enum.SexEnum;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document
public class User implements Serializable {

    private Long id;
    private SexEnum sexEnum;
    @Field("user_name")
    private String userName;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SexEnum getSexEnum() {
        return sexEnum;
    }

    public void setSexEnum(SexEnum sexEnum) {
        this.sexEnum = sexEnum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
