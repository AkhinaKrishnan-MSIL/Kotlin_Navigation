package com.example.kotlin_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation


class First_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first_, container, false)
        val TextView= view.findViewById<TextView>(R.id.textview111)
        TextView.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_first_Fragment3_to_second_Fragment)
        }
        return view
    }


}