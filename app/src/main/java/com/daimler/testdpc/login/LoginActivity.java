package com.daimler.testdpc.login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.daimler.testdpc.PolicyManagementActivity;
import com.daimler.testdpc.R;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    final String ADMIN_PASSWORD = "mbbras@admin";

    private TextInputEditText mPasscodeEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mPasscodeEditText = this.findViewById(R.id.login_password_text);
        Button mSignInButton = this.findViewById(R.id.login_button);
        mSignInButton.setOnClickListener(view -> {
            String passcode = mPasscodeEditText.getText().toString();
            if (ADMIN_PASSWORD.equals(passcode)) {
                this.finish();
                Intent intent = new Intent(this, PolicyManagementActivity.class);
                startActivity(intent);
            }
            else {
                Toast.makeText(this, R.string.login_invalid_credentials, Toast.LENGTH_SHORT).show();
            }
        });
    }

}