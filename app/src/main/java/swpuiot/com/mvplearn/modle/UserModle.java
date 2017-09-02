package swpuiot.com.mvplearn.modle;

import android.util.Log;

import swpuiot.com.mvplearn.listener.LoginListener;

/**
 * Created by tgs on 17-7-11.
 * UserModel,do something operation which cost time.
 */

public class UserModle {
    public int register() {
        //此处模拟注册过程
        return 1;
    }

    public int login(final LoginListener listener) {
        //此处模拟登录过程
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
//                    Log.d("test", "sleep");
                    Thread.sleep(3000);
                    listener.success();
//                    Log.d("test", "success");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        return 1;
    }
}
