package ir.sematec.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("ActivityLifecycle" , "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("ActivityLifecycle" , "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityLifecycle" , "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ActivityLifecycle" , "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActivityLifecycle" , "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityLifecycle" , "onDestroy")
    }
}