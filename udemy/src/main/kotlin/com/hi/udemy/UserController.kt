package com.hi.udemy

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

// localhost:8080/account
@RestController("/account")
public class UserController {

    @Autowired
    lateinit var repository:UserRepository

    // localhost:8080/account/login
    @RequestMapping("/login")
    public fun login(model: Model):String{
        model.addAttribute("title","Home")
        return "index"
    }
}