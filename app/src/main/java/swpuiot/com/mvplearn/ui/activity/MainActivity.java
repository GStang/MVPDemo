package swpuiot.com.mvplearn.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import swpuiot.com.mvplearn.R;
import swpuiot.com.mvplearn.base.BaseActivity;
import swpuiot.com.mvplearn.presenter.impl.MainActivityPresenterImple;
import swpuiot.com.mvplearn.view.BaseActivityView;

public class MainActivity extends BaseActivity implements BaseActivityView {
    private MainActivityPresenterImple presenterImple;
    private Button button;

    /**
     * MainActivity As a View.
     * Implement View and has it's Presenter.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenterImple = new MainActivityPresenterImple(this);
        button = (Button) findViewById(R.id.btn_one);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonOnclick();
            }
        });
    }

    /**
     * use presenter's methods to handel model
     */
    @Override
    public void ButtonOnclick() {
        Log.d("test", "click");
        presenterImple.Toast();
    }

    @Override
    public void Toast(String resultcode) {
        Toast.makeText(this, "ButtonOnclick,resultcode=" + resultcode, Toast.LENGTH_SHORT).show();

    }

}
