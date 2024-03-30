package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* renamed from: X.6sm  reason: invalid class name and case insensitive filesystem */
public class C144766sm implements C159417jK {
    public final Context A00;
    public final C20810yC A01;
    public final C21010yW A02;

    public void BV1() {
        ActivityInfo activityInfo;
        if (this.A01.A0E(3085)) {
            Intent A0D = C36431kI.A0D();
            A0D.setAction("com.facebook.GET_PHONE_ID");
            Context context = this.A00;
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(A0D, 0);
            PackageManager packageManager = context.getPackageManager();
            int i = 64;
            if (C19550w8.A05()) {
                i = 134217728;
            }
            for (ResolveInfo next : queryBroadcastReceivers) {
                if (!(next == null || (activityInfo = next.activityInfo) == null)) {
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(activityInfo.packageName, i);
                        C1039757u r1 = new C1039757u();
                        r1.A00 = packageManager.getApplicationLabel(next.activityInfo.applicationInfo).toString();
                        r1.A01 = next.activityInfo.packageName;
                        r1.A03 = C132916Vu.A01(packageInfo);
                        r1.A02 = C18750th.A02(packageInfo.applicationInfo.publicSourceDir);
                        this.A02.Blv(r1);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
            }
        }
    }

    public C144766sm(Context context, C20810yC r2, C21010yW r3) {
        this.A00 = context;
        this.A02 = r3;
        this.A01 = r2;
    }
}
