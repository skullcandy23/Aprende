package com.key.heart.aprende;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class AprendeActivity extends AppCompatActivity {

    private TextView tvNombre;
    private ImageView ivSenia;
    private ImageView ivImagen;
    private ImageView ivDescripcion;
    private Item item;
    private  ArrayList list;
    private int index=0;
    String categoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aprende);

        Intent intent = getIntent();
        categoria =  intent.getStringExtra("categoria");

        tvNombre=findViewById(R.id.tvNombre);
        ivSenia=findViewById(R.id.ivSenia);
        ivImagen=findViewById(R.id.ivImagen);
        ivDescripcion=findViewById(R.id.ivDescripcion);

        generarCategoria(categoria);

    }

    private void generarCategoria(String categoria){
        switch (categoria){
            case "ABECEDARIO" :
                list=new ArrayList<Item>();
                for (Abecedario i: Abecedario.values()) {
                    Item item=new Item(i.getNombre(),i.getDescripcion(),i.getRutaSenia(),i.getRutaImagen());
                    list.add(item);
                }
                mostrarSenia(index);
                break;
            case "NUMEROS" :
                list=new ArrayList<Item>();
                for (Numeros numeros: Numeros.values()) {
                    item = new Item(numeros.getNombre(), numeros.getDescripcion(), numeros.getRutaSenia(), numeros.getRutaImagen());
                    list.add(item);
                }
                mostrarSenia(index);
                break;
            case "COLORES" :
                list=new ArrayList<Item>();
                for (Colores colores: Colores.values()) {
                    item=new Item(colores.getNombre(),colores.getDescripcion(),colores.getRutaSenia(),colores.getRutaImagen());
                    list.add(item);
                }
                mostrarSenia(index);
                break;
            case "CALENDARIO" :
                list=new ArrayList<Item>();
                for (Calendario calendario: Calendario.values()) {
                    item=new Item(calendario.getNombre(),calendario.getDescripcion(),calendario.getRutaSenia(),calendario.getRutaImagen());
                    list.add(item);
                }
                mostrarSenia(index);
                break;
            case "CASA" :
                list=new ArrayList<Item>();
                for (Casa casa: Casa.values()) {
                    item = new Item(casa.getNombre(), casa.getDescripcion(), casa.getRutaSenia(), casa.getRutaImagen());
                    list.add(item);
                }
                mostrarSenia(index);
                break;
            case "FAMILIA" :
                list=new ArrayList<Item>();
                for (Familia familia: Familia.values()) {
                    item = new Item(familia.getNombre(), familia.getDescripcion(), familia.getRutaSenia(), familia.getRutaImagen());
                    list.add(item);
                }
                mostrarSenia(index);
                break;
            case "ESCUELA" :
                list=new ArrayList<Item>();
                for (Escuela escuela: Escuela.values()) {
                    item=new Item(escuela.getNombre(),escuela.getDescripcion(),escuela.getRutaSenia(),escuela.getRutaImagen());
                    list.add(item);
                }
                mostrarSenia(index);
                break;
            case "FRUTAS Y VERDURAS" :
                list=new ArrayList<Item>();
                for (Futver futver: Futver.values()) {
                    item=new Item(futver.getNombre(),futver.getDescripcion(),futver.getRutaSenia(),futver.getRutaImagen());
                    list.add(item);
                }
                mostrarSenia(index);
                break;
            case "SALUDOS":
                list=new ArrayList<Item>();
                for (Saludo saludo: Saludo.values()) {
                    item = new Item(saludo.getNombre(), saludo.getDescripcion(), saludo.getRutaSenia(), saludo.getRutaImagen());
                    list.add(item);
                }
                mostrarSenia(index);
                break;
            case "PROFESIONES" :
                list=new ArrayList<Item>();
                for (Profesion profesion: Profesion.values()) {
                    item = new Item(profesion.getNombre(), profesion.getDescripcion(), profesion.getRutaSenia(), profesion.getRutaImagen());
                    list.add(item);
                }
                mostrarSenia(index);
                break;
            case "ANIMALES" :
                list=new ArrayList<Item>();
                for (Animal animal: Animal.values()) {
                    item = new Item(animal.getNombre(), animal.getDescripcion(), animal.getRutaSenia(), animal.getRutaImagen());
                    list.add(item);
                }
                mostrarSenia(index);
                break;
            case "ALIMENTOS" :
                list=new ArrayList<Item>();
                for (Alimento alimento: Alimento.values()) {
                    item = new Item(alimento.getNombre(), alimento.getDescripcion(), alimento.getRutaSenia(), alimento.getRutaImagen());
                    list.add(item);
                }
                mostrarSenia(index);
                break;
            case "CUERPO HUMANO" :
                list=new ArrayList<Item>();
                for (Humano humano: Humano.values()) {
                    item = new Item(humano.getNombre(), humano.getDescripcion(), humano.getRutaSenia(), humano.getRutaImagen());
                    list.add(item);
                }
                mostrarSenia(index);
                break;
            case "LUGARES" :
                list=new ArrayList<Item>();
                for (Lugar lugar: Lugar.values()) {
                    item = new Item(lugar.getNombre(), lugar.getDescripcion(), lugar.getRutaSenia(), lugar.getRutaImagen());
                    list.add(item);
                }
                mostrarSenia(index);
                break;
            case "REP. MEXICANA" :
                list=new ArrayList<Item>();
                for (Mexicana mexicanas: Mexicana.values()) {
                    item = new Item(mexicanas.getNombre(), mexicanas.getDescripcion(), mexicanas.getRutaSenia(), mexicanas.getRutaImagen());
                    list.add(item);
                }
                mostrarSenia(index);
                break;
            case "VERBOS" :
                list=new ArrayList<Item>();
                for (Verbo verbos: Verbo.values()) {
                    item = new Item(verbos.getNombre(), verbos.getDescripcion(), verbos.getRutaSenia(), verbos.getRutaImagen());
                    list.add(item);
                }
                mostrarSenia(index);
                break;
        }
    }

    public void anterior(View view){
        if (index==0) {
            index = list.size()-1;
            mostrarSenia(index);
        }else {
            index--;
            mostrarSenia(index);
        }
    }

    public void siguiente(View view){
        if (index==list.size()-1) {
            index=0;
            mostrarSenia(index);

        } else {
            index++;
            mostrarSenia(index);
        }
    }

    private void mostrarSenia(final int index){
        item=(Item)list.get(index);
        tvNombre.setText(item.getNombre());
        ivSenia.setImageResource(item.getRutaSenia());
        ivImagen.setImageResource(item.getRutaImagen());
        ivDescripcion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),DescripcionActivity.class);
                intent.putExtra("nombre",item.getNombre());
                intent.putExtra("rutaSenia",item.getRutaSenia());
                intent.putExtra("descripcion",item.getDescripcion());
                startActivity(intent);
            }
        });
    }

    public class Item implements Serializable {
        private String nombre;
        private String descripcion;
        private int rutaSenia;
        private int rutaImagen;

        Item(String nombre,String descripcion, int rutaSenia, int rutaImagen){
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.rutaSenia = rutaSenia;
            this.rutaImagen = rutaImagen;
        }

        public String getNombre() {
            return nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public int getRutaSenia() {
            return rutaSenia;
        }

        public int getRutaImagen() {
            return rutaImagen;
        }
    }
}
