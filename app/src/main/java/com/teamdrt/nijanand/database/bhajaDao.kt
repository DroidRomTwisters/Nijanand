package com.teamdrt.nijanand.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface bhajaDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun Insert(bhajan: bhajan)

    @Update
    fun update(bhajan: bhajan)

    @Delete
    fun delete(bhajan: bhajan)

    @Query("select * from bhajan")
    fun getAllBhajan():LiveData<List<bhajan>>

    @Query("select * from bhajan where favourite")
    fun getAllFavourites():LiveData<List<bhajan>>
}