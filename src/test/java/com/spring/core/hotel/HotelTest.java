package com.spring.core.hotel;

import com.spring.core.config.HotelConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class HotelTest {

    @Test
    @DisplayName("호텔 예약 테스트가 성공해야 한다.(단언)")
    void reserveTest() {
//nullPointException : 객체의 주소값을 못 찾아서 접근을 못 하는 오류. restaurant 가 현재 null 이어서 오류가 뜸
//        Hotel hotel = new Hotel(restaurant);
//        hotel.reserve();

        //여기서는 spring.io에 포함된거 써야함
        ApplicationContext ct = new AnnotationConfigApplicationContext(HotelConfig.class);
        Hotel hotel = ct.getBean(Hotel.class);
        hotel.reserve();

    }
}