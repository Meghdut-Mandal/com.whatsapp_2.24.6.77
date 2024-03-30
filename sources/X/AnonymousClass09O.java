package X;

import android.os.Build;

/* renamed from: X.09O  reason: invalid class name */
public final class AnonymousClass09O {
    public final AnonymousClass09P A00;

    public AnonymousClass09O(AnonymousClass09H r3) {
        AnonymousClass09P r0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            r0 = new AnonymousClass09R(r3);
        } else if (i >= 29) {
            r0 = new AnonymousClass09Q(r3);
        } else {
            r0 = new AnonymousClass0H0(r3);
        }
        this.A00 = r0;
    }

    public AnonymousClass09O() {
        AnonymousClass09P r0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            r0 = new AnonymousClass09R();
        } else if (i >= 29) {
            r0 = new AnonymousClass09Q();
        } else {
            r0 = new AnonymousClass0H0();
        }
        this.A00 = r0;
    }
}
