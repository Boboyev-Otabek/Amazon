package com.example.amazon.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.amazon.R
import com.example.amazon.model.Book
import com.google.android.material.imageview.ShapeableImageView

class BookAdapter(var context: Context, var item: ArrayList<Book>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemCount(): Int {
        return item.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_book_view, parent, false)
        return BookViewHolder(view)

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var book = item[position]

        if (holder is BookViewHolder) {
            var iv_profile = holder.iv_profile
            var tv_fullname = holder.tv_fullname
            var tv_new_price = holder.tv_new_price
            var tv_sent = holder.tv_sent
            var tv_old_price = holder.tv_old_price


            iv_profile.setImageResource(book.profile)
            tv_fullname.text = book.fullname
            tv_new_price.text = book.new_price
            tv_sent.text = book.sent
            tv_old_price.text = book.old_price
        }
    }

    class BookViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var iv_profile: ShapeableImageView
        var tv_fullname: TextView
        var tv_new_price: TextView
        var tv_sent: TextView
        var tv_old_price: TextView

        init {
            iv_profile = view.findViewById(R.id.iv_book)
            tv_fullname = view.findViewById(R.id.tv_book_name)
            tv_new_price = view.findViewById(R.id.tv_new_price)
            tv_sent = view.findViewById(R.id.tv_sent)
            tv_old_price = view.findViewById(R.id.tv_old_price)
        }
    }
}