package com.example.kotlinndemo.service

import com.example.kotlinndemo.dto.CreateStudentRequest
import org.springframework.http.ResponseEntity

interface IStudentService {
    fun test(): String;

    fun getStudents(): ResponseEntity<*>;
    fun updateStudents(id: String): ResponseEntity<*>;
    fun createStudent(request: CreateStudentRequest): ResponseEntity<*>;
    fun deleteStudent(id: String): ResponseEntity<*>;
    fun getStudentDetails(): ResponseEntity<*>;
}