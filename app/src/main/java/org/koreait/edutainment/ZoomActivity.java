package org.koreait.edutainment;

import android.annotation.SuppressLint;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;

import org.koreait.edutainment.databinding.ActivityZoomBinding;

public class ZoomActivity extends AppCompatActivity {
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_zoom);
   }
}