package com.wedul.mapstructtest;

import com.wedul.mapstructtest.dto.AccountResponse;
import com.wedul.mapstructtest.dto.AccountResponseImage;
import com.wedul.mapstructtest.entity.AccountEntity;
import com.wedul.mapstructtest.entity.AccountImage;
import com.wedul.mapstructtest.mapper.AccountMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class AccountResponseMappingIntegrationTest {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    void shouldAccountMappingTest() {
        // given
        List<AccountImage> imageEntities = List.of(AccountImage.builder()
                        .id(1L)
                        .path("path1")
                        .name("image1")
                        .build(),
                AccountImage.builder()
                        .id(2L)
                        .path("path2")
                        .name("image2")
                        .build());
        AccountEntity accountEntity = AccountEntity.builder()
                .age(10)
                .name("wedul")
                .address("seoul")
                .homeTel("02-1111-1111")
                .images(imageEntities)
                .build();

        // when
        AccountResponse response = accountMapper.domainToEntity(accountEntity);

        // then
        AccountResponse expected = AccountResponse.builder()
                .age(accountEntity.getAge())
                .homeNumber(accountEntity.getHomeTel())
                .location(accountEntity.getAddress())
                .name(accountEntity.getName())
                .images(imageEntities.stream().map(d -> AccountResponseImage.builder()
                        .path(d.getPath())
                        .imageName(d.getName())
                        .id(d.getId())
                        .build()).collect(Collectors.toList()))
                .build();
        assertThat(response).usingRecursiveComparison().isEqualTo(expected);
    }


}
