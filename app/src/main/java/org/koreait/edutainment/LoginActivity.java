package org.koreait.edutainment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
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
    public void loginbuttonClick(View view) {
        // 로그인 로직을 처리하고 성공하면 메인 화면으로 전환
        if (performLogin()) {
            // 로그인 성공 시 메인 화면으로 전환
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);

            // (옵션) 로그인 정보 저장
            saveLoginCredentials();
        }
    }

    private void saveLoginCredentials() {
        SharedPreferences preferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("isLoggedIn", true);
        editor.apply();
    }

    private boolean performLogin() {
        return true; // 로그인 성공
    }

}