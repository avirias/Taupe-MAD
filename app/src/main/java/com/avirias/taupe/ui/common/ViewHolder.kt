package com.avirias.taupe.ui.common

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class ViewHolder<in T>(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun bind(data: T)
}