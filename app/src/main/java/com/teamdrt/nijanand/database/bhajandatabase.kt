package com.teamdrt.nijanand.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [bhajan::class],version = 1)
abstract class bhajandatabase:RoomDatabase(){
    abstract fun bhajanDao():bhajaDao

    companion object{
        private var instance:bhajandatabase?=null

        fun getInstance(context: Context):bhajandatabase{
            if (instance == null) {
                instance = Room.databaseBuilder(
                        context.applicationContext,
                       bhajandatabase::class.java,
                        "bhajan"
                )
                        .fallbackToDestructiveMigration()
                        .build()
            }
            return instance!!
        }
    }
}