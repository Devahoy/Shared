package com.devahoy.android.shared;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Map;
import java.util.Set;

public class Shared {

    private SharedPreferences mPrefs;
    private SharedPreferences.Editor mEditor;

    public Shared(Context context, String fileName) {
        mPrefs = context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
        mEditor = mPrefs.edit();
    }


    /**
     * ===========================================================
     * SAVE DATA
     * ==========================================================
     */
    public void save(String key, boolean value) {
        mEditor.putBoolean(key, value);
        mEditor.apply();
    }

    public void save(String key, float value) {
        mEditor.putFloat(key, value);
        mEditor.apply();
    }

    public void save(String key, int value) {
        mEditor.putInt(key, value);
        mEditor.apply();
    }

    public void save(String key, long value) {
        mEditor.putLong(key, value);
        mEditor.apply();
    }

    public void save(String key, String value) {
        mEditor.putString(key, value);
        mEditor.apply();
    }

    public void save(String key, Set<String> value) {
        mEditor.putStringSet(key, value);
        mEditor.apply();
    }


    /** ===========================================================
     *  GET DATA
     *  ========================================================== */
    public Map<String, ?> getAll() {
        return mPrefs.getAll();
    }

    public boolean getBoolean(String key, boolean value) {
        return mPrefs.getBoolean(key, value);
    }

    public float getFloat(String key, float value) {
        return mPrefs.getFloat(key, value);
    }

    public int getInt(String key, int value) {
        return mPrefs.getInt(key, value);
    }

    public long getLong(String key, long value) {
        return mPrefs.getLong(key, value);
    }

    public String getString(String key, String value) {
        return mPrefs.getString(key, value);
    }

    public Set<String> getStringSet(String key, Set<String> value) {
        return mPrefs.getStringSet(key, value);
    }


    /**
     * ===========================================================
     * REMOVE DATA
     * ==========================================================
     */
    public void remove(String key) {
        mEditor.remove(key);
        mEditor.apply();
    }
}
