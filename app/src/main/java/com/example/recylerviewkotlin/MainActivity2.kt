package com.example.recylerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recylerviewkotlin.adapters.MyAdapter2
import com.example.recylerviewkotlin.models.Songs

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var  recyclerView: RecyclerView =findViewById(R.id.recyclerView2id)

        //val songs:List<String> = listOf("Hello","My Hera","ABC","XYZ","XYZ","XYZ","XYZ","XYZ","XYZ","XYZ","XYZ","ABC")
        val songsObject = mutableListOf<Songs>()
        songsObject.add(Songs("Kyu K Tum e Ho 1","Aashiqui 2  is a 2013 Indian Hindi-language romantic musical drama film directed by Mohit Suri and produthe film stars Aditya Roy Kapur and Shraddha Kapoor in the lead roles, with Shaad Randhawa and Mahesh Thakur in supporting roles, as well as Salil Acharya in a cameo appearance. The film was one of the highest-grossing Bollywood movie of 2013.",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho 2","Aashiqui 2  is a 2013 Indian Hindi-language romantic musical drama film directed by Mohit Suri and produthe film stars Aditya Roy Kapur and Shraddha Kapoor in the lead roles, with Shaad Randhawa and Mahesh Thakur in supporting roles, as well as Salil Acharya in a cameo appearance. The film was one of the highest-grossing Bollywood movie of 2013.",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho 3","Aashiqui 2  is a 2013 Indian Hindi-language romantic musical drama film directed by Mohit Suri and produthe film stars Aditya Roy Kapur and Shraddha Kapoor in the lead roles, with Shaad Randhawa and Mahesh Thakur in supporting roles, as well as Salil Acharya in a cameo appearance. The film was one of the highest-grossing Bollywood movie of 2013.",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho 4","Aashiqui 2  is a 2013 Indian Hindi-language romantic musical drama film directed by Mohit Suri and produthe film stars Aditya Roy Kapur and Shraddha Kapoor in the lead roles, with Shaad Randhawa and Mahesh Thakur in supporting roles, as well as Salil Acharya in a cameo appearance. The film was one of the highest-grossing Bollywood movie of 2013.",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho 5","Aashiqui 2  is a 2013 Indian Hindi-language romantic musical drama film directed by Mohit Suri and produthe film stars Aditya Roy Kapur and Shraddha Kapoor in the lead roles, with Shaad Randhawa and Mahesh Thakur in supporting roles, as well as Salil Acharya in a cameo appearance. The film was one of the highest-grossing Bollywood movie of 2013.",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho 6","Aashiqui 2  is a 2013 Indian Hindi-language romantic musical drama film directed by Mohit Suri and produthe film stars Aditya Roy Kapur and Shraddha Kapoor in the lead roles, with Shaad Randhawa and Mahesh Thakur in supporting roles, as well as Salil Acharya in a cameo appearance. The film was one of the highest-grossing Bollywood movie of 2013.",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho 7","Aashiqui 2  is a 2013 Indian Hindi-language romantic musical drama film directed by Mohit Suri and produthe film stars Aditya Roy Kapur and Shraddha Kapoor in the lead roles, with Shaad Randhawa and Mahesh Thakur in supporting roles, as well as Salil Acharya in a cameo appearance. The film was one of the highest-grossing Bollywood movie of 2013.",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho 8","Aashiqui 2  is a 2013 Indian Hindi-language romantic musical drama film directed by Mohit Suri and produthe film stars Aditya Roy Kapur and Shraddha Kapoor in the lead roles, with Shaad Randhawa and Mahesh Thakur in supporting roles, as well as Salil Acharya in a cameo appearance. The film was one of the highest-grossing Bollywood movie of 2013.",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho 9","Aashiqui 2  is a 2013 Indian Hindi-language romantic musical drama film directed by Mohit Suri and produthe film stars Aditya Roy Kapur and Shraddha Kapoor in the lead roles, with Shaad Randhawa and Mahesh Thakur in supporting roles, as well as Salil Acharya in a cameo appearance. The film was one of the highest-grossing Bollywood movie of 2013.",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho 10","Aashiqui 2  is a 2013 Indian Hindi-language romantic musical drama film directed by Mohit Suri and produthe film stars Aditya Roy Kapur and Shraddha Kapoor in the lead roles, with Shaad Randhawa and Mahesh Thakur in supporting roles, as well as Salil Acharya in a cameo appearance. The film was one of the highest-grossing Bollywood movie of 2013.",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho 11","Aashiqui 2  is a 2013 Indian Hindi-language romantic musical drama film directed by Mohit Suri and produthe film stars Aditya Roy Kapur and Shraddha Kapoor in the lead roles, with Shaad Randhawa and Mahesh Thakur in supporting roles, as well as Salil Acharya in a cameo appearance. The film was one of the highest-grossing Bollywood movie of 2013.",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho 12","Aashiqui 2  is a 2013 Indian Hindi-language romantic musical drama film directed by Mohit Suri and produthe film stars Aditya Roy Kapur and Shraddha Kapoor in the lead roles, with Shaad Randhawa and Mahesh Thakur in supporting roles, as well as Salil Acharya in a cameo appearance. The film was one of the highest-grossing Bollywood movie of 2013.",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho 13","Aashiqui 2  is a 2013 Indian Hindi-language romantic musical drama film directed by Mohit Suri and produthe film stars Aditya Roy Kapur and Shraddha Kapoor in the lead roles, with Shaad Randhawa and Mahesh Thakur in supporting roles, as well as Salil Acharya in a cameo appearance. The film was one of the highest-grossing Bollywood movie of 2013.",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho 14","Aashiqui 2  is a 2013 Indian Hindi-language romantic musical drama film directed by Mohit Suri and produthe film stars Aditya Roy Kapur and Shraddha Kapoor in the lead roles, with Shaad Randhawa and Mahesh Thakur in supporting roles, as well as Salil Acharya in a cameo appearance. The film was one of the highest-grossing Bollywood movie of 2013.",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho 15","Aashiqui 2  is a 2013 Indian Hindi-language romantic musical drama film directed by Mohit Suri and produthe film stars Aditya Roy Kapur and Shraddha Kapoor in the lead roles, with Shaad Randhawa and Mahesh Thakur in supporting roles, as well as Salil Acharya in a cameo appearance. The film was one of the highest-grossing Bollywood movie of 2013.",R.drawable.ashiq2pic))

        var adapterobj=MyAdapter2(songsObject)
        recyclerView.adapter=adapterobj

        adapterobj.setonItemClickListener(object :MyAdapter2.onItemClickListener{
            override fun onItemClick(position: Int) {
              //  Toast.makeText(this@MainActivity2,"You Click item $position", Toast.LENGTH_LONG).show()
                var intent =Intent(this@MainActivity2,DisplayDetails::class.java)
                intent.putExtra("title",songsObject[position].title)
                intent.putExtra("discription",songsObject[position].description)
                intent.putExtra("imagekey",songsObject[position].image)

                startActivity(intent)

            }

        })
        recyclerView.layoutManager=LinearLayoutManager(this)



    }
}