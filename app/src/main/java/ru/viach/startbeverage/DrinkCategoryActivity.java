package ru.viach.startbeverage;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import ru.viach.startbeverage.model.Beverage;

public class DrinkCategoryActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);

        ArrayAdapter<Beverage> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Beverage.beverages
        );

        ListView listDrinks = (ListView) findViewById(R.id.list_drinkds);
        listDrinks.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
                intent.putExtra(DrinkActivity.EXTRA_DRINK_ID, (int) id);
                startActivity(intent);
            }
        };

        listDrinks.setOnItemClickListener(itemClickListener);
    }
}