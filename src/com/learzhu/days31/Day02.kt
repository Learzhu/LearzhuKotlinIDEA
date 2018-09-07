package com.learzhu.days31

import com.learzhu.learzhukotlin.base.Person

/**
 * Day02.kt是Elvis操作符的类。
 *需要处理代码中的空值？可以使用 elvis 操作符，
 * 避免您的 “空情况” (null-erplate)。
 * 这只是替换空作为值或者返回事件情况的一个小语法。
 * @author Learzhu
 * @version 2.0.0 2018-09-06 15:15
 * @update Learzhu 2018-09-06 15:15
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
val person: Person = Person("AA")
var name: String = ""
fun main(args: Array<String>) {
    name = person.name ?: "unknow"
    println(name)
}