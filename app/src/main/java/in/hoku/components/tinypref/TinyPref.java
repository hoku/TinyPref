package in.hoku.components.tinypref;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Set;

/**
 * Created by hoku. on 2016/05/16.
 */
public class TinyPref {

    private static final String PREF_NAME = "in.hoku.components.tinypref.TinyPref";

    public static void saveString(Context c, String key, String value) {
        SharedPreferences.Editor editor = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE).edit();
        editor.putString(key, value);
        editor.commit();
    }

    public static void saveInt(Context c, String key, int value) {
        SharedPreferences.Editor editor = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE).edit();
        editor.putInt(key, value);
        editor.commit();
    }

    public static void saveFloat(Context c, String key, float value) {
        SharedPreferences.Editor editor = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE).edit();
        editor.putFloat(key, value);
        editor.commit();
    }

    public static void saveBoolean(Context c, String key, boolean value) {
        SharedPreferences.Editor editor = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE).edit();
        editor.putBoolean(key, value);
        editor.commit();
    }

    public static void saveLong(Context c, String key, long value) {
        SharedPreferences.Editor editor = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE).edit();
        editor.putLong(key, value);
        editor.commit();
    }

    public static void saveStringSet(Context c, String key, Set<String> value) {
        SharedPreferences.Editor editor = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE).edit();
        editor.putStringSet(key, value);
        editor.commit();
    }


    public static String loadString(Context c, String key, String defValue) {
        SharedPreferences pref = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return pref.getString(key, defValue);
    }

    public static int loadInt(Context c, String key, int defValue) {
        SharedPreferences pref = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return pref.getInt(key, defValue);
    }

    public static float loadFloat(Context c, String key, float defValue) {
        SharedPreferences pref = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return pref.getFloat(key, defValue);
    }

    public static boolean loadBoolean(Context c, String key, boolean defValue) {
        SharedPreferences pref = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return pref.getBoolean(key, defValue);
    }

    public static long loadLong(Context c, String key, long defValue) {
        SharedPreferences pref = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return pref.getLong(key, defValue);
    }

    public static Set<String> loadStringSet(Context c, String key, Set<String> defValue) {
        SharedPreferences pref = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return pref.getStringSet(key, defValue);
    }
}
