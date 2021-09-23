package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import java.util.Objects;
public class MainActivity extends AppCompatActivity {

    Button btn_signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Login");

        btn_signup = findViewById(R.id.button2);
        btn_signup.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(),signup.class)));
    }
}