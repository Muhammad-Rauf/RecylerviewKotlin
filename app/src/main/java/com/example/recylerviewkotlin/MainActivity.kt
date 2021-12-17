package com.example.recylerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var layoutManager:RecyclerView.LayoutManager?=null
    private var adapter:RecyclerView.Adapter<RecylerAdapter.ViewHolderclass>?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var  recyclerView:RecyclerView=findViewById(R.id.recyclerViewid)
        layoutManager=LinearLayoutManager(this)
       recyclerView.layoutManager=layoutManager
        adapter=RecylerAdapter()
        recyclerView.adapter=adapter


    }
}