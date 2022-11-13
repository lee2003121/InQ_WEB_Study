package com.example.Inq_study;

import com.example.Inq_study.repository.JdbcMemberRepository;
import com.example.Inq_study.repository.JdbcTemplateMemberRepository;
import com.example.Inq_study.repository.MemberRepository;
import com.example.Inq_study.repository.MemoryMemberRepository;
import com.example.Inq_study.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {


    private DataSource dataSource;

    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        //return new MemoryMemberRepository();
        //return new JdbcMemberRepository(dataSource);
        return new JdbcTemplateMemberRepository(dataSource);
    }
}
