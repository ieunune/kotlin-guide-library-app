package com.group.libraryapp.calculator

import java.lang.IllegalArgumentException

class Calculator (
    var number: Int
) {

    // set()을 사용하지 않는 약속을 통해 불필요한 코드 없애자
//    val number : Int
//        get() = this.number

    fun add(operand: Int) {
        this.number += operand
    }

    fun minus(operand: Int) {
        this.number -= operand
    }

    fun multiply(operand: Int) {
        this.number *= operand
    }

    fun divide(operand: Int) {
        if (operand == 0) {
            throw IllegalArgumentException("0으로 나눌 수 없습니다.")
        }
        this.number /= operand
    }
}