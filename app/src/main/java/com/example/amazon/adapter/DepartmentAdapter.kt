package com.example.amazon.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.amazon.R
import com.example.amazon.model.Department
import com.google.android.material.imageview.ShapeableImageView

class DepartmentAdapter(var context: Context, var item:ArrayList<Department>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemCount(): Int {
        return item.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_department_view,parent,false)
        return DepartmentViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var department=item[position]

        if(holder is DepartmentViewHolder){

            var iv_profile=holder.iv_profile
            var tv_fullname=holder.tv_fullname

            iv_profile.setImageResource(department.profile)
            tv_fullname.text=department.fullname
        }
    }
    class DepartmentViewHolder(view: View):RecyclerView.ViewHolder(view){

        var iv_profile:ShapeableImageView
        var tv_fullname:TextView

        init {
            iv_profile=view.findViewById(R.id.im_department)
            tv_fullname=view.findViewById(R.id.department_name)
        }
    }
}