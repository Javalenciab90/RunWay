package com.java90.runway.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.java90.runway.repositories.MainRepository

class StatisticsViewModel
    @ViewModelInject constructor(private val mainRepository: MainRepository) : ViewModel() {

}