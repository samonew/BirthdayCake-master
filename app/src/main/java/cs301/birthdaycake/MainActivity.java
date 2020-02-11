package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.*;

public class MainActivity extends AppCompatActivity {
    private CakeView cakeView;
    private cakeController cakeController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        cakeView = findViewById(R.id.cakeview);
        cakeController = new cakeController(cakeView);

        View balloonTouch = findViewById(R.id.wholeScreen);
        balloonTouch.setOnTouchListener(cakeController);



    }

    public void goodbye(View button) {
        Log.i("button2", "goodbye");
    }

}
