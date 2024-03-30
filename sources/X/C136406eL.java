package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.6eL  reason: invalid class name and case insensitive filesystem */
public final class C136406eL implements C160547lB {
    public final long A00;
    public final long A01;
    public final C161427mt A02;

    public long BBJ(C129076Ev r3, C129076Ev r4, C129076Ev r5) {
        return Long.MAX_VALUE;
    }

    public boolean BM1() {
        return true;
    }

    public C129076Ev BIr(C129076Ev r14, C129076Ev r15, C129076Ev r16, long j) {
        long j2;
        C129076Ev r10 = r16;
        C161427mt r7 = this.A02;
        long j3 = this.A01;
        long j4 = j + j3;
        if (j4 <= 0) {
            j2 = 0;
        } else {
            long j5 = this.A00;
            j2 = j4 - ((j4 / j5) * j5);
        }
        long j6 = this.A00;
        C129076Ev r8 = r14;
        C129076Ev r9 = r15;
        if (j4 > j6) {
            r10 = r7.BIv(r8, r9, r10, j6 - j3);
        }
        return r7.BIr(r14, r15, r10, j2);
    }

    public C129076Ev BIv(C129076Ev r14, C129076Ev r15, C129076Ev r16, long j) {
        long j2;
        C129076Ev r10 = r16;
        C161427mt r7 = this.A02;
        long j3 = this.A01;
        long j4 = j + j3;
        if (j4 <= 0) {
            j2 = 0;
        } else {
            long j5 = this.A00;
            j2 = j4 - ((j4 / j5) * j5);
        }
        long j6 = this.A00;
        C129076Ev r8 = r14;
        C129076Ev r9 = r15;
        if (j4 > j6) {
            r10 = r7.BIv(r8, r9, r10, j6 - j3);
        }
        return r7.BIv(r14, r15, r10, j2);
    }

    public C136406eL(C161427mt r5, long j) {
        this.A02 = r5;
        this.A00 = ((long) (0 + r5.BBG())) * SearchActionVerificationClientService.MS_TO_NS;
        this.A01 = j * SearchActionVerificationClientService.MS_TO_NS;
    }

    public /* synthetic */ C129076Ev BBb(C129076Ev r7, C129076Ev r8, C129076Ev r9) {
        return BIv(r7, r8, r9, Long.MAX_VALUE);
    }
}
