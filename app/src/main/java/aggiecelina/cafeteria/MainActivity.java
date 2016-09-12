package aggiecelina.cafeteria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int coffee_price = 5;
    int total_counter = 0;


    public void showBasket(View view){

        TextView basket = (TextView) findViewById(R.id.basket);
        total_counter = total_counter + coffee_price;
        basket.setText("" + total_counter);


    }


}
