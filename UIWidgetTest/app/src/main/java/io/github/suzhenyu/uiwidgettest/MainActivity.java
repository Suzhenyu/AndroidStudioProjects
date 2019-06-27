package io.github.suzhenyu.uiwidgettest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 使用匿名类来注册监听器
        Button button1 = (Button)findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 在此添加点击逻辑
            }
        });

//        // 这种方法不行，不知为何
//        Button button2 = (Button)findViewById(R.id.button);
//        button2.setOnClickListener(this);
    }

//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.button:
//                // 在此添加点击逻辑
//                Log.d("MainActivity", "onClick");
//                break;
//            default:
//                break;
//        }
//    }
}
