package in.hoku.components.tinypref;

import android.app.Application;

/**
 * Created by hoku.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        TinyPref.putInt(this, "COUNT", 100);
    }
}
