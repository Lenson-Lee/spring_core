package com.spring.core.oop.member;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    //테스트 메서드 생성시에는 @Test 꼭 붙여야 한다.
    @Test
    void lombokTest() {
        //@AllArgsConstructor// 모든 필드 초기화 생성자 만들어서 기본생성자가 사라지니 NoArgsConstructor 도 만들어야 한다.
        Member member = new Member(1L, "철수", Grade.VIP);
        member.setId(1L);
        member.getGrade();

        new Member();

        System.out.println("=============================");
        System.out.println(member);

    }

}