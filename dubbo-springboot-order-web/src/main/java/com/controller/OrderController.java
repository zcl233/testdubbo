package com.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.api.member.MemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Reference
    private MemberService memberService;
    @RequestMapping("/order")
    public String orderToMember(){
        return memberService.getUser();
    }
}
