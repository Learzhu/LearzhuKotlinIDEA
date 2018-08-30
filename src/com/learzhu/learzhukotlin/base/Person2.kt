package com.learzhu.learzhukotlin.base

/**
 * Person2.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-07-19 16:16
 * @update Learzhu 2018-07-19 16:16
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
class Person2 {
    var name: String = ""
    var isMarried: Boolean = false


    constructor(name: String, isMarried: Boolean) {
        this.name = name
        this.isMarried = isMarried
    }

    constructor(isMarried: Boolean) {
        this.isMarried = isMarried
    }

    constructor()
}