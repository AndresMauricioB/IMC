package com.example.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast;
import android.widget.ImageView;
import com.squareup.picasso.Picasso


class FimcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fimc)
        var dato : Double = intent.extras!!.get("val").toString().toDouble();


        var mensaje:String = "";
        var img: ImageView = findViewById(R.id.imageView)
        if(dato >= 30){
            mensaje = "Obesidad";
            Picasso.get().load("https://www.limarp.com/img/obesidad-morbida.png").into(img);
        }
        if(dato > 25 && dato < 29.9 ){
            mensaje = "Peso superior al normal";
            Picasso.get().load("https://image.shutterstock.com/image-vector/body-mass-index-fitness-exercise-600w-2011588322.jpg").into(img);
        }
        if(dato > 18.5 && dato < 24.9 ){
            mensaje = "Normal";
            Picasso.get().load("https://img.freepik.com/vector-gratis/indice-masa-corporal-control-peso-imc-ilustracion-vector-plano-estilo-vida-saludable-no-saludable-indicador-fitness-antes-despues-dieta-concepto-escala-grasa-corporal-salud-general_88138-795.jpg?w=740&t=st=1666149830~exp=1666150430~hmac=ed1fbd0cf243f687d7162e97de31ae23ea9c6e1fa969f4cefbd3a9f94855e321").into(img);
        }
        if(dato < 18.4){
            mensaje = "Peso inferior al normal";
            Picasso.get().load("https://thumbs.dreamstime.com/z/el-doblar-masculino-flaco-joven-11673997.jpg").into(img);
        }
       // Toast.makeText(this,mensaje, Toast.LENGTH_LONG).show()
        val valor: TextView = findViewById(R.id.info);
        valor.setText(mensaje);








    }
}