package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: X.00F  reason: invalid class name */
public abstract class AnonymousClass00F {
    public static int A00(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C013305t.A00(context, i);
        }
        return context.getResources().getColor(i);
    }

    public static int A01(Context context, String str) {
        Objects.requireNonNull(str, "permission must be non-null");
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        if (new C007203c(context).A01()) {
            return 0;
        }
        return -1;
    }

    public static Context A02(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnonymousClass00G.A00(context);
        }
        return null;
    }

    public static Object A05(Context context, Class cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C013305t.A01(context, cls);
        }
        String str = (String) AnonymousClass0RF.A00.get(cls);
        if (str != null) {
            return context.getSystemService(str);
        }
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:58|(2:60|61)|62|63) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0091 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x00cd */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:43:0x0091=Splitter:B:43:0x0091, B:62:0x00cd=Splitter:B:62:0x00cd} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A06(android.content.Context r8, int r9) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L_0x0043
            java.lang.Object r0 = X.AnonymousClass0PP.A00(r8)
            if (r0 == 0) goto L_0x00c3
            android.os.LocaleList r0 = X.AnonymousClass0PO.A00(r0)
            X.0Yc r3 = X.C07530Yc.A00(r0)
        L_0x0014:
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 32
            if (r2 > r0) goto L_0x003a
            X.0qr r0 = r3.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x003a
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>(r0)
            r0 = 24
            if (r2 < r0) goto L_0x003f
            X.AnonymousClass0VL.A01(r1, r3)
        L_0x0036:
            android.content.Context r8 = A03(r8, r1)
        L_0x003a:
            java.lang.String r0 = r8.getString(r9)
            return r0
        L_0x003f:
            A09(r1, r3)
            goto L_0x0036
        L_0x0043:
            java.lang.Object r7 = X.AnonymousClass0RE.A00
            monitor-enter(r7)
            java.lang.String r2 = ""
            java.lang.String r4 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r3 = r8.openFileInput(r4)     // Catch:{ FileNotFoundException -> 0x009c }
            org.xmlpull.v1.XmlPullParser r5 = android.util.Xml.newPullParser()     // Catch:{ IOException | XmlPullParserException -> 0x0085 }
            java.lang.String r0 = "UTF-8"
            r5.setInput(r3, r0)     // Catch:{ IOException | XmlPullParserException -> 0x0085 }
            int r6 = r5.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x0085 }
        L_0x005b:
            int r1 = r5.next()     // Catch:{ IOException | XmlPullParserException -> 0x0085 }
            r0 = 1
            if (r1 == r0) goto L_0x008c
            r0 = 3
            if (r1 != r0) goto L_0x006c
            int r0 = r5.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x0085 }
            if (r0 <= r6) goto L_0x008c
            goto L_0x005b
        L_0x006c:
            if (r1 == r0) goto L_0x005b
            r0 = 4
            if (r1 == r0) goto L_0x005b
            java.lang.String r1 = r5.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0085 }
            java.lang.String r0 = "locales"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0085 }
            if (r0 == 0) goto L_0x005b
            r1 = 0
            java.lang.String r0 = "application_locales"
            java.lang.String r2 = r5.getAttributeValue(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x0085 }
            goto L_0x008c
        L_0x0085:
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r0 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x00c7 }
        L_0x008c:
            if (r3 == 0) goto L_0x0091
            r3.close()     // Catch:{ IOException -> 0x0091 }
        L_0x0091:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x009a
            r8.deleteFile(r4)     // Catch:{ all -> 0x00ce }
        L_0x009a:
            monitor-exit(r7)     // Catch:{ all -> 0x00ce }
            goto L_0x009d
        L_0x009c:
            monitor-exit(r7)     // Catch:{ all -> 0x00ce }
        L_0x009d:
            X.0Yc r0 = X.C07530Yc.A01
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00c3
            r1 = -1
            java.lang.String r0 = ","
            java.lang.String[] r4 = r2.split(r0, r1)
            int r3 = r4.length
            java.util.Locale[] r2 = new java.util.Locale[r3]
            r1 = 0
        L_0x00b0:
            if (r1 >= r3) goto L_0x00bd
            r0 = r4[r1]
            java.util.Locale r0 = X.C06860Vj.A00(r0)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00bd:
            X.0Yc r3 = X.C07530Yc.A01(r2)
            goto L_0x0014
        L_0x00c3:
            X.0Yc r3 = X.C07530Yc.A01
            goto L_0x0014
        L_0x00c7:
            r0 = move-exception
            if (r3 == 0) goto L_0x00cd
            r3.close()     // Catch:{ IOException -> 0x00cd }
        L_0x00cd:
            throw r0     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00ce }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass00F.A06(android.content.Context, int):java.lang.String");
    }

    public static Executor A07(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C05310Pf.A00(context);
        }
        return new C12500iB(new Handler(context.getMainLooper()));
    }

    public static void A08(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C05300Pe.A00(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static void A09(Configuration configuration, C07530Yc r3) {
        C17180qr r1 = r3.A00;
        if (!r1.isEmpty()) {
            configuration.setLocale(r1.B85(0));
        }
    }

    public static boolean A0A(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnonymousClass00G.A01(context);
        }
        return false;
    }

    public static Context A03(Context context, Configuration configuration) {
        return context.createConfigurationContext(configuration);
    }

    public static ColorStateList A04(Context context, int i) {
        return C015006m.A02(context.getTheme(), context.getResources(), i);
    }
}
