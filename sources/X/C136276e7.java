package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.6e7  reason: invalid class name and case insensitive filesystem */
public final class C136276e7 implements C160687lQ {
    public final long A00;
    public final C129076Ev A01;
    public final C129076Ev A02;
    public final C129076Ev A03;
    public final C156857b4 A04;
    public final AnonymousClass7dZ A05;
    public final Object A06;
    public final Object A07;

    public C136276e7(C129076Ev r21, C156837b2 r22, C156857b4 r23, Object obj) {
        C136426eN r10 = new C136426eN(((C136316eB) r22).A00);
        this.A05 = r10;
        C156857b4 r1 = r23;
        this.A04 = r1;
        Object obj2 = obj;
        this.A06 = obj2;
        C129076Ev A002 = C136386eJ.A00(r1, obj2);
        this.A02 = A002;
        C129076Ev r11 = r21;
        this.A03 = C108975Vs.A00(r11);
        C006302t r13 = ((C136386eJ) this.A04).A00;
        C129076Ev r12 = r10.A00;
        if (r12 == null) {
            r12 = C129076Ev.A00(A002);
            r10.A00 = r12;
        }
        int A022 = r12.A02();
        for (int i = 0; i < A022; i++) {
            C156847b3 r0 = r10.A03;
            float A012 = A002.A01(i);
            float A013 = r11.A01(i);
            AnonymousClass6K6 r2 = ((AnonymousClass6eI) r0).A00;
            double A003 = AnonymousClass6K6.A00(r2, A013);
            double d = (double) C112115dN.A00;
            r12.A05(i, A012 + (((float) (((double) (r2.A00 * r2.A01)) * Math.exp((d / (d - 1.0d)) * A003))) * Math.signum(A013)));
        }
        this.A07 = r13.invoke(r12);
        C129076Ev r02 = r10.A02;
        if (r02 == null) {
            r02 = C129076Ev.A00(A002);
            r10.A02 = r02;
        }
        int A023 = r02.A02();
        long j = 0;
        for (int i2 = 0; i2 < A023; i2++) {
            C156847b3 r03 = r10.A03;
            j = Math.max(j, ((long) (Math.exp(AnonymousClass6K6.A00(((AnonymousClass6eI) r03).A00, r11.A01(i2)) / (((double) C112115dN.A00) - 1.0d)) * 1000.0d)) * SearchActionVerificationClientService.MS_TO_NS);
        }
        this.A00 = j;
        C129076Ev A004 = C108975Vs.A00(r10.BIw(A002, r11, j));
        this.A01 = A004;
        int A024 = A004.A02();
        for (int i3 = 0; i3 < A024; i3++) {
            C129076Ev r3 = this.A01;
            r3.A05(i3, C15040mb.A01(r3.A01(i3), -0.0f, 0.0f));
        }
    }

    public Object BIp(long j) {
        float f;
        if (j >= this.A00) {
            return this.A07;
        }
        C006302t r15 = ((C136386eJ) this.A04).A00;
        AnonymousClass7dZ r9 = this.A05;
        C129076Ev r14 = this.A02;
        C129076Ev r13 = this.A03;
        C136426eN r92 = (C136426eN) r9;
        C129076Ev r8 = r92.A01;
        if (r8 == null) {
            r8 = C129076Ev.A00(r14);
            r92.A01 = r8;
        }
        int A022 = r8.A02();
        for (int i = 0; i < A022; i++) {
            C156847b3 r2 = r92.A03;
            float A012 = r14.A01(i);
            float A013 = r13.A01(i);
            long j2 = j / SearchActionVerificationClientService.MS_TO_NS;
            AnonymousClass6K6 r0 = ((AnonymousClass6eI) r2).A00;
            double A002 = AnonymousClass6K6.A00(r0, A013);
            double d = (double) C112115dN.A00;
            double d2 = d - 1.0d;
            float exp = (float) (((double) (r0.A00 * r0.A01)) * Math.exp((d / d2) * A002));
            long exp2 = (long) (Math.exp(A002 / d2) * 1000.0d);
            if (exp2 > 0) {
                f = ((float) j2) / ((float) exp2);
            } else {
                f = 1.0f;
            }
            r8.A05(i, A012 + (exp * Math.signum(A013) * AnonymousClass6HX.A00(f).A00));
        }
        return r15.invoke(r8);
    }

    public C129076Ev BIx(long j) {
        if (j >= this.A00) {
            return this.A01;
        }
        return this.A05.BIw(this.A02, this.A03, j);
    }

    public long BBH() {
        return this.A00;
    }

    public Object BID() {
        return this.A07;
    }

    public C156857b4 BIe() {
        return this.A04;
    }

    public boolean BM1() {
        return false;
    }
}
