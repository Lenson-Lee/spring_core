package com.spring.core.hotel;

import org.springframework.stereotype.Component;

//이 클래스를 스프링 컨테이너에 등록한다.
@Component
public class FrenchRestaurant implements Restaurant{

    private final Chef chef;

    //Chef 에 final 이 붙음으로써 생성자 매개변수 추가
    public FrenchRestaurant(Chef chef) {
        this.chef = chef;
        System.out.println("레스토랑 생성자 호출!");
    }

    @Override
    public void orderDinner() {
        System.out.println("저녁식사는 프랑스요리로 주문합니다.");
        chef.cook();


    }
}
