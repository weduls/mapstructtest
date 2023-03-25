package com.wedul.mapstructtest.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class AccountResponse {

    private final String name;
    private final int age;
    private final String location;
    private final String homeNumber;
    private final List<AccountResponseImage> images;

    @Builder
    public AccountResponse(String name, int age, String location, String homeNumber, List<AccountResponseImage> images) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.homeNumber = homeNumber;
        this.images = images;
    }
}
