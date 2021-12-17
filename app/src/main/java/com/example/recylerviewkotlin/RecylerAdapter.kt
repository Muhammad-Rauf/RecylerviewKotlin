package com.example.recylerviewkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class RecylerAdapter : RecyclerView.Adapter<RecylerAdapter.ViewHolderclass>(){

private var titles= arrayOf("Chapter 1","Chapter 2","Chapter 3","Chapter 4","Chapter 5","Chapter 6")
private var details= arrayOf("chapter One detail ","Chapter Two detail","Chapter Three detail","Chapter Four detail","Chapter Five detail","Chapter six detail")
private val images= arrayOf(R.drawable.luddo,R.drawable.luddo,R.drawable.luddo,R.drawable.luddo,R.drawable.luddo,R.drawable.luddo)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecylerAdapter.ViewHolderclass {

        val v=LayoutInflater.from(parent.context).inflate(R.layout.cardlayout,parent,false)
        return ViewHolderclass(v)
    }

    override fun onBindViewHolder(holder: RecylerAdapter.ViewHolderclass, position: Int) {
       holder.itemTitle.text=titles[position]
        holder.itemDetail.text=details[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
      return titles.size
    }
   inner class ViewHolderclass(itemView: View): RecyclerView.ViewHolder(itemView) {
       var itemImage:ImageView
       var itemTitle:TextView
       var itemDetail:TextView
       init {
           itemImage=itemView.findViewById(R.id.item_imageid)
           itemTitle=itemView.findViewById(R.id.itemtileid)
           itemDetail=itemView.findViewById(R.id.item_detailid)
           itemView.setOnClickListener{
               val position:Int=adapterPosition
               Toast.makeText(itemView.context,"You click on ${titles[position]}",Toast.LENGTH_LONG).show()
           }

       }



    }
}