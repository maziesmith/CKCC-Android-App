package kh.edu.rupp.ckcc.ckcc.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kh.edu.rupp.ckcc.ckcc.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class TrainingCoursesFragment extends Fragment {


    public TrainingCoursesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_training_courses, container, false);
    }

}
