package kh.edu.rupp.ckcc.ckcc.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import kh.edu.rupp.ckcc.ckcc.R;
import kh.edu.rupp.ckcc.ckcc.datamodel.Course;

public class CoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        // Recycler View
        RecyclerView rclCourses = (RecyclerView) findViewById(R.id.rcl_courses);

        //Layout Manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rclCourses.setLayoutManager(layoutManager);

        Course[] courses = loadCourses();

        // Adapter
        CoursesAdapter adapter = new CoursesAdapter();
        adapter.courses = courses;
        rclCourses.setAdapter(adapter);
    }

    // Temporary load courses
    private Course[] loadCourses() {
        Course course1 = new Course();
        course1.title = "Mobile App Development";
        course1.startDate = "18 March 2017";

        Course course2 = new Course();
        course2.title = "iOS App Development";
        course2.startDate = "21 April 2017";

        Course course3 = new Course();
        course3.title = "Korean Language";
        course3.startDate = "11 May 2017";

        Course course4 = new Course();
        course4.title = "Web Development";
        course4.startDate = "02 July 2017";

        Course[] courses = {course1, course2, course3, course4};
        return courses;
    }

    class CoursesAdapter extends RecyclerView.Adapter<CoursesAdapter.CourseViewHolder> {

        public Course[] courses;

        @Override
        public CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View courseViewHolderLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_course, parent, false);
            CourseViewHolder courseViewHolder = new CourseViewHolder(courseViewHolderLayout);

            return courseViewHolder;
        }

        @Override
        public void onBindViewHolder(CourseViewHolder holder, int position) {

            Course course = courses[position];
            holder.txtTitle.setText(course.title);
            holder.txtDate.setText(course.startDate);

        }

        @Override
        public int getItemCount() {
            return courses.length;
        }

        class CourseViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            ImageView imgThumbnail;
            TextView txtTitle;
            TextView txtDate;

            public CourseViewHolder(View itemView) {
                super(itemView);

                imgThumbnail = (ImageView) itemView.findViewById(R.id.img_thumbnail);
                txtTitle = (TextView) itemView.findViewById(R.id.txt_title);
                txtDate = (TextView) itemView.findViewById(R.id.txt_date);

                itemView.setOnClickListener(this);
            }

            @Override
            public void onClick(View view) {
                int position = getAdapterPosition();
                Course course = courses[position];

                Intent intent = new Intent(CoursesActivity.this, CourseActivity.class);
                intent.putExtra("course-title", course.title);
                intent.putExtra("start-date", course.startDate);
                startActivity(intent);
            }
        }

    }

}













