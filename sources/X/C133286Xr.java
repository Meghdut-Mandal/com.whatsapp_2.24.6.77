package X;

/* renamed from: X.6Xr  reason: invalid class name and case insensitive filesystem */
public abstract class C133286Xr {
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r8 == 4) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long A00(X.AnonymousClass6QC r6, X.AnonymousClass6QC r7, int r8) {
        /*
            r0 = 3
            if (r8 != r0) goto L_0x0053
            float r1 = r6.A01
            float r0 = r7.A02
        L_0x0007:
            float r1 = r1 - r0
            r0 = 0
            float r0 = java.lang.Math.max(r0, r1)
            float r0 = java.lang.Math.abs(r0)
            long r1 = (long) r0
            r0 = 3
            if (r8 == r0) goto L_0x0019
            r0 = 4
            r4 = 0
            if (r8 != r0) goto L_0x001a
        L_0x0019:
            r4 = 1
        L_0x001a:
            r3 = 2
            if (r4 == 0) goto L_0x0039
            float r5 = r6.A03
            float r0 = r6.A00
            float r0 = r0 - r5
            float r4 = (float) r3
            float r0 = r0 / r4
            float r5 = r5 + r0
            float r3 = r7.A03
            float r0 = r7.A00
        L_0x0029:
            float r0 = r0 - r3
            float r0 = r0 / r4
            float r3 = r3 + r0
            float r0 = X.C90494aF.A01(r5, r3)
            long r5 = (long) r0
            r0 = 13
            long r3 = (long) r0
            long r3 = r3 * r1
            long r3 = r3 * r1
            long r5 = r5 * r5
            long r3 = r3 + r5
            return r3
        L_0x0039:
            r0 = 5
            if (r8 == r0) goto L_0x0046
            r0 = 6
            if (r8 == r0) goto L_0x0046
            java.lang.String r0 = "This function should only be used for 2-D focus search"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0046:
            float r5 = r6.A01
            float r0 = r6.A02
            float r0 = r0 - r5
            float r4 = (float) r3
            float r0 = r0 / r4
            float r5 = r5 + r0
            float r3 = r7.A01
            float r0 = r7.A02
            goto L_0x0029
        L_0x0053:
            r0 = 4
            if (r8 != r0) goto L_0x005b
            float r1 = r7.A01
            float r0 = r6.A02
            goto L_0x0007
        L_0x005b:
            r0 = 5
            if (r8 != r0) goto L_0x0063
            float r1 = r6.A03
            float r0 = r7.A00
            goto L_0x0007
        L_0x0063:
            r0 = 6
            if (r8 != r0) goto L_0x006b
            float r1 = r7.A03
            float r0 = r6.A00
            goto L_0x0007
        L_0x006b:
            java.lang.String r0 = "This function should only be used for 2-D focus search"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133286Xr.A00(X.6QC, X.6QC, int):long");
    }

    public static final C94214hq A01(C1506776e r12, AnonymousClass6QC r13, int i) {
        AnonymousClass6QC A01;
        if (AnonymousClass000.A1S(i, 3)) {
            A01 = r13.A01((r13.A02 - r13.A01) + ((float) 1), 0.0f);
        } else if (i == 4) {
            A01 = r13.A01(-((r13.A02 - r13.A01) + ((float) 1)), 0.0f);
        } else if (i == 5) {
            A01 = r13.A01(0.0f, (r13.A00 - r13.A03) + ((float) 1));
        } else if (i == 6) {
            A01 = r13.A01(0.0f, -((r13.A00 - r13.A03) + ((float) 1)));
        } else {
            throw AnonymousClass001.A09("This function should only be used for 2-D focus search");
        }
        C94214hq r11 = null;
        int i2 = r12.A00;
        if (i2 > 0) {
            int i3 = 0;
            Object[] objArr = r12.A01;
            do {
                C94214hq r6 = (C94214hq) objArr[i3];
                if (AnonymousClass6U1.A03(r6)) {
                    AnonymousClass6QC A02 = AnonymousClass6U1.A02(r6);
                    if (A08(A02, r13, i) && (!A08(A01, r13, i) || A09(r13, A02, A01, i) || (!A09(r13, A01, A02, i) && A00(r13, A02, i) < A00(r13, A01, i)))) {
                        r11 = r6;
                        A01 = A02;
                    }
                }
                i3++;
            } while (i3 < i2);
        }
        return r11;
    }

    public static final boolean A07(AnonymousClass6QC r3, AnonymousClass6QC r4, int i) {
        float f;
        float f2;
        if (AnonymousClass000.A1S(i, 3) || i == 4) {
            if (r3.A00 <= r4.A03) {
                return false;
            }
            f = r3.A03;
            f2 = r4.A00;
        } else if (i != 5 && i != 6) {
            throw AnonymousClass001.A09("This function should only be used for 2-D focus search");
        } else if (r3.A02 <= r4.A01) {
            return false;
        } else {
            f = r3.A01;
            f2 = r4.A02;
        }
        if (f < f2) {
            return true;
        }
        return false;
    }

    public static final boolean A08(AnonymousClass6QC r3, AnonymousClass6QC r4, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        if (AnonymousClass000.A1S(i, 3)) {
            float f5 = r4.A02;
            float f6 = r3.A02;
            if (f5 <= f6 && r4.A01 < f6) {
                return false;
            }
            f3 = r4.A01;
            f4 = r3.A01;
        } else {
            if (i == 4) {
                float f7 = r4.A01;
                float f8 = r3.A01;
                if (f7 >= f8 && r4.A02 > f8) {
                    return false;
                }
                f = r4.A02;
                f2 = r3.A02;
            } else if (i == 5) {
                float f9 = r4.A00;
                float f10 = r3.A00;
                if (f9 <= f10 && r4.A03 < f10) {
                    return false;
                }
                f3 = r4.A03;
                f4 = r3.A03;
            } else if (i == 6) {
                float f11 = r4.A03;
                float f12 = r3.A03;
                if (f11 >= f12 && r4.A00 > f12) {
                    return false;
                }
                f = r4.A00;
                f2 = r3.A00;
            } else {
                throw AnonymousClass001.A09("This function should only be used for 2-D focus search");
            }
            if (f < f2) {
                return true;
            }
            return false;
        }
        if (f3 > f4) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0019  */
    public static final void A03(X.C1506776e r8, X.AnonymousClass7bY r9) {
        /*
            r7 = 1024(0x400, float:1.435E-42)
            X.6gq r9 = (X.C137856gq) r9
            X.6gq r6 = r9.A03
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x0080
            X.76e r5 = X.C1506776e.A01()
            X.6gq r0 = r6.A02
            if (r0 == 0) goto L_0x0023
            r5.A0D(r0)
        L_0x0015:
            int r0 = r5.A00
            if (r0 == 0) goto L_0x007f
            r4 = 1
            X.6gq r6 = X.C1506776e.A03(r5, r0)
            int r0 = r6.A00
            r0 = r0 & r7
            if (r0 != 0) goto L_0x0029
        L_0x0023:
            X.AnonymousClass6VZ.A04(r5, r6)
            goto L_0x0015
        L_0x0027:
            if (r6 == 0) goto L_0x0015
        L_0x0029:
            int r0 = r6.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x007c
            r3 = 0
        L_0x002f:
            boolean r0 = r6 instanceof X.C94214hq
            if (r0 == 0) goto L_0x004f
            X.4hq r6 = (X.C94214hq) r6
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x0044
            X.6g0 r0 = r6.A0F()
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x004b
            r8.A0D(r6)
        L_0x0044:
            X.6gq r6 = X.AnonymousClass6VZ.A00(r3)
        L_0x0048:
            if (r6 == 0) goto L_0x0015
            goto L_0x002f
        L_0x004b:
            A03(r8, r6)
            goto L_0x0044
        L_0x004f:
            int r0 = r6.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0044
            boolean r0 = r6 instanceof X.C94114hf
            if (r0 == 0) goto L_0x0044
            r0 = r6
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x005e:
            if (r2 == 0) goto L_0x0079
            int r0 = r2.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x006a
            int r1 = r1 + 1
            if (r1 != r4) goto L_0x006d
            r6 = r2
        L_0x006a:
            X.6gq r2 = r2.A02
            goto L_0x005e
        L_0x006d:
            X.76e r3 = X.C90464aC.A0G(r3)
            X.6gq r6 = X.C90524aI.A0D(r3, r6)
            r3.A0D(r2)
            goto L_0x006a
        L_0x0079:
            if (r1 != r4) goto L_0x0044
            goto L_0x0048
        L_0x007c:
            X.6gq r6 = r6.A02
            goto L_0x0027
        L_0x007f:
            return
        L_0x0080:
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133286Xr.A03(X.76e, X.7bY):void");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x007b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    public static final boolean A04(X.C94214hq r10, X.C94214hq r11, X.C006302t r12, int r13) {
        /*
            r0 = 16
            X.4hq[] r0 = new X.C94214hq[r0]
            r9 = 0
            X.76e r3 = X.C1506776e.A02(r0)
            r8 = 1024(0x400, float:1.435E-42)
            X.6gq r7 = r10.A03
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x009e
            X.76e r6 = X.C1506776e.A01()
            X.6gq r0 = r7.A02
            if (r0 == 0) goto L_0x002e
            r6.A0D(r0)
        L_0x001c:
            int r1 = r6.A00
            boolean r0 = X.AnonymousClass000.A1P(r1)
            r4 = 1
            if (r0 == 0) goto L_0x007b
            X.6gq r7 = X.C1506776e.A03(r6, r1)
            int r0 = r7.A00
            r0 = r0 & r8
            if (r0 != 0) goto L_0x0034
        L_0x002e:
            X.AnonymousClass6VZ.A04(r6, r7)
            goto L_0x001c
        L_0x0032:
            if (r7 == 0) goto L_0x001c
        L_0x0034:
            int r0 = r7.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0075
            r5 = 0
        L_0x003a:
            boolean r0 = r7 instanceof X.C94214hq
            if (r0 == 0) goto L_0x0048
            r3.A0D(r7)
        L_0x0041:
            X.6gq r7 = X.AnonymousClass6VZ.A00(r5)
        L_0x0045:
            if (r7 == 0) goto L_0x001c
            goto L_0x003a
        L_0x0048:
            int r0 = r7.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0041
            boolean r0 = r7 instanceof X.C94114hf
            if (r0 == 0) goto L_0x0041
            r0 = r7
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x0057:
            if (r2 == 0) goto L_0x0072
            int r0 = r2.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0063
            int r1 = r1 + 1
            if (r1 != r4) goto L_0x0066
            r7 = r2
        L_0x0063:
            X.6gq r2 = r2.A02
            goto L_0x0057
        L_0x0066:
            X.76e r5 = X.C90464aC.A0G(r5)
            X.6gq r7 = X.C90524aI.A0D(r5, r7)
            r5.A0D(r2)
            goto L_0x0063
        L_0x0072:
            if (r1 != r4) goto L_0x0041
            goto L_0x0045
        L_0x0075:
            X.6gq r7 = r7.A02
            goto L_0x0032
        L_0x0078:
            r3.A0F(r1)
        L_0x007b:
            int r0 = r3.A00
            if (r0 == 0) goto L_0x009d
            X.6QC r0 = X.AnonymousClass6U1.A02(r11)
            X.4hq r1 = A01(r3, r0, r13)
            if (r1 == 0) goto L_0x009d
            X.6g0 r0 = r1.A0F()
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x0096
            boolean r0 = X.C90464aC.A1Y(r1, r12)
            return r0
        L_0x0096:
            boolean r0 = A05(r1, r11, r12, r13)
            if (r0 == 0) goto L_0x0078
            return r4
        L_0x009d:
            return r9
        L_0x009e:
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133286Xr.A04(X.4hq, X.4hq, X.02t, int):boolean");
    }

    public static final boolean A06(C94214hq r5, C006302t r6, int i) {
        float f;
        float f2;
        Object A01;
        C1506776e A02 = C1506776e.A02(new C94214hq[16]);
        A03(A02, r5);
        int i2 = A02.A00;
        if (i2 > 1) {
            if (i == 7) {
                i = 4;
            } else if (!(i == 4 || i == 6)) {
                if (i == 3 || i == 5) {
                    AnonymousClass6QC A022 = AnonymousClass6U1.A02(r5);
                    f = A022.A02;
                    f2 = A022.A00;
                    A01 = A01(A02, new AnonymousClass6QC(f, f2, f, f2), i);
                } else {
                    throw AnonymousClass001.A09("This function should only be used for 2-D focus search");
                }
            }
            AnonymousClass6QC A023 = AnonymousClass6U1.A02(r5);
            f = A023.A01;
            f2 = A023.A03;
            A01 = A01(A02, new AnonymousClass6QC(f, f2, f, f2), i);
        } else if (i2 == 0) {
            return false;
        } else {
            A01 = A02.A01[0];
        }
        if (A01 != null) {
            return C90464aC.A1Y(A01, r6);
        }
        return false;
    }

    public static final Boolean A02(C94214hq r7, C006302t r8, int i) {
        boolean z;
        int A00 = C94214hq.A00(r7);
        if (A00 == 1) {
            C94214hq A01 = AnonymousClass6U1.A01(r7);
            if (A01 != null) {
                int A002 = C94214hq.A00(A01);
                if (A002 == 1) {
                    Boolean A02 = A02(A01, r8, i);
                    if (!C36371kC.A1X(A02, false)) {
                        return A02;
                    }
                    if (A01.A0G() == AnonymousClass5U8.ActiveParent) {
                        A01 = AnonymousClass6U1.A00(A01);
                        if (A01 == null) {
                            throw AnonymousClass001.A09("ActiveParent must have a focusedChild");
                        }
                    } else {
                        throw AnonymousClass001.A09("Searching for active node in inactive hierarchy");
                    }
                } else if (!(A002 == 0 || A002 == 2)) {
                    if (A002 != 3) {
                        throw C36441kJ.A18();
                    }
                    throw AnonymousClass001.A09("ActiveParent must have a focusedChild");
                }
                z = A05(r7, A01, r8, i);
            } else {
                throw AnonymousClass001.A09("ActiveParent must have a focusedChild");
            }
        } else if (A00 == 0 || A00 == 2) {
            z = A06(r7, r8, i);
        } else if (A00 != 3) {
            throw C36441kJ.A18();
        } else if (r7.A0F().A0A) {
            return (Boolean) r8.invoke(r7);
        } else {
            return false;
        }
        return Boolean.valueOf(z);
    }

    public static final boolean A05(C94214hq r1, C94214hq r2, C006302t r3, int i) {
        if (A04(r1, r2, r3, i)) {
            return true;
        }
        return C90494aF.A1Y((Boolean) AnonymousClass5WP.A00(r1, new AnonymousClass7V4(r1, r2, r3, i), i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r7 != 3) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        if (r1 <= r0) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        if (r7 == 4) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        if (r7 != 5) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        r1 = r4.A03;
        r0 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0032, code lost:
        r2 = java.lang.Math.max(0.0f, r1 - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        if (r7 != 5) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        r1 = r4.A03;
        r0 = r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        if (r2 >= java.lang.Math.max(1.0f, r1 - r0)) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        r1 = r6.A00;
        r0 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
        r1 = r5.A03;
        r0 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A09(X.AnonymousClass6QC r4, X.AnonymousClass6QC r5, X.AnonymousClass6QC r6, int r7) {
        /*
            boolean r0 = A07(r6, r4, r7)
            r3 = 0
            if (r0 != 0) goto L_0x001c
            boolean r0 = A07(r5, r4, r7)
            if (r0 == 0) goto L_0x001c
            r0 = 3
            if (r7 != r0) goto L_0x001d
            float r1 = r4.A01
            float r0 = r6.A02
        L_0x0014:
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x001b
            r0 = 3
            if (r7 != r0) goto L_0x0028
        L_0x001b:
            r3 = 1
        L_0x001c:
            return r3
        L_0x001d:
            r0 = 4
            if (r7 != r0) goto L_0x0055
            float r1 = r4.A02
            float r0 = r6.A01
        L_0x0024:
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x001b
        L_0x0028:
            r0 = 4
            if (r7 == r0) goto L_0x001b
            r0 = 5
            if (r7 != r0) goto L_0x0050
            float r1 = r4.A03
            float r0 = r5.A00
        L_0x0032:
            float r1 = r1 - r0
            r0 = 0
            float r2 = java.lang.Math.max(r0, r1)
            r0 = 5
            if (r7 != r0) goto L_0x004b
            float r1 = r4.A03
            float r0 = r6.A03
        L_0x003f:
            float r1 = r1 - r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.max(r0, r1)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x001c
            goto L_0x001b
        L_0x004b:
            float r1 = r6.A00
            float r0 = r4.A00
            goto L_0x003f
        L_0x0050:
            float r1 = r5.A03
            float r0 = r4.A00
            goto L_0x0032
        L_0x0055:
            r0 = 5
            if (r7 != r0) goto L_0x005d
            float r1 = r4.A03
            float r0 = r6.A00
            goto L_0x0014
        L_0x005d:
            r0 = 6
            if (r7 != r0) goto L_0x0065
            float r1 = r4.A00
            float r0 = r6.A03
            goto L_0x0024
        L_0x0065:
            java.lang.String r0 = "This function should only be used for 2-D focus search"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133286Xr.A09(X.6QC, X.6QC, X.6QC, int):boolean");
    }
}
