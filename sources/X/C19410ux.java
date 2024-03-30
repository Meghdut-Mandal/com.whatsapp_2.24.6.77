package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0ux  reason: invalid class name and case insensitive filesystem */
public class C19410ux {
    public final Context A00;
    public final SharedPreferences A01;
    public final AtomicBoolean A02;
    public final C19150uS A03;

    public C19410ux(Context context, C19150uS r6, String str) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context context2 = context;
        if (Build.VERSION.SDK_INT >= 24 && !AnonymousClass00F.A0A(context)) {
            context2 = AnonymousClass00F.A02(context);
        }
        this.A00 = context2;
        StringBuilder sb = new StringBuilder();
        sb.append("com.google.firebase.common.prefs:");
        sb.append(str);
        SharedPreferences sharedPreferences = context.getSharedPreferences(sb.toString(), 0);
        this.A01 = sharedPreferences;
        this.A03 = r6;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                Context context3 = this.A00;
                PackageManager packageManager = context3.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context3.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled"))) {
                    z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z = true;
        }
        this.A02 = new AtomicBoolean(z);
    }
}
