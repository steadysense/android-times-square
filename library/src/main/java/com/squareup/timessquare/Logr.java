package com.squareup.timessquare;

import android.util.Log;

/** Log utility class to handle the log tag and DEBUG-only logging. */
final class Logr {
  public static boolean enabled = false;
  public static void d(String message) {
    if (BuildConfig.DEBUG && enabled) {
      Log.d("TimesSquare", message);
    }
  }

  public static void d(String message, Object... args) {
    if (BuildConfig.DEBUG && enabled) {
      d(String.format(message, args));
    }
  }
}
