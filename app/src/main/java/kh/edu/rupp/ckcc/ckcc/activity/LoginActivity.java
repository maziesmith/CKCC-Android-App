package kh.edu.rupp.ckcc.ckcc.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import kh.edu.rupp.ckcc.ckcc.R;

/**
 * CKCC
 * Created by leapkh on 16/3/17.
 */

public class LoginActivity extends Activity implements View.OnClickListener {

    private final String USERNAME = "ckcc";
    private final String PASSWORD = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        Button btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_login) {
            EditText etxtUsername = (EditText) findViewById(R.id.etxt_username);
            EditText etxtPassword = (EditText) findViewById(R.id.etxt_password);
            String username = etxtUsername.getText().toString();
            String password = etxtPassword.getText().toString();
            if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                Intent mainIntent = new Intent(this, MainActivity.class);
                startActivity(mainIntent);
            } else {
                Log.d("ckcc", "Login fail");
            }
        }
    }
}
