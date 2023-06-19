package com.example.kotlinndemo.controller

import org.springframework.web.bind.annotation.RestController

@RestController
class StudentController {

    fun test(): String = "Hello";

}