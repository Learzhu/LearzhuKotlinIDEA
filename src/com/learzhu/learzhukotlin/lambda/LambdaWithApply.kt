package com.learzhu.learzhukotlin.lambda

/**
 * LambdaWithApply.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-08-16 15:17
 * @update Learzhu 2018-08-16 15:17
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
//val listener= View.OnClickListener { view->
//    val text=when(view.id){
//        R.id.button1->"First button"
//        R.id.button2->"Second button"
//        else ->"Unknown button"
//    }
//    println(text)
//}
//button1.setOnClickListener(listener)

fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\nNow I know the alphabet!")
    return result.toString()
}

fun alphabet1(): String {
    val sb = StringBuilder()
    return with(sb) {
        for (letter in 'A'..'Z') {
//            this.append(letter)
            append(letter)
        }
        append("\nNow I know the alphabet!")
//        this.toString()
        toString()
    }
}

/**
 * apply 始终会返回作为实参传递给他的对象【接收者对象】
 */
fun apphabet2(): String = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()

//fun createViewWithCustomAttributes(context: Context) =
//        TextView(context).apply {
//            text = "Sample Text"
//            textSize = 20.0f
//            setPadding(10, 0, 0, 0)
//        }