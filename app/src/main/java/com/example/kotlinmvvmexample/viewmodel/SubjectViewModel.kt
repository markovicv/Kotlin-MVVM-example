package com.example.kotlinmvvmexample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.kotlinmvvmexample.db.SubjectRepository
import com.example.kotlinmvvmexample.model.Subject

class SubjectViewModel(private val subjectRepository: SubjectRepository):ViewModel() {



    fun addSubject(subject: Subject){
        subjectRepository.addSubject(subject)
    }

    fun getSubjects():LiveData<List<Subject>>{
        return subjectRepository.getSubjects()
    }


}