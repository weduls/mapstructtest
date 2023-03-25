package com.wedul.mapstructtest.mapper;

import com.wedul.mapstructtest.dto.AccountResponse;
import com.wedul.mapstructtest.dto.AccountResponseImage;
import com.wedul.mapstructtest.entity.AccountEntity;
import com.wedul.mapstructtest.entity.AccountImage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AccountImageMapper {

    @Mapping(source = "name", target = "imageName")
    AccountResponseImage domainToEntity(AccountImage accountEntity);

}
