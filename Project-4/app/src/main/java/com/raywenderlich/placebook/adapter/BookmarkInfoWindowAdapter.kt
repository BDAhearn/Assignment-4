package com.raywenderlich.placebook.adapter

import android.app.Activity
import android.graphics.Bitmap
import android.view.View
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Marker
import com.raywenderlich.placebook.databinding.ContentBookmarkInfoBinding
import com.raywenderlich.placebook.ui.MapsActivity

class BookmarkInfoWindowAdapter(context: Activity) :
    GoogleMap.InfoWindowAdapter {
    private val binding =
        ContentBookmarkInfoBinding.inflate(context.layoutInflater)

    override fun getInfoWindow(marker: Marker): View? {
        return null
    }

    override fun getInfoContents(marker: Marker): View? {
        binding.title.text = marker.title ?: ""
        binding.phone.text = marker.snippet ?: ""
        val imageView = binding.photo

        imageView.setImageBitmap((marker.tag as MapsActivity.PlaceInfo).image)

        return binding.root
    }
}