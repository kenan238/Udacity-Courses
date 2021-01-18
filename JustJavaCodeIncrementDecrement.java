/**
 * Rewritten by kenan238
 * Thanks for using my version! i changed things but it will do the same things as the video says! but i also explained everything and remove some lines that would
 * probably give you errors...
 * i have some basic java knowledge so i know what happens here
 * Dont remove my comments as they might be useful to know what happens because
 * this might look like chinese...
 */
package com.example.android.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;
//Here i removed the import android.support.v7.... Because we dont need it also i have only v4 and it gave me an error

/**
 * INT: Contains numbers
 * STRING: Contains characters
 * just so i dont look like speaking some other alien language
 * in the comments below
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * submitOrder function
     * Dont tell me why i use this type of comment...
     * i can so i can :)
     */
    public void submitOrder(View view){
        //adding 1 new int variable
        int quantity = 2;
        display(quantity);
        // Now every cup of coffee is 5$ so i mutliply the quantity by the price
        displayPrice(quantity * 5);
    }

    /**
     * display doesnt exist so we define it here with the param number as an int
     */
    //forgot to set this to private not public here but it doesnt really matter as it does nothing
    private void display(int number){
        // get the text view in a variable (we got it from import android.widget.TextView so that TextView exists) get the view so we can use it
        // and the variable value is the text view with the id quantity_text_view
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        // Now we set the text of the textview to the number and we need to convert it to string so they used a technique
        // to convert to string :)
        quantityTextView.setText("" + number);
    }
    // create this too with int number as params
    private void displayPrice(int number){
        // get the text view in a variable (we got it from import android.widget.TextView so that TextView exists) get the view so we can use it
        // and the variable value is the text view with the id price_text_view
        TextView priceTextView = (TextView) findViewById(
                R.id.price_text_view);
        // now we display the text
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    //create a new function to increment (Not done)
    public void increment(View view){
        //create a variable named quantity and set its value to 3
        int quantity = 3;
        //display quantity
        display(quantity);
    }
    //Create another new function to use to decrement (Not done)
    public void decrement(View view){
        //create a variable named quantity and set its value to 3
        int quantity = 1;
        //display quantity
        display(quantity);
    }
    // You will modify this further in the course! I am taking the course too!
    // Thanks for using my version !
    // btw for it to work add another attribute to the button view for it to work the attribute is: android:onClick="submitOrder" and a couple more layouts :)
    // i think i will be posting more of this if i can copy the code from the video or have enough information to know what i should code
    // myself because sometimes i cant see it all so i code it myself
    // hope they update !
    // (This is the third one for the increment and decrement)
}
