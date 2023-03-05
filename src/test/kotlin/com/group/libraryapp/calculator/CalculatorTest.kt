package com.group.libraryapp.calculator

fun main() {
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
    calculatorTest.minusTest()
    calculatorTest.multiflyTest()
    calculatorTest.divideTest()
}

class CalculatorTest {

    fun addTest() {
        // given
        val calculator = Calculator(5)

        // when
        calculator.add(3)

        // then
        // 생성자를 public으로 두는 경우 직접 접근 가능.
        // 거부감 있을 수 있음.
        if (calculator.number != 8) {
            throw IllegalArgumentException()
        }

        // data class는 equals를 구현하고 있기 때문에 가능
//        val expectCalculator = Calculator(8)
//        if (calculator != expectCalculator) {
//            throw IllegalArgumentException()
//        }
    }

    fun minusTest() {
        // given
        val calculator = Calculator(5)

        // when
        calculator.minus(3)

        // then
        if (calculator.number != 2) {
            throw IllegalArgumentException()
        }
    }

    fun multiflyTest() {
        // given
        val calculator = Calculator(5)

        // when
        calculator.multiply(3)

        // then
        if (calculator.number != 15) {
            throw IllegalArgumentException()
        }
    }

    fun divideTest() {
        // given
        val calculator = Calculator(5)

        // when
        try {
            calculator.divide(0)
        } catch (e: IllegalArgumentException) {

            if (e.message != "0으로 나눌 수 없습니다.") {
                throw IllegalArgumentException("메시지가 다릅니다.")
            }
            // 테스트 성공!
            return
        } catch (e: Exception) {
            throw IllegalStateException()
        }

        throw IllegalStateException("기대하는 예외가 발생하지 않았습니다.")


        // then
//        if (calculator.number != 2) {
//            throw IllegalArgumentException()
//        }
    }

}