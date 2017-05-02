package kh.edu.rupp.ckcc.ckcc.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kh.edu.rupp.ckcc.ckcc.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        return inflater.inflate(R.layout.fragment_news, container, false);
    }

}
