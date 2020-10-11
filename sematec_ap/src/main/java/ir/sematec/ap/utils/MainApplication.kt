package ir.sematec.ap.utils

import android.app.Application
import android.content.Context
import com.orhanobut.hawk.Hawk

class MainApplication : Application() {

    companion object {
       lateinit var context : Context
    }

    override fun onCreate() {
        super.onCreate()
        Hawk.init(this).build()
        context = this
   }


    override fun onLowMemory() {
        super.onLowMemory()
    }

    override fun onTerminate() {
        super.onTerminate()
    }

}