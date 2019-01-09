package com.hk3t.model;

import org.springframework.stereotype.Component;

import javax.validation.constraints.*;

@Component
public class User {
    @NotEmpty
    @Size(min = 2, max = 45)
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 45)
    private String lastName;

    @NotEmpty
    @Size(min = 10, max = 11)
    @Pattern(regexp = "^0[0-9]{9,10}$")
    private String phoneNumber;

    @NotNull
    @Min(18)
    private int age;

    @Email
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
