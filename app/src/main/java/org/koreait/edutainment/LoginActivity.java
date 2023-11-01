package org.koreait.edutainment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.koreait.edutainment.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
    TextView sign;

    @Override
    protected void onPostCreate(Bundle saveInstanceState) {
        super.onPostCreate(saveInstanceState);
        setContentView(R.layout.activity_login);

        sign = findViewById(R.id.signin); //회원가입 버튼
        sign.setOnClickListener(v ->{ //회원가입버튼 클릭시, 회원가입 페이지로 넘어감
            Intent intent = new Intent(this,SigupActivity.class);
            startActivity(intent);
        });

        sign = findViewById(R.id.loginbutton);
        sign.setOnClickListener(v ->{
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        });
    }
}
