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
