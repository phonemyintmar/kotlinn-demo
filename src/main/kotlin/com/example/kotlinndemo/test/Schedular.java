package com.example.kotlinndemo.test;

import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import java.time.Instant;

public class Schedular {

    private final ThreadPoolTaskScheduler taskScheduler;

    public Schedular(ThreadPoolTaskScheduler taskScheduler) {
        this.taskScheduler = taskScheduler;
        run();
    }


    private void run() {
        taskScheduler.schedule(() -> {
            System.out.println("Hello World");
        }, Instant.now());
    }
}
