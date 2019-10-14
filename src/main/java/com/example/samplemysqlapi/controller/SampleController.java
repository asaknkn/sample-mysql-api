package com.example.samplemysqlapi.controller;

import com.example.samplemysqlapi.controller.resource.SampleResponse;
import com.example.samplemysqlapi.mapper.UsersMapper;
import com.example.samplemysqlapi.mapper.entity.UsersEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class SampleController {
    private final UsersMapper usersMapper;

    @GetMapping("/get/sample")
    public List<SampleResponse> getSample() {
        List<UsersEntity> usersEntityList = usersMapper.findUserList();
        return usersEntityList.stream().map(SampleResponse::create).collect(Collectors.toList());
    }
}
