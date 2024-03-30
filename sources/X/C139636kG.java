package X;

import android.os.SystemClock;
import java.io.IOException;

/* renamed from: X.6kG  reason: invalid class name and case insensitive filesystem */
public final class C139636kG implements B5W {
    public long A00;
    public String A01;
    public boolean A02;
    public long A03;
    public long A04;
    public final /* synthetic */ AnonymousClass6WC A05;

    public void BY4(C188528zj r1, long j, long j2, long j3) {
    }

    public void BY5(long j, long j2) {
    }

    public void BZB(C188528zj r1) {
    }

    public void BZC() {
    }

    public void BjU() {
    }

    public void BjX(String str, Object obj) {
    }

    public void BjY(C202189lD r1, C188528zj r2) {
    }

    public void Bqc(long j) {
    }

    public C139636kG(AnonymousClass6WC r2) {
        this.A05 = r2;
        this.A01 = "";
    }

    public static void A00(C139636kG r2, Object obj) {
        A0Z a0z = (A0Z) obj;
        String str = a0z.A0M.A07;
        AnonymousClass00C.A08(str);
        r2.A01 = str;
        r2.A02 = a0z.A0R;
        r2.A00 = a0z.A01;
    }

    public void BSX(C202189lD r15, Object obj, int i, boolean z) {
        if (z) {
            Object obj2 = obj;
            if (obj2 instanceof A0Z) {
                A00(this, obj2);
                long j = this.A03 + ((long) i);
                this.A03 = j;
                long j2 = this.A04;
                if (j2 > 0 && j >= 131072) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j3 = elapsedRealtime - j2;
                    this.A04 = elapsedRealtime;
                    for (C1255660j A002 : this.A05.A0B) {
                        A002.A00(this.A01, "", j3, this.A03, this.A00, this.A02);
                    }
                    this.A03 = 0;
                }
            }
        }
    }

    public void BjV(C202189lD r13, Object obj, boolean z) {
        if (z && (obj instanceof A0Z)) {
            A00(this, obj);
            long j = this.A04;
            if (j > 0 && this.A03 > 0) {
                long A0J = C90514aH.A0J(j);
                for (C1255660j A002 : this.A05.A0B) {
                    A002.A00(this.A01, "", A0J, this.A03, this.A00, this.A02);
                }
            }
        }
    }

    public void BjW(IOException iOException) {
        for (C1255660j A002 : this.A05.A0B) {
            A002.A00(this.A01, String.valueOf(iOException), 0, 0, this.A00, this.A02);
        }
    }

    public void BjZ(C202189lD r3, Object obj, boolean z, boolean z2) {
        if (z && (obj instanceof A0Z)) {
            A00(this, obj);
            this.A04 = SystemClock.elapsedRealtime();
            this.A03 = 0;
        }
    }

    public C139636kG() {
    }
}
