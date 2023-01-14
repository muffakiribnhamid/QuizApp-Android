package com.muffakir.sawaal_quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.muffakir.sawall_jawab_thequizapp.Constants
import com.muffakir.sawall_jawab_thequizapp.QuizQuestionActivity
import com.muffakir.sawall_jawab_thequizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnStart.setOnClickListener {
            if (binding.etName.text!!.isEmpty()) {
                Toast.makeText(this, "Enter A Name", Toast.LENGTH_SHORT).show()
            }
            else {
                val intent = Intent(this,QuizQuestionActivity::class.java)
                val name = binding.etName.text.toString()
                intent.putExtra(Constants.USERNAME,name)
                startActivity(intent)
                finish()
            }
        }
    }
}
