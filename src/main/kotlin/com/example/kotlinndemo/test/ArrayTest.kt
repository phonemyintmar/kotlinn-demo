package com.example.kotlinndemo.test

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class ArrayTest {

    val log = LoggerFactory.getLogger(ArrayTest::class.java);

    init {
        test();
        loopTest();
    }

    fun test() {
        val students = arrayOf("hla hla", "mya mya");
        if ("ag ag" in students) {
            log.info("Array htl mhr ag ag shi")
        } else {
            log.error("Array htl mhr ag ag m shi")
        }
        if ("hla hla" in students) {
            log.info("Array htl mhr hla hla shi")
        } else {
            log.error("Array htl mhr hla hla ma shi")
        }
    }

    fun loopTest() {
        var cars = arrayOf("ferrari", "lambo", "gtr");
        for (x in cars) {
            println(x)
        }

        for (x in 'a'..'x') {
            log.warn("ABCD ye ya ag => $x")
        }

        for ((i, x) in cars.withIndex()) {
            log.info("Cars Array htl mhr index $i ka $x")
        }

        cars.forEachIndexed { i, x ->
            log.info("From for each indexed, Cars Array htl mhr index $i ka $x")
        }

        var arrayTest = ArrayTest();
        
    }


}