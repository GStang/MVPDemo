package swpuiot.com.mvplearn.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import swpuiot.com.mvplearn.R;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState!=null){

        }
//        setContentView(R.layout.activity_base);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
