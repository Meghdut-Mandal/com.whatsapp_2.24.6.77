package X;

import android.os.Build;
import android.os.Trace;

/* renamed from: X.68E  reason: invalid class name */
public final class AnonymousClass68E {
    public void A02(String str) {
        AnonymousClass00C.A0D(str, 0);
        if (C112825eW.A00) {
            Trace.beginSection(str);
        }
    }

    public static void A00() {
        AnonymousClass6RN.A00.A01();
    }

    public void A01() {
        if (C112825eW.A00) {
            Trace.endSection();
        }
    }

    public boolean A03() {
        if (!C112825eW.A00) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 29 || Trace.isEnabled()) {
            return true;
        }
        return false;
    }
}
