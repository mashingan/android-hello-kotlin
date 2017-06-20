package com.rdr.kotlinhello

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.rdr.kotlinhello.R.id.buttonInput
import com.rdr.kotlinhello.R.id.input
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonInputObj = findViewById(buttonInput) as Button
        var inputObj = findViewById(input) as TextView
        buttonInputObj.setOnClickListener { toast("Message: ${inputObj.text}") }
    }
}
