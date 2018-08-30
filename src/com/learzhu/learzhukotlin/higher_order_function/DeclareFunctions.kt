package com.learzhu.learzhukotlin.higher_order_function

/**
 * DeclareFunctions.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-08-28 15:01
 * @update Learzhu 2018-08-28 15:01
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
//把lambda表达式保存在局部变量中
val num = { x: Int, y: Int -> x + y }
val action = { println(42) }

//变量的显示声明
val num1: (Int, Int) -> Int = { x, y -> x + y }
// 一个函数类型声明总需要一个显示的返回类型 Unit不能省略
val action1: () -> Unit = { println(42) }

//var canReturnNull: (Int, Int) -> Int? = { null }
var funOrNull: ((Int, Int) -> Int)? = null

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The result is $result")
}

//简单版本的filter
fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) sb.append(element)
    }
    return sb.toString()
}

fun processTheAnswer(f: (Int) -> Int) {
    println(f(42))
}


fun <T> Collection<T>.joinToString(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = "",
        transform: (T) -> String = { it.toString() }
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(transform(element))
    }
    result.append(postfix)
    return result.toString()
}

fun <T> Collection<T>.joinToString1(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = "",
        transform: ((T) -> String)? = null
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        val str = transform?.invoke(element)
                ?: element.toString()
        result.append(str)
    }
    result.append(postfix)
    return result.toString()
}


