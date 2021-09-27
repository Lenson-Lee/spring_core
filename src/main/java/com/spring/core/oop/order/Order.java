package com.spring.core.oop.order;

//주문 정보 객체

import lombok.*;
//롬복 라이브러리. @S만 쳐도 나옴
@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {

    //사실 얘네도 인터페이스 해야하는데 스케일이 커지니 그냥 하겠음
    private Long memberId; //주문한 회원 아이디
    private String itemName; //상품명
    private int itemPrice; //상품 금액
    private int discountPrice; //할인액


}
