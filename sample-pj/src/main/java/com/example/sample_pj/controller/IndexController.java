package main.java.com.example.sample_pj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {
  @RequestMapping("")
  public String index(){
    return "/index";
  }
}