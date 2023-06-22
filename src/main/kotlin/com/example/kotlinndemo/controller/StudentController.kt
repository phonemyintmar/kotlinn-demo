package com.example.kotlinndemo.controller

import com.example.kotlinndemo.config.AppConfig
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("student")
class StudentController(private val appConfig: AppConfig) {

    @GetMapping("ping")
    fun test(): String {
        return "pong";
    }

    @GetMapping("")
    fun getStudents(): ResponseEntity<*>{
        return ResponseEntity.ok("abcdefg")
    }





}