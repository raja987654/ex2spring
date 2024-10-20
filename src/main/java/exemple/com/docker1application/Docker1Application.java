package exemple.com.docker1application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Docker1Application {

    public static void main(String[] args) {
        SpringApplication.run(Docker1Application.class, args);
    }

}
@GetMapping("/Test")
public String hello () {
    return "Hello Word "
}
