package com.olgatech.incrementzuri

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var count: Int = 0
    lateinit var showCount : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showCount = findViewById(R.id.textView)
        val increase = findViewById<Button>(R.id.incrementBtn)
        increase.setOnClickListener {countUp(increase) }
    }

    //Increases the counter by 1 and displays the result
    @SuppressLint("SetTextI18n")
    fun countUp(view: View) {
        count++
        showCount.text = Integer.toString(count)
    }
}