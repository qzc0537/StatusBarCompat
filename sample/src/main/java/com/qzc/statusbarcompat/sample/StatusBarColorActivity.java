package com.qzc.statusbarcompat.sample;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import com.qzc.statusbarcompat.StatusBarCompat;

public class StatusBarColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_bar_color);

        StatusBarCompat.setStatusBarColor(StatusBarColorActivity.this,
                ContextCompat.getColor(this, R.color.colorPrimary),
                50
        );
        final TextView alpha = findViewById(R.id.alpha);
        SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                alpha.setText(progress + "");
                StatusBarCompat.setStatusBarColor(StatusBarColorActivity.this,
                        ContextCompat.getColor(getBaseContext(), R.color.colorPrimary),
                        progress
                );
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
