package haui.edu.libmanagerhaui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import haui.edu.libmanagerhaui.dao.ThuThuDAO;

public class LoginActivity extends AppCompatActivity {
    EditText edUsername, edPassword;
    Button btnLogin, btnCancel;
    CheckBox chkRememberPass;
    String strUser, strPass;
    ThuThuDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("Đăng nhập");
        edUsername = findViewById(R.id.edUsername);
        edPassword = findViewById(R.id.edPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnCancel = findViewById(R.id.btnCancel);
        chkRememberPass = findViewById(R.id.chkRememberPass);
        dao = new ThuThuDAO(this);
        
        //đọc user,pass trong SharePreferences
        SharedPreferences pref = getSharedPreferences("USER_FILE",MODE_PRIVATE);
        String user = pref.getString("USERNAME","");
        String pass = pref.getString("PASSWORD","");
        Boolean rem = pref.getBoolean("REMEMBER", false);
        
        edUsername.setText(user);
        edPassword.setText(pass);
        chkRememberPass.setChecked(rem);


        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edUsername.setText("");
                edPassword.setText("");
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkLogin();
            }
        });
    }
    public void rememberUser(String u, String p, boolean status){
        SharedPreferences pref = getSharedPreferences("USER_FILE",MODE_PRIVATE);
        SharedPreferences.Editor edit = pref.edit();
        if(!status){
            //xóa tình trạng trước đó
            edit.clear();
        }else {
            //Lưu dữ liệu
            edit.putString("USERNAME",u);
            edit.putString("PASSWORD",p);
            edit.putBoolean("REMEMBER",status);
        }
        //Lưu lại toàn bộ dữ liệu
        edit.commit();
    }
    public void checkLogin(){
        strUser = edUsername.getText().toString();
        strPass = edPassword.getText().toString();
        if(strUser.isEmpty() && strPass.isEmpty()){
            Toast.makeText(getApplicationContext(), "Username and Password cannot be left blank", Toast.LENGTH_SHORT).show();
        }else {
            if(dao.checkLogin(strUser,strPass) > 0){
                Toast.makeText(getApplicationContext(), "Login successfully", Toast.LENGTH_SHORT).show();
                rememberUser(strUser,strPass,chkRememberPass.isChecked());
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.putExtra("user", strUser);
                startActivity(i);
                finish();
            }else {
                Toast.makeText(getApplicationContext(), "Username or password is incorrect", Toast.LENGTH_SHORT).show();
            }
        }
    }
}