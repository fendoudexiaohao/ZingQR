package songzhihao.bwei.com.zing;

import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;

/**
 * 作者： 宋智豪
 * * 时间： 2017/3/29 15:00
 * * 描述： 尚未编写描述
 */

public class MyApp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        ZXingLibrary.initDisplayOpinion(this);
    }
}
