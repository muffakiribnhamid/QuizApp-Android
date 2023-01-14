package com.muffakir.sawall_jawab_thequizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muffakir.sawaal_quizapp.MainActivity
import com.muffakir.sawall_jawab_thequizapp.databinding.ActivityResultBinding

class Result_Activity : AppCompatActivity() {
    private lateinit var binding : ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityResultBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)




        val name = intent.getStringExtra(Constants.USERNAME)
        binding.name.text = name

        val totalquestions = intent.getStringExtra(Constants.TOTAL_QUESTIONS)
        val correctanswers = intent.getStringExtra(Constants.CORRECT_ANSWERS)

        binding.score.text = "Your Score is $correctanswers out of $totalquestions"

        binding.btnFinsh.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.btnshare.setOnClickListener {
            val intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Hey I am Playing Quiz on Muffakirs App My Score is $correctanswers out of $totalquestions \n If you want to play dm him here \n twitter.com/HamidMuffakir")
                type = "text/plain"

            }
            startActivity(Intent.createChooser(intent, "Share Using!!"))

        }

    }
}
