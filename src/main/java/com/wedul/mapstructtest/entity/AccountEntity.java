package com.wedul.mapstructtest.entity;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class AccountEntity {

    private String name;
    private int age;
    private String address;
    private String homeTel;
    private List<AccountImage> images;

    @Builder
    public AccountEntity(String name, int age, String address, String homeTel, List<AccountImage> images) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.homeTel = homeTel;
        this.images = images;
    }
}
