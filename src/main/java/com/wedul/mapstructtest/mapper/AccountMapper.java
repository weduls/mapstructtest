package com.wedul.mapstructtest.mapper;

import com.wedul.mapstructtest.dto.Account;
import com.wedul.mapstructtest.entity.AccountEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    @Mapping(source = "address", target = "location")
    @Mapping(source = "homeTel", target = "homeNumber")
    Account domainToEntity(AccountEntity accountEntity);

}
