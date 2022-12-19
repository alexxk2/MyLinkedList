package com.practice.mylinkedlist

class MyLinkedList<T> {

    var head: Element<T>? = null
    private var numberOfElements = 0

    fun addFirst(inputValue: T) {

        val newElement = Element(
            value = inputValue,
            next = null
        )
        newElement.next = head
        head = newElement

        numberOfElements++
    }

    fun addLast(inputValue: T) {

        val newElement = Element(
            value = inputValue,
            next = null
        )

        if (head == null){
            head = newElement
        }
        else{
            var temp = head
            while (temp?.next != null) temp = temp.next
            temp?.next = newElement
        }
        numberOfElements++

    }

    fun get(index: Int): T? {

        if (index >= numberOfElements || index < 0) {
            println("OutOfBounds")
            return null
        }

        var element = head

        for (n in 0 until index) {
            element = element?.next
        }

        return element?.value
    }

    fun size(): Int = numberOfElements

    fun clear() {
        head = null
        numberOfElements = 0
    }

    //idea is to get a link part of removed element and put it to the previous element
    fun removeByIndex(index: Int){

        var elementBeforeRemoved = head
        var elementRemoved = head

        for (n in 0 until index-1){
            elementBeforeRemoved = elementBeforeRemoved?.next
        }
        for (n in 0 until index){
            elementRemoved = elementRemoved?.next
        }

        elementBeforeRemoved?.next = elementRemoved?.next

        numberOfElements--
    }


}