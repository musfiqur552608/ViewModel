package org.freedu.viewmodeldemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView countTxt;
    private Button countBtn;


    private MainActivityViewActivity mainActivityViewActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countTxt = findViewById(R.id.countTxt);
        countBtn = findViewById(R.id.countBtn);
        mainActivityViewActivity = new ViewModelProvider(this).get(MainActivityViewActivity.class);

        LiveData<Integer> count = mainActivityViewActivity.getInitialCounter();
        count.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                countTxt.setText(integer+"");
            }
        });

        countBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivityViewActivity.getCounter();
            }
        });
    }
}