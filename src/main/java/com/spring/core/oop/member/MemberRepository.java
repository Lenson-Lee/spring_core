package com.spring.core.oop.member;

//역할 : 회원 정보를 저장해야 하는 책임이 있다.
public interface MemberRepository {

    //회원 가입 기능
    void save(Member member);

    //회원 조회 기능
    Member findById(Long id);




}
