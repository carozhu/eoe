package com.krislq.theme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ThemeActivity extends BaseActivity {
    private Button btnEnter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.theme);
        btnEnter = (Button)findViewById(R.id.button);
        btnEnter.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ThemeActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }

}
