package com.learzhu.learzhukotlin.lambda

import java.io.File

/**
 * LambdaSequence.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-08-15 17:24
 * @update Learzhu 2018-08-15 17:24
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
val people1 = listOf<Man>(Man("Alice", 33), Man("Bob", 35), Man("Candy", 33))

fun main(args: Array<String>) {
    people1.asSequence()
            .map(Man::name)
            .filter { it.startsWith("A") }
            .toList()

    println(file.isInsideHiddenDirectory())
}

fun testOperate() {
    //中间操作始终是惰性的
    listOf(1, 2, 3, 4).asSequence()
            .map { print("map($it)");it * it }
            .filter { print("filter($it)");it % 2 == 0 }
            //末端操作 触发了所有的延期计算
            .toList()

    println(listOf(1, 2, 3, 4).asSequence()
            .map { it * it }.find { it > 3 })
}

fun testSequence() {
    val naturalNumbers = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())
}

fun File.isInsideHiddenDirectory() = generateSequence(this) { it.parentFile }.any { it.isHidden }
val file = File("Users/svtk/.HiddenDir/a.txt")
