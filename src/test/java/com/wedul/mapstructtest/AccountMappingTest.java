package com.wedul.mapstructtest;

import com.wedul.mapstructtest.dto.Account;
import com.wedul.mapstructtest.entity.AccountEntity;
import com.wedul.mapstructtest.mapper.AccountMapper;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountMappingTest {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    @Test
    void shouldAccountMappingTest() {
        // given
        AccountEntity accountEntity = AccountEntity.builder()
                .age(10)
                .name("wedul")
                .build();

        // when
        Account account = INSTANCE.domainToEntity(accountEntity);

        // then
        assertThat(account.getAge()).isEqualTo(accountEntity.getAge());
        assertThat(account.getName()).isEqualTo(accountEntity.getName());
        assertThat(account.getHomeNumber()).isEqualTo(accountEntity.getHomeTel());
        assertThat(account.getLocation()).isEqualTo(accountEntity.getAddress());
    }
}
