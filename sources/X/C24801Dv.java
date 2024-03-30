package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.1Dv  reason: invalid class name and case insensitive filesystem */
public class C24801Dv implements C24791Du {
    public C20810yC A00;
    public final AnonymousClass17Y A01;
    public final C19970wo A02;

    public void A08(Context context, Intent intent, String str) {
        boolean z = true;
        boolean z2 = false;
        if (context != null) {
            z2 = true;
        }
        C18740tg.A0E(z2, "Context must not be null");
        boolean z3 = false;
        if (intent != null) {
            z3 = true;
        }
        C18740tg.A0E(z3, "Intent cannot be null to launch the activity");
        if (str == null) {
            z = false;
        }
        C18740tg.A0E(z, "Origin cannot be null");
        AnonymousClass3M9.A01(intent, str);
        A06(context, intent);
    }

    public void Bp8(Context context, Uri uri, AnonymousClass3T1 r3, int i) {
    }

    public void Bp9(Context context, Uri uri, AnonymousClass3T1 r3, int i, int i2) {
    }

    public static void A02(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static void A03(View view, WindowManager windowManager) {
        int identifier;
        if (view != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int i = 0;
            Resources resources = view.getContext().getResources();
            if (Build.MANUFACTURER.equalsIgnoreCase("Essential Products") && Build.MODEL.equalsIgnoreCase("PH-1") && resources.getConfiguration().orientation == 2 && (identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
                i = resources.getDimensionPixelSize(identifier);
            }
            view.getLayoutParams().width = point.x - i;
        }
    }

    public static void A04(Window window) {
        if (Build.VERSION.SDK_INT >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
        }
    }

    public void A06(Context context, Intent intent) {
        AnonymousClass17Y r2 = this.A01;
        if (!A05(context, intent)) {
            r2.A06(R.string.f12nameremoved, 0);
        }
    }

    public void Bp7(Context context, Uri uri, AnonymousClass3T1 r7) {
        if (uri == null) {
            Log.e("activity-utils/start-activity/uri-is-null");
            return;
        }
        if (C20800yB.A01(C21000yV.A02, this.A00, 2428)) {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.putExtra("com.android.browser.application_id", context.getPackageName());
            intent.putExtra("create_new_tab", true);
            String host = uri.getHost();
            if (host != null && host.startsWith("www.")) {
                host = host.replace("www.", "");
            }
            String str = (String) C56102vk.A00.get(host);
            if (str != null) {
                try {
                    context.getPackageManager().getPackageInfo(str, 0);
                    intent.setPackage(str);
                    if (A05(context, intent)) {
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", uri);
        intent2.putExtra("com.android.browser.application_id", context.getPackageName());
        intent2.putExtra("create_new_tab", true);
        C18740tg.A06(intent2);
        if (!A05(context, intent2)) {
            Intent intent3 = new Intent(intent2);
            intent3.addCategory("android.intent.category.BROWSABLE");
            if (!A05(context, intent3)) {
                this.A01.A06(R.string.f12nameremoved, 0);
            }
        }
    }

    public C24801Dv(AnonymousClass17Y r1, C19970wo r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public static Activity A00(Context context) {
        Activity A002 = C18860tw.A00(context);
        if (A002 != null) {
            return A002;
        }
        throw new IllegalStateException("The Context is not an Activity.");
    }

    public static Activity A01(Context context, Class cls) {
        Activity A002 = A00(context);
        if (cls.isAssignableFrom(A002.getClass())) {
            return A002;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The Context is not assignable from class ");
        sb.append(cls.getSimpleName());
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if ((r6.getFlags() & 268435456) != 0) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(android.content.Context r5, android.content.Intent r6) {
        /*
            android.app.Activity r0 = X.C18860tw.A00(r5)
            r4 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0012
            int r2 = r6.getFlags()
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 & r0
            r1 = 0
            if (r2 == 0) goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            java.lang.String r0 = "Need to use activity context or FLAG_ACTIVITY_NEW_TASK flag"
            X.C18740tg.A0E(r1, r0)
            r5.startActivity(r6)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x001c }
            goto L_0x0023
        L_0x001c:
            r1 = move-exception
            java.lang.String r0 = "app/try-start-activity "
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        L_0x0023:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24801Dv.A05(android.content.Context, android.content.Intent):boolean");
    }

    public void A07(Context context, Intent intent) {
        A08(context, intent, context.getClass().getSimpleName());
    }

    public boolean A09(Activity activity, Intent intent, int i) {
        try {
            activity.startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException | SecurityException e) {
            Log.e("app/start-activity-for-result ", e);
            this.A01.A06(R.string.f12nameremoved, 0);
            return false;
        }
    }
}
