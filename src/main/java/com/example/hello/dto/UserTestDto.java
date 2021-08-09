package com.example.hello.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserTestDto {
    private String name;
    private int age;
    @JsonProperty("phone_number")
    private String phoneNumber;

    public UserTestDto() {
        this.name = null;
        this.age = 0;
        this.phoneNumber = null;
    }

    public UserTestDto(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /*public UserTestDto getDefaultUser() {
        return new UserTestDto("dafult", 0);
    }*/

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "UserTestDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
