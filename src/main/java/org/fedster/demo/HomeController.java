package org.fedster.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("myvar", "Say hello to the people.");
        return "hometemplate";
    }

    @RequestMapping("/inventory")
    public String altHomePage(Model model) {
        model.addAttribute("item", "Mac Pro 15 32 GB 512GB SSD");
        model.addAttribute("price", "2455.99");
        return "inventoryhome";
    }

}
