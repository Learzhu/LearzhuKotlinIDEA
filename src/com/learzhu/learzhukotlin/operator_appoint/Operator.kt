package com.learzhu.learzhukotlin.operator_appoint

import java.math.BigDecimal

/**
 * Operator.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-08-23 15:40
 * @update Learzhu 2018-08-23 15:40
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }

    override fun equals(obj: Any?): Boolean {
//        return super.equals(other)
        //恒等运算符 等同于java 中的==
        if (obj === this) return true
        if (obj !is Point) return false
        return obj.x == x && obj.y == y
    }
}

//扩展函数
operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}


operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), ((y * scale).toInt()))
}

operator fun Double.times(p: Point): Point {
    return Point(p.x * this.toInt(), p.y * this.toInt())
}

//一元运算符重载没有参数
operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE

//复合运算符
fun recombination() {
    var point = Point(10, 11)
    //修改对象不修改引用
    point += Point(3, 4)

    val list = arrayListOf(2, 3)
    //修改list
    list += 3
    //返回一个包含所有元素的新列表
    val list1 = list + listOf(5, 6)
    println(list1)

    var bd = BigDecimal.ZERO
    println(bd++)
    println(++bd)
}

//比较compareTo
class Personx(val firstName: String, val lastName: String) : Comparable<Personx> {
    override fun compareTo(other: Personx): Int {
        //按照顺序比较
        return compareValuesBy(this, other, Personx::lastName, Personx::firstName)
    }
}

fun main(args: Array<String>) {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)
    println(p1.plus(p2))

    val p3 = Point(33, 33)
    println(p3 * 1.5)
}