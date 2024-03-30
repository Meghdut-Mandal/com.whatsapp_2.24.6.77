package X;

import android.os.SystemClock;

/* renamed from: X.3pV  reason: invalid class name and case insensitive filesystem */
public final class C76823pV implements C236119d {
    public final int A00;
    public final int A01;
    public final long A02 = SystemClock.elapsedRealtime();
    public final long A03;
    public final C19970wo A04;
    public final C236119d A05;
    public final C203399nx A06;
    public final /* synthetic */ AnonymousClass19A A07;

    public void BVN(String str) {
        String str2 = str;
        AnonymousClass00C.A0D(str, 0);
        long j = this.A03;
        long j2 = this.A02;
        C19970wo r6 = this.A04;
        long elapsedRealtime = j - (SystemClock.elapsedRealtime() - j2);
        int i = this.A00;
        if (i >= 3 || elapsedRealtime <= 1000) {
            this.A07.A08.markerAnnotate(154475307, str.hashCode(), "retry", i);
            this.A05.BVN(str);
            return;
        }
        C203399nx r8 = this.A06;
        this.A07.A0D(r6, this.A05, r8, str2, this.A01, i + 1, elapsedRealtime);
    }

    public C76823pV(C19970wo r3, AnonymousClass19A r4, C236119d r5, C203399nx r6, int i, int i2, long j) {
        this.A07 = r4;
        this.A04 = r3;
        this.A01 = i;
        this.A06 = r6;
        this.A05 = r5;
        this.A00 = i2;
        this.A03 = j;
    }

    public void BWw(C203399nx r6, String str) {
        C36321k7.A0w(str, r6);
        this.A07.A08.markerAnnotate(154475307, str.hashCode(), "retry", this.A00);
        this.A05.BWw(r6, str);
    }

    public void BiM(C203399nx r6, String str) {
        C36321k7.A0w(str, r6);
        this.A07.A08.markerAnnotate(154475307, str.hashCode(), "retry", this.A00);
        this.A05.BiM(r6, str);
    }
}
