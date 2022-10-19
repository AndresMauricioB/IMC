package com.example.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.imc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

  private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnNav.setOnClickListener(this)

    }
    //  usar picasso para traer imagenes de internet con url
    override fun onClick(v: View?) {
        var e: Double = binding.estatura.text.toString().toDouble();
        var p: Double = binding.peso.text.toString().toDouble();

        var res: Double = p/(e*e);


        if(v!!.id == binding.btnNav.id){
            var intent: Intent = Intent(this,FimcActivity::class.java)
            intent.putExtra("val",res)
            startActivity(intent)
        }
    }
}