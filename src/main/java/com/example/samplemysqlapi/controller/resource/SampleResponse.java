package com.example.samplemysqlapi.controller.resource;

import com.example.samplemysqlapi.mapper.entity.UsersEntity;
import lombok.Value;

@Value
public class SampleResponse {
    private Integer userId;
    private String userName;

    public static SampleResponse create(UsersEntity entity) {
        return new SampleResponse(
                entity.getUserId(),
                entity.getUserName()
        );
    }
}
