package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

    @Controller
    public class HelloController {
        @RequestMapping("/hello")
        public String printHello() {
            return "hello";
        }
    }

