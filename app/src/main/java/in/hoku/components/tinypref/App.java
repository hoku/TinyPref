package in.hoku.components.tinypref;

import android.app.Application;

/**
 * Created by hoku. on 2016/05/16.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        TinyPref.saveInt(this, "COUNT", 100);
    }
}
