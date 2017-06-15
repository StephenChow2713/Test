package com.dtm.aimiao.utils;

import android.content.Context;

import com.baidu.autoupdatesdk.BDAutoUpdateSDK;
import com.dtm.aimiao.callBack.BDUICheckUpdateCallback;


/**
 * Created by Administrator on 2017/6/15.
 */

public class BDUtils {

    public static void uiUpdate(Context context){
        try{
            BDAutoUpdateSDK.uiUpdateAction(context, new BDUICheckUpdateCallback());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
