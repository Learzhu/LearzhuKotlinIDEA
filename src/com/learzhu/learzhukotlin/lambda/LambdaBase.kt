package com.learzhu.learzhukotlin.lambda

import com.learzhu.learzhukotlin.Button

/**
 * LambdaBase.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-08-13 17:11
 * @update Learzhu 2018-08-13 17:11
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
fun main(args: Array<String>) {
    val button: Button
    //通过lambda在集合中搜索
    val man = listOf<Man>(Man("Alice", 11), Man("Bob", 33))
    println(man.maxBy { it.age })
    //lambda 语法:当有一个实参的时候既可以把lambda放到括号内，也可以放到外面甚至可以取消括号
//    man.maxBy() { man: Man -> man.age }
//    man.maxBy { man: Man -> man.age }
    //lambda的参数可以被推导出来就可以不用显湿表达
    man.maxBy { man -> man.name }

    val names = man.joinToString(separator = "", transform = { man: Man -> man.name })
    val names1 = man.joinToString(" ") { man: Man -> man.name }

    val sum = { x: Int, y: Int ->
        println("Computing the sum of $x and $y")
        x + y
    }
    println(sum(1, 2))

    val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
    printProblemCounts(responses)

    //成员引用
    Man::name
    val getName = { man: Man -> man.name }
    man.maxBy(Man::name)

    //引用顶层函数
    fun salute() = println("Salute!")
    run(::salute)

//    val action = { man: Man, message: String ->
//        sendEmail(man, message)
//    }
//    val nextAction=::senEmail
}

data class Man(val name: String, val age: Int = 0)

/**
 * 查找年龄最大的人
 */
fun findTheOldest(mans: List<Man>) {
    var maxAge = 0
    //保存年龄最大的人
    var theOldest: Man? = null
    for (man in mans) {
        if (man.age > maxAge) {
            maxAge = man.age
            theOldest = man
        }
    }
    println(theOldest)
}

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach { println("$prefix $it") }
}

//在lambda中改变局部变量
fun printProblemCounts(responses: Collection<String>) {
    //声明在lambda内局部访问的变量
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        //lambda中修改变量值
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("$clientErrors client errors,$serverErrors server errors")
}