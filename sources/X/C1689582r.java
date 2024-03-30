package X;

import android.net.Uri;
import com.facebook.android.exoplayer2.Timeline;

/* renamed from: X.82r  reason: invalid class name and case insensitive filesystem */
public final class C1689582r extends C209399zw {
    public final long A00;
    public final C207099uY A01;
    public final Timeline A02;
    public final C22861AxD A03;
    public final C202189lD A04;

    public void A05() {
    }

    public void BPf() {
    }

    public void A06(C202709mU r3, boolean z) {
        A04(this.A02, (Object) null);
    }

    public B5S B4q(AnonymousClass9WT r9, C195899Ws r10, long j) {
        C202189lD r5 = this.A04;
        C22861AxD axD = this.A03;
        return new C209369zt(this.A01, new C202249lP(r9, this.A03.A02, 0), axD, r5, this.A00);
    }

    public void BnT(B5S b5s) {
        C209369zt r4 = (C209369zt) b5s;
        C198829eG r2 = r4.A08;
        C166117v3 r1 = r2.A00;
        if (r1 != null) {
            r1.A00(true);
        }
        r2.A02.shutdown();
        r4.A07.A03();
    }

    public C1689582r(Uri uri, C207099uY r4, C22861AxD axD, long j) {
        this.A03 = axD;
        this.A01 = r4;
        this.A00 = j;
        this.A04 = new C202189lD(uri);
        this.A02 = new AnonymousClass82O(j, true);
    }
}
