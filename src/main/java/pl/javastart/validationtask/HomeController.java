package pl.javastart.validationtask;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("data", new RegisterFormDto());
        System.out.println();
        return "home";
    }

    @PostMapping("/register")
    public String register(RegisterFormDto registerFormDto, Model model) {
        model.addAttribute("formData", registerFormDto);
        return "success";
    }


}
