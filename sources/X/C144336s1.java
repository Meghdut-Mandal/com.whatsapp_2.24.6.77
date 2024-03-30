package X;

import android.os.SystemClock;

/* renamed from: X.6s1  reason: invalid class name and case insensitive filesystem */
public class C144336s1 implements C33281f2 {
    public long A00 = 0;
    public boolean A01 = false;
    public final C227815t A02;
    public final C19970wo A03;

    public synchronized boolean isValid() {
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.A00 < 5000) {
            z = this.A01;
        } else {
            this.A00 = uptimeMillis;
            try {
                AnonymousClass15u r3 = this.A02.A00;
                int i = r3.A00;
                if (i != 1 || r3.A01 > 0 || r3.A03 > 0 || r3.A02 != Integer.MIN_VALUE) {
                    if (!r3.A01() || i != 2) {
                        z = false;
                        this.A01 = z;
                    }
                }
                z = true;
                this.A01 = z;
            } catch (Exception unused) {
                z = false;
                this.A01 = false;
            }
        }
        return z;
    }

    public C144336s1(C227815t r3, C19970wo r4) {
        this.A03 = r4;
        this.A02 = r3;
    }
}
