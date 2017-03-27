package com.samples.academy.databinding;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.samples.academy.databinding.databinding.ActivityMainBinding;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

public class MainActivity extends AppCompatActivity {
  private User user;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

    user = new User("Abdellah", "SELASSI",
        "https://cdn-images-1.medium.com/fit/c/64/64/1*qfp_eL6jGpBgmNzTDIc13Q.jpeg");
    binding.setUser(user);
    binding.setNewUser(user);
  }

  @BindingAdapter("imageUrl")
  public static void setImageUrl(final ImageView imageView, String url) {
    if (url == null) {
      imageView.setImageDrawable(null);
    } else {
      Picasso.with(DataBindingSampleApplication.getAppContext()).load(url)
          .into(new Target() {
            @Override
            public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
              imageView.setImageBitmap(bitmap);
            }

            @Override
            public void onBitmapFailed(Drawable errorDrawable) {

            }

            @Override
            public void onPrepareLoad(Drawable placeHolderDrawable) {

            }
          });
    }
  }
}
