package com.example.kotlinndemo.database.repo

import com.example.kotlinndemo.database.model.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepo: JpaRepository<Student,String> {
}