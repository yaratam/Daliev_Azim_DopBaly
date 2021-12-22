package com.example.dopbaly

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlin.Any as KotlinAny



/**
 * A simple [Fragment] subclass.
 * Use the [TriallFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TrialFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_triall, container, false)


        view.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_trialFragment2_to_triallFragment)
        }

        return view


    }
}
