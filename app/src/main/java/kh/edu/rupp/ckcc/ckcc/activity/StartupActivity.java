package kh.edu.rupp.ckcc.ckcc.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import kh.edu.rupp.ckcc.ckcc.R;

public class StartupActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_startup);
        startLoginActivity();
    }

    private void startLoginActivity(){
        Intent loginIntent = new Intent(this, LoginActivity.class);
        startActivity(loginIntent);
    }

}
