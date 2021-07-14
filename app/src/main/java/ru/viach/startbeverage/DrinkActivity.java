package ru.viach.startbeverage;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import ru.viach.startbeverage.model.Beverage;

public class DrinkActivity extends Activity {
    public static final String EXTRA_DRINK_ID =  "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int drinkId = (int) getIntent().getExtras().get(EXTRA_DRINK_ID);
        Beverage beverage = Beverage.beverages[drinkId];

        ImageView image = findViewById(R.id.photo);
        image.setImageResource(beverage.getImageResourceId());
        image.setContentDescription(beverage.getName());

        TextView name = findViewById(R.id.dirink_name);
        name.setText(beverage.getName());

        TextView description = findViewById(R.id.drink_description);
        description.setText(beverage.getDescription());

    }
}