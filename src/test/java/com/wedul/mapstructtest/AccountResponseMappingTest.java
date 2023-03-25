package com.wedul.mapstructtest;

import com.wedul.mapstructtest.dto.AccountResponse;
import com.wedul.mapstructtest.entity.AccountEntity;
import com.wedul.mapstructtest.mapper.AccountMapper;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountResponseMappingTest {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    @Test
    void shouldAccountMappingTest() {
        // given
        AccountEntity accountEntity = AccountEntity.builder()
                .age(10)
                .name("wedul")
                .build();

        // when
        AccountResponse accountResponse = INSTANCE.domainToEntity(accountEntity);

        // then
        assertThat(accountResponse.getAge()).isEqualTo(accountEntity.getAge());
        assertThat(accountResponse.getName()).isEqualTo(accountEntity.getName());
        assertThat(accountResponse.getHomeNumber()).isEqualTo(accountEntity.getHomeTel());
        assertThat(accountResponse.getLocation()).isEqualTo(accountEntity.getAddress());
    }
}
