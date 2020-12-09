package com.java90.runway.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.java90.runway.db.Run
import com.java90.runway.repositories.MainRepository
import kotlinx.coroutines.launch

class MainViewModel
    @ViewModelInject constructor(private val mainRepository: MainRepository): ViewModel() {

    val runsSortedByDate = mainRepository.getAllRunsSortedByDate()

    fun insertRun(run: Run) = viewModelScope.launch {
        mainRepository.insertRun(run)
    }
}