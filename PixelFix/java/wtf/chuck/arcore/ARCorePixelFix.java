package wtf.chuck.arcore;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public class ARCorePixelFix {

    private static final int Preview2versionCode = 171204143;

    public static void PixelFix(Context context) {
        int versionCode = Preview2versionCode;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.ar.core", 0);
            versionCode = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        if (versionCode < Preview2versionCode) {
            Intent intent = new Intent(context, ARCorePixelFixActivity.class);
            context.startActivity(intent);
        }
    }

    public static void UnityPixelFix() {
        PixelFix(com.unity3d.player.UnityPlayer.currentActivity);
    }

}
