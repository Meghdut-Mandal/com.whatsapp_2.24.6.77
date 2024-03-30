package X;

/* renamed from: X.6Hp  reason: invalid class name and case insensitive filesystem */
public abstract class C129576Hp {
    public static final C125195zT A00 = new C125195zT();

    public static final void A00(C161337ma r12, C161267mT r13, AnonymousClass6SD r14, C009003v r15, int i, int i2) {
        C137046fV r3;
        C161337ma r1 = r12;
        r12.Bun(-511989831);
        if ((i2 & 2) != 0) {
            r13 = C161267mT.A00;
        }
        C136916fF r8 = (C136916fF) r1;
        int i3 = r8.A02;
        r12.Bum(-1165786124);
        C136916fF.A0K(r8, AnonymousClass6XJ.A04, (Object) null, 206, 0);
        AnonymousClass6G1 r9 = null;
        if (r8.A0L) {
            AnonymousClass6YK r6 = r8.A0E;
            int i4 = r6.A08;
            int A01 = AnonymousClass6YK.A01(r6, i4);
            int[] iArr = r6.A0G;
            int i5 = (A01 * 5) + 1;
            int i6 = iArr[i5];
            if ((134217728 & i6) == 0) {
                int i7 = i6 | 134217728;
                iArr[i5] = i7;
                if ((i7 & 67108864) == 0) {
                    AnonymousClass6YK.A0A(r6, AnonymousClass6YK.A04(r6, iArr, i4));
                }
            }
        }
        Object A0Q = r8.A0Q();
        if (!(A0Q instanceof C137046fV) || (r3 = (C137046fV) A0Q) == null) {
            int i8 = r8.A02;
            boolean z = r8.A0K;
            boolean z2 = r8.A0Q;
            C136986fP r0 = (C136986fP) r8.A0W;
            if (r0 != null) {
                r9 = r0.A07;
            }
            r3 = new C137046fV(new C93534gi(r8, r9, i8, z, z2));
            r8.A0R(r3);
        }
        C93534gi r62 = r3.A00;
        r62.A02.setValue(C136916fF.A04(r8));
        C136916fF.A0G(r8);
        C161267mT A002 = AnonymousClass5WK.A00(r1, r13);
        C161557n6 A04 = C136916fF.A04(r8);
        AnonymousClass00S r5 = C137846gp.A0W;
        r1.Bum(1405779621);
        r1.Bup();
        if (r8.A0L) {
            r1.B4n(new AnonymousClass7J2(r5));
        } else {
            r1.BxD();
        }
        AnonymousClass5WF.A01(r1, r14, r14.A04);
        AnonymousClass5WF.A01(r1, r62, r14.A02);
        AnonymousClass5WF.A01(r1, r15, r14.A03);
        AnonymousClass5WF.A01(r1, A04, AnonymousClass6JB.A06);
        AnonymousClass5WF.A01(r1, A002, AnonymousClass6JB.A05);
        C009003v r32 = AnonymousClass6JB.A01;
        if (r8.A0L || !C90464aC.A1W(r1, i3)) {
            C90464aC.A0v(r1, r32, i3);
        }
        C136916fF.A0M(r8, true);
        C136916fF.A0M(r8, false);
        if (!r1.BHg()) {
            r1.Bn4(new AnonymousClass7J3(r14));
        }
        C136976fO B6Z = r1.B6Z();
        if (B6Z != null) {
            B6Z.A06 = new C156097Yq(r13, r14, r15, i, i2);
        }
    }
}
