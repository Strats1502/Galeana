package mx.gob.galeana.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mx.gob.galeana.R;

/**
 * Created by Uriel on 01/02/2016.
 */
public class RetosDelDiaFragment extends CustomFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_retos_del_dia, parent, false);

        return v;
    }
}