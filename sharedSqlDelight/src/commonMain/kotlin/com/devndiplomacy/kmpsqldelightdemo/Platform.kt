package com.devndiplomacy.kmpsqldelightdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform