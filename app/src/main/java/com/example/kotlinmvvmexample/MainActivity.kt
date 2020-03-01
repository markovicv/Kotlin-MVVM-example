package com.example.kotlinmvvmexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.kotlinmvvmexample.injector.Injector
import com.example.kotlinmvvmexample.model.Subject
import com.example.kotlinmvvmexample.viewmodel.SubjectViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init(){
        val factoryVM = Injector.provideSubjectsViewModelFactory()
        val viewModel = ViewModelProviders.of(this,factoryVM).get(SubjectViewModel::class.java)

        viewModel.getSubjects().observe(this, Observer {subjects->
            val stringBuilder = StringBuilder()
            subjects.forEach{
                subject-> stringBuilder.append("$subject\n")
            }
            bodyId.text = stringBuilder.toString()

        })
        addId.setOnClickListener{
            val subject = Subject(nameId.text.toString(),gradeId.text.toString())
            viewModel.addSubject(subject)
            nameId.setText("")
            gradeId.setText("")
        }
    }
}
