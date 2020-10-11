package ir.sematec.ap.utils

import android.content.Context
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import ir.sematec.ap.BuildConfig
import ir.sematec.ap.R


fun ImageView.load(ctx: Context, url: String) {
    Glide
        .with(ctx)
        .load(url)
        .centerCrop()
        .placeholder(R.drawable.avatar)
        .into(this)
}
fun ImageView.load(ctx: Context, file:Int) {
    Glide
        .with(ctx)
        .load(file)
        .centerCrop()
        .placeholder(R.drawable.avatar)
        .into(this)
}


fun String.log(tag: String = "sematec_ap_debug") {
    if(BuildConfig.DEBUG){
        Log.d(tag, this)
    }
}

fun Int.log(tag: String = "sematec_ap_debug") {
    this.toString().log(tag)
}


fun String.toast(){
    Toast.makeText(MainApplication.context , this , Toast.LENGTH_LONG).show()
}