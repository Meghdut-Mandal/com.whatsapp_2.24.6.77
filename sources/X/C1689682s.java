package X;

import android.net.Uri;
import java.util.concurrent.ExecutorService;

/* renamed from: X.82s  reason: invalid class name and case insensitive filesystem */
public final class C1689682s extends C209399zw {
    public long A00 = -9223372036854775807L;
    public boolean A01;
    public final Uri A02;
    public final B4V A03;
    public final C22861AxD A04;

    public void A05() {
    }

    public B5S B4q(AnonymousClass9WT r9, C195899Ws r10, long j) {
        return new C209379zu(this.A02, this, new C202249lP(r9, this.A03.A02, 0), this.A04.B4R(), r10, this.A03.B4X());
    }

    public void BPf() {
    }

    public void A06(C202709mU r6, boolean z) {
        long j = this.A00;
        this.A00 = j;
        this.A01 = false;
        A04(new AnonymousClass82O(j, false), (Object) null);
    }

    public void BnT(B5S b5s) {
        C209379zu r5 = (C209379zu) b5s;
        if (r5.A0E) {
            for (C209179za A042 : r5.A0H) {
                A042.A04();
            }
        }
        C198829eG r2 = r5.A0T;
        C166117v3 r1 = r2.A00;
        if (r1 != null) {
            r1.A00(true);
        }
        ExecutorService executorService = r2.A02;
        executorService.execute(new AnonymousClass759(r5, 37));
        executorService.shutdown();
        r5.A0P.removeCallbacksAndMessages((Object) null);
        r5.A08 = null;
        r5.A0F = true;
        r5.A0S.A03();
    }

    @Deprecated
    public C1689682s(Uri uri, B4V b4v, C22861AxD axD) {
        this.A02 = uri;
        this.A04 = axD;
        this.A03 = b4v;
    }

    public void A07(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (this.A00 != j || this.A01 != z) {
            this.A00 = j;
            this.A01 = z;
            A04(new AnonymousClass82O(j, z), (Object) null);
        }
    }
}
