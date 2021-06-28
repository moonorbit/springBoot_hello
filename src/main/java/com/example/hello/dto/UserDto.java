package com.example.hello.dto;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL) // null 값 제외
public class UserDto {
    private String name;
    private Integer age;
=======
public class UserDto {
    private String name;
    private int age;
>>>>>>> 70ec1761363035f2dfb68fff0e51417a006af997
    private String phoneNumber;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

<<<<<<< HEAD
    public Integer getAge() {
=======
    public int getAge() {
>>>>>>> 70ec1761363035f2dfb68fff0e51417a006af997
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
<<<<<<< HEAD

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
=======
>>>>>>> 70ec1761363035f2dfb68fff0e51417a006af997
}
