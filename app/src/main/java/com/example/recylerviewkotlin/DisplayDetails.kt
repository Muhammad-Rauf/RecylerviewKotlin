package com.example.recylerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DisplayDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_details)
        val deatiltitle:TextView=findViewById(R.id.detailTitleid)
        val detailimage:ImageView=findViewById(R.id.detailimageViewid)
        val deatiltext:TextView=findViewById(R.id.detailstextView2)


        val bundle:Bundle?=intent.extras
        val title2=bundle!!.getString("title")
        val image2=bundle.getInt("imagekey")
        val detail2=bundle.getString("discription")



        deatiltitle.text=title2
        detailimage.setImageResource(image2)
        deatiltext.text=detail2

    }
}