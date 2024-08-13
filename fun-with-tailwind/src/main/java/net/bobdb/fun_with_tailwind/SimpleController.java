package net.bobdb.fun_with_tailwind;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {

    @GetMapping("/")
    public String hello() {
        return "index";
    }
}
