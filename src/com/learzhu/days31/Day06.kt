package com.learzhu.days31

/**
 * Day06.java是液总汇的类。
 * 在 Kotlin 中，类可以具有可变和只读属性，默认情况下生成 getter 和 setter。如果需要，您也可以实现自定义的。
 *
 * @author Learzhu
 * @version 2.0.0 2018-09-07 16:16
 * @update Learzhu 2018-09-07 16:16
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
class UserX {
    val id: String = ""  //just getter
    var name: String = "" //getter and setter
    var surname: String = "" //custom getter default setter
        get() = surname.toUpperCase()

    var email: String = ""
        set(value) {
            if (true) {
                field = value
            }
        }
}
