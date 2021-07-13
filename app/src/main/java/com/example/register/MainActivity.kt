package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvNumbers:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayContacts()
    }
    fun displayContacts(){
      var contactView= listOf<Contact>(
          Contact("esther","esther@gmail.com","0678876655545"),
          Contact("phiphi","phiphi@gmail.com","07887665574"),
          Contact("titus","titus@gmail.com","079887665524"),
          Contact("Sincere","sincereahereza@gmail.com","07588766565845"),
          Contact("janet","anyijukire@gmail.com","07985643289"),
      Contact("Belyse","belyse@gmail.com","07789468934"),
          Contact("Timothy","timo@gmail.com","25467898990989")

      )
        rvNumbers=findViewById(R.id.rvNumbers)
        var contactAdapter=ContactsAdapter(contactView)
        rvNumbers.layoutManager=LinearLayoutManager(baseContext)
        rvNumbers.adapter=contactAdapter

    }
}