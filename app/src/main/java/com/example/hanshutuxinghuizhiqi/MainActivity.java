package com.example.hanshutuxinghuizhiqi;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity{
    //创建菜单
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    //菜单点击事件
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.id_about_us: //关于
                String version = "1.0.190712";
                AlertDialog aboutDialog = new AlertDialog.Builder(this).create();
                aboutDialog.setTitle("函数绘制器");
                aboutDialog.setMessage("当前版本：" + version);
                aboutDialog.show();
                break;
            case R.id.id_scan_some: //歌单
                Intent intent = new Intent();
//                startActivity(new Intent(MainActivity.this, Myview.class));
                break;
            case R.id.id_close_app: //退出
                AlertDialog exitDialog = new AlertDialog.Builder(this).create();
                exitDialog.setTitle("系统提示");
                exitDialog.setMessage("确定要退出吗");
                exitDialog.setButton(DialogInterface.BUTTON_POSITIVE, "确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                exitDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "欢迎回来", Toast.LENGTH_SHORT).show();
                    }
                });
                exitDialog.show();
                break;
            default:
                break;
        }
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_my_view);
       final EditText txtFunction = (EditText) findViewById(R.id.txtFunction1);
     Button buttonPlot = (Button) findViewById(R.id.buttonPlot1);
        Button buttonfangda = (Button) findViewById(R.id.buttonFangda);
        Button buttonsuoxiao = (Button) findViewById(R.id.buttonsuoxiao);
        Button buttonyanse = (Button)findViewById(R.id.buttonyanse);
        Button buttonxiantiao = (Button)findViewById(R.id.buttonxiantiao);
        final MyView myView = (MyView) findViewById(R.id.plotview1);
        buttonPlot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (myView != null) {
                    String strFunction = txtFunction.getText().toString();//获取函数文本
                    myView.setStrFunction(strFunction);
                    myView.invalidate();
                }
            }
        });
        buttonfangda.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (myView != null) {
                    String strFunction = txtFunction.getText().toString();//获取函数文本
                    myView.setStrFunction(strFunction);
                    myView.setfangda(10);
                }
            }
        });
        buttonPlot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (myView != null) {
                    String strFunction = txtFunction.getText().toString();//获取函数文本
                    myView.setStrFunction(strFunction);
                    myView.invalidate();
                }
            }
        });
    }

}
