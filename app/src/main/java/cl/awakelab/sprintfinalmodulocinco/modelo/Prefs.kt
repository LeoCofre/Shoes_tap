package cl.awakelab.sprintfinalmodulocinco.modelo

import android.content.Context
import android.content.SharedPreferences

class Prefs(context: Context) {
    val PREFS_NAME = "coockie"

    val mSharedPreferences : SharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    fun agregarPrefs(keyPrefs: String){
        mSharedPreferences.edit().putString(keyPrefs, keyPrefs).apply()
    }

    fun clean(){
        mSharedPreferences.edit().clear().apply()
    }
    fun removeItem(keyDelete: String){
        mSharedPreferences.edit().remove(keyDelete).apply()
    }
    fun showAll(): String{
        return mSharedPreferences.all.toString()
    }
}
