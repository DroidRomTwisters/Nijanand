package com.teamdrt.nijanand.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "bhajan")
data class bhajan(
        @PrimaryKey(autoGenerate = true)
        val id:Int,

        val name:String,

        val lyrics:String,

        val favourite:Boolean
)