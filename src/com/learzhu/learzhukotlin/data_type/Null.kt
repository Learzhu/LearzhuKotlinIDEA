package com.learzhu.learzhukotlin.data_type

/**
 * Null.java是Kotlin中关于数据类型的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-08-20 16:46
 * @update Learzhu 2018-08-20 16:46
 * @updateDes
 * @include {@link }
 * @used {@link }
 * 1. ?.简化null 检查和方法调用
 * 2. String? 可为null
 * 3.?: Elvis运算符 接收两个运算数，第一个不为null 结果就是第一个运算数，如果第一个为null，结果为第二个
 * 4.as? 尝试把值转换为指定类型
 * 5.!! 非空断言
 * 6.let 函数把一个调用它的对象编程lambda表达式的参数
 * 7.lateinit 延迟初始化的属性
 */

fun main(args: Array<String>) {
    strLenSafe(null)
}

fun strLenSafe(s: String?): Int =
//        if (s != null) s.length else 0
        s?.length ?: 0

fun safe(s: String?) {
    val toUpperCase: String? = s?.toUpperCase()
    println(toUpperCase)
}

class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee): String? = employee.manager?.name

class Address(val streetAddress: String, val zipCode: Int,
              val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun Person.countryName(): String {
    val country = this.company?.address?.country
    return if (country != null) country else "Unknow"
}

fun Person.countryName1() =
        company?.address?.country ?: "Unknow"

fun foo(s: String?) {
    val t: String = s ?: ""
}