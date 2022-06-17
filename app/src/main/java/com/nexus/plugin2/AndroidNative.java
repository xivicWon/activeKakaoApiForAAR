package com.nexus.plugin2;

import android.content.Context;
import android.os.Build;
import android.widget.Toast;

import com.unity3d.player.UnityPlayer;

public class AndroidNative {
    private static AndroidNative m_instance;
    private Context context;

    // 유니티에서 인스턴스화 하여 사용하기 위해 만드는 메소드.
    public static AndroidNative instance()
    {
        if(m_instance == null)
            m_instance = new AndroidNative();

        return m_instance;
    }

    // 앱을 지정하도록 사용하기 위한 메소드.
    private void setContext(Context context)
    {
        this.context = context;
    }

    // 본격적으로 Toast를 사용하는 메소드.
    private void ShowToast(String toastStr)
    {
        Toast.makeText(this.context, toastStr, Toast.LENGTH_SHORT).show();
    }

    // 버전을 체크하는 메소드.
    private void AndroidVersionCheck(String name, String method)
    {
        UnityPlayer.UnitySendMessage(name, method,"Android version : " + Build.VERSION.RELEASE);
    }
}
