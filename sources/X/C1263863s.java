package X;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.63s  reason: invalid class name and case insensitive filesystem */
public final class C1263863s {
    public final C29071Vf A00;
    public final C140256lI A01;
    public final Context A02;
    public final C19420v0 A03;
    public final C20810yC A04;

    public C1263863s(Context context, C19420v0 r3, C20810yC r4, C29071Vf r5, C140256lI r6) {
        C18740tg.A06(context);
        this.A02 = context.getApplicationContext();
        C18740tg.A06(r5);
        this.A00 = r5;
        this.A01 = r6;
        this.A04 = r4;
        this.A03 = r3;
    }

    public void A00() {
        C29061Ve r0;
        ActivityInfo activityInfo;
        Intent A0D = C36431kI.A0D();
        Context context = this.A02;
        A0D.setComponent(new ComponentName(context.getPackageName(), "com.facebook.phoneid.PhoneIdRequestReceiver"));
        PendingIntent A002 = C65743Th.A00(context, 0, A0D, 201326592);
        Bundle A07 = AnonymousClass001.A07();
        A07.putParcelable("auth", A002);
        if (C20800yB.A01(C21000yV.A01, this.A04, 3651)) {
            PackageManager packageManager = context.getPackageManager();
            int i = 64;
            if (C19550w8.A05()) {
                i = 134217728;
            }
            Intent A0D2 = C36431kI.A0D();
            A0D2.setAction("com.facebook.GET_PHONE_ID");
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(A0D2, 0);
            ArrayList A0I = AnonymousClass001.A0I();
            String packageName = context.getPackageName();
            for (ResolveInfo next : queryBroadcastReceivers) {
                if (!(next == null || (activityInfo = next.activityInfo) == null)) {
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(activityInfo.packageName, i);
                        String str = packageInfo.packageName;
                        if (!str.equals(packageName)) {
                            boolean A042 = C132916Vu.A04(packageInfo);
                            if (!A042) {
                                if (AnonymousClass6ID.A00().contains(C132916Vu.A01(packageInfo))) {
                                }
                            }
                            A0I.add(new C118595oP(str, A042));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("could not find package; packageName=");
                        A0u.append(next.activityInfo.packageName);
                        C36321k7.A1J(e, " ", A0u);
                    }
                }
            }
            boolean A012 = AnonymousClass6ID.A01(context);
            Iterator it = A0I.iterator();
            while (it.hasNext()) {
                C118595oP r1 = (C118595oP) it.next();
                String str2 = r1.A00;
                Intent A0D3 = C36431kI.A0D();
                A0D3.setAction("com.facebook.GET_PHONE_ID");
                A0D3.setPackage(str2);
                boolean z = r1.A01;
                if (z || !A012) {
                    r0 = this.A00;
                } else {
                    r0 = this.A01;
                }
                C90834ax r15 = new C90834ax(r0);
                Bundle bundle = null;
                if (z) {
                    bundle = A07;
                }
                context.sendOrderedBroadcast(A0D3, (String) null, r15, (Handler) null, 1, (String) null, bundle);
            }
            return;
        }
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        ArrayList A0I2 = AnonymousClass001.A0I();
        String packageName2 = context.getPackageName();
        for (PackageInfo next2 : installedPackages) {
            if (!next2.packageName.equals(packageName2)) {
                try {
                    PackageManager packageManager2 = context.getPackageManager();
                    String str3 = next2.packageName;
                    int i2 = 64;
                    if (C19550w8.A05()) {
                        i2 = 134217728;
                    }
                    PackageInfo packageInfo2 = packageManager2.getPackageInfo(str3, i2);
                    if (C132916Vu.A04(packageInfo2)) {
                        A0I2.add(packageInfo2.packageName);
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("could not find package; packageName=");
                    C36351kA.A1Q(next2.packageName, A0u2, e2);
                }
            }
        }
        Iterator it2 = A0I2.iterator();
        while (it2.hasNext()) {
            String A0C = AnonymousClass001.A0C(it2);
            Intent A0D4 = C36431kI.A0D();
            A0D4.setAction("com.facebook.GET_PHONE_ID");
            A0D4.setPackage(A0C);
            context.sendOrderedBroadcast(A0D4, (String) null, new C90834ax(this.A00), (Handler) null, 1, (String) null, A07);
        }
    }
}
