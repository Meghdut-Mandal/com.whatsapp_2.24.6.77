package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: X.0Z4  reason: invalid class name */
public class AnonymousClass0Z4 {
    public static volatile C06550Ua A00;
    public static volatile List A01;

    public static void A06(Context context, AnonymousClass0X5 r4) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 32) {
            if ((r4.A0D & 1) != 0) {
                return;
            }
            if (i < 26) {
                if (A08(context)) {
                    Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                    r4.A02(intent);
                    context.sendBroadcast(intent);
                    return;
                }
                return;
            }
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(r4.A01(), (IntentSender) null);
    }

    public static Intent A01(Context context, AnonymousClass0X5 r3) {
        Intent intent;
        if (Build.VERSION.SDK_INT < 26 || (intent = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(r3.A01())) == null) {
            intent = new Intent();
        }
        r3.A02(intent);
        return intent;
    }

    public static C06550Ua A02(Context context) {
        if (A00 == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    A00 = (C06550Ua) AnonymousClass001.A0G(Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, AnonymousClass0Z4.class.getClassLoader()), Context.class, "getInstance", new Class[1], 0).invoke((Object) null, new Object[]{context});
                } catch (Exception unused) {
                }
            }
            if (A00 == null) {
                A00 = new C03580Gl();
            }
        }
        return A00;
    }

    public static List A03(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
            for (ShortcutInfo r1 : dynamicShortcuts) {
                arrayList.add(new AnonymousClass0Y4(context, r1).A00());
            }
            return arrayList;
        }
        try {
            return A02(context).A02();
        } catch (Exception unused) {
            return AnonymousClass001.A0I();
        }
    }

    public static List A04(Context context) {
        Bundle bundle;
        String string;
        if (A01 == null) {
            ArrayList A0I = AnonymousClass001.A0I();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 128)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (!(activityInfo == null || (bundle = activityInfo.metaData) == null || (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) == null)) {
                    try {
                        AnonymousClass001.A0G(Class.forName(string, false, AnonymousClass0Z4.class.getClassLoader()), Context.class, "getInstance", new Class[1], 0).invoke((Object) null, new Object[]{context});
                        A0I.add((Object) null);
                    } catch (Exception unused) {
                    }
                }
            }
            if (A01 == null) {
                A01 = A0I;
            }
        }
        return A01;
    }

    public static void A05(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        }
        A02(context).A00();
        Iterator it = A04(context).iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0A("onAllShortcutsRemoved");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A08(android.content.Context r5) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0013
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r5.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            boolean r0 = r0.isRequestPinShortcutSupported()
            return r0
        L_0x0013:
            java.lang.String r4 = "com.android.launcher.permission.INSTALL_SHORTCUT"
            int r0 = X.AnonymousClass00F.A01(r5, r4)
            r3 = 0
            if (r0 != 0) goto L_0x004d
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            java.lang.String r1 = "com.android.launcher.action.INSTALL_SHORTCUT"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            java.util.List r0 = r2.queryBroadcastReceivers(r0, r3)
            java.util.Iterator r2 = r0.iterator()
        L_0x002f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004d
            java.lang.Object r0 = r2.next()
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            java.lang.String r1 = r0.permission
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x004b
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x002f
        L_0x004b:
            r0 = 1
            return r0
        L_0x004d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Z4.A08(android.content.Context):boolean");
    }

    public static int A00(Context context) {
        Objects.requireNonNull(context);
        if (Build.VERSION.SDK_INT >= 25) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        if (r6 >= 25) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(android.content.Context r7, java.util.List<X.AnonymousClass0X5> r8) {
        /*
            java.util.Objects.requireNonNull(r8)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 32
            if (r1 > r0) goto L_0x0029
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r8)
            java.util.Iterator r2 = r8.iterator()
        L_0x0012:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r1 = r2.next()
            X.0X5 r1 = (X.AnonymousClass0X5) r1
            int r0 = r1.A0D
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0012
            r3.remove(r1)
            goto L_0x0012
        L_0x0028:
            r8 = r3
        L_0x0029:
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r6 > r0) goto L_0x007a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.Iterator r5 = r0.iterator()
        L_0x0038:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r4 = r5.next()
            X.0X5 r4 = (X.AnonymousClass0X5) r4
            androidx.core.graphics.drawable.IconCompat r2 = r4.A0I
            if (r2 == 0) goto L_0x0072
            int r3 = r2.A02
            r1 = 6
            if (r3 == r1) goto L_0x0051
            r0 = 4
            if (r3 == r0) goto L_0x0051
            goto L_0x0038
        L_0x0051:
            java.io.InputStream r0 = r2.A0C(r7)
            if (r0 == 0) goto L_0x0072
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r0)
            if (r2 == 0) goto L_0x0072
            if (r3 != r1) goto L_0x006d
            java.util.Objects.requireNonNull(r2)
            r1 = 5
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>(r1)
            r0.A06 = r2
        L_0x006a:
            r4.A0I = r0
            goto L_0x0038
        L_0x006d:
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.A03(r2)
            goto L_0x006a
        L_0x0072:
            r8.remove(r4)
            goto L_0x0038
        L_0x0076:
            r0 = 25
            if (r6 < r0) goto L_0x0096
        L_0x007a:
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.util.Iterator r1 = r8.iterator()
        L_0x0082:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r0 = r1.next()
            X.0X5 r0 = (X.AnonymousClass0X5) r0
            android.content.pm.ShortcutInfo r0 = r0.A01()
            r2.add(r0)
            goto L_0x0082
        L_0x0096:
            X.0Ua r0 = A02(r7)
            r0.A01(r8)
            java.util.List r0 = A04(r7)
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c3
            r1.next()
            java.lang.String r0 = "onShortcutAdded"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x00b5:
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r7.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            boolean r0 = r0.addDynamicShortcuts(r2)
            if (r0 != 0) goto L_0x0096
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Z4.A07(android.content.Context, java.util.List):void");
    }
}
