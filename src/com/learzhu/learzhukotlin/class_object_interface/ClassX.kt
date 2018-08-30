package com.learzhu.learzhukotlin.class_object_interface

/**
 * ClassX.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-08-08 11:55
 * @update Learzhu 2018-08-08 11:55
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable") //default interface implements
}

class Button0 : Clickable {
    //    override fun click() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
    override fun click() = println("default interface implements")
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

class Button1 : Clickable, Focusable {
    //    override fun showOff()=super<Clickable>.showOff()
    override fun showOff() {
        //如果同样的继承成员有不止一个实现 必须提供一个显式实现
        super<Clickable>.showOff()
        super<Focusable>.showOff()
//        println("AAAAAAAA")
        //下方的todo是必须替换的否则就认为没有实现
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    //    override fun click() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
    override fun click() = println("default interface implements")
}

open class RichButton : Clickable {
    //没有final 的override 即为open
    final override fun click() {}
//    override fun click() { }

    //默认的函数是final 不能在子类中重写
    fun disable() {
    }

    open fun animate() {
    }
}

open class RichButtonX : RichButton() {
    //    override fun click() {
//
//    }
//    override fun disable() {
//
//    }
    override fun animate() {
        super.animate()
    }
}

abstract class Animated {
    abstract fun animate()
    open fun stopAnimating() {}
    fun animateTwice() {}
}

//模块中可见
internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey")
    protected fun whisper() = println("Let's talk!")
}

internal fun TalkativeButton.giveSpeech() {
//    yell()
//    whisper()
}



