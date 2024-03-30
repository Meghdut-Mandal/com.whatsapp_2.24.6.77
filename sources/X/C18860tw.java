package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.0tw  reason: invalid class name and case insensitive filesystem */
public abstract class C18860tw {
    @Deprecated
    public static Activity A00(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    @Deprecated
    public static Activity A01(Context context, Class cls) {
        Activity A00 = A00(context);
        if (A00 == null || !cls.isAssignableFrom(A00.getClass())) {
            return null;
        }
        return A00;
    }

    public static void A02(Intent intent) {
        if (!A03(intent)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Intent ");
            sb.append(intent);
            sb.append(" is implicit. For apps targeting API 34+ (Android 14+) implicit broadcasts will NOT be delivered to un-exported internal broadcast receivers. So, if thisbroadcast is meant for an unexported internal receiver make the receiver exported or make the Intent explicit. More information here https://fburl.com/dxdppmde");
            Log.w(sb.toString());
        }
    }

    public static boolean A03(Intent intent) {
        if (!TextUtils.isEmpty(intent.getPackage()) || intent.getComponent() != null) {
            return true;
        }
        return false;
    }
}
