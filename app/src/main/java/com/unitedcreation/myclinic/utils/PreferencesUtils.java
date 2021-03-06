package com.unitedcreation.myclinic.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import static com.unitedcreation.myclinic.utils.StringUtils.USER_ID;

public class PreferencesUtils {

    private static SharedPreferences getPreferences (Context context) {
        return PreferenceManager
                .getDefaultSharedPreferences(context);
    }

    public static void addUser (Context context, String uid) {
        getPreferences(context).edit().putString(USER_ID, uid).apply();
    }

    static void removeUser (Context context) {
        getPreferences(context).edit().putString(USER_ID, null).apply();
    }

    public static String getUserId (Context context) {
        return getPreferences(context).getString(USER_ID, "0");
    }

}
