package com.example.helical_conveyor_design.packageutilidad

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

class Glide {

    @BindingAdapter("url")
    fun loadImage(view: ImageView, url: String){
        Glide.with(view)
            .load(url)
            .into(view)
    }
}