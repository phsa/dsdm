package br.ufc.crateus.dsdm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        final CheckBox pizzaCheck = findViewById(R.id.pizzaCheckBox);
        final EditText pizzaQtde = findViewById(R.id.editPizzaQtde);
        final EditText pizzaPrice = findViewById(R.id.editPizzaPrice);

        final CheckBox sodaCheck = findViewById(R.id.sodaCheckBox);
        final EditText sodaQtde = findViewById(R.id.editSodaQtde);
        final EditText sodaPrice = findViewById(R.id.editSodaPrice);

        final CheckBox hamburgerCheck = findViewById(R.id.hamburgerCheckBox);
        final EditText hamburgerQtde = findViewById(R.id.editHamburgerQtde);
        final EditText hamburgerPrice = findViewById(R.id.editHamburgerPrice);

        Button calcular = findViewById(R.id.calculateButton);


        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double total = 0.0;
                    if (pizzaCheck.isChecked())
                        total += (Integer.parseInt(pizzaQtde.getText().toString()) * Double.parseDouble(pizzaPrice.getText().toString()));
                    if (sodaCheck.isChecked())
                        total += (Integer.parseInt(sodaQtde.getText().toString()) * Double.parseDouble(sodaPrice.getText().toString()));
                    if (hamburgerCheck.isChecked())
                        total += (Integer.parseInt(hamburgerQtde.getText().toString()) * Double.parseDouble(hamburgerPrice.getText().toString()));

                    Toast.makeText(RestaurantActivity.this, "O valor total da conta: " + total, Toast.LENGTH_SHORT).show();
                } catch (NumberFormatException e) {
                    Toast.makeText(RestaurantActivity.this, "Só aceitamos valores númericos.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
