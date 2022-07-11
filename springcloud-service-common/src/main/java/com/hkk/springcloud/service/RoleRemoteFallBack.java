package com.hkk.springcloud.service;


import org.springframework.stereotype.Component;

@Component
public class RoleRemoteFallBack implements RoleRemoteService{

    @Override
    public Object getRoles(String id) {
        return "服务降级";
    }
}
