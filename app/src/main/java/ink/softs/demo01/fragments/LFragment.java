package ink.softs.demo01.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ink.softs.demo01.R;

/**
 * Created by Administrator on 2016-05-11.
 */

public class LFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.lfragment_layout,null);
        initView(view);
        return view;
    }

    private void initView(View view) {

    }
}
