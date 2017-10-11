package mx.gob.galeana.fragments;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;

import mx.gob.galeana.R;

/**
 * Created by code on 26/10/16.
 */
public class AyudaFragment extends Fragment {
    private YouTubePlayerFragment videoView;
    private YouTubePlayer.OnInitializedListener listener;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_ayuda, container, false);

        videoView = (YouTubePlayerFragment) getActivity().getFragmentManager().findFragmentById(R.id.fragment_youtube);

        listener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("af2ciht_ncc");
                youTubePlayer.setShowFullscreenButton(false);
                //youTubePlayer.setOnFullscreenListener(b1 -> getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE));
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };


        videoView.initialize("AIzaSyDHDnSpC4e1VwrYYjQeb1sAQrr_d2U0zPY", listener);

        return v;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        this.onDestroy();
        if (videoView != null)
            getActivity().getFragmentManager().beginTransaction().remove(videoView).commit();
    }
}
