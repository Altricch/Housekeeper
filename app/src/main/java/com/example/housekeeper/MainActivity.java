package com.example.housekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonLogin;
    private EditText editTextEmail;
    private EditText editTextPassword;

    private CheckBox checkBoxLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar(findViewById(R.id.activity_main_toolbar));

        androidx.appcompat.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.header_logo, null);
        actionBar.setCustomView(view);


        buttonLogin = findViewById(R.id.login);
        editTextPassword = findViewById(R.id.editTextTextPassword);
        editTextEmail = findViewById(R.id.editTextTextEmailAddress);
        checkBoxLogin = findViewById(R.id.checkBoxLogin);





        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBoxLogin.isChecked()) {
                    Intent intent = new Intent(MainActivity.this, RoomsActivity.class);
                    startActivity(intent);
                }

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