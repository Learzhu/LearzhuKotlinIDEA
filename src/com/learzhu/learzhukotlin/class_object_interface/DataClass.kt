package com.learzhu.learzhukotlin.class_object_interface

/**
 * DataClass.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-08-09 17:43
 * @update Learzhu 2018-08-09 17:43
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
class Client(val name: String, val postalCode: Int) {
    override fun toString(): String = "Client(name=$name,postalCode=$postalCode)"
    //Any是Kotlin中所有的类的父类
    override fun equals(other: Any?): Boolean {
//        return super.equals(other)
        if (other == null || other !is Client) {
            return false
        }
        return name == other.name &&
                postalCode == other.postalCode
    }

    //两个对象相等，他们必须有相同的hash值
    override fun hashCode(): Int = name.hashCode() * 31 + postalCode

    fun copy(name: String = this.name,
             postalCode: Int = this.postalCode) =
            Client(name, postalCode)
}

fun main(args: Array<String>) {
    val client1 = Client("Alice", 12345)
    val client2 = Client("Alice", 12345)
    //==检查对象是否相等 非比较引用此处比较的是equals false
    println(client1 == client2)
}


