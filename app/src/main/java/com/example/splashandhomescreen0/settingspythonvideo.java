package com.example.splashandhomescreen0;

import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class settingspythonvideo extends AppCompatActivity {

    private YouTubePlayerView youTubePlayerView;
    Button button;

    public YouTubePlayerView getYouTubePlayerView() {

        return null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settingspythonvideo);

        youTubePlayerView =findViewById(R.id.youtubeplayerId);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "aZZkEdWxBQs";
                youTubePlayer.cueVideo(videoId, 0);
            }
        });
    }
}