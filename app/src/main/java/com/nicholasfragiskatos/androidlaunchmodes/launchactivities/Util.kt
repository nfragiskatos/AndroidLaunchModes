package com.nicholasfragiskatos.androidlaunchmodes.launchactivities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.startActivity(context: Context, clazz: Class<*>) {
    startActivity(Intent(context, clazz))
}