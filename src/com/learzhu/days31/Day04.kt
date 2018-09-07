package com.learzhu.days31

/**
 * Day04.java是液总汇的类。
 *强大的 switch！Kotlin 的 When 表达几乎可以匹配任何东西。
 * 字面值，枚举，数字范围。您甚至可以调用任意函数！
 * @author Learzhu
 * @version 2.0.0 2018-09-06 15:59
 * @update Learzhu 2018-09-06 15:59
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
class Train(val cargo: Number?) {
    override fun toString(): String {
        return when (cargo) {
            null, 0 -> "empty"
            1 -> "tiny"
            in 2..10 -> "small"
            is Int -> "big inty"
            else -> "$cargo"
        }
    }
}