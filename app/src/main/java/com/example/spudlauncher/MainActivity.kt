package com.example.spudlauncher

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gifWebView.setBackgroundColor(Color.TRANSPARENT)

        val data = "<!DOCTYPE html><html><body><img src=\"https://media.giphy.com/media/4Fvqh5TKRzXP2/giphy.gif\" alt=\"Smileyface\" width=\"100%\" height=\"100%\"></body></html>"
        gifWebView.loadData(data, "text/html", "utf-8")

        chromeButton.setImageDrawable(getActivityIcon(this,"com.android.chrome", "com.google.android.apps.chrome.Main"))
        chromeButton.setOnClickListener {
            onChromeButtonClick()
        }
        drawerButton.setOnClickListener {
            onDrawerButtonClick()
        }
    }

    private fun onDrawerButtonClick() {
        startActivity(Intent(this, AppDrawer::class.java))
    }

    fun onChromeButtonClick() {
        startActivity(packageManager.getLaunchIntentForPackage("com.android.chrome"))
    }

    fun getActivityIcon(context: Context, packageName: String, activityName: String): Drawable {
        val pm = context.getPackageManager()
        val intent = Intent()
        intent.component = ComponentName(packageName, activityName)
        val resolveInfo = pm.resolveActivity(intent, 0)

        return resolveInfo.loadIcon(pm)
    }

}
