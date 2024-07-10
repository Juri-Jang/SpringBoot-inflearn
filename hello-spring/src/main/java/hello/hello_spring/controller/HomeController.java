package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    //로컬호스트(8080) 접속시 home이 리턴되면서 home.html로 접속됨
    public String home(){
        return "home";
    }
}
