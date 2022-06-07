package sg.edu.rp.c346.id21011275.demofruit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String [] fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("ArrayList");

        ArrayList<String> fruits;
        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add(3, "durian");
        String theFruit = fruits.get(1);
        fruits.remove(0);
        fruits.set(fruits.size() - 1, "dragon fruit");

        tv = findViewById(R.id.textView);

        String text = "Fruits\n";
        text += "=====\n";

        for (int i = 0; i < fruits.size(); i++){
            text += fruits.get(i) + "\n";
        }
        tv.setText(text);
    }
}
