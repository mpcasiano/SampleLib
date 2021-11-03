package com.example.toast

import android.content.Context
import android.widget.Toast

object Toast {
    fun show(context: Context) {
        Toast.makeText(context, "Hello Worlddd", Toast.LENGTH_SHORT).show()
    }
}