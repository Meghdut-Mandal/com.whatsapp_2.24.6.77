package X;

/* renamed from: X.6MS  reason: invalid class name */
public final class AnonymousClass6MS {
    public C137846gp[] A00;
    public final C1506776e A01 = C1506776e.A02(new C137846gp[16]);

    private final void A00(C137846gp r9) {
        C129056Et r2 = r9.A0P;
        if (r2.A05 == C023109s.A0R && !r2.A09 && !r2.A0E && !r9.A0H && r2.A0G.A0C) {
            C137856gq r6 = r9.A0R.A02;
            if ((r6.A00 & 256) != 0) {
                do {
                    if ((r6.A01 & 256) != 0) {
                        C1506776e r5 = null;
                        C137856gq r4 = r6;
                        do {
                            if (r4 instanceof C161767nR) {
                                C161767nR r42 = (C161767nR) r4;
                                r42.BYg(C137856gq.A06((C137856gq) r42));
                            } else if ((r4.A01 & 256) != 0 && (r4 instanceof C94114hf)) {
                                int i = 0;
                                for (C137856gq r22 = ((C94114hf) r4).A00; r22 != null; r22 = r22.A02) {
                                    if ((r22.A01 & 256) != 0) {
                                        i++;
                                        if (i == 1) {
                                            r4 = r22;
                                        } else {
                                            r5 = C90464aC.A0F(r5);
                                            r4 = C90524aI.A0D(r5, r4);
                                            r5.A0D(r22);
                                        }
                                    }
                                }
                                if (i == 1) {
                                    continue;
                                }
                            }
                            r4 = AnonymousClass6VZ.A00(r5);
                            continue;
                        } while (r4 != null);
                    }
                    if ((r6.A00 & 256) == 0) {
                        break;
                    }
                    r6 = r6.A02;
                } while (r6 == null);
            }
        }
        int i2 = 0;
        r9.A0I = false;
        C1506776e A09 = r9.A09();
        int i3 = A09.A00;
        if (i3 > 0) {
            Object[] objArr = A09.A01;
            do {
                A00((C137846gp) objArr[i2]);
                i2++;
            } while (i2 < i3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 < r3) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r5 = this;
            X.76e r4 = r5.A01
            X.75d r0 = X.C1504075d.A00
            r4.A0B(r0)
            int r3 = r4.A00
            X.6gp[] r2 = r5.A00
            if (r2 == 0) goto L_0x0010
            int r0 = r2.length
            if (r0 >= r3) goto L_0x0018
        L_0x0010:
            r0 = 16
            int r0 = java.lang.Math.max(r0, r3)
            X.6gp[] r2 = new X.C137846gp[r0]
        L_0x0018:
            r0 = 0
            r5.A00 = r0
            r1 = 0
        L_0x001c:
            if (r1 >= r3) goto L_0x0027
            java.lang.Object[] r0 = r4.A01
            r0 = r0[r1]
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x001c
        L_0x0027:
            r4.A06()
        L_0x002a:
            int r3 = r3 + -1
            r0 = -1
            if (r0 >= r3) goto L_0x003c
            r1 = r2[r3]
            X.AnonymousClass00C.A0B(r1)
            boolean r0 = r1.A0I
            if (r0 == 0) goto L_0x002a
            r5.A00(r1)
            goto L_0x002a
        L_0x003c:
            r5.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MS.A01():void");
    }
}
