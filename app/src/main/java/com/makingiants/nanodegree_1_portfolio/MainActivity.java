package com.makingiants.nanodegree_1_portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_activity);
    ButterKnife.bind(this);
  }

  @OnClick({
      R.id.popularMoviesButton, R.id.stockHawkButton, R.id.buildItBiggerButton,
      R.id.makeYourAppMaterialButton, R.id.goUbiquitousButton,
      R.id.capstoneButton,
  })
  public void onButtonClick(Button button) {
    Toast.makeText(this,
        getString(R.string.this_button_will_launch, button.getText()),
        Toast.LENGTH_SHORT)
        .show();
  }
}
