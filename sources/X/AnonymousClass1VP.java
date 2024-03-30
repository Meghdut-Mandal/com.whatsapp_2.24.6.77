package X;

import android.os.SystemClock;

/* renamed from: X.1VP  reason: invalid class name */
public final class AnonymousClass1VP {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public AnonymousClass2SZ A04;
    public String A05;
    public final C21010yW A06;
    public final C19970wo A07;

    public AnonymousClass1VP(C19970wo r2, C21010yW r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A07 = r2;
        this.A06 = r3;
    }

    public static final AnonymousClass2SZ A00(AnonymousClass1VP r5, AnonymousClass6FQ r6, C006302t r7, int i) {
        int i2 = r6.A02;
        if (i2 == 12) {
            return null;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        AnonymousClass2SZ r4 = new AnonymousClass2SZ();
        A01(r4, r5, i, uptimeMillis);
        r4.A02 = r6.A01();
        r4.A03 = AnonymousClass6V9.A01(i2);
        r4.A04 = Integer.valueOf(r6.A00());
        Boolean bool = r6.A00;
        if (bool != null) {
            r4.A01 = bool;
        }
        r7.invoke(r4);
        r5.A03 = uptimeMillis;
        r5.A02++;
        r5.A01++;
        return r4;
    }

    public static final void A02(AnonymousClass1VP r2, AnonymousClass6FQ r3, int i) {
        AnonymousClass2SZ A002 = A00(r2, r3, AnonymousClass4NI.A00, i);
        if (A002 != null) {
            r2.A06.Bly(A002);
        }
    }

    public static final void A03(AnonymousClass1VP r2, AnonymousClass6FQ r3, Integer num, int i) {
        AnonymousClass2SZ A002 = A00(r2, r3, new AnonymousClass4KU(num), i);
        if (A002 != null) {
            r2.A06.Bly(A002);
        }
    }

    public static final void A01(AnonymousClass2SZ r4, AnonymousClass1VP r5, int i, long j) {
        r4.A05 = Integer.valueOf(i);
        r4.A07 = Long.valueOf(j - r5.A00);
        r4.A0A = Long.valueOf(j - r5.A03);
        r4.A08 = Long.valueOf(r5.A01);
        r4.A0B = r5.A05;
        r4.A09 = Long.valueOf(r5.A02);
    }
}
