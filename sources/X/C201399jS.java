package X;

import com.facebook.android.exoplayer2.Timeline;

/* renamed from: X.9jS  reason: invalid class name and case insensitive filesystem */
public final class C201399jS {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Timeline A03;
    public final AnonymousClass9WT A04;
    public final C206419tN A05;
    public final AnonymousClass9MF A06;
    public final Integer A07;
    public final Object A08;
    public final boolean A09;
    public final boolean A0A;
    public volatile long A0B;
    public volatile long A0C;
    public volatile long A0D;

    public C201399jS(Timeline timeline, C206419tN r16, AnonymousClass9MF r17, long j) {
        this(timeline, new AnonymousClass9WT(0, -1, -1, -1), r16, r17, C023109s.A00, (Object) null, 1, j, -9223372036854775807L, false, false);
    }

    public static void A00(C201399jS r2, C201399jS r3) {
        r3.A0D = r2.A0D;
        r3.A0C = r2.A0C;
        r3.A0B = r2.A0B;
    }

    public C201399jS A01(AnonymousClass9WT r16, long j, long j2) {
        long j3 = j2;
        Timeline timeline = this.A03;
        Object obj = this.A08;
        AnonymousClass9WT r3 = r16;
        if (r3.A00 == -1) {
            j3 = -9223372036854775807L;
        }
        return new C201399jS(timeline, r3, this.A05, this.A06, this.A07, obj, this.A00, j, j3, this.A0A, this.A09);
    }

    public C201399jS A02(C206419tN r15, AnonymousClass9MF r16) {
        Timeline timeline = this.A03;
        Object obj = this.A08;
        AnonymousClass9WT r2 = this.A04;
        long j = this.A02;
        long j2 = this.A01;
        C206419tN r3 = r15;
        AnonymousClass9MF r4 = r16;
        C201399jS r0 = new C201399jS(timeline, r2, r3, r4, this.A07, obj, this.A00, j, j2, this.A0A, this.A09);
        A00(this, r0);
        return r0;
    }

    public C201399jS(Timeline timeline, AnonymousClass9WT r2, C206419tN r3, AnonymousClass9MF r4, Integer num, Object obj, int i, long j, long j2, boolean z, boolean z2) {
        this.A03 = timeline;
        this.A08 = obj;
        this.A04 = r2;
        this.A02 = j;
        this.A01 = j2;
        this.A0D = j;
        this.A0C = j;
        this.A00 = i;
        this.A0A = z;
        this.A05 = r3;
        this.A06 = r4;
        this.A07 = num;
        this.A09 = z2;
    }
}
