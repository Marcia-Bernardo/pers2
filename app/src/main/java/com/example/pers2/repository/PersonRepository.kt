package com.example.pers2.repository

import androidx.annotation.WorkerThread
import com.example.pers2.dao.PersonDao
import com.example.pers2.model.Person
import kotlinx.coroutines.flow.Flow


class PersonRepository(private val personDao: PersonDao) {

    val allPeople: Flow<List<Person>> = personDao.getOrderedPeople()

    @Suppress("RedudantSuspendModifier")
    @WorkerThread
    suspend fun insert(person: Person){
        personDao.insert(person)
    }

}