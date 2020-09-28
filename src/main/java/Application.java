import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Application {

    @RequestMapping("/")
    String home() {
        return "はろーわーるど!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
