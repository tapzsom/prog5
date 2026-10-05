package hu.mik.pte.prog5.crud_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiController {

    @GetMapping("/api/**")
    @ResponseBody
    public String getApi() {
        return "Hello World!";
    }
}
