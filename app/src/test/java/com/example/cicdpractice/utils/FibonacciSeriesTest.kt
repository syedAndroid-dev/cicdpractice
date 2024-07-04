package com.example.cicdpractice.utils

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class FibonacciSeriesTest{
    @Test
    fun `return 0 if input is 0`(){
        val result = FibonacciSeries.fib(0)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `return 1 if input is 1`(){
        val result = FibonacciSeries.fib(1)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `return fibonacci number in input`(){
        val result = FibonacciSeries.fib(5)
        assertThat(result).isEqualTo(FibonacciSeries.fib(5-1)+FibonacciSeries.fib(5-2))
    }
}