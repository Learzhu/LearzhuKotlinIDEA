package com.learzhu.learzhukotlin.class_object_interface

import android.content.Context
import android.util.AttributeSet
import java.util.jar.Attributes

/**
 * constructor.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-08-09 11:51
 * @update Learzhu 2018-08-09 11:51
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
//主体构造方法
//class User(val nickname: String)

//完成同样事情的最明确的代码
class User1(_nickname: String) {
    val nickname: String

    init {
        nickname = _nickname
    }
}

//单参数构造方法
class User2(nickname: String) {
    val nickname = this.nickname
}

//默认值的构造方法
class User(val nickname: String, val isSubscribed: Boolean = true)

fun main(args: Array<String>) {
    val alice = User("Alice")
    println(alice.isSubscribed)
}

class TwitterUser(nickname: String) : User(nickname) {
}

//无参构造
open class Button

//class RadioButton : Button
class RadioButton : Button()

//私有构造确保不会被别的类实例化
class Secretive private constructor() {}


open class View1 {
    constructor(context: Context) {
    }

    constructor(context: Context, attr: AttributeSet) {}
}

class MyButton : View1 {
    //调用父类构造方法
    constructor(context: Context) : super(context) {
    }

    constructor(context: Context, attr: AttributeSet) : super(context, attr) {}

    constructor(context: Context) {
        super(context)
    }

    //委托给这个类的另一个构造方法
    val MY_STYLE

    constructor(context: Context) : this(context, MY_STYLE)
    constructor(context: Context, attr: AttributeSet) : super(context, attr)
}

//实现在接口中声明的属性
interface IUser {
    val email: String
    val nickname: String
        get() = email.substringBefore('@')
}

class PrivateUser(override val nickname: String) : IUser
class SubscribingUser(val email: String) : IUser {
    override val nickname: String
    //自定义get方法
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : IUser {
    override val nickname = getFaceBookName(accountId)
}

class LengthCounter {
    var counter: Int = 0
    //不能在类外部修改这个属性
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun testLengthCounter() {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hello world!")
    println(lengthCounter.counter)
}