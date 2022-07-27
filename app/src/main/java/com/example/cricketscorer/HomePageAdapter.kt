package com.example.cricketscorer

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.cricketscorer.Batsmen.BatsmenFragment
import com.example.cricketscorer.Bowler.BowlerFragment

class HomePageAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 2;
    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> {
                return BatsmenFragment()
            }
            1 -> {
                return BowlerFragment()
            }
            else -> {
                return BatsmenFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {
                return "Batsmen"
            }
            1 -> {
                return "Bowler"
            }
        }
        return super.getPageTitle(position)
    }

}
