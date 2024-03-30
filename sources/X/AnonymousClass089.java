package X;

import android.content.res.Resources;
import android.os.Build;

/* renamed from: X.089  reason: invalid class name */
public abstract class AnonymousClass089 {
    public static final C002000v A00 = new C002000v(16);
    public static final AnonymousClass08A A01;

    static {
        AnonymousClass08A r0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            r0 = new AnonymousClass08B();
        } else if (i >= 28) {
            r0 = new C03600Gn();
        } else if (i >= 26) {
            r0 = new C03610Go();
        } else if (i < 24 || !AnonymousClass0Gq.A01()) {
            r0 = new AnonymousClass0Gp();
        } else {
            r0 = new AnonymousClass0Gq();
        }
        A01 = r0;
    }

    public static String A00(Resources resources, String str, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder(resources.getResourcePackageName(i));
        sb.append('-');
        sb.append(str);
        sb.append('-');
        sb.append(i2);
        sb.append('-');
        sb.append(i);
        sb.append('-');
        sb.append(i3);
        return sb.toString();
    }
}
