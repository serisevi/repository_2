package com.example.a24032020

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.main.*
import android.graphics.drawable.AnimationDrawable
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.R
import java.util.*
import kotlin.concurrent.schedule


class MainActivity: AppCompatActivity(){

    lateinit var anim: AnimationDrawable
    lateinit var anim2: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.aAnimationsApp.R.layout.main)

        idFrameAnimation.setOnClickListener {
            (View.background as AnimationDrawable).start()
            val randomIntent = Intent (this, SecondActivity::class.java)
            Timer().schedule(2500){
                (View.background as AnimationDrawable).stop()
                startActivity(randomIntent)
            }
        }

        idTweenAnimation.setOnClickListener {
        anim2 = AnimationUtils.loadAnimation(this, com.example.aAnimationsApp.R.anim.example_anim)
            MainLayout.startAnimation(anim2)
            val randomIntent = Intent (this, SecondActivity::class.java)
            Timer().schedule(500){
                startActivity(randomIntent)
            }
        }
    }
}





