package ru.startandroid.game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun hb(view : View){
        progressBar.progress += 2
        if (progressBar.progress == 100)
            progressBar.progress = 50
    }

    fun lb(view : View){
        progressBar.progress -= 2
        if (progressBar.progress == 0)
            progressBar.progress = 50
    }

}
