package cl.awakelab.sprintfinalmodulocinco.modelo

import android.app.Application

class SharedApp : Application() {
companion object{
    lateinit var prefer: Prefs

}
    override fun onCreate() {
        super.onCreate()
        prefer = Prefs(applicationContext)
    }
}
