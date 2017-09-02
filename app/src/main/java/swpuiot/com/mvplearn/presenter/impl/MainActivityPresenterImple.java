package swpuiot.com.mvplearn.presenter.impl;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import swpuiot.com.mvplearn.listener.LoginListener;
import swpuiot.com.mvplearn.modle.UserModle;
import swpuiot.com.mvplearn.presenter.MainActivityPresenter;
import swpuiot.com.mvplearn.view.BaseActivityView;

/**
 * Created by tgs on 17-7-11.
 * Presenter,As a Control between Modle and View
 */

public class MainActivityPresenterImple implements MainActivityPresenter, LoginListener {
    private BaseActivityView view;
    private UserModle modle;

    public MainActivityPresenterImple(BaseActivityView view) {
        this.view = view;
        modle = new UserModle();
    }

    @Override
    public void Toast() {
        Log.d("test", "Toast");
        modle.login(this);
    }

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 1) {
                show();
            }
        }
    };

    @Override
    public void success() {
//        Log.d("test", "sucess");
//        view.Toast("success");

        Message message = new Message();
        message.what = 1;
        message.arg1 = 1;
        handler.sendMessage(message);
    }

    public void show() {
        view.Toast("Success");
    }
}
