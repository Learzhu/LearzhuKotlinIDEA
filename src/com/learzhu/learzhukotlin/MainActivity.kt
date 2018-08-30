//package com.learzhu.learzhukotlin
//
//import android.os.Bundle
//import android.support.v7.app.AppCompatActivity
//import android.view.View
//import android.widget.Button
//import com.learzhu.learzhukotlin.`fun`.FunTest
//import com.learzhu.learzhukotlin.class_object_interface.Button1
//import strings.a
//import strings.lastChar
//import strings.showOff
//import strings.lastChar as last
//
////import strings.StringFunctions
//
//class MainActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        val funTest = FunTest()
//        println("^^^^^^^^^")
//        println(funTest.map.get(1))
//        println(funTest.list.last())
//        println(funTest.list.max())
//        val list = listOf<Int>(1, 2, 3)
//        println(funTest.joinToString(list, "; ", "(", ")"))
//        println(funTest.joinToString(collection = list, separator = "; ", prefix = "(", postfix = ")"))
////        println(StringFunctions.joinToString())
////        println(FunX)
//        println("AAA".lastChar())
//        println("AAABBBB".last())
//
//        testSpreadFunction()
//        testProperty()
//
//        val a = 5.a(6)
//        println(a)
//        println(2.plus(500))
//        testSplite()
//        testRegular()
//        testRegular1()
//        testSuper()
//    }
//
//    companion object {
//        @JvmStatic
//        fun main(args: Array<String>) {
//        }
//    }
//
//    fun testSpreadFunction() {
//        val view: View = Button(this)
//        view.showOff()
//    }
//
//    fun testProperty() {
//        println("Kotlin".lastChar)
//        val sb = StringBuilder("Kotlin?")
//        sb.lastChar = '!'
//        println(sb)
//    }
//
//    fun testSplite() {
//        val ss = "12.345-6.A"
//        println(ss.split(".", "-"))
//    }
//
//    fun testRegular() {
//        val ss = "12.345-6.A"
//        val ss1 = """aa"""
//        val price = """${'$'}99.9"""
//        println(ss.split("\\.|-".toRegex()))
//        println(ss.split(".", "-"))
//    }
//
//    fun testRegular1() {
//        val kotlinLogo = """| //
//                    .|//
//                    .|/ \"""
//        println(kotlinLogo.trimMargin("."))
//    }
//
//    fun testSuper() {
//        val button = Button1()
//        button.showOff()
//        button.setFocus(true)
//        button.click()
//    }
//}
