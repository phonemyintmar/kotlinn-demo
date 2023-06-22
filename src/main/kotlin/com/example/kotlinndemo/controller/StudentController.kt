package com.example.kotlinndemo.controller

import com.example.kotlinndemo.dto.CreateStudentRequest
import com.example.kotlinndemo.service.IStudentService
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("student")
@Validated
class StudentController(private val service: IStudentService) {

    @GetMapping("ping")
    fun test(): String {
        return "pong";
    }

    @GetMapping("")
    fun getStudents(): ResponseEntity<*> {
        return service.getStudents();
    }


    @PostMapping("")
    fun createStudent(@RequestBody @Valid request: CreateStudentRequest?): ResponseEntity<*> {
        return service.createStudent(request!!);
    }


//    @PostMapping("makeOrder")
//    fun makeOrder(@RequestBody orderRequest: @Valid MakeOrderRequest?): ResponseEntity<*>? {
//        return orderService.makeOrder(orderRequest)
//    }


}