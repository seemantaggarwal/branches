package com.branches.branches

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Travel_forward : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel_forward)
         btnTrav.setOnClickListener() {
            val actIntent = Intent(this, TravellersSelect::class.java)
            startActivity(actIntent)
        }
    }
}
