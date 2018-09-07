package com.learzhu.days31

/**
 * Day05.java是液总汇的类。
 *for 循环在与其他两种 Kotlin 特性一起使用时可以获得超级能力：范围表达式和解构。
 * @author Learzhu
 * @version 2.0.0 2018-09-07 15:58
 * @update Learzhu 2018-09-07 15:58
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
fun main(args: Array<String>) {
    for (i in 1..100) {
        println(i)
    }

    for (i in 100 downTo 1) {

    }

    val array = arrayOf("a", "b", "x")
    for (i in 1 until array.size step 2) {

    }

    for ((index, element) in array.withIndex()) {

    }

    //iterating over a map
    val map = mapOf(1 to "one", 2 to "two")
    for ((key, value) in map) {

    }
}
