package com.neppplus.fragmentpractice_20210327.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.neppplus.fragmentpractice_20210327.MainActivity
import com.neppplus.fragmentpractice_20210327.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        toastBtn.setOnClickListener {
            Toast.makeText(activity!!, "문구 출력", Toast.LENGTH_SHORT).show()
        }
    }
}