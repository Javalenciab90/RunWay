package com.java90.runway.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.java90.runway.R
import com.java90.runway.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrackingFragment : Fragment(R.layout.fragment_tracking) {

    private val viewModel: MainViewModel by viewModels()
}