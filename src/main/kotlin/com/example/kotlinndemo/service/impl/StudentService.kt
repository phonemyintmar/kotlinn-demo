package com.example.kotlinndemo.service.impl

import com.example.kotlinndemo.config.AppConfig
import com.example.kotlinndemo.database.model.Student
import com.example.kotlinndemo.database.repo.StudentRepo
import com.example.kotlinndemo.dto.CreateStudentRequest
import com.example.kotlinndemo.service.IStudentService
import com.example.kotlinndemo.test.TestClass
import com.pm.ResponseUtil
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class StudentService(
        val appConfig: AppConfig,
        val studentRepo: StudentRepo) : IStudentService {

    val log = LoggerFactory.getLogger(StudentService::class.java)
    override fun test(): String {
        log.info("tested")
        TODO("Not yet implemented")
    }

    override fun getStudents(): ResponseEntity<*> {
        var studentList: List<Student> = studentRepo.findAll();
        return ResponseUtil.onSuccess("000", "Successfully fetched student data", studentList);
    }

    override fun updateStudents(id: String): ResponseEntity<*> {
        TODO("Not yet implemented")
    }

    override fun createStudent(request: CreateStudentRequest): ResponseEntity<*> {
        var student: Student = Student(UUID.randomUUID().toString(), request.name, request.age);
        return ResponseUtil.onDefaultSuccess(studentRepo.save(student));
    }

    override fun deleteStudent(id: String): ResponseEntity<*> {
        TODO("Not yet implemented")
    }

    override fun getStudentDetails(): ResponseEntity<*> {
        TODO("Not yet implemented")
    }


}