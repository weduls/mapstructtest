package com.wedul.mapstructtest.mapper;

import com.wedul.mapstructtest.dto.AccountResponse;
import com.wedul.mapstructtest.entity.AccountEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {
        AccountImageMapper.class
})
public interface AccountMapper {

    @Mapping(source = "address", target = "location")
    @Mapping(source = "homeTel", target = "homeNumber")
    AccountResponse domainToEntity(AccountEntity accountEntity);

}
