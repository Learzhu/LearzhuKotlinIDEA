package com.learzhu.learzhukotlin.class_object_interface

/**
 * companion.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-08-13 11:53
 * @update Learzhu 2018-08-13 11:53
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
class A {
    companion object {
        fun bar() {
            println("Companion object called")
        }
    }
}

fun main(args: Array<String>) {
    //就像java调用静态方法
    //伴生对象可以访问类中所有的private成员 包括private构造方法
    A.bar()
    Teacther.Loader.fromJSON("AA")
    Teacther.fromJSON("BB")
}

class Student {
    var nickname: String = ""

    constructor(email: String) {
        nickname = email.substringBefore('@')
    }

    constructor(facebookAccountId: Int) {
//       override val nickname = getFacebookName(facebookAccountId)
    }
}

//私有构造方法伴生对象
class Student1 private constructor(val nickname: String) {
    companion object {
        fun newSubscribingStudent(email: String) =
                Student1(email.substringBefore('@'))

        fun newFacebookStudent(accountId: Int) {
            Student1(getFacebookName(accountId))
        }

        private fun getFacebookName(accountId: Int): String {
            return "!";
        }
    }

//    fun getFacebookName(accountId: String): Int {
//        return 11;
//    }
}

//包含名称的伴生对象
class Teacther(val name: String) {
    companion object Loader {
        fun fromJSON(jsonText: String): Teacther = Teacther("AA")
    }
}

//伴生对象接口中的实现
interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}

class XX(val name: String) {
    companion object : JSONFactory<Teacther> {
        override fun fromJSON(jsonText: String): Teacther {
            return Teacther("AAA")
        }

    }
}


