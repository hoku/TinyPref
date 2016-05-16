package in.hoku.components.tinypref;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by hoku. on 2016/05/16.
 */
public class MainActivity extends Activity implements View.OnClickListener {

    private static final String COUNT_PREF_KEY = "COUNT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.countButton:
                countUp();
                break;

            case R.id.clearButton:
                countClear();
                break;
        }
    }

    private void countUp() {
        int count = TinyPref.loadInt(this, COUNT_PREF_KEY, 0);
        count++;
        TinyPref.saveInt(this, COUNT_PREF_KEY, count);

        refreshCountText(count);
    }

    private void countClear() {
        TinyPref.saveInt(this, COUNT_PREF_KEY, 0);

        refreshCountText(0);
    }

    private void refreshCountText(int count) {
        TextView textView = (TextView) findViewById(R.id.count);
        textView.setText(String.valueOf(count));
    }
}
