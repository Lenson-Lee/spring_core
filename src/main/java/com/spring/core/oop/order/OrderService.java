package com.spring.core.oop.order;

//역할: 적당한 회원저장소에서 회원 정보를 조회한 후
//      회원등급에 따라 적당한 할인정책을 적용한 주문정보을 생성하는 책임.

import com.spring.core.oop.discount.DiscountPolicy;
import com.spring.core.oop.member.Member;
import com.spring.core.oop.member.MemberRepository;

public class OrderService {

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;  //만약 아직 구현이 되지 않은 기능이라도 추후에 외부에서 넣어줄거라 일단 만들기가 가능함

    public  OrderService(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
       //memberRepository = new MemoryMemberRepository();
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;   //불변값 final 로 만들어서 해결
    }

    //주문 기능
    public Order createOrder(Long id, String itemName, int price) {
        Member member = memberRepository.findById(id);
        //Grade grade = member.getGrade();
        int discount = discountPolicy.discount(member, price);  //강사님 DiscountPolicy.discount 가 static 인지 확인하기  => 인터페이스에서는 static 쓰느거 아니다. 타입 DiscountPolicy 에 접근해야 static 쓰는거고 여기서는 discou ~
        //주문생성할인 적용     ~~어쩌고저쩌고 대충 이런식으로 코드가 짜여지겠지~~?
        Order order = new Order(id, itemName, price, discount);
        return order;


    }


}
