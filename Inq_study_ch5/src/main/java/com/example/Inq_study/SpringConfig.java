package com.example.Inq_study;

import com.example.Inq_study.repository.MemberRepository;
import com.example.Inq_study.repository.MemoryMemberRepository;
import com.example.Inq_study.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
