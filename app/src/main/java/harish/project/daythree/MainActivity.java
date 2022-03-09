package harish.project.daythree;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button button_test;
Button button_stop;
MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_test=findViewById(R.id.button);
        button_stop=findViewById(R.id.button2);
        mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.sasa);
        button_test.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mediaPlayer.start();

                return false;
            }
        });
        button_stop.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
               mediaPlayer.stop();
                return false;
            }
        });
    }
}