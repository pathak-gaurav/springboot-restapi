package com.gaurav;

import com.gaurav.service.ApiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private ApiService service;

    public UserController(ApiService service) {
        this.service = service;
    }

    @RequestMapping({"/", "/index", "/index.html", ""})
    public String index() {
        return "index";
    }

    @PostMapping("/users")
    public String formPost(Model model, @RequestParam("limit") Integer limit) {
        if (limit == 0 || limit == null) {
            limit = Integer.valueOf(10);
        }
        model.addAttribute("users", service.getUsers(limit));
        return "userlist";
    }

}
