package cl.matias.fastfood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import android.os.PersistableBundle;
import android.preference.PreferenceManager;
import android.view.View;
import java.io.Serializable;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class sandwiches extends AppCompatActivity {

    LinearLayout contenedor;
    ArrayList<SandwichesPOO> Sandwich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwiches);
        contenedor = (LinearLayout) findViewById(R.id.contenedor);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Sandwiches");
        actionBar.setDisplayHomeAsUpEnabled(true);


        Sandwich = (ArrayList<SandwichesPOO>) getIntent().getSerializableExtra("array");

        Sandwich.trimToSize();

        for(int i=0; i<Sandwich.size();i++){
            final SandwichesPOO e = Sandwich.get(i);
            Button bt = new Button(getApplicationContext());
            bt.setText(e.getNombre());
            bt.setBackgroundColor(Color.parseColor("#1089FF"));
            bt.setTextSize(20);
            bt.setTextColor(Color.WHITE);
            contenedor.addView(bt);
            final int finalI = i;
            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(sandwiches.this, detalles.class);
                    intent.putExtra("id", finalI);
                    intent.putExtra("objeto",Sandwich);
                    startActivity(intent);
                }
            });
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
    }


    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putSerializable("salida",Sandwich);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Sandwich = (ArrayList<SandwichesPOO>) savedInstanceState.getSerializable("salida");
    }

}
