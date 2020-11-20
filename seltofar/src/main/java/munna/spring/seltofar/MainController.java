package munna.spring.seltofar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @GetMapping("/register")
    public String showForm(Model model){
        Loader loader = new Loader();
        model.addAttribute("loader", loader);
        return "converter_form";
    }



    @PostMapping("/register")
    public String submitForm(@ModelAttribute("loader") Loader loader){
        System.out.println(loader);
        return "success";
    }
}
