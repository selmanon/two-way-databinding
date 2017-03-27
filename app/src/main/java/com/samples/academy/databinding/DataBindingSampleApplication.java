package com.samples.academy.databinding;

import android.app.Application;
import android.content.Context;

/**
 * Created by abdellahselassi on 3/27/17.
 */

public class DataBindingSampleApplication extends Application {
  private static Context _appContext;

  @Override
  public void onCreate() {
    super.onCreate();
    _appContext = this;
  }

  public static Context getAppContext() {
    return _appContext;
  }
}
