package com.example.kotlinndemo.controller

import com.example.kotlinndemo.config.AppConfig
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentController(private val appConfig: AppConfig) {

    @GetMapping("hello")
    fun test(): String {
        return appConfig.name.toString();
    }



}