package net.bobdb.fun_with_jte;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TemplateController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("username", "Joe No");
        return "pages/home";
    }

    @GetMapping("/team")
    public String team(Model model) {
        var team = List.of("Alice","Bill","Charlie");
        model.addAttribute("teamMembers",team);
        return "pages/team";
    }

    @GetMapping("/projects")
    public String projects(Model model) {
        var projects = List.of("P1","P2","P3");
        model.addAttribute("projects",projects);
        model.addAttribute("username", "Joe Shmo");
        return "pages/projects";
    }
}
