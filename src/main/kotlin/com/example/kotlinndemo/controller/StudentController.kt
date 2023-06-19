package com.example.kotlinndemo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentController {

    @GetMapping("hello")
    fun test(): String = "Hello";

}