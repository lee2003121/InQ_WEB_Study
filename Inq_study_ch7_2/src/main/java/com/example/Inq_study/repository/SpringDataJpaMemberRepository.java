package com.example.Inq_study.repository;

import com.example.Inq_study.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member,Long>,MemberRepository {
    @Override
    Optional<Member> findByName(String name);
}
