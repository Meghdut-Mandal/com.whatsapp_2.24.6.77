package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.whatsapp.payments.receiver.IndiaUpiPayIntentReceiverActivity;
import com.whatsapp.util.Log;

/* renamed from: X.1L0  reason: invalid class name */
public abstract class AnonymousClass1L0 {
    public static void A03(Context context, boolean z) {
        Class<IndiaUpiPayIntentReceiverActivity> cls = IndiaUpiPayIntentReceiverActivity.class;
        PackageManager packageManager = context.getPackageManager();
        try {
            ComponentName componentName = new ComponentName(context, cls);
            int i = 2;
            if (z) {
                i = 1;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("PackageManagerUtils/setActivityRegisteredState/error: ");
            sb.append(e);
            Log.e(sb.toString());
        }
    }

    public static long A00(Context context, String str) {
        PackageInfo A02 = A02(context, str);
        if (A02 == null) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return A02.getLongVersionCode();
        }
        return (long) A02.versionCode;
    }

    public static long A01(Context context, String str) {
        ApplicationInfo applicationInfo;
        PackageInfo A02 = A02(context, str);
        if (A02 == null || (applicationInfo = A02.applicationInfo) == null || !applicationInfo.enabled) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return A02.getLongVersionCode();
        }
        return (long) A02.versionCode;
    }

    public static PackageInfo A02(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getPackageInfo(str, 0);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.i("Failed to get package info", e);
            return null;
        } catch (RuntimeException e2) {
            Log.e("Package manager has died", e2);
            return null;
        }
    }

    public static Signature[] A04(Context context) {
        String packageName = context.getPackageName();
        if (context.getPackageManager() == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(packageName, 64).signatures;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
