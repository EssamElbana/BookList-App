package com.example.booklistapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class BookDetailsFragment : Fragment() {
    companion object {
        fun newInstance(): BookDetailsFragment {
            return BookDetailsFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.book_details, container, false)
    }
}