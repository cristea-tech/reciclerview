package com.example.reciclerviewapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class HomeFeed(val videos: List<Video>)

class Video(val id: Int, val name: String, val link: String, val imageUrl: String,
            val numberOfViews: Int, val channel: Channel)

class Channel(val name: String, val profileImageUrl: String)

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view){

}
