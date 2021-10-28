package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if (string1Etv.text.isEmpty() || string2Etv.text.isEmpty()){
                outputTv.text = "please enter strings"
            }
            else{

                checkStringCompare()

            }
        }
    }

    private fun checkStringCompare(): Boolean {
        val first: CharArray = string1Etv.text.toString().toCharArray()
        val second = string2Etv.text.toString().toCharArray()

        first.forEach { a1 ->
            second.forEach { s2 ->
                return if(a1 == s2){
                    outputTv.text = "True- string2 is a sub string of string1"
                    true
                } else{
                    outputTv.text = "False- Not a substring"
                    false
                }
            }
        }
        return false
    }
}