package cl.matias.fastfood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import java.util.ArrayList;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


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

        final ArrayList<SandwichesPOO> Sandwich = new ArrayList<SandwichesPOO>();
        Sandwich.add(new SandwichesPOO(R.string.btn_lomito , R.string.des_lomito, R.string.pre_lomito, R.drawable.lomito, R.string.title_lomito));
        Sandwich.add(new SandwichesPOO(R.string.btn_completo , R.string.des_completo, R.string.pre_completo, R.drawable.completo, R.string.title_completo));
        Sandwich.add(new SandwichesPOO(R.string.btn_barros_luco , R.string.des_barros_luco, R.string.pre_barros_luco, R.drawable.barrosluco, R.string.title_barros_luco));
        Sandwich.add(new SandwichesPOO( R.string.btn_chacarero , R.string.des_chacarero, R.string.pre_chacarero, R.drawable.chacarero, R.string.title_chacarero));
        Sandwich.add(new SandwichesPOO(R.string.btn_barros_jarpa , R.string.des_barros_jarpa, R.string.pre_barros_jarpa, R.drawable.barrosjarpa, R.string.title_barros_jarpa));

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
}
