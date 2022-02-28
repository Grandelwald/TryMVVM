package com.example.trymvvm.presentation.utils

import android.widget.TextView
import androidx.databinding.BindingAdapter
import java.text.SimpleDateFormat
import java.util.*

@BindingAdapter("app:createdDate")
fun bindCreateDate(textView: TextView, date : Date?){
    val dateFormat = SimpleDateFormat("yyyy,MM,dd",Locale.KOREA)
}
