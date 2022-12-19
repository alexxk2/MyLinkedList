package com.practice.mylinkedlist

fun main() {

    val myList = MyLinkedList<String>()

    myList.addLast("a")
    myList.addLast("b")
    myList.addLast("c")
    myList.addLast("d")
    myList.addLast("e")

    println(myList.size())

    myList.addFirst("x")

    println(myList.head)

    myList.removeByIndex(2)

    println(myList.size())
    println(myList.get(0))
    println(myList.head)



}