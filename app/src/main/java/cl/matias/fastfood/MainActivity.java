package cl.matias.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnNosotros, btnSandwiches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNosotros = (Button)findViewById(R.id.sobre_nosotros);

        btnNosotros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, sobre_nosotros.class);
                startActivity(intent);
            }
        });

        btnSandwiches = (Button)findViewById(R.id.sandwiches);
        btnSandwiches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, sandwiches.class);
                startActivity(intent);
            }
        });


    }
}
