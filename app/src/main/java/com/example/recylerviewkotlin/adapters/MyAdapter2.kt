package com.example.recylerviewkotlin.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recylerviewkotlin.R
import com.example.recylerviewkotlin.models.Songs

class MyAdapter2(val songs: List<Songs>) : RecyclerView.Adapter<MyAdapter2.MyViewholderClass>() {
    private lateinit var mlistener: onItemClickListener

    interface onItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setonItemClickListener(listener: onItemClickListener) {
        mlistener = listener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyAdapter2.MyViewholderClass {
        val infalter =
            LayoutInflater.from(parent.context).inflate(R.layout.itemlayout2, parent, false)
        return MyViewholderClass(infalter, mlistener)
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    override fun onBindViewHolder(holder: MyAdapter2.MyViewholderClass, position: Int) {
        holder.itemTitle.text = songs[position].title
        holder.itemDetail.text = songs[position].description
        holder.itemImage.setImageResource(songs[position].image)
    }


    inner class MyViewholderClass(itemView: View, listener: onItemClickListener) :
        RecyclerView.ViewHolder(itemView) {
        var itemImage = itemView.findViewById<ImageView>(R.id.item2_imageid)
        var itemTitle = itemView.findViewById<TextView>(R.id.item2titleid)
        var itemDetail = itemView.findViewById<TextView>(R.id.item2_detailid)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)

            }
        }


//        var itemImage: ImageView
//        var itemTitle: TextView
//        var itemDetail: TextView
//        init {
//            itemImage=itemView.findViewById(R.id.item2_imageid)
//            itemTitle=itemView.findViewById(R.id.item2tileid)
//            itemDetail=itemView.findViewById(R.id.item2_detailid)
//           itemView.setOnClickListener{
//                val position:Int=adapterPosition
//                Toast.makeText(itemView.context,"You click on ${titles[position]}", Toast.LENGTH_LONG).show()
//           }
    }
}
