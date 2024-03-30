package X;

/* renamed from: X.5Wp  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C109185Wp {
    public static Object A00(C161807nV r8, C114375h9 r9) {
        C137856gq r1 = ((C137856gq) r8).A03;
        if (r1.A08) {
            C137856gq r5 = r1.A04;
            C137846gp A02 = AnonymousClass6VZ.A02(r8);
            if (A02 != null) {
                while (true) {
                    if ((A02.A0R.A02.A00 & 32) != 0) {
                        while (r5 != null) {
                            if ((r5.A01 & 32) != 0) {
                                C137856gq r7 = r5;
                                C1506776e r6 = null;
                                do {
                                    if (r7 instanceof C161807nV) {
                                        AnonymousClass65T BGK = ((C161807nV) r7).BGK();
                                        if (BGK.A01(r9)) {
                                            return BGK.A00(r9);
                                        }
                                    } else if ((r7.A01 & 32) != 0 && (r7 instanceof C94114hf)) {
                                        int i = 0;
                                        for (C137856gq r2 = ((C94114hf) r7).A00; r2 != null; r2 = r2.A02) {
                                            if ((r2.A01 & 32) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    r7 = r2;
                                                } else {
                                                    r6 = C90464aC.A0F(r6);
                                                    r7 = C90524aI.A0D(r6, r7);
                                                    r6.A0D(r2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                            continue;
                                        }
                                    }
                                    r7 = AnonymousClass6VZ.A00(r6);
                                    continue;
                                } while (r7 != null);
                            }
                            r5 = r5.A04;
                        }
                    }
                    A02 = A02.A0A();
                    if (A02 == null) {
                        break;
                    }
                    AnonymousClass6XQ r0 = A02.A0R;
                    if (r0 != null) {
                        r5 = r0.A05;
                    } else {
                        r5 = null;
                    }
                }
            }
            return r9.A00.invoke();
        }
        throw AnonymousClass001.A08("ModifierLocal accessed from an unattached node");
    }
}
