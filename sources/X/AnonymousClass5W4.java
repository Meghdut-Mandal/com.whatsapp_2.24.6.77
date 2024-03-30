package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.5W4  reason: invalid class name */
public abstract class AnonymousClass5W4 {
    public static final void A00(AnonymousClass76V r12, C161337ma r13, Object obj, C009003v r15, int i, int i2) {
        Snapshot A06;
        C137776gi r0;
        r13.Bun(-2079116560);
        r13.Bum(511388516);
        Object obj2 = obj;
        AnonymousClass76V r8 = r12;
        boolean B2f = r13.B2f(obj) | r13.B2f(r12);
        Object BnZ = r13.BnZ();
        if (B2f || BnZ == C129736Ig.A00) {
            BnZ = new C137776gi(r12, obj);
            ((C136916fF) r13).A0R(BnZ);
        }
        C136916fF r5 = (C136916fF) r13;
        C136916fF.A0M(r5, false);
        C137776gi r4 = (C137776gi) BnZ;
        int i3 = i;
        r4.A00.Br4(i3);
        C93564gm r3 = C112425ds.A00;
        C157717dz r7 = (C157717dz) AnonymousClass6G0.A01(r5, r3);
        Snapshot A02 = AnonymousClass6VV.A02();
        try {
            A06 = A02.A06();
            C161547n5 r1 = r4.A02;
            if (r7 != ((C157717dz) r1.getValue())) {
                r1.setValue(r7);
                if (r4.A01.BCn() > 0) {
                    C161547n5 r14 = r4.A03;
                    C157707dy r02 = (C157707dy) r14.getValue();
                    if (r02 != null) {
                        r02.release();
                    }
                    if (r7 != null) {
                        r0 = r7.Blc();
                    } else {
                        r0 = null;
                    }
                    r14.setValue(r0);
                }
            }
            C1269066c.A00(A06);
            A02.A0B();
            r13.Bum(1161125085);
            boolean B2f2 = r13.B2f(r4);
            Object BnZ2 = r13.BnZ();
            if (B2f2 || BnZ2 == C129736Ig.A00) {
                BnZ2 = new C154057Qs(r4);
                r5.A0R(BnZ2);
            }
            C136916fF.A0M(r5, false);
            C132846Vm.A02(r13, r4, (C006302t) BnZ2);
            int i4 = i2;
            C009003v r10 = r15;
            AnonymousClass6Fz.A00(r13, new C120655rr(r3, r4, true), r15, 0 | ((i2 >> 6) & 112));
            C136976fO B6Z = r13.B6Z();
            if (B6Z != null) {
                B6Z.A06 = new C156087Yp(r8, obj2, r10, i3, i4);
            }
        } catch (Throwable th) {
            A02.A0B();
            throw th;
        }
    }
}
