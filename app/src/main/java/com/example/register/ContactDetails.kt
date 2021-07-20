package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.squareup.picasso.Picasso

class ContactDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState
        )
        setContentView(R.layout.activity_contact_details)

        var name=intent.getStringExtra("name")
        var nameIntent=intent.getStringExtra("name")
        var emailIntent=intent.getStringExtra("email")
        var phoneNumberIntent=intent.getStringExtra("phoneNumber")
        var imageIntent=intent.getStringExtra("ImageView")

        val  tvName=findViewById<TextView>(R.id.tvName)
        val  tvEmail=findViewById<TextView>(R.id.tvEmail)
        val  tvPhoneNumber=findViewById<TextView>(R.id.tvPhoneNumber)
        val  imageView=findViewById<ImageView>(R.id.imageView)
        Toast.makeText(baseContext,name,Toast.LENGTH_LONG).show()

        tvName.text=nameIntent
        tvPhoneNumber.text=phoneNumberIntent
        tvEmail.text=emailIntent
        Picasso.get()
            .load(imageIntent)
            .into(imageView)
    }
}