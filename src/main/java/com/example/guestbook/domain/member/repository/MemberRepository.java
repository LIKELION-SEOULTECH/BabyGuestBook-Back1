package com.example.guestbook.domain.member.repository;

import com.example.guestbook.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface MemberRepository extends JpaRepository<Member, Long> {
     Optional<Member> findByEmail(String email);
}
