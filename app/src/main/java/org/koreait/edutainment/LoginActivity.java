package org.koreait.edutainment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
    }
}