package com.wedul.mapstructtest.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Account {

    private final String name;
    private final int age;
    private final String location;
    private final String homeNumber;

    @Builder
    public Account(String name, int age, String location, String homeNumber) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.homeNumber = homeNumber;
    }
}
