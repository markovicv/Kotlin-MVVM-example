package com.example.kotlinmvvmexample.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinmvvmexample.db.SubjectRepository

class SubjectViewModelFactory(private val subjectRepository: SubjectRepository) : ViewModelProvider.NewInstanceFactory() {


    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return SubjectViewModel(subjectRepository) as T
    }
}