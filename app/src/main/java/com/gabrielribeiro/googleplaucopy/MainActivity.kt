package com.gabrielribeiro.googleplaucopy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerViewMain = findViewById<RecyclerView>(R.id.recyclerViewMain)
        recyclerViewMain.adapter = TestAdapter()
    }

    class TestAdapter : RecyclerView.Adapter<TestViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
           return TestViewHolder(LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_1, parent, false))
        }

        override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
            (holder.itemView as TextView).text = "$position pos"
        }

        override fun getItemCount(): Int  = 40

    }

    class TestViewHolder (view :View) : RecyclerView.ViewHolder(view) {

    }


}