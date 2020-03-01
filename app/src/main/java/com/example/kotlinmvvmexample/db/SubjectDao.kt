package com.example.kotlinmvvmexample.db

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.kotlinmvvmexample.model.Subject

class SubjectDao {
    private val subjectList = mutableListOf<Subject>()
    private val subjects = MutableLiveData<List<Subject>>()


    init{
        subjects.value = subjectList
    }

    fun addSubject(subject: Subject){
        subjectList.add(subject)
        subjects.value = subjectList
    }

    fun getSubjects():LiveData<List<Subject>>{
        return subjects as LiveData<List<Subject>>
    }
}