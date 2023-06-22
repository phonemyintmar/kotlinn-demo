package com.example.kotlinndemo.database.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import lombok.AllArgsConstructor
import lombok.NoArgsConstructor

@Entity
@NoArgsConstructor
@AllArgsConstructor
data class Student(
        @Id
        var id: String,
        var name: String?,
        var age: Int?
) {
}