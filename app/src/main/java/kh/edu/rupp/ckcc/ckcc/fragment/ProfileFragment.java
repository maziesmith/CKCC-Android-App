package kh.edu.rupp.ckcc.ckcc.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kh.edu.rupp.ckcc.ckcc.R;

/**
 * CKCC
 * Created by leapkh on 23/3/17.
 */

public class ProfileFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.activity_profile, container, false);

    }
}
