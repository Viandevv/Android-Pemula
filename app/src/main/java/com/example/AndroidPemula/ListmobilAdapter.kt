package com.example.AndroidPemula

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListmobilAdapter(val listmobil: ArrayList<mobil>) : RecyclerView.Adapter<ListmobilAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_card_mobil, viewGroup,false )
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listmobil.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, photo, overview, identity) = listmobil[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = name

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, detail_mobil::class.java)
            moveDetail.putExtra(detail_mobil.EXTRA_NAME, name)
            moveDetail.putExtra(detail_mobil.EXTRA_PHOTO, photo)
            moveDetail.putExtra(detail_mobil.EXTRA_IDENTITY, identity)
            moveDetail.putExtra(detail_mobil.EXTRA_OVERVIEW, overview)
            mContext.startActivity(moveDetail)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

}