package com.spring.core.oop.member;

import lombok.*;

//@Setter 를 통해 필드명(id, name 등이 바뀌면 관련된 부분도 같이 바뀌어서 한번에 이름변경 가능)
@Setter @Getter

@AllArgsConstructor// 모든 필드 초기화 생성자
@NoArgsConstructor
@ToString //주소값 대신 정보가 나오도록.
public class Member {


    //필드에 대해서는 항상 직접접근을 피해야 한다(은닉화) private 이상한 데이터 유입 방지.

    private Long Id; //회원 식별코드
    private String name; //회원명
    //회원등급(String 으로 사용하면 실수로 오타가 나도 알아채기 어려워서 enum 사용 추천: 새파일-열거형)
    private Grade grade = Grade.VIP;    //실수로 vif, 퍄ㅔ 치면 오류 뜬다 ㅎㅎ

    /*
    //private 했으니 setter, getter 만들어야한다. : 자바(커피) 빈즈 규약(커피콩들이니 클래스를 하나하나 커피콩이라고 해서 beans)

        <자바 빈즈 규약> - 자바가 비판받는 이유
        1. 기본 생성자 만들것.
        2. 모든 필드 초기화 생성자.
        3. setter/ getter
        4. hashcode/ toString

        Project Lombok
        원래 외부 라이브러리를 받고싶다면 제공 사이트에 가서 파일을 다운로드하면 라이브러리 작업파일이 나온다.
        단점: 롬복이 패치되면 또 받아야해서... 라이브러리를 수백개 사용하면 관리가 되겠누..

        하지만 우리는 그러지 않을 것임!!
        빌드도구를 사용할거다. build.gradle 파일이 있을거다. 들어가면 (메이븐은 po.M?)
        dependencies(의존파일) 이 적혀있다. : 라이브러리 의존성 관리(코드 지우면 스프링 지워진다..)
        여기에 롬복 넣으면 알아서 관리해준다.

        maven repository 에서 롬복 검색하고, 사용자가 가장 많은 파일 선택하면 파일에 따른 링크 나옴. 우리는 gradle(short)사용
        복사해서 build.gradle 파일에 넣으면 된다. 우측상단에 코끼리 새로고침 눌러서 다운로드 시작.
        설치 완료되면 우측 상단에 gradle 창에서 dependencies - compileClasspath 에 롬복 깔림
        shift + shift 에서 플러그인 - 마켓 플레이스 들어가서 롬복 또 설치 해야한다.


        src - test 폴더가 테스트할 수 있는 폴더. 굳이 메인메서드 안만들어도 된다.
        멤버 메서드 이름에서 ctrl shift t -> 새 테스트 생성시 생김
     */



}
