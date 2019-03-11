package com.example.spudlauncher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_app_drawer.*


class AppDrawer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_drawer)

        appRecycler.adapter = AppDrawerAdapter()
        appRecycler.layoutManager = LinearLayoutManager(this)
    }
}
