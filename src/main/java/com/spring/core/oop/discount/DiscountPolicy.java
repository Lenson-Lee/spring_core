package com.spring.core.oop.discount;

import com.spring.core.oop.member.Member;

//역할: VIP 회원에게 할인을 적용해줘야 한다. (ex: 정액할인, 정률할인)
public interface DiscountPolicy {

    /*
     * <항상 이런식으로 설명을 적어주면서 작업해야 한다.>
     * 할인 정책별 할인액을 계산해주는 기능
     * @param member - 할인 대상 회원정보(여기서 등급을 확인할 수 있음)
     * @param itemPrice - 할인 전 구매 금액
     * @return itemPrice 에서 등급별 혜택을 적용한 총 할인액
     */

 int discount(Member member, int itemPrice);

}
