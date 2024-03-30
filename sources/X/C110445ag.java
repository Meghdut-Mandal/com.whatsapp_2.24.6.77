package X;

import com.whatsapp.R;

/* renamed from: X.5ag  reason: invalid class name and case insensitive filesystem */
public abstract class C110445ag {
    public static final void A00(C161337ma r28, C161267mT r29, int i, int i2, boolean z) {
        AnonymousClass72W r13;
        boolean z2 = z;
        C161267mT r2 = r29;
        C161337ma r8 = r28;
        r8.Bun(654557652);
        int i3 = i2;
        int i4 = i2 & 1;
        int i5 = i;
        int i6 = i | 6;
        if (i4 == 0) {
            if ((i & 14) == 0) {
                i6 = C90484aE.A04(r8.B2f(r2) ? 1 : 0) | i;
            } else {
                i6 = i5;
            }
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i & 112) == 0) {
            i6 |= C90494aF.A07(r8.B2g(z2) ? 1 : 0);
        }
        if ((i6 & 91) != 18 || !r8.BHg()) {
            if (i4 != 0) {
                r2 = C161267mT.A00;
            }
            if (i7 != 0) {
                z2 = false;
            }
            String A00 = AnonymousClass5XO.A00(r8, R.string.f12nameremoved);
            C161267mT A002 = C129226Fx.A00(r2, (float) 14, (float) 8);
            long A003 = AnonymousClass5XM.A00(r8, R.color.f6nameremoved);
            long A02 = AnonymousClass6U3.A02(14);
            if (z2) {
                r13 = AnonymousClass72W.A02;
            } else {
                r13 = null;
            }
            AnonymousClass6UK.A01(r8, A002, (AnonymousClass6V8) null, (C129796Im) null, (AnonymousClass68R) null, r13, (C131266Oj) null, (C131366Ot) null, A00, (C006302t) null, 0, 1, 0, 3072, 3072, 122832, A003, A02, 0, 0, false);
        } else {
            r8.BuE();
        }
        C136976fO B6Z = r8.B6Z();
        if (B6Z != null) {
            B6Z.A06 = new C156027Yj(r2, i5, i3, z2);
        }
    }
}
