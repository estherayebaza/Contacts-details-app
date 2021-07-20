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
          Contact("esther","esther@gmail.com","0678876655545","https://images.unsplash.com/photo-1560238970-cc0ae073d3a5?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTF8fGdpcmxzfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
          Contact("phiphi","phiphi@gmail.com","07887665574","https://images.unsplash.com/photo-1597586124394-fbd6ef244026?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fGdpcmxzfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
          Contact("titus","titus@gmail.com","079887665524","https://images.unsplash.com/photo-1604436122917-66306388da12?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=334&q=80"),
          Contact("Sincere","sincereahereza@gmail.com","07588766565845","https://images.unsplash.com/photo-1560238970-cc0ae073d3a5?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTF8fGdpcmxzfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
          Contact("janet","anyijukire@gmail.com","07985643289","https://images.unsplash.com/photo-1529626455594-4ff0802cfb7e?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8Z2lybHN8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
          Contact("Belyse","belyse@gmail.com","07789468934","https://images.unsplash.com/photo-1529626455594-4ff0802cfb7e?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8Z2lybHN8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
          Contact("Timothy","timo@gmail.com","25467898990989","https://images.unsplash.com/photo-1517841905240-472988babdf9?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8cGVvcGxlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60")

      )
        rvNumbers=findViewById(R.id.rvNumbers)
        var contactAdapter=ContactsAdapter(contactView,baseContext)
        rvNumbers.layoutManager=LinearLayoutManager(baseContext)
        rvNumbers.adapter=contactAdapter

    }
}