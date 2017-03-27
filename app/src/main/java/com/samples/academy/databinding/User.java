package com.samples.academy.databinding;

import android.databinding.ObservableField;

/**
 * Created by abdellahselassi on 3/25/17.
 */

public class User {
  public final ObservableField<String> firstName;
  public final ObservableField<String> lastName;

  public User(String firstName, String lastName) {
    this.firstName = new ObservableField<>(firstName);
    this.lastName = new ObservableField<>(lastName);
  }
}
