package com.spring.core.oop.discount;

import com.spring.core.oop.member.Grade;
import com.spring.core.oop.member.Member;

/**
 * 정액 할인 정책 구현 클래스
 * 책임: VIP 회원에게 고정된 액수의 할인액을 계산해준다.
 */
//DiscountPolicy 를 받아와서 맞춰서 작성해야 함
public class FixDiscountPolicy implements DiscountPolicy {

    //고정 할인액(앞으로 고정 할인액이 변동되면 여기서 수정하면 다른곳도 다 같이 바뀔것임)
    private static final int FIX_AMOUNT = 1000;

    @Override
    public int discount(Member member, int itemPrice) {
        if (member.getGrade() == Grade.VIP) {
            return 1000;
        } else {
            return 0;
        }
    }


}
