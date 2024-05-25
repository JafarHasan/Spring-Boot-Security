package AccioJob.demoSecurityProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("LoginPage")
    public String loginDemo() {
        return "Hi authenticated Successfully";
    }
}
