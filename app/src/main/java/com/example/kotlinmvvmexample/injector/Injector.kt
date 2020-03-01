package com.example.kotlinmvvmexample.injector

import com.example.kotlinmvvmexample.db.SubjectDao
import com.example.kotlinmvvmexample.db.SubjectRepository
import com.example.kotlinmvvmexample.viewmodel.SubjectViewModelFactory

object Injector {

    fun provideSubjectsViewModelFactory():SubjectViewModelFactory{
        val subjectRepository = SubjectRepository.getInstance(SubjectDao())
        return SubjectViewModelFactory(subjectRepository)
    }
}