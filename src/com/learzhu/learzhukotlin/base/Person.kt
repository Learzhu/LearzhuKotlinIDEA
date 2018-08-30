package com.learzhu.learzhukotlin.base

/**
 * Person.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-07-19 15:40
 * @update Learzhu 2018-07-19 15:40
 * @updateDes
 * @include []
 * @used []
 */
//public class Person {
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public Person() {
//    }
//
//    public Person(String name) {
//        this.name = name;
//    }
//}
class Person {
    var name: String = ""

    constructor() {}

    constructor(name: String) {
        this.name = name
    }
}
