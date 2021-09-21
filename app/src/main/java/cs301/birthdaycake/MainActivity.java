package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView myCakeView = findViewById(R.id.cakeview);
        CakeController myCakeController = new CakeController(myCakeView);
        View extinguish = findViewById(R.id.extinguish);
        extinguish.setOnClickListener(myCakeController);
        CompoundButton candleSwitch = (CompoundButton) findViewById(R.id.candleSwitch);
        candleSwitch.setOnCheckedChangeListener(myCakeController);
        SeekBar candleCount = (SeekBar) findViewById(R.id.candleBar);
        candleCount.setOnSeekBarChangeListener(myCakeController);
    }

    public void goodbye(View button) {
        Log.i("button", "Goodbye");
        finishAffinity();
    }


}
