package com.learzhu.learzhukotlin.`fun`

/**
 * FunTest.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-08-06 14:39
 * @update Learzhu 2018-08-06 14:39
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
class FunTest {
    val set = hashSetOf<Int>(1, 6, 53)
    val set1 = setOf<Int>(1, 1)
    val list = arrayListOf<Int>(1, 7, 53)
    val map = hashMapOf(1 to "one", 7 to "seven", 6 to "six")
    //    fun <T> joinToString(
//            collection: Collection<T>,
//            separator: String,
//            prefix: String,
//            postfix: String
//    ): String {
//        val result = StringBuilder(prefix)
//        for ((index, element) in collection.withIndex()) {
//            //第一个元素不添加分隔符
//            if (index > 0) result.append(separator)
//            result.append(element)
//        }
//        result.append(postfix)
//        return result.toString()
//    }
    //可以指定默认值来实现函数重载
    @JvmOverloads
    fun <T> joinToString(
            collection: Collection<T>,
            separator: String = ",",
            prefix: String = "(",
            postfix: String = ")"
    ): String {
        val result = StringBuilder(prefix)
        for ((index, element) in collection.withIndex()) {
            //第一个元素不添加分隔符
            if (index > 0) result.append(separator)
            result.append(element)
        }
        result.append(postfix)
        return result.toString()
    }
}