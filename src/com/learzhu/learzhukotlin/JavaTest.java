package com.learzhu.learzhukotlin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * JavaTest.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-08-07 15:49
 * @update Learzhu 2018-08-07 15:49
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
public class JavaTest {
    public static void main(String args[]) {
        A a = new B();
        a.print();
        String ss = "12.345-6.A";
//        System.out.println(ss.split(".").length);
        System.out.println(ss.split("\\.").length);
        test();
    }

    private static void test() {
        Button button = new Button();
        button.getCurrentState();
        //java.io.NotSerializableException: com.learzhu.learzhukotlin.Button
        try {
            ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(
                    new File("E:/Person.txt")));
            oo.writeObject(button);
            System.out.println("Person对象序列化成功！");
            oo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //测试集合的lambda表达式
    private static void testLambda() {
        List list = new ArrayList<>();
    }
}

class A {
    private String name;

    public void print() {
        System.out.println("A");
    }
}

class B extends A {
    public void print() {
        B.super.print();
        super.print();
        System.out.println("B");
    }
}

//interface IOpen{
//    void open(){};
//}

