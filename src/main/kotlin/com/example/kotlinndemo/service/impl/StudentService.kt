package com.example.kotlinndemo.service.impl

import com.example.kotlinndemo.config.AppConfig
import com.example.kotlinndemo.service.IStudentService
import com.example.kotlinndemo.test.TestClass
import org.springframework.stereotype.Service

@Service
class StudentService(
        val appConfig: AppConfig)
    : IStudentService {


    override fun test(): String {
        return "Hello World";
    }



}