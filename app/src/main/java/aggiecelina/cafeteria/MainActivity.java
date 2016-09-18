package aggiecelina.cafeteria;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int coffee_price = 5;
    int coffee_2_price = 10;
    int ice_price = 15;
    int tea_price = 20;
    int total_counter = 0;




    public void selectCoffee(View view) {

        TextView basket = (TextView) findViewById(R.id.basket);
        total_counter = total_counter + coffee_price;
        basket.setText("" + total_counter);


    }

    public void selectCoffee2(View view) {

        TextView basket = (TextView) findViewById(R.id.basket);
        total_counter = total_counter + coffee_2_price;
        basket.setText("" + total_counter);
    }

    public void selectIce(View view) {

        TextView basket = (TextView) findViewById(R.id.basket);
        total_counter = total_counter + ice_price;
        basket.setText("" + total_counter);
    }

    public void selectTea(View view) {

        TextView basket = (TextView) findViewById(R.id.basket);
        total_counter = total_counter + tea_price;
        basket.setText("" + total_counter);
    }


    public void onClickHappyHours(View view){

    //pobieramy stan przycisku przelacznika:isChecked() zwraca true jezeli przycisk jest wlaczony
    boolean on = ((ToggleButton) view).isChecked();
        if(on) {
            double discount = ((double)total_counter)/(-10);
            double total_discounted = ((double)total_counter) + discount;

            TextView basket = (TextView) findViewById(R.id.basket);
            LinearLayout l1 = (LinearLayout) findViewById(R.id. coffee_layout);
            LinearLayout l2 = (LinearLayout) findViewById(R.id. ice_layout);
            basket.setText("" + total_discounted);
            l1.setBackgroundColor(Color.YELLOW);
            l2.setBackgroundColor(Color.YELLOW);

        } else {

            TextView basket = (TextView) findViewById(R.id.basket);
            LinearLayout l1 = (LinearLayout) findViewById(R.id. coffee_layout);
            LinearLayout l2 = (LinearLayout) findViewById(R.id. ice_layout);
            l1.setBackgroundColor(Color.WHITE);
            l2.setBackgroundColor(Color.WHITE);
            basket.setText("" + total_counter);
        }
    }
}




