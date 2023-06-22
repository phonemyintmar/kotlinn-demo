package com.example.kotlinndemo.service.impl

import com.example.kotlinndemo.config.AppConfig
import com.example.kotlinndemo.service.IStudentService
import com.example.kotlinndemo.test.TestClass
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class StudentService(
        val appConfig: AppConfig) {

    val log = LoggerFactory.getLogger(StudentService::class.java)




}