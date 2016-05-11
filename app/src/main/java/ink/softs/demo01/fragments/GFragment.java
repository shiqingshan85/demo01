package ink.softs.demo01.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ink.softs.demo01.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link GFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link GFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_g, container, false);
    }


}
