
# 스프링 코어 학습
- [스프링프로젝트 생성 사이트](https://start.spring.io)
- [속에 있는 글을 클릭 시 소괄호 링크로 이동](https://start.spring.io)
##lombok 설정
1. build.gradle -> dependencies에 추가
```groovy
//lombok + compileOnly 의 링크를 복사해서 annotation 을 만들어서 넣어줘야 한다.

	// https://mvnrepository.com/artifact/org.projectlombok/lombok
    //lombok 라이브러리 ( 빽팁 세 개 작성 후 파일형태 작성하면 그 문법 사용 가능
	compileOnly 'org.projectlombok:lombok:1.18.12'
	annotationProcessor 'org.projectlombok:lombok:1.18.12'

```
2. 인텔리제이 shift 두 번 눌러서 검색창에 플러그인 검색 후 lombok 플러그인 설치

# 스프링 코어 학습
- [스프링프로젝트 생성 사이트]
- 