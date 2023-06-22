package com.example.kotlinndemo.test

import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import kotlin.random.Random
import kotlin.random.nextInt

@Service
class `If-ElseTest` {

    val log = LoggerFactory.getLogger(`If-ElseTest`::class.java)

    init{
        anotherTest();
    }


    private fun test() {
        val test: String;
        test = if (true) "good day" else "bad day"
    }

    private fun anotherTest() {
        val day = 4
        var test = Random.nextInt(7);

        val result = when (test) {
            1 -> {
                 ("Monday and Monday")
            }
            2 -> "Tuesday"
            3 -> "Wednesday"
            4 -> "Thursday"
            5 -> "Friday"
            6 -> "Saturday"
            7 -> "Sunday"
            else -> "Invalid day."
        }
        log.info("Test : $test")
        log.info("result : $result")

    }
}