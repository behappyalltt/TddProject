package com.study.tdd.dto

open class Money(
    private val amount: Int,
    private val currency: String? = null
) {
    fun amount(): Int {
        return amount
    }

    fun currency(): String? {
        return currency
    }

    fun getString(): String {
        return "$amount $currency"
    }

    fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }

    fun equals(money: Money): Boolean {
        return (this.amount == money.amount) && (this.currency == money.currency)
    }

    fun dollar(): Dollar {
        return Dollar(amount, "USD")
    }

    fun franc(): Franc {
        return Franc(amount, "CHF")
    }
}
