package com.learzhu.learzhukotlin.base

import kotlin.math.max

/**
 * Base.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-07-19 16:44
 * @update Learzhu 2018-07-19 16:44
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
fun main(args: Array<String>) {
    println("Hello,World!")
    println(max(1, 2))
    println(a)
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("hello, $name!")
    println("hello, \$name!")
    if (args.size > 0) {
        println("hello, ${args[0]}")
    }
    println("Hello,${if (args.size > 0) args[0] else "someone"}")
    val person = Person("AA")
    println(person.name)

    val person1 = Person1("BB")
    val person2 = Person2("Bob", false)
    println("person2: " + person2.name + person2.isMarried)
}