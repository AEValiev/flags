package uz.evkalipt.flagquiz

import android.content.Context
import android.content.SharedPreferences

object MySharedPreference {

    private const val NAME = "preference"
    private const val MODE = Context.MODE_PRIVATE
    private lateinit var preferences: SharedPreferences

    fun init(context: Context){
        preferences =context.getSharedPreferences(NAME, MODE)
    }

    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editor: SharedPreferences.Editor = edit()
        operation(editor)
        editor.apply()
    }

    var euro1CountStars:String?
        get() = preferences.getString("euro1CountStars","")
        set(value) =MySharedPreference.preferences.edit {
            if (value!=null){
                it.putString("euro1CountStars",value)
            }
        }

    var euro2CountStars:String?
        get() = preferences.getString("euro2CountStars","")
        set(value) =MySharedPreference.preferences.edit {
            if (value!=null){
                it.putString("euro2CountStars",value)
            }
        }
    var northAmericaCountStars:String?
        get() = preferences.getString("northAmericaCountStars","")
        set(value) =MySharedPreference.preferences.edit {
            if (value!=null){
                it.putString("northAmericaCountStars",value)
            }
        }

    var southAmericaCountStars:String?
        get() = preferences.getString("southAmericaCountStars","")
        set(value) =MySharedPreference.preferences.edit {
            if (value!=null){
                it.putString("southAmericaCountStars",value)
            }
        }
    var asia1CountStars:String?
        get() = preferences.getString("asia1CountStars","")
        set(value) =MySharedPreference.preferences.edit {
            if (value!=null){
                it.putString("asia1CountStars",value)
            }
        }
    var asia2CountStars:String?
        get() = preferences.getString("asia2CountStars","")
        set(value) =MySharedPreference.preferences.edit {
            if (value!=null){
                it.putString("asia2CountStars",value)
            }
        }
    var africa1CountStars:String?
        get() = preferences.getString("africa1CountStars","")
        set(value) =MySharedPreference.preferences.edit {
            if (value!=null){
                it.putString("africa1CountStars",value)
            }
        }

    var africa2CountStars:String?
        get() = preferences.getString("africa2CountStars","")
        set(value) =MySharedPreference.preferences.edit {
            if (value!=null){
                it.putString("africa2CountStars",value)
            }
        }
    var allFlagsCountStars:String?
        get() = preferences.getString("allFlagsCountStars","")
        set(value) =MySharedPreference.preferences.edit {
            if (value!=null){
                it.putString("allFlagsCountStars",value)
            }
        }




    var europe2sp:Boolean
        get() = preferences.getBoolean("europe2sp",false)
        set(value) =MySharedPreference.preferences.edit {
            if (value!=null){
                it.putBoolean("europe2sp",value)
            }
        }

    var northAmericasp:Boolean
        get() = preferences.getBoolean("northAmericasp",false)
        set(value) =MySharedPreference.preferences.edit {
            if (value!=null){
                it.putBoolean("northAmericasp",value)
            }
        }

    var southAmericasp:Boolean
        get() = preferences.getBoolean("southAmericasp",false)
        set(value) =MySharedPreference.preferences.edit {
            if (value!=null){
                it.putBoolean("southAmericasp",value)
            }
        }

    var asia1sp:Boolean
        get() = preferences.getBoolean("asia1sp",false)
        set(value) =MySharedPreference.preferences.edit {
            if (value!=null){
                it.putBoolean("asia1sp",value)
            }
        }

    var asia2sp:Boolean
        get() = preferences.getBoolean("asia2sp",false)
        set(value) =MySharedPreference.preferences.edit {
            if (value!=null){
                it.putBoolean("asia2sp",value)
            }
        }

    var africa1sp:Boolean
        get() = preferences.getBoolean("africa1sp",false)
        set(value) =MySharedPreference.preferences.edit {
            if (value!=null){
                it.putBoolean("africa1sp",value)
            }
        }

    var africa2sp:Boolean
        get() = preferences.getBoolean("africa2sp",false)
        set(value) =MySharedPreference.preferences.edit {
            if (value!=null){
                it.putBoolean("africa2sp",value)
            }
        }

    var allFlagssp:Boolean
        get() = preferences.getBoolean("allFlagssp",false)
        set(value) =MySharedPreference.preferences.edit {
            if (value!=null){
                it.putBoolean("allFlagssp",value)
            }
        }
}