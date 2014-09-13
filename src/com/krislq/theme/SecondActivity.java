package com.krislq.theme;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends BaseActivity {
    private Button btnEnter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        btnEnter = (Button)findViewById(R.id.button);
        btnEnter.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
                PreferenceHelper.setTheme(SecondActivity.this, mTheme == R.style.AppTheme_Default ? R.style.AppTheme_Another : R.style.AppTheme_Default);
                reload();
            }
        });
    }

}
