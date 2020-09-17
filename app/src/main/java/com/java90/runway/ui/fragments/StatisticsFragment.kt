package com.java90.runway.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.java90.runway.R
import com.java90.runway.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics) {

    private val viewModel: MainViewModel by viewModels()
}