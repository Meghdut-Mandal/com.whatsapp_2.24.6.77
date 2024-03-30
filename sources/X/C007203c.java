package X;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.03c  reason: invalid class name and case insensitive filesystem */
public final class C007203c {
    public static AnonymousClass0ZU A02;
    public static String A03;
    public static Set A04 = new HashSet();
    public static final Object A05 = new Object();
    public static final Object A06 = new Object();
    public final NotificationManager A00;
    public final Context A01;

    public void A00(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.A00.notify(str, i, notification);
            return;
        }
        Context context = this.A01;
        C09590cc r3 = new C09590cc(notification, context.getPackageName(), str, i);
        synchronized (A06) {
            AnonymousClass0ZU r1 = A02;
            if (r1 == null) {
                r1 = new AnonymousClass0ZU(context.getApplicationContext());
                A02 = r1;
            }
            r1.A02.obtainMessage(0, r3).sendToTarget();
        }
        this.A00.cancel(str, i);
    }

    public boolean A01() {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnonymousClass0PZ.A00(this.A00);
        }
        Context context = this.A01;
        Object systemService = context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", new Class[]{cls2, cls2, String.class}).invoke(systemService, new Object[]{(Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class), Integer.valueOf(i), packageName})).intValue() != 0) {
                return false;
            }
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public C007203c(Context context) {
        this.A01 = context;
        this.A00 = (NotificationManager) context.getSystemService("notification");
    }
}
