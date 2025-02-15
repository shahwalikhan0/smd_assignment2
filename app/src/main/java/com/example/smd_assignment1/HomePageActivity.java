package com.example.smd_assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class HomePageActivity extends AppCompatActivity {

    private Button button;
    private TextView nameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        init();

        button.setOnClickListener(v -> {
            String name = nameInput.getText().toString().trim();

            if (name.isEmpty()) {
                Toast.makeText(this, "Name is required!", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(HomePageActivity.this, QuizActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });
    }

    private void init() {
        nameInput = findViewById(R.id.nameInput);
        button = findViewById(R.id.startButton);
    }
}