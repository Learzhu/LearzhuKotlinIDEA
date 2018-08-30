package com.learzhu.learzhukotlin.base

/**
 * BaseStudyTest.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-07-19 16:35
 * @update Learzhu 2018-07-19 16:35
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
class BaseStudyTest {
    val a = 11

    fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    fun max1(a: Int, b: Int): Int = if (a > b) a else b
}

/**
 * 生成 main 函数之后，我们可以在当前 .kt 文件中直接创建 class 类，这里和 Java 有点不同，Java 的 main 函数是写在 class 里面，Kotlin 的 main 函数写在 class 中，只能被当做一个常规方法来调用
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