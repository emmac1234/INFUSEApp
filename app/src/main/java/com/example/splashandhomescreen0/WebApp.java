package com.example.splashandhomescreen0;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class WebApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_app);
        VideoView videoView = findViewById(R.id.videoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.life_at_ericsson; // Replace "my_video" with your video file name
        videoView.setVideoPath(videoPath);
        videoView.start();

        MediaController mediaController = new MediaController(this);
//link mediaController to videoView
        mediaController.setAnchorView(videoView);
//allow mediaController to control our videoView
        videoView.setMediaController(mediaController);




        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                int videoWidth = mediaPlayer.getVideoWidth();
                int videoHeight = mediaPlayer.getVideoHeight();

                // Calculate the aspect ratio
                float aspectRatio = (float) videoWidth / videoHeight;

                // Set the dimensions of the VideoView
                int screenWidth = getResources().getDisplayMetrics().widthPixels;
                int screenHeight = getResources().getDisplayMetrics().heightPixels;

                if (screenWidth / aspectRatio > screenHeight) {
                    // Fit the width to the screen height
                    videoView.getLayoutParams().width = (int) (screenHeight * aspectRatio);
                    videoView.getLayoutParams().height = screenHeight;
                } else {
                    // Fit the height to the screen width
                    videoView.getLayoutParams().width = screenWidth;
                    videoView.getLayoutParams().height = (int) (screenWidth / aspectRatio);
                }

                videoView.requestLayout();
            }
        });


    }

}