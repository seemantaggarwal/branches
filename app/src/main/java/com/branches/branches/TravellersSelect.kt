package com.branches.branches

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class TravellersSelect : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travellers_select)
        val spinner: Spinner = findViewById(R.id.Spinner)
        ArrayAdapter.createFromResource(
                this,
                R.array.number_traveller,
                android.R.layout.simple_spinner_dropdown_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
        class SpinnerActivity : Activity(), AdapterView.OnItemSelectedListener {

            override fun onItemSelected(parent: AdapterView<*>, view: View, pos: Int, id: Long) {

            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                spinner.setPrompt("Number of travellers")
            }
        }
    }
}
