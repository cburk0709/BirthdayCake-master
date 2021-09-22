package cs301.birthdaycake;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;


public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {

    private CakeView myCakeView;
    private CakeModel myCakeModel;
    Square square;

    public CakeController(CakeView tempView){
        myCakeView = tempView;
        myCakeModel = myCakeView.getMyCakeModel();
    }

    @Override
    public void onClick(View view) {
        Log.d("d", "button logged");
        //blow out the candles
        myCakeModel.areCandlesLit = false;
        //redraw
        myCakeView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        Log.d("d", "switch logged");
        //alternates whether or not the cake has candles
        myCakeModel.cakeHasCandles =!myCakeModel.cakeHasCandles;
        //redraw
        myCakeView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        Log.d("d", "progress changed: " + i);
        //changes the amount of candles
        myCakeModel.candleCount = i;
        //redraw
        myCakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

}
