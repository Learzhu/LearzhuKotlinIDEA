package com.learzhu.learzhukotlin.class_object_interface

/**
 * sealed.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-08-09 10:34
 * @update Learzhu 2018-08-09 10:34
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
//类似于说明一个数
interface Expr

class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

//when的时候会强制检查默认选项
fun eval(e: Expr): Int = when (e) {
    is Num -> e.value
    is Sum -> eval(e.right) + eval(e.left)
    else -> throw  IllegalArgumentException("Unknow expression")
}

//标记为密封类
//密封类不能在类外部拥有子类
sealed class Expr1 {
    class Num(val value: Int) : Expr1()
    class Sum(val left: Expr, val right: Expr1) : Expr1()
}

//when表达式涵盖了所有的可能的情况，所以不需要else 分支
fun eval(e: Expr1): Int = when (e) {
    is Expr1.Num -> e.value
    is Expr1.Sum -> eval(e.right) + eval(e.left)
}

//因为Expr1是密封类不可扩展
//class B : Expr1 {
//}
//密封类扩展后需要修改用到的when的使用逻辑else
//class B : Expr1() {
//    class X()
//}