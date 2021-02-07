package com.umeng.message.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;

import com.taobao.agoo.TaobaoBaseIntentService;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.message.PushAgent;
import com.umeng.message.UmengMessageHandler;
import com.umeng.message.entity.UMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PushAgent.getInstance(MainActivity.this).onAppStart();
        UMConfigure.setLogEnabled(true);

        /*web.loadUrl("file:///android_asset/callback.htm");*/
    }
    /**
     * 十六进制转换字符串
     * @return String 对应的字符串
     */
    public static String hexStr2Str(String hexStr)
    {
        String str = "0123456789ABCDEF";
        char[] hexs = hexStr.toCharArray();
        byte[] bytes = new byte[hexStr.length() / 2];
        int n;

        for (int i = 0; i < bytes.length; i++)
        {
            n = str.indexOf(hexs[2 * i]) * 16;
            n += str.indexOf(hexs[2 * i + 1]);
            bytes[i] = (byte) (n & 0xff);
        }
        return new String(bytes);
    }

}

/*
abstract  class UmengBaseIntentService extends TaobaoBaseIntentService {
    private static final String a = UmengBaseIntentService.class.getName();

    public UmengBaseIntentService() {
    }

    protected void onMessage(Context var1, Intent var2) {
                */
/*MLog.i(a, new Object[]{ & quot; --- & gt;&gt;&gt;
                UmengBaseIntentService onMessage&quot;});*//*

             Log.i("aaa","变量a"+a+" 变量b"+var2);

    }
    }
*/
