package com.learzhu.learzhukotlin.lambda

/**
 * LambdaCollection.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-08-15 11:14
 * @update Learzhu 2018-08-15 11:14
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
fun main(args: Array<String>) {

}

/**
 * filter函数可以从集合中移除你不想要的元素 但是他并不会改变这些元素
 */
fun testNum() {
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 })
}

fun testObject() {
    val people = listOf<Man>(Man("Alice", 33), Man("Bob", 35))
    println(people.filter { it.age > 33 })
}

val people = listOf<Man>(Man("Alice", 33), Man("Bob", 35), Man("Candy", 33))
val list = listOf(1, 2, 3, 4)

/**
 * map函数对集合中的没一个元素应用给定的函数并把结果收集到一个新的集合
 */
fun testMap() {
    println(list.map { it * it })
    println(people.map { it.name })
    println(people.map(Man::name))

    //找到年龄最大的人
    //重复计算了年纪最大的人
    people.filter { it.age == people.maxBy(Man::age)!!.age }
    //避免重复计算
    val maxAge = people.maxBy(Man::age)!!.age
    people.filter { it.age == maxAge }


    //对map应用过滤和变换函数
    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.toUpperCase() })

//    //过滤和变换map的key
//    numbers.filterKeys {  }
//    numbers.mapKeys {  }
//    //过滤和变换map的值
//    numbers.filterValues {  }
//    numbers.mapValues {  }
}

fun testAllAnyCountFind() {
    val canBeInClub33 = { man: Man -> man.age <= 33 }
    //所有元素都满足帕努单式
    println(people.all(canBeInClub33))
    //集合中至少存在一个匹配的元素
    println(people.any(canBeInClub33))

    println(!list.all { it == 3 })
    println(list.any { it != 3 })

    //count函数通常过滤集合后取大小
    println(people.count(canBeInClub33))
    println(people.find(canBeInClub33))

}

fun testGroup() {
    println(people.groupBy { it.age })

    val list = listOf<String>("a", "ab", "b")
    println(list.groupBy(String::first))
}

class Book(val title: String, val authors: List<String>)

val books = listOf<Book>(Book("A", listOf("a", "b", "c")), Book("B", listOf("c", "d")))
fun testFlatMapFlatten() {
    //统计所有作者
    books.flatMap { it.authors }.toSet()

    //先映射然后平铺
    val strings = listOf<String>("abc", "def")
    println(strings.flatMap { it.toList() })

    println(books.flatMap { it.authors }.toSet())
//    println(books.flatMap { it.authors }.flatten())
    val deepArray = arrayOf(
            arrayOf(1),
            arrayOf(2, 3),
            arrayOf(4, 5, 6)
    )
    //集合的集合的平铺的计算函数
    println(deepArray.flatten()) // [1, 2, 3, 4, 5, 6]
}
