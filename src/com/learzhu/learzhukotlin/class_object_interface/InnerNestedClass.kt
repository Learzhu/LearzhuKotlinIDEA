package com.learzhu.learzhukotlin.class_object_interface

import java.io.Serializable

/**
 * InnerNestedClass.java是内部类和嵌套类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-08-08 17:00
 * @update Learzhu 2018-08-08 17:00
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
interface State : Serializable

interface View {
    fun getCurrentState(): State
    //接口内可以有方法的空实现 和java 不同
    fun restoreState(state: State) {}
}

//无显示修饰符的嵌套类与java中的static嵌套类是一样的
class Button2 : View {
    override fun getCurrentState(): State = Button2.ButtonState()
    override fun restoreState(state: State) {
        super.restoreState(state)
    }

    class ButtonState : State {
    }
}

//内部类持有外部类的引用
class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}

