package com.learzhu.days31

/**
 * Day01.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-09-06 14:56
 * @update Learzhu 2018-09-06 14:56
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
/**
 * 在 Kotlin 中一切都是默认 public 的。
 * 并且 Kotlin 还有一套丰富的可见性修饰符，
 * 例如：private, protected,
 * internal。它们每个都以不同的方式降低了可见性。*/
//public by default
val isVisible = true

//only in the same file
private val isHidden1 = true

//internal to compilation 'module'
internal val almostVisible = true

class Foo {
    //public by default
    val isVisible = true

    protected val isInheritable = true

    private val isHidden = true
}

fun main(args: Array<String>) {
}