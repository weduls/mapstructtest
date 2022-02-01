package com.wedul.mapstructtest.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
public class AccountEntity {

    private String name;
    private int age;
    private String address;
    private String homeTel;

    @Builder
    public AccountEntity(String name, int age, String address, String homeTel) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.homeTel = homeTel;
    }
}
