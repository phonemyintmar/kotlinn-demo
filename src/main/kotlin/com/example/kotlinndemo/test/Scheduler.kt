package com.example.kotlinndemo.test

import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler
import java.time.Instant

class Schedular(private val taskScheduler: ThreadPoolTaskScheduler) {
    init {
        run()
    }

    private fun run() {
        taskScheduler.schedule({ println("Hello World") }, Instant.now())
    }
}