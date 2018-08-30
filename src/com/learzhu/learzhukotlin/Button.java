package com.learzhu.learzhukotlin;

import java.io.Serializable;

/**
 * Button.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-08-08 17:09
 * @update Learzhu 2018-08-08 17:09
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
interface State extends Serializable {
}

interface View {
    State getCurrentState();

    void restoreState(State state);
}

public class Button implements View {

    @Override
    public State getCurrentState() {
//        return null;
        return new ButtonState();
    }

    @Override
    public void restoreState(State state) {

    }

    //当前类不能被序列化 被Button破坏 内部类隐式存储了它的外部类Button的引用
//    public class ButtonState implements State {
//
//    }
    public static class ButtonState implements State {
        private int age;

    }
}