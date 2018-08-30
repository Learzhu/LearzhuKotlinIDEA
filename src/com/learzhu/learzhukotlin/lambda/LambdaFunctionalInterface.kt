package com.learzhu.learzhukotlin.lambda


/**
 * LambdaFunctionalInterface.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-08-16 14:16
 * @update Learzhu 2018-08-16 14:16
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
fun postponeComputation(delay: Int, computation: Runnable) {}

fun main(args: Array<String>) {
//    postponeComputation(10000) { println(22) }
    postponeComputation(1000, object : Runnable {
        override fun run() {
            println(44)
        }
    })

//    val button: Button=Button(Context)
//    button.setOnClickListener { view -> println("onclick") }
}