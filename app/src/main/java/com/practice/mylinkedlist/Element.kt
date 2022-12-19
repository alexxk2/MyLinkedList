package com.practice.mylinkedlist

data class Element<T>(
    var value: T? =  null,
    var next: Element<T>? = null
)
