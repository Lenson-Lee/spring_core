package com.spring.core.quiz;

import org.springframework.stereotype.Component;

@Component
public class LogitecMouse implements Mouse{

    @Override
    public void info() {
        System.out.println("로지텍 마우스 입니다.");
    }
}

//키보드 모니터도 구현하고 컴퓨터에서 ctr shift T 테스트 만들고