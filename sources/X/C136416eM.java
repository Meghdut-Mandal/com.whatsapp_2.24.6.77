package X;

import java.util.Iterator;

/* renamed from: X.6eM  reason: invalid class name and case insensitive filesystem */
public final class C136416eM implements C160547lB {
    public C129076Ev A00;
    public C129076Ev A01;
    public C129076Ev A02;
    public final AnonymousClass7dX A03;

    public C129076Ev BBb(C129076Ev r9, C129076Ev r10, C129076Ev r11) {
        C129076Ev r0 = this.A00;
        if (r0 == null) {
            r0 = C129076Ev.A00(r11);
            this.A00 = r0;
        }
        int A022 = r0.A02();
        for (int i = 0; i < A022; i++) {
            C129076Ev r4 = this.A00;
            if (r4 == null) {
                throw C36331k8.A0d("endVelocityVector");
            }
            r4.A05(i, this.A03.B7v(i).BBa(r9.A01(i), r10.A01(i), r11.A01(i)));
        }
        C129076Ev r02 = this.A00;
        if (r02 != null) {
            return r02;
        }
        throw C36331k8.A0d("endVelocityVector");
    }

    public C129076Ev BIr(C129076Ev r12, C129076Ev r13, C129076Ev r14, long j) {
        C129076Ev r0 = this.A01;
        if (r0 == null) {
            r0 = C129076Ev.A00(r12);
            this.A01 = r0;
        }
        int A022 = r0.A02();
        for (int i = 0; i < A022; i++) {
            C129076Ev r1 = this.A01;
            if (r1 == null) {
                throw C36331k8.A0d("valueVector");
            }
            r1.A05(i, this.A03.B7v(i).BIq(r12.A01(i), r13.A01(i), r14.A01(i), j));
        }
        C129076Ev r02 = this.A01;
        if (r02 != null) {
            return r02;
        }
        throw C36331k8.A0d("valueVector");
    }

    public C129076Ev BIv(C129076Ev r12, C129076Ev r13, C129076Ev r14, long j) {
        C129076Ev r0 = this.A02;
        if (r0 == null) {
            r0 = C129076Ev.A00(r14);
            this.A02 = r0;
        }
        int A022 = r0.A02();
        for (int i = 0; i < A022; i++) {
            C129076Ev r1 = this.A02;
            if (r1 == null) {
                throw C36331k8.A0d("velocityVector");
            }
            r1.A05(i, this.A03.B7v(i).BIu(r12.A01(i), r13.A01(i), r14.A01(i), j));
        }
        C129076Ev r02 = this.A02;
        if (r02 != null) {
            return r02;
        }
        throw C36331k8.A0d("velocityVector");
    }

    public C136416eM(AnonymousClass7dX r1) {
        this.A03 = r1;
    }

    public long BBJ(C129076Ev r9, C129076Ev r10, C129076Ev r11) {
        Iterator it = C15040mb.A05(0, r9.A02()).iterator();
        long j = 0;
        while (it.hasNext()) {
            int A002 = ((C12260hl) it).A00();
            j = Math.max(j, this.A03.B7v(A002).BBI(r9.A01(A002), r10.A01(A002), r11.A01(A002)));
        }
        return j;
    }

    public /* synthetic */ boolean BM1() {
        return false;
    }
}
