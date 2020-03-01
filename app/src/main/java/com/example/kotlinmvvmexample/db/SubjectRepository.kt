package com.example.kotlinmvvmexample.db

import androidx.lifecycle.LiveData
import com.example.kotlinmvvmexample.model.Subject

class SubjectRepository private constructor(val subjectDao: SubjectDao) {


    companion object{
        private var instance :SubjectRepository? = null


        fun getInstance(subjectDao: SubjectDao):SubjectRepository{
            if(instance==null){
                instance = SubjectRepository(subjectDao)
            }
            return instance as SubjectRepository



        }
    }

    fun addSubject(subject: Subject){
        subjectDao.addSubject(subject)
    }
    fun getSubjects():LiveData<List<Subject>>{
        return subjectDao.getSubjects()
    }
}