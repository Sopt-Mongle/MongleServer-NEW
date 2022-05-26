package com.mongle.mongleserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MongleServerApplication

fun main(args: Array<String>) {
	runApplication<MongleServerApplication>(*args)
}
