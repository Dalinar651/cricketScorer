package com.example.cricketscorer.Batsmen

import android.os.Bundle
import android.text.format.DateUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.cricketscorer.R




class BatsmenFragment : Fragment() {

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val ListAdapter=BatsmenListViewAdapter(arrayOf<String>("MSD","Virat Kohli","Joe Root"))
        val recyleView: RecyclerView?=view?.findViewById(R.id.recycle_view)
        recyleView?.adapter=ListAdapter
        return inflater.inflate(R.layout.fragment_batsmen, container, false)
    }


}