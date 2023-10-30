package com.nicholasfragiskatos.androidlaunchmodes.launchactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nicholasfragiskatos.androidlaunchmodes.R
import com.nicholasfragiskatos.androidlaunchmodes.databinding.ActivityDBinding

class ActivityD : AppCompatActivity() {

    private lateinit var binding: ActivityDBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDBinding.inflate(layoutInflater)
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

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(this, "onNewIntent called for Activity D", Toast.LENGTH_LONG).show()
    }
}