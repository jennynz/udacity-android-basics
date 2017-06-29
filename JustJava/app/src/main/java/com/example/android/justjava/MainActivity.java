package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 2;
    int pricePerCoffee = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view) {
        quantity = quantity + 1;
        displayQuantity(quantity);
        displayPrice();
    }

    public void decrement(View view) {
        // Set lower limit of 1

        quantity = quantity - 1;
        displayQuantity(quantity);
        displayPrice();
    }

    private void displayQuantity(int number) {
        TextView tv = (TextView) findViewById(R.id.quantity_text_view);
        tv.setText(Integer.toString(number));
    }

    private void displayPrice() {
        TextView tv = (TextView) findViewById(R.id.price_text_view);
        tv.setText(NumberFormat.getCurrencyInstance().format(quantity * pricePerCoffee));
    }

    public void submitOrder(View view) {
        Log.v("Order submitted", "The order button has been clicked");
    }

}