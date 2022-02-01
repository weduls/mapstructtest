package com.wedul.mapstructtest;

import com.wedul.mapstructtest.dto.Account;
import com.wedul.mapstructtest.entity.AccountEntity;
import com.wedul.mapstructtest.mapper.AccountMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class AccountMappingIntegrationTest {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    void shouldAccountMappingTest() {
        // given
        AccountEntity accountEntity = AccountEntity.builder()
                .age(10)
                .name("wedul")
                .build();

        // when
        Account account = accountMapper.domainToEntity(accountEntity);

        // then
        assertThat(account.getAge()).isEqualTo(accountEntity.getAge());
        assertThat(account.getName()).isEqualTo(accountEntity.getName());
        assertThat(account.getHomeNumber()).isEqualTo(accountEntity.getHomeTel());
        assertThat(account.getLocation()).isEqualTo(accountEntity.getAddress());
    }


}
