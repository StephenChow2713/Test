package com.dtm.aimiao.callBack;

import android.util.Log;

import com.baidu.autoupdatesdk.UICheckUpdateCallback;

/**
 * Created by Administrator on 2017/6/15.
 */

public class BDUICheckUpdateCallback implements UICheckUpdateCallback {
    @Override
    public void onNoUpdateFound() {
        Log.e("戴天明","爱苗百度已经是最新版本");
    }

    @Override
    public void onCheckComplete() {

    }
}
