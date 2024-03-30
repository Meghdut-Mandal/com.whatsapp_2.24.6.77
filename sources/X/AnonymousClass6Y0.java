package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.6Y0  reason: invalid class name */
public final class AnonymousClass6Y0 {
    public Constraints A00;
    public boolean A01;
    public final AnonymousClass69F A02 = new AnonymousClass69F();
    public final C137846gp A03;
    public final AnonymousClass6MS A04 = new AnonymousClass6MS();
    public final C1506776e A05 = C1506776e.A02(new AnonymousClass7bZ[16]);
    public final C1506776e A06 = C1506776e.A02(new C120695rv[16]);

    private final void A02(C137846gp r3, boolean z) {
        boolean z2;
        C129056Et r0 = r3.A0P;
        if (z) {
            z2 = r0.A0D;
        } else {
            z2 = r0.A0E;
        }
        if (z2) {
            AnonymousClass69F r1 = this.A02;
            boolean contains = r1.A00.A00.contains(r3);
            if (!z) {
                if (!contains) {
                    contains = r1.A01.A00.contains(r3);
                }
                A08(r3, z, false);
            }
            if (!contains) {
                return;
            }
            A08(r3, z, false);
        }
    }

    public static final void A03(AnonymousClass6Y0 r13) {
        C1506776e r12 = r13.A05;
        int i = r12.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = r12.A01;
            do {
                C94944jW r8 = ((C137846gp) ((AnonymousClass7bZ) objArr[i2])).A0R.A06;
                C94104he r7 = r8.A01;
                C137856gq A032 = C94894iy.A03(r8, true);
                while (A032 != null && (A032.A00 & 128) != 0) {
                    if ((A032.A01 & 128) != 0) {
                        C1506776e r5 = null;
                        C137856gq r4 = A032;
                        do {
                            if (r4 instanceof C161827nX) {
                                ((C161827nX) r4).Bcj(r8);
                            } else if ((r4.A01 & 128) != 0 && (r4 instanceof C94114hf)) {
                                int i3 = 0;
                                for (C137856gq r2 = ((C94114hf) r4).A00; r2 != null; r2 = r2.A02) {
                                    if ((r2.A01 & 128) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            r4 = r2;
                                        } else {
                                            r5 = C90464aC.A0F(r5);
                                            r4 = C90524aI.A0D(r5, r4);
                                            r5.A0D(r2);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                    continue;
                                }
                            }
                            r4 = AnonymousClass6VZ.A00(r5);
                            continue;
                        } while (r4 != null);
                    }
                    if (A032 == r7) {
                        break;
                    }
                    A032 = A032.A02;
                }
                i2++;
            } while (i2 < i);
        }
        r12.A06();
    }

    private final boolean A04(C137846gp r4) {
        Integer num;
        AnonymousClass6Q5 r0;
        C129056Et r1 = r4.A0P;
        if (!r1.A0D) {
            return false;
        }
        C94724ig r2 = r1.A04;
        if (r2 != null) {
            num = r2.A04;
        } else {
            num = C023109s.A0C;
        }
        if (num == C023109s.A00) {
            return true;
        }
        if (r2 == null || (r0 = r2.A0G) == null) {
            return false;
        }
        r0.A03();
        if (r0.A00 != null) {
            return true;
        }
        return false;
    }

    public static final boolean A05(C137846gp r2) {
        C94734ih r22 = r2.A0P.A0G;
        if (r22.A07 != C023109s.A00) {
            AnonymousClass6Q5 r0 = r22.A0K;
            r0.A03();
            if (r0.A00 != null) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A06(X.C137846gp r6, X.AnonymousClass6Y0 r7, androidx.compose.ui.unit.Constraints r8) {
        /*
            X.6gp r0 = r6.A07
            r5 = 0
            if (r0 != 0) goto L_0x0006
            return r5
        L_0x0006:
            X.6Et r4 = r6.A0P
            X.4ig r2 = r4.A04
            if (r8 == 0) goto L_0x003e
            X.AnonymousClass00C.A0B(r2)
            long r0 = r8.A00
        L_0x0011:
            boolean r3 = r2.A0H(r0)
        L_0x0015:
            X.6gp r2 = r6.A0A()
            if (r3 == 0) goto L_0x0024
            if (r2 == 0) goto L_0x0024
            X.6gp r0 = r2.A07
            if (r0 != 0) goto L_0x0025
            r7.A0D(r2, r5)
        L_0x0024:
            return r3
        L_0x0025:
            X.4ig r0 = r4.A04
            if (r0 == 0) goto L_0x0033
            java.lang.Integer r1 = r0.A04
        L_0x002b:
            java.lang.Integer r0 = X.C023109s.A00
            if (r1 != r0) goto L_0x0036
            r7.A0B(r2, r5)
            return r3
        L_0x0033:
            java.lang.Integer r1 = X.C023109s.A0C
            goto L_0x002b
        L_0x0036:
            java.lang.Integer r0 = X.C023109s.A01
            if (r1 != r0) goto L_0x0024
            r7.A0A(r2, r5)
            return r3
        L_0x003e:
            if (r2 == 0) goto L_0x0047
            androidx.compose.ui.unit.Constraints r0 = r2.A03
            if (r0 == 0) goto L_0x0047
            long r0 = r0.A00
            goto L_0x0011
        L_0x0047:
            r3 = 0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Y0.A06(X.6gp, X.6Y0, androidx.compose.ui.unit.Constraints):boolean");
    }

    public static final boolean A07(C137846gp r4, AnonymousClass6Y0 r5, Constraints constraints) {
        Constraints constraints2;
        boolean A0Y;
        if (constraints != null) {
            A0Y = r4.A0Y(constraints);
        } else {
            C94734ih r1 = r4.A0P.A0G;
            if (r1.A0F) {
                constraints2 = new Constraints(r1.A04);
            } else {
                constraints2 = null;
            }
            A0Y = r4.A0Y(constraints2);
        }
        C137846gp A0A = r4.A0A();
        if (A0Y && A0A != null) {
            Integer num = r4.A0P.A0G.A07;
            if (num == C023109s.A00) {
                r5.A0D(A0A, false);
            } else if (num == C023109s.A01) {
                r5.A0C(A0A, false);
                return A0Y;
            }
        }
        return A0Y;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00f7, code lost:
        if (r0.A00 != null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A08(X.C137846gp r10, boolean r11, boolean r12) {
        /*
            r9 = this;
            boolean r0 = r10.A0H
            r3 = 0
            if (r0 != 0) goto L_0x00fb
            X.6Et r4 = r10.A0P
            X.4ih r2 = r4.A0G
            boolean r0 = r2.A0C
            r1 = 1
            if (r0 != 0) goto L_0x001c
            boolean r0 = r2.A0D
            if (r0 != 0) goto L_0x001c
            boolean r0 = r4.A0E
            if (r0 == 0) goto L_0x00d1
            boolean r0 = A05(r10)
            if (r0 == 0) goto L_0x00d1
        L_0x001c:
            boolean r0 = r4.A0D
            if (r0 != 0) goto L_0x00b4
            boolean r0 = r4.A0E
            if (r0 != 0) goto L_0x00b4
            r8 = 0
            r0 = 0
        L_0x0026:
            if (r12 == 0) goto L_0x0085
            if (r0 != 0) goto L_0x002e
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x003d
        L_0x002e:
            java.lang.Boolean r0 = r10.A0C()
            boolean r0 = X.C36371kC.A1X(r0, r1)
            if (r0 == 0) goto L_0x003d
            if (r11 == 0) goto L_0x003d
            r10.A0K()
        L_0x003d:
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x0085
            X.6gp r4 = r9.A03
            if (r10 == r4) goto L_0x0057
            X.6gp r0 = r10.A0A()
            if (r0 == 0) goto L_0x0085
            X.6Et r0 = r0.A0P
            X.4ih r0 = r0.A0G
            boolean r0 = r0.A0C
            if (r0 != r1) goto L_0x0085
            boolean r0 = r2.A0D
            if (r0 == 0) goto L_0x0085
        L_0x0057:
            if (r10 != r4) goto L_0x00b0
            java.lang.Integer r4 = r10.A0D
            java.lang.Integer r0 = X.C023109s.A0C
            if (r4 != r0) goto L_0x0062
            X.C137846gp.A06(r10)
        L_0x0062:
            X.6gp r0 = r10.A0A()
            if (r0 == 0) goto L_0x0070
            X.6XQ r0 = r0.A0R
            X.4jW r0 = r0.A06
            X.6WO r4 = r0.A02
            if (r4 != 0) goto L_0x0079
        L_0x0070:
            X.7mZ r0 = X.C129586Hq.A00(r10)
            X.4if r4 = new X.4if
            r4.<init>(r0)
        L_0x0079:
            r4.A04(r2, r3, r3)
        L_0x007c:
            X.6MS r0 = r9.A04
            X.76e r0 = r0.A01
            r0.A0D(r10)
            r10.A0I = r1
        L_0x0085:
            X.76e r7 = r9.A06
            int r6 = r7.A00
            if (r6 == 0) goto L_0x00ab
            if (r6 <= 0) goto L_0x00a8
            java.lang.Object[] r5 = r7.A01
        L_0x008f:
            r4 = r5[r3]
            X.5rv r4 = (X.C120695rv) r4
            X.6gp r0 = r4.A00
            X.7mZ r0 = r0.A09
            if (r0 == 0) goto L_0x00a4
            boolean r2 = r4.A02
            X.6gp r1 = r4.A00
            boolean r0 = r4.A01
            if (r2 != 0) goto L_0x00ac
            r9.A0D(r1, r0)
        L_0x00a4:
            int r3 = r3 + 1
            if (r3 < r6) goto L_0x008f
        L_0x00a8:
            r7.A06()
        L_0x00ab:
            return r8
        L_0x00ac:
            r9.A0B(r1, r0)
            goto L_0x00a4
        L_0x00b0:
            r10.A0N()
            goto L_0x007c
        L_0x00b4:
            X.6gp r0 = r9.A03
            if (r10 != r0) goto L_0x00cf
            androidx.compose.ui.unit.Constraints r5 = r9.A00
            X.AnonymousClass00C.A0B(r5)
        L_0x00bd:
            boolean r0 = r4.A0D
            if (r0 == 0) goto L_0x00cd
            if (r11 == 0) goto L_0x00cd
            boolean r0 = A06(r10, r9, r5)
        L_0x00c7:
            boolean r8 = A07(r10, r9, r5)
            goto L_0x0026
        L_0x00cd:
            r0 = 0
            goto L_0x00c7
        L_0x00cf:
            r5 = 0
            goto L_0x00bd
        L_0x00d1:
            java.lang.Boolean r0 = r10.A0C()
            boolean r0 = X.C36371kC.A1X(r0, r1)
            if (r0 != 0) goto L_0x001c
            boolean r0 = r9.A04(r10)
            if (r0 != 0) goto L_0x001c
            X.6Q5 r0 = r2.A0K
            r0.A03()
            X.7nI r0 = r0.A00
            if (r0 != 0) goto L_0x001c
            X.4ig r0 = r4.A04
            if (r0 == 0) goto L_0x00fb
            X.6Q5 r0 = r0.A0G
            if (r0 == 0) goto L_0x00fb
            r0.A03()
            X.7nI r0 = r0.A00
            if (r0 == 0) goto L_0x00fb
            goto L_0x001c
        L_0x00fb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Y0.A08(X.6gp, boolean, boolean):boolean");
    }

    public final void A09(C137846gp r2, boolean z) {
        AnonymousClass62O r0;
        boolean z2;
        AnonymousClass69F r02 = this.A02;
        if (z) {
            r0 = r02.A00;
        } else {
            r0 = r02.A01;
        }
        if (r0.A00.isEmpty()) {
            return;
        }
        if (this.A01) {
            C129056Et r03 = r2.A0P;
            if (z) {
                z2 = r03.A0D;
            } else {
                z2 = r03.A0E;
            }
            if (!z2) {
                A01(r2, z);
                return;
            }
            throw AnonymousClass001.A08("node not yet measured");
        }
        throw AnonymousClass001.A09("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        if (r1.A0B != true) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        if (r1.A0E != true) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0064 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0A(X.C137846gp r7, boolean r8) {
        /*
            r6 = this;
            X.6Et r5 = r7.A0P
            java.lang.Integer r0 = r5.A05
            int r1 = r0.intValue()
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L_0x0026
            if (r1 == r3) goto L_0x001c
            r0 = 3
            if (r1 == r0) goto L_0x0026
            r0 = 2
            if (r1 == r0) goto L_0x001c
            r0 = 4
            if (r1 == r0) goto L_0x001c
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x001c:
            boolean r0 = r5.A0D
            if (r0 != 0) goto L_0x0024
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x0028
        L_0x0024:
            if (r8 != 0) goto L_0x0028
        L_0x0026:
            r2 = 0
            return r2
        L_0x0028:
            r5.A0B = r2
            r5.A0C = r2
            r5.A09 = r2
            r5.A0A = r2
            boolean r0 = r7.A0H
            if (r0 != 0) goto L_0x0026
            X.6gp r4 = r7.A0A()
            java.lang.Boolean r0 = r7.A0C()
            boolean r0 = X.C36371kC.A1X(r0, r2)
            if (r0 == 0) goto L_0x004e
            if (r4 == 0) goto L_0x006b
            X.6Et r1 = r4.A0P
            boolean r0 = r1.A0D
            if (r0 == r2) goto L_0x004e
            boolean r0 = r1.A0B
            if (r0 != r2) goto L_0x006b
        L_0x004e:
            X.4ih r0 = r5.A0G
            boolean r0 = r0.A0C
            if (r0 == 0) goto L_0x0060
            if (r4 == 0) goto L_0x0065
            X.6Et r1 = r4.A0P
            boolean r0 = r1.A09
            if (r0 == r2) goto L_0x0060
            boolean r0 = r1.A0E
            if (r0 != r2) goto L_0x0065
        L_0x0060:
            boolean r0 = r6.A01
            if (r0 != 0) goto L_0x0026
            return r2
        L_0x0065:
            X.69F r0 = r6.A02
            r0.A01(r7, r3)
            goto L_0x0060
        L_0x006b:
            X.69F r0 = r6.A02
            r0.A01(r7, r2)
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Y0.A0A(X.6gp, boolean):boolean");
    }

    public final boolean A0B(C137846gp r6, boolean z) {
        C137846gp A0A;
        C137846gp A0A2;
        if (r6.A07 != null) {
            C129056Et r3 = r6.A0P;
            int intValue = r3.A05.intValue();
            if (intValue == 1) {
                return false;
            }
            if (intValue == 0 || intValue == 3 || intValue == 2) {
                this.A06.A0D(new C120695rv(r6, true, z));
                return false;
            } else if (intValue != 4) {
                throw C36441kJ.A18();
            } else if (r3.A0D && !z) {
                return false;
            } else {
                r3.A0D = true;
                r3.A0E = true;
                if (r6.A0H) {
                    return false;
                }
                if ((C36371kC.A1X(r6.A0C(), true) || A04(r6)) && ((A0A2 = r6.A0A()) == null || !A0A2.A0P.A0D)) {
                    this.A02.A01(r6, true);
                } else if ((r3.A0G.A0C || (r3.A0E && A05(r6))) && ((A0A = r6.A0A()) == null || !A0A.A0P.A0E)) {
                    this.A02.A01(r6, false);
                }
                if (!this.A01) {
                    return true;
                }
                return false;
            }
        } else {
            throw AnonymousClass001.A09("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (r1.A0E != true) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0C(X.C137846gp r6, boolean r7) {
        /*
            r5 = this;
            X.6Et r4 = r6.A0P
            java.lang.Integer r0 = r4.A05
            int r1 = r0.intValue()
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L_0x0029
            if (r1 == r3) goto L_0x0029
            r0 = 3
            if (r1 == r0) goto L_0x0029
            r0 = 2
            if (r1 == r0) goto L_0x0029
            r0 = 4
            if (r1 != r0) goto L_0x0054
            if (r7 != 0) goto L_0x002b
            X.4ih r0 = r4.A0G
            boolean r1 = r0.A0C
            boolean r0 = r0.A0D
            if (r1 != r0) goto L_0x002b
            boolean r0 = r4.A0E
            if (r0 != 0) goto L_0x0029
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x002b
        L_0x0029:
            r2 = 0
            return r2
        L_0x002b:
            r4.A09 = r2
            r4.A0A = r2
            boolean r0 = r6.A0H
            if (r0 != 0) goto L_0x0029
            X.4ih r0 = r4.A0G
            boolean r0 = r0.A0D
            if (r0 == 0) goto L_0x0049
            X.6gp r0 = r6.A0A()
            if (r0 == 0) goto L_0x004e
            X.6Et r1 = r0.A0P
            boolean r0 = r1.A09
            if (r0 == r2) goto L_0x0049
            boolean r0 = r1.A0E
            if (r0 != r2) goto L_0x004e
        L_0x0049:
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x0029
            return r2
        L_0x004e:
            X.69F r0 = r5.A02
            r0.A01(r6, r3)
            goto L_0x0049
        L_0x0054:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Y0.A0C(X.6gp, boolean):boolean");
    }

    public final boolean A0D(C137846gp r6, boolean z) {
        C137846gp A0A;
        C129056Et r4 = r6.A0P;
        int intValue = r4.A05.intValue();
        if (intValue == 1 || intValue == 0) {
            return false;
        }
        if (intValue == 3 || intValue == 2) {
            this.A06.A0D(new C120695rv(r6, false, z));
            return false;
        } else if (intValue != 4) {
            throw C36441kJ.A18();
        } else if (r4.A0E && !z) {
            return false;
        } else {
            r4.A0E = true;
            if (r6.A0H) {
                return false;
            }
            if ((r4.A0G.A0C || A05(r6)) && ((A0A = r6.A0A()) == null || !A0A.A0P.A0E)) {
                this.A02.A01(r6, false);
            }
            if (!this.A01) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: finally extract failed */
    public final boolean A0E(AnonymousClass00S r10) {
        C137846gp r8 = this.A03;
        if (r8.A09 == null) {
            throw AnonymousClass001.A08("performMeasureAndLayout called with unattached root");
        } else if (!r8.A0P.A0G.A0C) {
            throw AnonymousClass001.A08("performMeasureAndLayout called with unplaced root");
        } else if (!this.A01) {
            boolean z = false;
            if (this.A00 != null) {
                this.A01 = true;
                try {
                    AnonymousClass69F r6 = this.A02;
                    boolean z2 = false;
                    if (!r6.A02()) {
                        while (!r6.A02()) {
                            AnonymousClass62O r1 = r6.A00;
                            boolean A1a = C36411kG.A1a(r1.A00);
                            if (!A1a) {
                                r1 = r6.A01;
                            }
                            AnonymousClass79F r2 = r1.A00;
                            C137846gp r12 = (C137846gp) r2.first();
                            if (r12.A09 != null) {
                                r2.remove(r12);
                                boolean A08 = A08(r12, A1a, true);
                                if (r12 == r8 && A08) {
                                    z2 = true;
                                }
                            } else {
                                throw AnonymousClass001.A09("DepthSortedSet.remove called on an unattached node");
                            }
                        }
                        if (r10 != null) {
                            r10.invoke();
                        }
                    }
                    this.A01 = false;
                    z = z2;
                } catch (Throwable th) {
                    this.A01 = false;
                    throw th;
                }
            }
            A03(this);
            return z;
        } else {
            throw AnonymousClass001.A08("performMeasureAndLayout called during measure layout");
        }
    }

    public AnonymousClass6Y0(C137846gp r3) {
        this.A03 = r3;
    }

    public static final void A00(C137846gp r4, AnonymousClass6Y0 r5) {
        Constraints constraints;
        C1506776e A09 = r4.A09();
        int i = A09.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A09.A01;
            do {
                C137846gp r1 = (C137846gp) objArr[i2];
                if (A05(r1)) {
                    if (C109265Wx.A00(r1)) {
                        if (r1 == r5.A03) {
                            constraints = r5.A00;
                            AnonymousClass00C.A0B(constraints);
                        } else {
                            constraints = null;
                        }
                        A06(r1, r5, constraints);
                    } else {
                        A00(r1, r5);
                    }
                }
                i2++;
            } while (i2 < i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r0.A00 != null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (A05(r2) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(X.C137846gp r9, boolean r10) {
        /*
            r8 = this;
            X.76e r0 = r9.A09()
            int r6 = r0.A00
            if (r6 <= 0) goto L_0x001c
            java.lang.Object[] r5 = r0.A01
            r4 = 0
            r3 = 0
        L_0x000c:
            r2 = r5[r3]
            X.6gp r2 = (X.C137846gp) r2
            if (r10 != 0) goto L_0x0020
            boolean r0 = A05(r2)
            if (r0 != 0) goto L_0x0039
        L_0x0018:
            int r3 = r3 + 1
            if (r3 < r6) goto L_0x000c
        L_0x001c:
            r8.A02(r9, r10)
            return
        L_0x0020:
            X.6Et r0 = r2.A0P
            X.4ig r7 = r0.A04
            if (r7 == 0) goto L_0x006d
            java.lang.Integer r1 = r7.A04
        L_0x0028:
            java.lang.Integer r0 = X.C023109s.A00
            if (r1 == r0) goto L_0x0039
            if (r7 == 0) goto L_0x0018
            X.6Q5 r0 = r7.A0G
            if (r0 == 0) goto L_0x0018
            r0.A03()
            X.7nI r0 = r0.A00
            if (r0 == 0) goto L_0x0018
        L_0x0039:
            boolean r0 = X.C109265Wx.A00(r2)
            if (r0 == 0) goto L_0x0057
            if (r10 != 0) goto L_0x0057
            X.6Et r0 = r2.A0P
            boolean r0 = r0.A0D
            r1 = 1
            if (r0 == 0) goto L_0x0069
            X.69F r0 = r8.A02
            X.62O r0 = r0.A00
            X.79F r0 = r0.A00
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0069
            r8.A08(r2, r1, r4)
        L_0x0057:
            r8.A02(r2, r10)
            X.6Et r0 = r2.A0P
            if (r10 == 0) goto L_0x0066
            boolean r0 = r0.A0D
        L_0x0060:
            if (r0 != 0) goto L_0x0018
            r8.A01(r2, r10)
            goto L_0x0018
        L_0x0066:
            boolean r0 = r0.A0E
            goto L_0x0060
        L_0x0069:
            r8.A09(r2, r1)
            goto L_0x0057
        L_0x006d:
            java.lang.Integer r1 = X.C023109s.A0C
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Y0.A01(X.6gp, boolean):void");
    }
}
