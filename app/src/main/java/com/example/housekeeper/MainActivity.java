package com.example.housekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonLogin;
    private EditText editTextEmail;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogin = findViewById(R.id.login);
        editTextPassword = findViewById(R.id.editTextTextPassword);
        editTextEmail = findViewById(R.id.editTextTextEmailAddress);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, RoomsActivity.class);
                startActivity(intent);

//                // Get the entered email and password
//                String email = editTextEmail.getText().toString();
//                String password = editTextPassword.getText().toString();
//
//                // Check if the email and password match
//                if (email.equals("") && password.equals("")) {
//                    // Successful login, you can navigate to the next activity or perform actions here
//                    // For now, let's just show a toast message
//                    Toast.makeText(MainActivity.this, "Login successful!", Toast.LENGTH_SHORT).show();
////                    Intent intent = new Intent(MainActivity.this, RoomsActivity.class);
////                    startActivity(intent);
//                    finish();
//                } else {
//                    // Login failed, show an error message
//                    Toast.makeText(MainActivity.this, "Login failed. Please check your credentials.", Toast.LENGTH_SHORT).show();
//                }
            }
        });
    }
}