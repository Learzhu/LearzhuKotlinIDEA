@file:JvmName("StringFunctions")

package strings

//import android.view.View
//import android.widget.Button
import com.learzhu.learzhukotlin.class_object_interface.Button2
import com.learzhu.learzhukotlin.class_object_interface.View

/**
 * FunX.java是扩展函数的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-08-07 14:26
 * @update Learzhu 2018-08-07 14:26
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
fun <T> joinToString(
        collection: Collection<T>,
        separator: String,
        prefix: String,
        postfix: String
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        //第一个元素不添加分隔符
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

//扩展方法
fun String.lastChar(): Char = this.get(this.length - 1)

fun String.lastChar1(): Char = get(length - 1)

fun Collection<String>.join(
        separator: String,
        prefix: String,
        postfix: String
) = joinToString(separator, prefix, postfix)

fun View.showOff() = println("I'm a view!")
fun Button2.showOff() = println("I'm a button!")

fun Int.a(i: Int): Int {
    return this + i
}

operator fun Int.plus(b: Int): Int {
    return this + b + 222
}

//扩展属性
//不可变的扩展属性
val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

//中缀调用和解构声明
val map = mapOf(1 to "one", 2 to "two")
val map1 = mapOf(1.to("one"), 2.to("two"))

//局部函数和扩展
class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id}: empty Name")
    }
    if (user.address.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.address}: empty Address")
    }
    //保存到数据库
}

fun saveUser1(user: User) {
    fun validate(user: User,
                 value: String,
                 filedName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty $filedName")
        }
    }
    validate(user, user.name, "Name")
    validate(user, user.address, "Address")
    //保存到数据库
}

fun saveUser2(user: User) {
    fun validate(value: String,
                 filedName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty $filedName")
        }
    }
    validate(user.name, "Name")
    validate(user.address, "Address")
    //保存到数据库
}

fun User.validateBeforeSave(user: User) {
    fun validate(value: String,
                 filedName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty $filedName")
        }
    }
    validate(user.name, "Name")
    validate(user.address, "Address")
    //保存到数据库
}

//对于正则表达式的修改
//"/User/yole/learzhukotlin-book/chapter.adoc"
fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
}

fun parsePathRegular(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory ,name:$filename,ext:$extension")
    }
}

val kotlinLogo = """| //
                    .|//
                    .|/ \"""


//fun listOf1<T>(vararg values: T): List<T> {}


