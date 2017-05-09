package kh.edu.rupp.ckcc.ckcc.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import kh.edu.rupp.ckcc.ckcc.R;

/**
 * CKCC
 * Created by leapkh on 16/3/17.
 */

public class LoginActivity extends Activity implements View.OnClickListener {

    public static final String PREFERENCE_NAME = "ckcc-app";
    public static final String KEY_USERNAME = "username";

    private final String USERNAME = "ckcc";
    private final String PASSWORD = "123";

    private CheckBox chkRememberMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        Button btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this);

        chkRememberMe = (CheckBox)findViewById(R.id.chk_remember);

        // Check if user logged in or not
        SharedPreferences preferences = getSharedPreferences(PREFERENCE_NAME, MODE_PRIVATE);
        String username = preferences.getString(KEY_USERNAME, null);
        if(username != null){
            startMainActivity();
        }
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_login) {
            EditText etxtUsername = (EditText) findViewById(R.id.etxt_username);
            EditText etxtPassword = (EditText) findViewById(R.id.etxt_password);
            String username = etxtUsername.getText().toString();
            String password = etxtPassword.getText().toString();
            if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                startMainActivity();
                if (chkRememberMe.isChecked()){
                    // Save username
                    SharedPreferences preferences = getSharedPreferences(PREFERENCE_NAME, MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString(KEY_USERNAME, username);
                    editor.commit();
                }
            } else {
                Log.d("ckcc", "Login fail");
            }
        }
    }

    private void startMainActivity(){
        Intent mainIntent = new Intent(this, MainActivity.class);
        startActivity(mainIntent);
        finish();
    }

}
