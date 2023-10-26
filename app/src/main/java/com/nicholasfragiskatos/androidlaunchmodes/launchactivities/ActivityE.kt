package com.nicholasfragiskatos.androidlaunchmodes.launchactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nicholasfragiskatos.androidlaunchmodes.R
import com.nicholasfragiskatos.androidlaunchmodes.databinding.ActivityEBinding

class ActivityE : AppCompatActivity() {

    private lateinit var binding : ActivityEBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.launchActivityA.setOnClickListener {
            startActivity(this, ActivityA::class.java)
        }

        binding.launchActivityB.setOnClickListener {
            startActivity(this, ActivityB::class.java)
        }

        binding.launchActivityC.setOnClickListener {
            startActivity(this, ActivityC::class.java)
        }

        binding.launchActivityD.setOnClickListener {
            startActivity(this, ActivityD::class.java)
        }

        binding.launchActivityE.setOnClickListener {
            startActivity(this, ActivityE::class.java)
        }

        binding.launchActivityF.setOnClickListener {
            startActivity(this, ActivityF::class.java)
        }
    }
}