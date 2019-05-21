package com.key.heart.aprende;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String[] nombresCategorias = {"ABECEDARIO","NUMEROS","COLORES","CALENDARIO","CASA","FAMILIA","ESCUELA","FRUTAS Y VERDURAS","SALUDOS","PROFESIONES","ANIMALES","ALIMENTOS","CUERPO HUMANO","LUGARES","REP. MEXICANA","VERBOS"};
    int[] imagenesCategorias = {R.drawable.abecedario,R.drawable.numeros,R.drawable.colores,R.drawable.calendario,R.drawable.casa,R.drawable.familia,R.drawable.escuela,R.drawable.frutasverduras,R.drawable.saludos,R.drawable.profesiones,R.drawable.animales,R.drawable.alimentos,R.drawable.cuerpohumano,R.drawable.lugares,R.drawable.republica,R.drawable.verbos};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridview);
        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),AprendeActivity.class);
                intent.putExtra("categoria",nombresCategorias[i]);
                startActivity(intent);
            }
        });


    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return nombresCategorias.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.row_data,null);
            TextView name = view1.findViewById(R.id.fruits);
            ImageView image = view1.findViewById(R.id.images);
            name.setText(nombresCategorias[i]);
            image.setImageResource(imagenesCategorias[i]);
            return view1;
        }
    }
}
