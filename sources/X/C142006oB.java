package X;

import android.os.SystemClock;

/* renamed from: X.6oB  reason: invalid class name and case insensitive filesystem */
public final class C142006oB implements C160367kt {
    public final AnonymousClass66C A00;

    public C142006oB(AnonymousClass66C r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void B6v(int i, int i2, String str, int i3) {
        AnonymousClass66C r3 = this.A00;
        if (r3.A00.A0E(4771)) {
            r3.A01.markerAnnotate(4, i2, "instance", i3);
        }
    }

    public void B6x(int i, int i2) {
        AnonymousClass66C r4 = this.A00;
        Short sh = (short) 2;
        int intValue = sh.intValue();
        if (r4.A00.A0E(4771)) {
            r4.A01.markerEnd(4, i2, (short) intValue);
        }
    }

    public boolean B6y(int i, int i2) {
        AnonymousClass66C r3 = this.A00;
        if (!r3.A00.A0E(4771)) {
            return true;
        }
        r3.A01.markerStart(4, i2);
        return true;
    }

    public long currentMonotonicTimestamp() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
