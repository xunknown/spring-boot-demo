package alpha.study.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restful {

    @GetMapping("/")
    public String root() {
        return "Hello World!";
    }
}
