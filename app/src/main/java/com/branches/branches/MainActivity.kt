package com.branches.branches

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPlace.setOnClickListener() {
            val actIntent = Intent(this, PlacesSelect::class.java)
            startActivity(actIntent)
        }
        btnTrav.setOnClickListener() {
            val actIntent = Intent(this, TravellersSelect::class.java)
            startActivity(actIntent)
        }
    }
}
