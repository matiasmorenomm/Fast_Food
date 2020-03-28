package cl.matias.fastfood;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class detalles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        final ArrayList<SandwichesPOO> Sandwich = (ArrayList<SandwichesPOO>) getIntent().getSerializableExtra("objeto");


        final ImageView imagen  = (ImageView) findViewById(R.id.imageView2);
        TextView t1 = (TextView) findViewById(R.id.textView);
        TextView t2 = (TextView) findViewById(R.id.textView2);
        TextView t3 = (TextView) findViewById(R.id.textView3);


        int c = (int) getIntent().getSerializableExtra("id");
        Sandwich.trimToSize();
        final SandwichesPOO e = Sandwich.get(c);
        actionBar.setTitle(e.getTitle());
        t1.setText(e.getNombre());
        t2.setText(e.getDetalle());
        t3.setText(e.getPrecio());
        imagen.setImageResource(e.getFoto());
    }


}
