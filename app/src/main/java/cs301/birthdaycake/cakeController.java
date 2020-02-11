package cs301.birthdaycake;

import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class cakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener,
            SeekBar.OnSeekBarChangeListener, View.OnTouchListener{


    private CakeView cakeView;
    private CakeModel cakecake;

    public cakeController(CakeView cake){

        cakeView = cake;
        cakecake = cakeView.getCakes();

        cakeView.setOnTouchListener(this);


    }


    public void onClick( View view ){

        cakecake.areLit = false;
        cakeView.invalidate();

    }

    public void onCheckedChanged(CompoundButton button, boolean b ){

        cakecake.hasCandles = false;
        cakeView.invalidate();

    }

    public void onProgressChanged(SeekBar seek, int i, boolean b){

        cakecake.numCandles = i;
        cakeView.invalidate();

    }

    public void onStartTrackingTouch(SeekBar seek){

    }

    public void onStopTrackingTouch(SeekBar seek){

    }

    public boolean onTouch(View v, MotionEvent event){
        cakecake.x = (int)event.getX();
        cakecake.y = (int)event.getY();
        cakecake.touch = true;
        cakeView.invalidate();
        return true;
    }

}
