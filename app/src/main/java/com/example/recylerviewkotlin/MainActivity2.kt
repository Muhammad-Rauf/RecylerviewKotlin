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
        songsObject.add(Songs("Kyu K Tum e Ho","Aashiqui 1 Movie best Song",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho","Aashiqui 2 Movie best Song",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho","Aashiqui 3 Movie best Song",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho","Aashiqui 4 Movie best Song",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho","Aashiqui 5 Movie best Song",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho","Aashiqui 6 Movie best Song",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho","Aashiqui 7 Movie best Song",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho","Aashiqui 8 Movie best Song",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho","Aashiqui 9 Movie best Song",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho","Aashiqui 10 Movie best Song",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho","Aashiqui 11 Movie best Song",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho","Aashiqui 12 Movie best Song",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho","Aashiqui 13 Movie best Song",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho","Aashiqui 14 Movie best Song",R.drawable.ashiq2pic))
        songsObject.add(Songs("Kyu K Tum e Ho","Aashiqui 15 Movie best Song",R.drawable.ashiq2pic))
         var adapterobj=MyAdapter2(songsObject)
        recyclerView.adapter=adapterobj

        adapterobj.setonItemClickListener(object :MyAdapter2.onItemClickListener{
            override fun onItemClick(position: Int) {
                Toast.makeText(this@MainActivity2,"You Click item $position", Toast.LENGTH_LONG).show()
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