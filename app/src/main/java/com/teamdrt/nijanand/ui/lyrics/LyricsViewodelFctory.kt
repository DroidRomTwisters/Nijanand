package com.teamdrt.nijanand.ui.lyrics

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.teamdrt.nijanand.database.bhajandatabase

class LyricsViewodelFctory(val application: Application):ViewModelProvider.Factory {
    /**
     * Creates a new instance of the given `Class`.
     *
     *
     *
     * @param modelClass a `Class` whose instance is requested
     * @param <T>        The type parameter for the ViewModel.
     * @return a newly created ViewModel
    </T> */
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LyricsViewModel::class.java)){
            return LyricsViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}