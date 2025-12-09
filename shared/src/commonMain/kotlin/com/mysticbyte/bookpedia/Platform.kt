package com.mysticbyte.bookpedia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform