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
    int quantity = 2;
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
        //create a string variable and give it the value Price $ and the result of quantity * 5 (Every cup is 5$)
        String priceMessage = "Price $" + (quantity * 5);
        //Display it
        displayMessage(priceMessage);
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
        quantity = quantity + 1; // add +1 to quantity
        //display quantity
        display(quantity);
    }
    //Create another new function to use to decrement (Not done)
    public void decrement(View view){
        //create a variable named quantity and set its value to 3
        quantity = quantity - 1; // add -1 to quantity
        //display quantity
        display(quantity);
    }
    // link still works: https://gist.github.com/anonymous/f5feae51009b9f8bc956
    // i changed this code so it has more explanation !
    /**
     * This method displays the given text on the screen.
     * It will require a string
     */
    // create the function
    private void displayMessage(String message) {
        // now reference the priceTextView as a variable
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message); // set the message to the TextView
    }
    // You will modify this further in the course! I am taking the course too!
    // Thanks for using my version !
    // btw for it to work add another attribute to the button view for it to work the attribute is: android:onClick="submitOrder" and a couple more layouts :)
    // i think i will be posting more of this if i can copy the code from the video or have enough information to know what i should code
    // myself because sometimes i cant see it all so i code it myself
    // hope they update !
    // (This is my progress so far)
}
