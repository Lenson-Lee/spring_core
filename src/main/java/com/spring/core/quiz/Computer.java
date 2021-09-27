package com.spring.core.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private final KeyBoard keyBoard;
    private final Mouse mouse;
    private final Monitor monitor;

    //생성자
    @Autowired  //( 속이 ) 필드에서 전부 final 일 때 생략 가능. 근데 나중에 실무에서 가시적 효과를 위해서나 나중에 써야 하는 경우도 있을 수 있어서 넣는게 좋다.
    public Computer(KeyBoard keyBoard, Mouse mouse, Monitor monitor) {
        this.keyBoard = keyBoard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    //부품 정보를 보여주는 메서드
    public void showParts() {
        keyBoard.info();
        monitor.info();
        mouse.info();
    }


}
