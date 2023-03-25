package com.wedul.mapstructtest.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class AccountResponseImage {

    private long id;
    private String path;
    private String imageName;

    @Builder
    public AccountResponseImage(long id, String path, String imageName) {
        this.id = id;
        this.path = path;
        this.imageName = imageName;
    }
}
