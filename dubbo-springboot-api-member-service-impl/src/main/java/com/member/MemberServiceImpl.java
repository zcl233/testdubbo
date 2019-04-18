package com.member;

import com.alibaba.dubbo.config.annotation.Service;
import com.api.member.MemberService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Service
@Component
public class MemberServiceImpl implements MemberService {
    @Value("${dubbo.protocol.port}")
    private String dubboPort;
    @Override
    public String getUser() {
        System.out.println("订单服务调用会员服务");
        return "订单服务调用会员服务"+dubboPort;
    }
}
