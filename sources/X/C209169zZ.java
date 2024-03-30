package X;

import com.facebook.android.exoplayer2.util.Util;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.9zZ  reason: invalid class name and case insensitive filesystem */
public class C209169zZ implements B29, B2B {
    public long A00 = -1;
    public long[] A01;
    public long[] A02;
    public long A03 = -1;
    public final /* synthetic */ C1688682i A04;

    public B29 B4u() {
        return this;
    }

    public boolean BN9() {
        return true;
    }

    public C209169zZ(C1688682i r3) {
        this.A04 = r3;
    }

    public long BBK() {
        AnonymousClass9MB r4 = this.A04.A00;
        return (r4.A04 * SearchActionVerificationClientService.MS_TO_NS) / ((long) r4.A03);
    }

    public AnonymousClass9VL BH7(long j) {
        C1688682i r4 = this.A04;
        int A032 = Util.A03(this.A01, C165597tg.A0E((long) r4.A00, j), true);
        long[] jArr = this.A01;
        long j2 = jArr[A032] * SearchActionVerificationClientService.MS_TO_NS;
        long j3 = (long) r4.A00;
        long j4 = j2 / j3;
        long j5 = this.A00;
        long[] jArr2 = this.A02;
        C199759fu r10 = new C199759fu(j4, j5 + jArr2[A032]);
        if (j4 >= j || A032 == jArr.length - 1) {
            return new AnonymousClass9VL(r10, r10);
        }
        int i = A032 + 1;
        return new AnonymousClass9VL(r10, new C199759fu((jArr[i] * SearchActionVerificationClientService.MS_TO_NS) / j3, j5 + jArr2[i]));
    }

    public long Bmo(C201519jm r9) {
        long j = this.A03;
        if (j < 0) {
            return -1;
        }
        long j2 = -(j + 2);
        this.A03 = -1;
        return j2;
    }

    public void Buq(long j) {
        this.A03 = this.A01[Util.A03(this.A01, j, true)];
    }
}
