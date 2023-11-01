package org.koreait.edutainment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void onPostCreate(Bundle saveInstanceState) {
        super.onPostCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        /*sign = findViewById(R.id.); //회원가입 버튼
        sign.setOnClickListener(v ->{ //회원가입버튼 클릭시, 회원가입 페이지로 넘어감
            Intent intent = new Intent(this,SigupActivity.class);
            startActivity(intent);
        });

        sign = findViewById(R.id.loginbutton);
        sign.setOnClickListener(v ->{
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        });
    }*/ // 버튼 누르면 다른 페이지로 이동

}