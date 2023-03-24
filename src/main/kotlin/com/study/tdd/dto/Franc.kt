package com.study.tdd.dto

data class Franc(
    private var amount: Int
) {
    fun times(multiplier: Int): Franc {
        return Franc(this.amount * multiplier)
    }

    fun equals(franc: Franc): Boolean {
        return this.amount == franc.amount
    }
}