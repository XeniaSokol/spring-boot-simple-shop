package my.app.site.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/main")
    public String main(Model model){
        model.addAttribute("title","Главная страница");
        return "main";
    }
    @GetMapping("/about")
    public String aboutPage(Model model){
        return "about";
    }

    @GetMapping("/contact")
    public String contactPage(Model model){
        return "contact";
    }
}
