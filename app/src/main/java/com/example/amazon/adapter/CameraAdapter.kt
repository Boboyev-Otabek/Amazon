package com.example.amazon.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.amazon.R
import com.example.amazon.model.Camera
import com.google.android.material.imageview.ShapeableImageView

class CameraAdapter(var context: Context,var item:ArrayList<Camera>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_camera_view,parent,false)
        return CameraViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var camera=item[position]
        if(holder is CameraViewHolder){
            var iv_profile=holder.iv_profile
            iv_profile.setImageResource(camera.profile)
        }
    }
    class CameraViewHolder(view: View):RecyclerView.ViewHolder(view){
        var iv_profile:ShapeableImageView

        init {
            iv_profile=view.findViewById(R.id.iv_camera)
        }
    }
}