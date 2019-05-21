package com.key.heart.aprende;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class DescripcionActivity extends AppCompatActivity implements TextToSpeech.OnInitListener{

    private String nombre;
    private int rutaSenia;
    private String descripcion;

    private TextView tvNombre;
    private ImageView ivSenia;
    private TextView tvDescripcion;
    private ImageView ivHablar;

    private TextToSpeech textToSpeech;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);

        textToSpeech= new TextToSpeech(getApplicationContext(),  this);

        nombre=getIntent().getStringExtra("nombre");
        rutaSenia=getIntent().getIntExtra("rutaSenia",0);
        descripcion=getIntent().getStringExtra("descripcion");

        tvNombre=findViewById(R.id.tvNombre);
        ivSenia=findViewById(R.id.ivSenia);
        tvDescripcion=findViewById(R.id.tvDescripcion);
        ivHablar=findViewById(R.id.ivHablar);

        tvNombre.setText(nombre);
        ivSenia.setImageResource(rutaSenia);
        tvDescripcion.setText(descripcion);
    }

    @Override
    public void onInit(int status) {
        if(status==TextToSpeech.LANG_MISSING_DATA || status==TextToSpeech.LANG_NOT_SUPPORTED){
            Toast.makeText(this, "Los datos del lenguaje estan faltando o el lenguaje no es soportado",Toast.LENGTH_SHORT).show();
        } else {
            textToSpeech.setLanguage(new Locale("spa","MX"));
            textToSpeech.setSpeechRate(1.0f);
            textToSpeech.setPitch(1.0f);
        }
    }

    public void habla(View view){
        if(textToSpeech!=null){
            textToSpeech.speak(descripcion, TextToSpeech.QUEUE_FLUSH, null);
        }
    }
}
