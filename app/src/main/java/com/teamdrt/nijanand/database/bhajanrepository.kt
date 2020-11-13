package com.teamdrt.nijanand.database

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.room.Update
import com.teamdrt.nijanand.Utils.subscribeOnBackground

class bhajanrepository(application: Application){
    private var bhajaDao:bhajaDao
    var getALlbhajan:LiveData<List<bhajan>>

    private val database=bhajandatabase.getInstance(application)

    init {
        bhajaDao=database.bhajanDao()
        getALlbhajan=bhajaDao.getAllBhajan()
    }

    fun insert(bhajan: bhajan){
        subscribeOnBackground {
            bhajaDao.Insert(bhajan)
        }
    }

    fun Update(bhajan: bhajan){
        subscribeOnBackground {
            bhajaDao.update(bhajan)
        }
    }

    fun delete(bhajan: bhajan){
        subscribeOnBackground {
            bhajaDao.delete(bhajan)
        }
    }
}