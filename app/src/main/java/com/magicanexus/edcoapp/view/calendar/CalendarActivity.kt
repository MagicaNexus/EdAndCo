package com.magicanexus.edcoapp.view.calendar



import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.magicanexus.edcoapp.R
import com.magicanexus.edcoapp.viewmodel.MainActivityViewModel
import timber.log.Timber


class CalendarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        val viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        viewModel.getPosts().observe(this, Observer {
            Timber.e("$it")
        })
    }
}