package alpha.study.springbootdemo;

import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restful {

    @GetMapping("/")
    public String root() {
        return "Hello World!";
    }

    @GetMapping("/now")
    public String now() {
    	return new Date().toString();
    }
}
