package X;

import android.content.Context;
import android.content.pm.PackageManager;
import com.whatsapp.util.Log;

/* renamed from: X.5bQ  reason: invalid class name and case insensitive filesystem */
public abstract class C110905bQ {
    public static final boolean A00(Context context, String str) {
        try {
            if (context.getPackageManager() == null) {
                return false;
            }
            try {
                return context.getPackageManager().getPackageInfo(str, 64).signatures != null;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        } catch (Exception e) {
            Log.e("FoaPresenceOnDeviceChecker/isPackageAvailable", e);
            return false;
        }
    }
}
