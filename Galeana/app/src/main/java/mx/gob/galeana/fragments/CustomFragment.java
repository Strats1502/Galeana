package mx.gob.galeana.fragments;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import mx.gob.galeana.R;
import mx.gob.galeana.activities.SegundaActivity;

/**
 * Created by Uriel on 01/02/2016.
 */
public class CustomFragment extends Fragment {

    private int menu_id;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        int string_title = getArguments().getInt("string_title");
        if(((AppCompatActivity)getActivity()).getSupportActionBar() != null) {
            ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(string_title);
        }
    }


    public static CustomFragment newInstance(int menu_id, int string_title, Class classFragment) throws IllegalAccessException, java.lang.InstantiationException {
        CustomFragment myFragment =  (CustomFragment)classFragment.newInstance();
        Bundle args = new Bundle();
        args.putInt("menu_id", menu_id);
        args.putInt("string_title", string_title);
        myFragment.setArguments(args);

        return myFragment;
    }
}
