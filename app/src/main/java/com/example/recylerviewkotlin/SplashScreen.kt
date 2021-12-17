package com.example.recylerviewkotlin

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    var dialogexit: android.app.Dialog? = null
    private var textViewExit : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        textViewExit = findViewById(R.id.textexitid)

        var top: TextView = findViewById(R.id.textView1id)
        var middle: TextView = findViewById(R.id.textView2id)
        var bottom: TextView = findViewById(R.id.textView3id)

        val topanimation = AnimationUtils.loadAnimation(this, R.anim.animation1)
        val middleanimation = AnimationUtils.loadAnimation(this, R.anim.animation2)
        val bottomanimation = AnimationUtils.loadAnimation(this, R.anim.animation3)

        top.startAnimation(topanimation)
        middle.startAnimation(middleanimation)
        bottom.startAnimation(bottomanimation)

        val splashtimeout = 4000
        var intent = Intent(this, MainActivity2::class.java)
        Handler().postDelayed({
            startActivity(intent)
        }, splashtimeout.toLong())


        DialogExit()

    }

    private fun DialogExit() {
        dialogexit = Dialog(this, R.style.CustomDialog)
        dialogexit?.let {
            it.setContentView(R.layout.exitapp_dialog)
            it.findViewById<TextView>(R.id.textexitid).setOnClickListener{
                dialogexit?.dismiss()
                finish()
            }
            it.setCanceledOnTouchOutside(true)
        }
//        textViewExit?.setOnClickListener{
//
//        }
    }

    override fun onBackPressed() {
        dialogexit?.show()
    }
}
