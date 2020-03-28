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


        final ArrayList<SandwichesPOO> Sandwich = new ArrayList<>();
        Sandwich.add(new SandwichesPOO(R.string.btn_lomito , R.string.des_lomito, R.string.pre_lomito, R.drawable.lomito, R.string.title_lomito));
        Sandwich.add(new SandwichesPOO(R.string.btn_completo , R.string.des_completo, R.string.pre_completo, R.drawable.completo, R.string.title_completo));
        Sandwich.add(new SandwichesPOO(R.string.btn_barros_luco , R.string.des_barros_luco, R.string.pre_barros_luco, R.drawable.barrosluco, R.string.title_barros_luco));
        Sandwich.add(new SandwichesPOO( R.string.btn_chacarero , R.string.des_chacarero, R.string.pre_chacarero, R.drawable.chacarero, R.string.title_chacarero));
        Sandwich.add(new SandwichesPOO(R.string.btn_barros_jarpa , R.string.des_barros_jarpa, R.string.pre_barros_jarpa, R.drawable.barrosjarpa, R.string.title_barros_jarpa));


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
                intent.putExtra("array", Sandwich);
                startActivity(intent);
            }
        });


    }
}
