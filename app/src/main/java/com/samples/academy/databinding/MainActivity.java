package com.samples.academy.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.samples.academy.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
  User user;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

    user = new User("Abdellah","SELASSI");
    binding.setUser(user);
    binding.setNewUser(user);
  }
}
