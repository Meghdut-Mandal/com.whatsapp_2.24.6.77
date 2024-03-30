package X;

import android.os.SystemClock;

/* renamed from: X.18b  reason: invalid class name and case insensitive filesystem */
public final class C233318b {
    public int A00;
    public long A01 = -1;
    public Runnable A02;
    public boolean A03;
    public boolean A04;
    public int A05;
    public long A06;
    public final C233518d A07;
    public final C19930wk A08;
    public final C19770wU A09;
    public final C19970wo A0A;
    public final C21010yW A0B;
    public final C233818g A0C;
    public volatile long A0D;

    public C233318b(C19970wo r3, C21010yW r4, C233818g r5, C233518d r6, C19770wU r7) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r7, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r5, 4);
        AnonymousClass00C.A0D(r6, 5);
        this.A0A = r3;
        this.A09 = r7;
        this.A0B = r4;
        this.A0C = r5;
        this.A07 = r6;
        this.A08 = new C19930wk(r7, false);
    }

    public static final synchronized void A00(C233318b r5, int i) {
        synchronized (r5) {
            int i2 = r5.A00;
            if (i2 <= i) {
                while (true) {
                    r5.A0D = (1 << i2) | r5.A0D;
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
        }
    }

    public static final void A01(C233318b r6, long j) {
        r6.A04 = true;
        r6.A02 = r6.A09.BpM(new C35731jA((Object) r6, 48), "BitArrayLogger/recordInteraction", 64000);
        r6.A01 = j;
        r6.A0D = 0;
        C233818g r1 = r6.A0C;
        r6.A05 = r1.A00();
        r6.A06 = C19970wo.A00(r6.A0A) - C233518d.A00(r1.A00).getLong("session_start_timestamp", -1);
    }

    public final synchronized void A02(long j) {
        synchronized (this) {
            if (this.A03) {
                A00(this, (int) j);
            } else {
                this.A04 = false;
            }
            C45502Rp r2 = new C45502Rp();
            r2.A02 = Long.valueOf((long) ((int) this.A0D));
            r2.A00 = Long.valueOf(this.A0D >> 32);
            r2.A06 = Long.valueOf((long) this.A05);
            r2.A04 = Long.valueOf(this.A06);
            long j2 = 0;
            for (long j3 = this.A0D; j3 != 0; j3 >>>= 1) {
                j2 += 1 & j3;
            }
            C233518d r6 = this.A07;
            int i = C233518d.A00(r6).getInt("cumulative_bits", 0);
            C233518d.A00(r6).edit().putInt("cumulative_bits", i + ((int) j2)).apply();
            r2.A03 = Long.valueOf((long) C233518d.A00(r6).getInt("cumulative_bits", 0));
            C233518d.A00(r6).edit().putInt("bit_array_session_sequence", C233518d.A00(r6).getInt("bit_array_session_sequence", 0) + 1).apply();
            r2.A05 = Long.valueOf((long) C233518d.A00(r6).getInt("bit_array_session_sequence", 0));
            r2.A01 = Long.valueOf(j);
            this.A0B.Blv(r2);
            if (this.A03) {
                A01(this, SystemClock.elapsedRealtime() / 1000);
                this.A00 = 0;
            }
        }
    }
}
