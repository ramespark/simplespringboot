package com.learning.simplerestuser

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserResController {

    @RequestMapping("/")
    fun getDefault(): String{
        return "Welcome to test app"
    }

    @RequestMapping("/user")
    fun getUser(): User{
        return User("TestUser",13)
    }
}