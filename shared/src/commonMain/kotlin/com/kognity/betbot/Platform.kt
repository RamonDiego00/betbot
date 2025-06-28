package com.kognity.betbot

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform