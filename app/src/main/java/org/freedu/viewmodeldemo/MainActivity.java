package org.freedu.viewmodeldemo;

import androidx.appcompat.app.AppCompatActivity;
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

        countTxt.setText(mainActivityViewActivity.getInitialCounter()+"");

        countBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countTxt.setText(mainActivityViewActivity.getCounter()+"");
            }
        });
    }
}