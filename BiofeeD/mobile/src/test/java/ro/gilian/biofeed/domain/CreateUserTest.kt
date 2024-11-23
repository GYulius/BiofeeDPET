package ro.gilian.biofeed.domain

import org.junit.Assert.*

import org.junit.Test

class CreateUserTest {

    private val subject = CreateUser()

    @Test
    fun`given an api error when execute is called, an error should be thrown`() {

        subject.execute().test()
            .assertNoValues()
            .assertNotComplete()
            .assertError(Throwable::class.java)
    }

    @Test
    fun`given a success on user creation, when execute is called, an user should be created`() {
        subject.execute().test()
            .assertNoErrors()
            .assertComplete()
            .assertValueCount(1)
    }
}