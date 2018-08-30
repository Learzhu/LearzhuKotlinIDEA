package com.learzhu.learzhukotlin.operator_appoint

import android.annotation.TargetApi
import android.os.Build
import java.time.LocalDate

/**
 * CollectionOperator.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-08-23 16:32
 * @update Learzhu 2018-08-23 16:32
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
operator fun Point.get(index: Int): Int {
    return when (index) {
        0 -> x
        1 -> y
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

data class MutablePoint(var x: Int, var y: Int)

operator fun MutablePoint.set(index: Int, value: Int) {
    when (index) {
        0 -> x = value
        1 -> y = value
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

data class Rectangle(val upperLeft: Point, val lowerRight: Point)

operator fun Rectangle.contains(p: Point): Boolean {
    //开区间
    return p.x in upperLeft.x until lowerRight.x &&
            p.y in upperLeft.y until lowerRight.y
}

@TargetApi(Build.VERSION_CODES.O)
fun main(args: Array<String>) {
    val now = LocalDate.now()
    //等价于rangeTo
    val vacation = now..now.plusDays(10)
    println(now.plusWeeks(1) in vacation)
}