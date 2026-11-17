package com.example.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {
    private TextView show_count;
    private Button button_toast;
    private Button button_count;
    private Button button_zero;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setBackgroundDrawable(
                    new android.graphics.drawable.ColorDrawable(
                            android.graphics.Color.parseColor("#303F9F")
                    )
            );
            getSupportActionBar().setTitle(
                    android.text.Html.fromHtml(
                            "<font color='#FFFFFF'>Hello Constraint</font>",
                            android.text.Html.FROM_HTML_MODE_LEGACY
                    )
            );
        }
        show_count = findViewById(R.id.show_count);
        button_toast = findViewById(R.id.button_toast);
        button_count = findViewById(R.id.button_count);
        button_zero = findViewById(R.id.button_zero);
        show_count.setText(String.valueOf(count));
        button_zero.setBackgroundColor(ContextCompat.getColor(this, R.color.gray));
        button_count.setBackgroundColor(ContextCompat.getColor(this, R.color.blue));
    }
    public void showToast(View view) {
        Toast.makeText(MainActivity.this, "Hello Toast!", Toast.LENGTH_LONG).show();
    }
    public void showCount(View view) {
        count++;
        show_count.setText(String.valueOf(count));
        int countColor = (count % 2 == 1) ? R.color.green : R.color.blue;
        button_count.setBackgroundColor(ContextCompat.getColor(this, countColor));
        button_zero.setBackgroundColor(ContextCompat.getColor(this, R.color.pink));
    }
    public void showZero(View view) {
        count = 0;
        show_count.setText(String.valueOf(count));
        button_zero.setBackgroundColor(ContextCompat.getColor(this, R.color.gray));
        button_count.setBackgroundColor(ContextCompat.getColor(this, R.color.blue));
    }
}
