package com.kognity.betbot

import com.kognity.betUI.getPrinter


class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {

        val printer = getPrinter()
        println(printer.value)

        return "Hello, ${platform.name}!"
    }
}