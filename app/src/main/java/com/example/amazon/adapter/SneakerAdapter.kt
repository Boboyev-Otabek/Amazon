package com.example.amazon.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.amazon.R
import com.example.amazon.model.Sneaker
import com.google.android.material.imageview.ShapeableImageView

class SneakerAdapter(var context: Context, var item:ArrayList<Sneaker>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemCount(): Int {
        return item.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var sneaker=item[position]

        if(holder is SneakerViewHolder )
        {
            var iv_profile=holder.iv_profile

            iv_profile.setImageResource(sneaker.profile)
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_sneaker_view,parent,false)
        return SneakerViewHolder(view)
    }
    class SneakerViewHolder(view: View):RecyclerView.ViewHolder(view){

        var iv_profile:ShapeableImageView

        init {
            iv_profile=view.findViewById(R.id.iv_sneaker)
        }

    }
}