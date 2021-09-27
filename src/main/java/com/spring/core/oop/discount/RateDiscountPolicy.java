package com.spring.core.oop.discount;

import com.spring.core.oop.member.Grade;
import com.spring.core.oop.member.Member;

/**
 * 정률 할인 정책
 * 책임: VIP 회원에게 정해진 비율만큼 할인액을 적용
 */
public class RateDiscountPolicy implements DiscountPolicy {

    //Assertion: 단언하다. => 프로그램에서 글을 쓸 때는 단언해야한다. (VIP 정도의 회원에게 ~해줄까, ~할 것이다, ~일지도 모른다 등 설명할때 애매하면 안된다.)

    //할인율
    private static final double DISCOUNT_RATE = 0.2; //20%할인

    @Override
    public int discount(Member member, int itemPrice) {
        if (member.getGrade() == Grade.VIP) {
            return (int) (itemPrice * DISCOUNT_RATE);   //int * double = double 이어서 그냥 쓰면 오류가 난다. 인터페이스가 int 여서 int 로 캐스팅(int 로 형변환)이 필요함.
        } else {
            return 0;
        }
    }


}
