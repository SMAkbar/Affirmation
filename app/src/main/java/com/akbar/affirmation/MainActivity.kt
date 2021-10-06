package com.akbar.affirmation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.akbar.affirmation.adapter.Itemadapter
import com.akbar.affirmation.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = Datasource().loadAffirmation()
        val recyclerView : RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = Itemadapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}