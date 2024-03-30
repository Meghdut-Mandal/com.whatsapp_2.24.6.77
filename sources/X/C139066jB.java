package X;

import android.os.SystemClock;

/* renamed from: X.6jB  reason: invalid class name and case insensitive filesystem */
public class C139066jB implements C158987iZ {
    public final AnonymousClass7eT A00;
    public final C19970wo A01;
    public final AnonymousClass61J A02;
    public final C148316yf A03;
    public final C118045nF A04 = new C118045nF();

    public C161027m0 Buv(String str, int i, int i2, long j) {
        int i3;
        AnonymousClass61J r7 = this.A02;
        int i4 = i2;
        Integer valueOf = Integer.valueOf(i4);
        int i5 = i;
        int i6 = i5;
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            int i7 = 0;
            for (int i8 = 0; i8 < 32; i8++) {
                i7 |= ((intValue >> i8) & 1) << (31 - i8);
            }
            i6 = i ^ i7;
        }
        String str2 = str;
        if (str == null) {
            i3 = C133056Wm.A00(r7.A00, i5).A01;
        } else {
            C133056Wm r3 = r7.A00;
            C133056Wm.A01(r3);
            C120365rO r2 = (C120365rO) r3.A03.get(str2);
            if (r2 == null) {
                r2 = new C120365rO(-1, 812974081);
                r3.A03.put(str2, r2);
            }
            i3 = r2.A01;
        }
        long j2 = ((long) i4) & 4294967295L;
        C148316yf r6 = this.A03;
        C19970wo r5 = this.A01;
        C118045nF r72 = this.A04;
        C139356je r4 = new C139356je(r5, r6, r72, str2, i3, i6, j2 | ((((long) i5) << 32) & -4294967296L), SystemClock.elapsedRealtimeNanos());
        r4.BPC("using_backup_start_time", false);
        r4.BPC("using_capped_backup_start_time", false);
        C148316yf r0 = r4.A04;
        if (r0.A03.isMarkerOn(r4.A01, r4.A00)) {
            r72.A00.put(Long.valueOf(r4.A03), r4);
        }
        return r4;
    }

    public C139066jB(C19970wo r2, AnonymousClass61J r3, C148316yf r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = new C139326jb(r2);
        this.A02 = r3;
    }

    public AnonymousClass7eT BI9() {
        return this.A00;
    }
}
