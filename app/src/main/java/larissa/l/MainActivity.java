package larissa.l;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    private Object ComponenteView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        final ArrayList<String> listaFrutas = new ArrayList<>();

        listaFrutas.add("maça");
        listaFrutas.add("kiwi");
        listaFrutas.add("morango");
        listaFrutas.add("uva");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                listaFrutas
        );

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, listaFrutas.get(i), Toast.LENGTH_LONG);

                          Intent intent = new Intent(MainActivity.this, ComponenteView.class);

                intent.putExtra("fruta", listaFrutas.get(i));
                startActivity(intent);
            }

        });
/*
      Button;
      RadioButton;
      ImageButton;
     CheckBox;
     RatingBar;
     ToggleButton;
    DatePicker;
    AlertDialog;*/

    }


    }

