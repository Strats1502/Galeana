package mx.gob.galeana.activities;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import mx.gob.galeana.R;
import mx.gob.galeana.fragments.AyudaFragment;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class HelpActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        //AyudaFragment f = AyudaFragment.newInstance(1);
        //ft.replace(R.id.fragment_container, f).commit();
    }


}
