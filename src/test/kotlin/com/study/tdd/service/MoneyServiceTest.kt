package com.study.tdd.service

import com.study.tdd.TddProjectApplication
import com.study.tdd.dto.Dollar
import com.study.tdd.dto.Franc
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
    fun dollarTest() {
        println("dollarTest start...")

        val dollar = Dollar(5)
        dollar.times(2).shouldBe(Dollar(10))
        dollar.times(3).shouldBe(Dollar(15))

        println("dollarTest end...")
    }

    @Test
    fun francTest() {
        println("francTest start...")

        val franc = Franc(2)
        franc.times(5).shouldBe(Franc(10))
        franc.times(10).shouldBe(Franc(20))
        franc.equals(Franc(1).times(2))

        println("francTest end...")
    }

    @AfterAll
    fun afterAll() {
        log.info { "AfterAll..." }
    }
}