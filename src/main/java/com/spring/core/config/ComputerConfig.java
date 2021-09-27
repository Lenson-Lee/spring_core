package com.spring.core.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//스프링의 객체 설정 파일로 지정(호텔 관련된 정보/객체들 관리)
@Configuration
//객체 생성시 탐색할 패키지의 경로
@ComponentScan(basePackages = "com.spring.core")
public class ComputerConfig {
}
