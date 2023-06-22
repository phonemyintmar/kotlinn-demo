package com.example.kotlinndemo.dto

import javax.validation.constraints.NotBlank


data class CreateStudentRequest(
        @field:NotBlank(message = "name must not be blank")
        val name:String?,

        @field:NotBlank(message = "age must not be blank")
        val age:Int?,
        var email:String?
) {
}