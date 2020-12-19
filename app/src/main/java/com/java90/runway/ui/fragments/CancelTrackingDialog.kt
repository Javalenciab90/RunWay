package com.java90.runway.ui.fragments

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.java90.runway.R

class CancelTrackingDialog : DialogFragment() {

    private var yesListener: (() -> Unit)? = null
    fun setYesListener(listener: () -> Unit) {
        yesListener = listener
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return MaterialAlertDialogBuilder(requireContext(), R.style.AlertDialogTheme)
                .setTitle("Cancel the Run?")
                .setMessage("Are you sure to cancel the current run and delete all its data?")
                .setIcon(R.drawable.ic_delete)
                .setPositiveButton("YES") { _, _ ->
                    yesListener?.let { yes -> yes() }
                }
                .setNegativeButton("NO") { dialogInterface, _ ->
                    dialogInterface.cancel()
                }
                .create()
    }
}