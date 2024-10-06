package com.example.taskreminderapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.taskreminderapp.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val title = intent.getStringExtra("TITLE")
        binding.taskTitle.text = title

        val date = intent.getStringExtra("SELECTED_DATE")
        binding.dateTask.text = date

        val time = intent.getStringExtra("SELECTED_TIME")
        binding.timeTask.text = time

        val repeat = intent.getStringExtra("SELECTED_REPEAT")
        binding.repeatTask.text = repeat

        binding.btnAddTask.setOnClickListener {

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}