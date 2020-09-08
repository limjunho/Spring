package test_application.test_web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Client에게 view(*.js, *html 등)가 아닌 data자체를 넘겨주기 위한 방법.
public class Controller {
    @GetMapping("/") // GET요청에 대한 응답을 매핑 시켜준다.
    public String hello() { // 응답
        return "Hello, Spring!!";
    }
}