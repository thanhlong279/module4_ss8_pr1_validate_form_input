package com.example.pr1_validating_form_input.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class User {
    @NotEmpty
    @Size(min = 2, max = 30)
    private String name;

    @Min(18)
    private int age;

    public User(){}

    public User(@NotEmpty @Size(min = 2, max = 30) String name, @Min(18) int age) {
        this.name = name;
        this.age = age;
    }

    public @NotEmpty @Size(min = 2, max = 30) String getName() {
        return name;
    }

    public void setName(@NotEmpty @Size(min = 2, max = 30) String name) {
        this.name = name;
    }

    @Min(18)
    public int getAge() {
        return age;
    }

    public void setAge(@Min(18) int age) {
        this.age = age;
    }
}
