package com.spring.core.hotel;

import org.springframework.stereotype.Component;

//이 클래스를 스프링 컨테이너에 등록한다.
@Component("cr")
public class ChineseRestaurant implements Restaurant{

    private final Chef chef;

    public ChineseRestaurant(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void orderDinner() {
        System.out.println("중국요리를 주문합니다.");

    }
}
