package com.learzhu.kotlin

/**
 * Control.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-09-12 15:36
 * @update Learzhu 2018-09-12 15:36
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
fun main(args: Array<String>): Unit {
    args.map(::println)
    args.map { println(it) }

    for (arg in args) {
        println(arg)
    }
}