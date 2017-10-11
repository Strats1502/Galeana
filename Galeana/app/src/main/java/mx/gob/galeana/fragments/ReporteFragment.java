package mx.gob.galeana.fragments;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import mx.gob.galeana.R;
import mx.gob.galeana.adapters.RVConvocatoriaAdapter;
import mx.gob.galeana.adapters.RVReporteAdapter;
import mx.gob.galeana.model.Usuario;
import mx.gob.galeana.model.StatusReporte;
import mx.gob.galeana.persistencia.BitacoraDBHelper;

/**
 * Created by Uriel on 11/03/2016.
 */
public class ReporteFragment extends CustomFragment {
    private BitacoraDBHelper bitacoraDBHelper;
    private ArrayList<StatusReporte> lista;
    private View rootView;
    private RecyclerView rvReporte;
    private RVReporteAdapter adapter;
    private CardView reporteCard;
    private TextView emptyView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_reportes, parent, false);


        return v;
    }

    @Override
    public void onStop() {
        super.onStop();
        final Toolbar toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar);
        getActivity().findViewById(R.id.toolbar).setVisibility(View.VISIBLE);
        getActivity().findViewById(R.id.collapsing_toolbar).setVisibility(View.GONE);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().findViewById(R.id.toolbar).setVisibility(View.GONE);
        getActivity().findViewById(R.id.collapsing_toolbar).setVisibility(View.VISIBLE);
        final Toolbar toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar2);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Reporte");
        ((CollapsingToolbarLayout)getActivity().findViewById(R.id.collapsing_toolbar)).setTitle("Reporte");
    }


}
