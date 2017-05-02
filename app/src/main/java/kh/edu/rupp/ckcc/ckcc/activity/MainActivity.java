package kh.edu.rupp.ckcc.ckcc.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import kh.edu.rupp.ckcc.ckcc.R;
import kh.edu.rupp.ckcc.ckcc.fragment.FeedbackFragment;
import kh.edu.rupp.ckcc.ckcc.fragment.ProfileFragment;

/**
 * CKCC
 * Created by leapkh on 23/3/17.
 */

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar tlbMain = (Toolbar) findViewById(R.id.tlb_main);
        setSupportActionBar(tlbMain);
        getSupportActionBar().setTitle(R.string.app_name);

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigationview);
        navigationView.setNavigationItemSelectedListener(this);

        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_main);

        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, tlbMain, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

    }

    private void onNewsClick() {
        /*FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        NewsFragment newsFragment = new NewsFragment();
        fragmentTransaction.replace(R.id.lyt_content, newsFragment);
        fragmentTransaction.commit();
        */
        Intent intent = new Intent(this, NewsActivity.class);
        startActivity(intent);
    }

    private void onTrainingCoursesClick() {
        /*
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        TrainingCoursesFragment trainingCoursesFragment = new TrainingCoursesFragment();
        fragmentTransaction.replace(R.id.lyt_content, trainingCoursesFragment);
        fragmentTransaction.commit();
        */
        Intent intent = new Intent(this, CoursesActivity.class);
        startActivity(intent);
    }

    private void onProfileClick() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        ProfileFragment profileFragment = new ProfileFragment();
        fragmentTransaction.replace(R.id.lyt_content, profileFragment);
        fragmentTransaction.commit();
    }

    private void onFeedbackClick() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FeedbackFragment feedbackFragment = new FeedbackFragment();
        fragmentTransaction.replace(R.id.lyt_content, feedbackFragment);
        fragmentTransaction.commit();
    }

    private void onContactClick() {

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        drawerLayout.closeDrawers();

        switch (item.getItemId()) {
            case R.id.mnu_news:
                onNewsClick();
                break;
            case R.id.mnu_training_courses:
                onTrainingCoursesClick();
                break;
            case R.id.mnu_profile:
                onProfileClick();
                break;
            case R.id.mnu_feedback:
                onFeedbackClick();
                break;
            case R.id.mnu_contact:
                onContactClick();
                break;
        }
        return true;
    }
}
