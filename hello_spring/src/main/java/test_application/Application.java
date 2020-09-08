package test_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplicaion 어노테이션으로 설정된 클래스는 반드시 프로젝트의 최상단에 위치하여야 한다.
@SpringBootApplication // 스프링 부트를 자동으로 설정하기 위해 사용 (해당 위치부터 설정을 읽기 때문에 최상단에 위치)
public class Application { // 메인 클래스
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); // 내장 WAS 실행
    }
}