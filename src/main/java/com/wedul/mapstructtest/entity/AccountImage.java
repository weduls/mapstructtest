package com.wedul.mapstructtest.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
public class AccountImage {

    private long id;
    private String path;
    private String name;

    @Builder
    public AccountImage(long id, String path, String name) {
        this.id = id;
        this.path = path;
        this.name = name;
    }
}
