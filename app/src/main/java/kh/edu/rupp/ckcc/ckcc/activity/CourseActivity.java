package kh.edu.rupp.ckcc.ckcc.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import kh.edu.rupp.ckcc.ckcc.R;

public class CourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);


        String courseTitle = getIntent().getStringExtra("course-title");
        String courseStartDate = getIntent().getStringExtra("start-date");

        TextView txtTitle = (TextView)findViewById(R.id.txt_title);
        txtTitle.setText(courseTitle);
        TextView txtDate = (TextView)findViewById(R.id.txt_date);
        txtDate.setText(courseStartDate);

    }
}
