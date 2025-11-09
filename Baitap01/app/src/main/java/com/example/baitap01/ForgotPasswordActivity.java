package com.example.baitap01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordActivity extends AppCompatActivity {

    private EditText editEmail;
    private Button buttonSendOtp;
    private TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        editEmail = findViewById(R.id.editEmail);
        buttonSendOtp = findViewById(R.id.buttonSendOtp);
        tvLogin = findViewById(R.id.tvLogin);

        buttonSendOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý logic gửi OTP để reset mật khẩu
                // Chuyển đến màn hình OTP
                startActivity(new Intent(ForgotPasswordActivity.this, OtpActivity.class));
            }
        });

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Quay lại màn hình đăng nhập
                finish();
            }
        });
    }
}