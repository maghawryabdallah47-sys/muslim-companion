package com.muslimcompanion

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this)
        textView.text = "رفيق المسلم"
        textView.textSize = 24f
        textView.setPadding(32, 64, 32, 32)

        setContentView(textView)
    }
}
