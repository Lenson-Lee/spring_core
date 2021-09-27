package com.spring.core.quiz;

import org.springframework.stereotype.Component;

@Component
public class HpKeyboard implements KeyBoard{
    @Override
    public void info() {
        System.out.println("HP의 키보드 입니다.");
    }

}
