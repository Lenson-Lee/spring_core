package com.spring.core.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//이 클래스를 스프링 컨테이너에 등록한다.    (~를 쓸거다)
@Component
public class Hotel {

    private final Restaurant restaurant;  //alt enter 인터페이스 생성했다, final: 불변값을 줌으로써 restaurant 의 null 오류를 수정

    //final 작성 후 생성자 매개변수 추가 - 리팩터링
    //@Component 에서  restaurant 가 french 와 chinese 두 개에 연관되서 무엇을 선택해야할 지 몰라서 bean defined 상속 오류가 뜬다.
    //컴포넌트 등록을 할 때(8번줄) @Component("cr")이라고 별칭을 붙여두면 hotel 에서 "cr" 쓰면 된다.

    @Autowired
    public Hotel(@Qualifier("cr") Restaurant restaurant) {
        System.out.println("호텔 생성자 호출");
        this.restaurant = restaurant;
    }

    public void reserve() {
        System.out.println("레스토랑을 예약합니다.");
        restaurant.orderDinner();
    }


}
