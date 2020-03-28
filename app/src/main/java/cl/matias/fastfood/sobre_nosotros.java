package cl.matias.fastfood;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class sobre_nosotros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_nosotros);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Sobre Nosotros");
        actionBar.setDisplayHomeAsUpEnabled(true);

    }
}
