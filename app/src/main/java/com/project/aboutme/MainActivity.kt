package com.project.aboutme

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        done_button.setOnClickListener {

            buttonDone()
        }

        nickname_text.setOnClickListener{

            nickname_edit.visibility = View.VISIBLE
            nickname_text.visibility = View.GONE
            done_button.visibility = View.VISIBLE
            nickname_edit.requestFocus()
            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.showSoftInput(nickname_text, 0)
        }
    }

    private fun buttonDone(){

        nickname_text.text = nickname_edit.text
        nickname_text.visibility = View.VISIBLE
        nickname_edit.visibility = View.GONE
        done_button.visibility = View.GONE
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(done_button.windowToken, 0)
    }
}
