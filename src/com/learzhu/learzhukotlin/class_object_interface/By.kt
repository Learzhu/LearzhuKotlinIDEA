package com.learzhu.learzhukotlin.class_object_interface

/**
 * By.java是液总汇的类。
 *
 * @author Learzhu
 * @version 2.0.0 2018-08-09 18:09
 * @update Learzhu 2018-08-09 18:09
 * @updateDes
 * @include {@link }
 * @used {@link }
 */
class DelegatingCollection<T> : Collection<T> {
    private val innerList = arrayListOf<T>()
    override val size: Int
        get() = innerList.size

    override fun isEmpty(): Boolean = innerList.isEmpty()
    override fun contains(element: T): Boolean = innerList.contains(element)
    override fun iterator(): Iterator<T> = innerList.iterator()
    override fun containsAll(elements: Collection<T>): Boolean = innerList.containsAll(elements)
}

//通过by关键字将接口的实现委托给另一个对象
class DelegatingCollection1<T>(
        innerList: Collection<T> = ArrayList<T>()
) : Collection<T> by innerList {}

class CountingSet<T>(
        val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet {
    var objectsAdded = 0
    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }
}