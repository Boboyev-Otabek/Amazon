package com.example.amazon.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.amazon.R
import com.example.amazon.model.Font
import com.google.android.material.imageview.ShapeableImageView

class FontAdapter(var context: Context, var item: ArrayList<Font>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_font_view,parent,false)
        return FontViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var font=item[position]

        if(holder is FontViewHolder){

            var tv_title=holder.tv_title
            var iv_profile=holder.iv_profile

            tv_title.text=font.title
            iv_profile.setImageResource(font.profile)

        }


    }
    class FontViewHolder(view: View):RecyclerView.ViewHolder(view){
        var tv_title:TextView

        var iv_profile:ShapeableImageView

        init {
            tv_title=view.findViewById(R.id.tv_tile)
            iv_profile=view.findViewById(R.id.iv_font)
        }
    }
}