package com.example.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var contactList = listOf(
            Contact("John Smith"),
            Contact("Brian Davis"),
            Contact("Tom Jones")
        )

        val adapter = ContactAdapter(contactList)
    }
}