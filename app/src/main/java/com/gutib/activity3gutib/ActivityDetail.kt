package com.gutib.activity3gutib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gutib.activity3gutib.databinding.DetailActivityBinding

class ActivityDetail: AppCompatActivity() {
    private lateinit var binding: DetailActivityBinding

    override fun onCreate(saveInstanceState:Bundle?){
        super.onCreate(saveInstanceState)
        binding = DetailActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.senderName.text = intent.getStringExtra("NAME_PARAMS")
        binding.subject.text = intent.getStringExtra("SUBJECT_PARAMS")
        binding.content.text =  intent.getStringExtra("MESSAGE_PARAMS")
    }
}