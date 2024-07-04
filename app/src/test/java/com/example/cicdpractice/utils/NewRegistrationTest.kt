package com.example.cicdpractice.utils

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class NewRegistrationTest{

    @Test
    fun `empty username return false`(){
        val result = NewRegistration.validateUserNameAndPassword(
            userName = "",
            password = "12345678",
            confirmPassword = "12345678"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password return false`(){
        val result = NewRegistration.validateUserNameAndPassword(
            userName = "test",
            password = "",
            confirmPassword = "12345678"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty confirm password return false`(){
        val result = NewRegistration.validateUserNameAndPassword(
            userName = "test",
            password = "12345678",
            confirmPassword = ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password and confirm password do not match return false`(){
        val result = NewRegistration.validateUserNameAndPassword(
            userName = "test",
            password = "12345678",
            confirmPassword = "12345679"
        )
        assertThat(result).isFalse()
    }
}