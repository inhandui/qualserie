package com.cursoandroid.qualserie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private ImageView humor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekbar);

        humor = findViewById(R.id.humor);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (progress == 1){
                    humor.setImageResource(R.drawable.pouco);
                }
                else if (progress == 2){
                    humor.setImageResource(R.drawable.medio);
                }
                else if (progress == 3 ){
                    humor.setImageResource(R.drawable.muito);
                }
                else if (progress == 4){
                    humor.setImageResource(R.drawable.susto);
                }

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
