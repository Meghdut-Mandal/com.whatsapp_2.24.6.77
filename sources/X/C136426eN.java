package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.6eN  reason: invalid class name and case insensitive filesystem */
public final class C136426eN implements AnonymousClass7dZ {
    public C129076Ev A00;
    public C129076Ev A01;
    public C129076Ev A02;
    public final C156847b3 A03;

    public C129076Ev BIw(C129076Ev r19, C129076Ev r20, long j) {
        float f;
        C129076Ev r8 = this.A02;
        if (r8 == null) {
            r8 = C129076Ev.A00(r19);
            this.A02 = r8;
        }
        int A022 = r8.A02();
        for (int i = 0; i < A022; i++) {
            C156847b3 r2 = this.A03;
            float A012 = r20.A01(i);
            long j2 = j / SearchActionVerificationClientService.MS_TO_NS;
            AnonymousClass6K6 r0 = ((AnonymousClass6eI) r2).A00;
            double A002 = AnonymousClass6K6.A00(r0, A012);
            double d = (double) C112115dN.A00;
            double d2 = d - 1.0d;
            float exp = (float) (((double) (r0.A00 * r0.A01)) * Math.exp((d / d2) * A002));
            long exp2 = (long) (Math.exp(A002 / d2) * 1000.0d);
            if (exp2 > 0) {
                f = ((float) j2) / ((float) exp2);
            } else {
                f = 1.0f;
            }
            r8.A05(i, (((AnonymousClass6HX.A00(f).A01 * Math.signum(A012)) * exp) / ((float) exp2)) * 1000.0f);
        }
        return r8;
    }

    public C136426eN(C156847b3 r1) {
        this.A03 = r1;
    }
}
