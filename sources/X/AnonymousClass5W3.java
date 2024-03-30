package X;

/* renamed from: X.5W3  reason: invalid class name */
public abstract class AnonymousClass5W3 {
    public static final void A00(C114265gw r9, C161337ma r10, C161267mT r11, AnonymousClass00S r12, C009003v r13, int i, int i2) {
        C114265gw r4 = r9;
        C161267mT r5 = r11;
        r10.Bun(2002163445);
        int i3 = i2;
        int i4 = i;
        int i5 = i | 6;
        AnonymousClass00S r6 = r12;
        if ((i2 & 1) == 0) {
            if ((i & 14) == 0) {
                i5 = C90484aE.A04(r10.B2h(r12) ? 1 : 0) | i;
            } else {
                i5 = i;
            }
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i & 112) == 0) {
            i5 |= C90464aC.A09(r10, r11);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i5 |= 384;
        } else if ((i & 896) == 0) {
            i5 |= C90474aD.A04(r10, r4);
        }
        C009003v r7 = r13;
        if ((i2 & 8) != 0) {
            i5 |= 3072;
        } else if ((i & 7168) == 0) {
            i5 |= C90494aF.A0A(r10, r13);
        }
        if ((i5 & 5851) != 1170 || !r10.BHg()) {
            if (i6 != 0) {
                r5 = C161267mT.A00;
            }
            if (i7 != 0) {
                r4 = null;
            }
            AnonymousClass5W6.A00(r10, AnonymousClass5WH.A00(r10, new C156627aH(r4, AnonymousClass6G2.A00(r10, r12), r5, r13), -1488997347), 6);
        } else {
            r10.BuE();
        }
        C136976fO B6Z = r10.B6Z();
        if (B6Z != null) {
            B6Z.A06 = new C156127Yt(r4, r5, r6, r7, i4, i3);
        }
    }
}
