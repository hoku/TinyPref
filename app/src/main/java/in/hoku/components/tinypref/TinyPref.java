package in.hoku.components.tinypref;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Set;

/**
 * Name:    TinyPref
 * URL:     https://github.com/hoku/TinyPref
 * License: CC0
 * <p/>
 * Created by hoku.
 */
public class TinyPref {

    private static final String PREF_NAME = "in.hoku.components.tinypref.TinyPref";

    public static void putString(Context c, String key, String value) {
        SharedPreferences.Editor editor = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE).edit();
        editor.putString(key, value);
        editor.commit();
    }

    public static void putInt(Context c, String key, int value) {
        SharedPreferences.Editor editor = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE).edit();
        editor.putInt(key, value);
        editor.commit();
    }

    public static void putFloat(Context c, String key, float value) {
        SharedPreferences.Editor editor = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE).edit();
        editor.putFloat(key, value);
        editor.commit();
    }

    public static void putBoolean(Context c, String key, boolean value) {
        SharedPreferences.Editor editor = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE).edit();
        editor.putBoolean(key, value);
        editor.commit();
    }

    public static void putLong(Context c, String key, long value) {
        SharedPreferences.Editor editor = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE).edit();
        editor.putLong(key, value);
        editor.commit();
    }

    public static void putStringSet(Context c, String key, Set<String> value) {
        SharedPreferences.Editor editor = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE).edit();
        editor.putStringSet(key, value);
        editor.commit();
    }


    public static String getString(Context c, String key, String defValue) {
        SharedPreferences pref = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return pref.getString(key, defValue);
    }

    public static int getInt(Context c, String key, int defValue) {
        SharedPreferences pref = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return pref.getInt(key, defValue);
    }

    public static float getFloat(Context c, String key, float defValue) {
        SharedPreferences pref = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return pref.getFloat(key, defValue);
    }

    public static boolean getBoolean(Context c, String key, boolean defValue) {
        SharedPreferences pref = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return pref.getBoolean(key, defValue);
    }

    public static long getLong(Context c, String key, long defValue) {
        SharedPreferences pref = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return pref.getLong(key, defValue);
    }

    public static Set<String> getStringSet(Context c, String key, Set<String> defValue) {
        SharedPreferences pref = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return pref.getStringSet(key, defValue);
    }


    public static void remove(Context c, String key) {
        SharedPreferences.Editor editor = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE).edit();
        editor.remove(key);
    }

    public static void clear(Context c) {
        SharedPreferences.Editor editor = c.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE).edit();
        editor.clear();
    }
}
