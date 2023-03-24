package com.study.tdd

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TddProjectApplication

fun main(args: Array<String>) {
	runApplication<TddProjectApplication>(*args)
}
