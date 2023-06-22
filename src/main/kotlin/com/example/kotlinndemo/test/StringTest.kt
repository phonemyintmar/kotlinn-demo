package com.example.kotlinndemo.test

import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service


@Service
class StringTest() {

    private val log = LoggerFactory.getLogger("StringTest");

    private val immutableName="Phone Myint";

    init {
        test()
    }


    fun test() {
        var name: String;
        name = "PM";
        log.info(immutableName.length.toString());
        log.info(name.plus(" ").plus(immutableName));
        log.info("D lo lote tr po kg tl pyaw tl $name and ${immutableName.length} ")
    }
}