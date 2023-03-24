package com.study.tdd.dto

data class Dollar(
    private var amount: Int
) {
    fun times(multiplier: Int): Dollar {
        return Dollar(this.amount * multiplier)
    }
}