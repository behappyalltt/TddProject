package com.study.tdd.service

import com.study.tdd.TddProjectApplication
import com.study.tdd.dto.Dollar
import com.study.tdd.dto.Franc
import com.study.tdd.dto.Money
import io.kotest.matchers.shouldBe
import mu.KotlinLogging
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(classes = [TddProjectApplication::class])
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootApplication
class MoneyServiceTest {
    val log = KotlinLogging.logger {}

    @BeforeAll
    fun beforeAll() {
        log.info { "BeforeAll..." }
    }

    @Test
    fun moneyTest() {
        println("moneyTest start...")

        val dollar = Money(10).dollar()
        dollar.getString().shouldBe("10 USD")
        dollar.equals(Money(20).dollar()).shouldBe(false)
        dollar.equals(Money(10).franc()).shouldBe(false)
        dollar.equals(Money(10).dollar()).shouldBe(true)

        val franc = Money(20).franc()
        franc.getString().shouldBe("20 CHF")

        println("dollarTest end...")
    }

    @AfterAll
    fun afterAll() {
        log.info { "AfterAll..." }
    }
}