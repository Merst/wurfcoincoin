package merst.wurfcoincoin;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button wurfButt;
    Button quackyButt;
    Button memeButt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wurfButt = (Button)findViewById(R.id.wurf);
        wurfButt.setOnClickListener(this);

        quackyButt = (Button)findViewById(R.id.coincoin);
        quackyButt.setOnClickListener(this);

        memeButt = (Button)findViewById(R.id.beaker);
        memeButt.setOnClickListener(this);
    }

    public void onClick(View view){
        switch (view.getId()) {
            case R.id.wurf:
                int wurfID = getResources().getIdentifier("wurf", "raw", getPackageName());
                MediaPlayer wurf = MediaPlayer.create(this, wurfID);
                wurf.start();
                break;

            case R.id.coincoin:
                int quackID = getResources().getIdentifier("quack", "raw", getPackageName());
                MediaPlayer coin = MediaPlayer.create(this, quackID);
                coin.start();
                break;

            case R.id.beaker:
                String rando = Integer.toString((int) (Math.random() * 3) + 1);
                String fileName = "mee" + rando;

                int meeID = getResources().getIdentifier(fileName, "raw", getPackageName());

                MediaPlayer mee = MediaPlayer.create(this, meeID);
                mee.start();

                break;
        }
    }
}


