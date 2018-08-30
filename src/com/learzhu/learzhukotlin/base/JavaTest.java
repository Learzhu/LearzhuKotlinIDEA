package com.learzhu.learzhukotlin.base;

import com.learzhu.learzhukotlin.fun.FunTest;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaTest.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-07-20 09:19
 * @update Learzhu 2018-07-20 09:19
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
public class JavaTest {
    public static void main(String args[]) {
        FunTest funTest = new FunTest();
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        funTest.joinToString(list);
    }

}

enum Color {
    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);
    // 成员变量
    private String name;
    private int index;

    // 构造方法
    private Color(String name, int index) {
        this.name = name;
        this.index = index;
    }

    //覆盖方法
    @Override
    public String toString() {
        return this.index + "_" + this.name;
    }

    public String switchX(Color color) {
        switch (color) {
            case RED:
                return "AA";
            case BLANK:
                return "BB";
            default:
                return "CC";
        }
    }

//    @JvmOverloads
//    private String joinToString(Collection collection,
//                                String separator="A",
//                                String prefix,
//                                String postfix) {
//
//    }

}
//enum Color(int r,int g,int b){
//        RED(255,0,0),ORANGE(255,165,0),BLUE(0,0,255);
////        fun rgb()=(r*256+g)*256+b
//        }

