package com.example.booklistapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class HomeView : Fragment() {
    companion object {
        fun newInstance(): BookDetailsFragment {
            return BookDetailsFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val searchBookBtn = activity?.findViewById<Button>(R.id.searchForABookButton)
        val checkBookListBtn = activity?.findViewById<Button>(R.id.checkBookListButton)

//        searchBookBtn.setOnClickListener {
//            if (savedInstanceState == null) {
//                // 2
//                supportFragmentManager
//                    // 3
//                    .beginTransaction()
//                    // 4
//                    .add(
//                        R.id.main_activity_linear_layout_id,
//                        BookDetailsFragment.newInstance(),
//                        "book details"
//                    )
//                    // 5
//                    .commit()
//            }
//        }
//
//        checkBookListBtn.setOnClickListener {
//
//        }
        return inflater.inflate(R.layout.home_view, container, false)
    }
}
