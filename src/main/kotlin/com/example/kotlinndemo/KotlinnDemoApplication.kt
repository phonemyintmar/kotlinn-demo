package com.example.kotlinndemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication


@SpringBootApplication()
class KotlinnDemoApplication

fun main(args: Array<String>) {
    runApplication<KotlinnDemoApplication>(*args)
}
