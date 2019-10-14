package com.example.samplemysqlapi.mapper;

import com.example.samplemysqlapi.mapper.entity.UsersEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UsersMapper {
    List<UsersEntity> findUserList();
}
