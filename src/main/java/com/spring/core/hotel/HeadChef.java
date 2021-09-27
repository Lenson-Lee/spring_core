package com.spring.core.hotel;

import org.springframework.stereotype.Component;

//이 클래스를 스프링 컨테이너에 등록한다.
@Component
public class HeadChef implements Chef{
    @Override
    public void cook() {
        System.out.println("선임 주방장이 요리합니다.");
    }
}
