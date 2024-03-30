package X;

import java.util.ArrayList;

/* renamed from: X.6WG  reason: invalid class name */
public final class AnonymousClass6WG {
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public int A03;
    public C114305h0 A04 = new C114305h0();
    public C114315h1 A05;
    public boolean A06;
    public int A07;
    public int A08 = -1;
    public final C136916fF A09;
    public final AnonymousClass61S A0A = new AnonymousClass61S();

    public static final void A01(AnonymousClass6WG r10) {
        A03(r10, false);
        AnonymousClass6QL r6 = r10.A09.A0C;
        if (r6.A07 > 0) {
            int i = r6.A05;
            AnonymousClass61S r4 = r10.A0A;
            int i2 = -2;
            int i3 = r4.A00;
            if (i3 > 0) {
                i2 = r4.A01[i3 - 1];
            }
            if (i2 != i) {
                if (!r10.A06) {
                    A03(r10, false);
                    r10.A05.A00.A04(C93604gq.A00);
                    r10.A06 = true;
                }
                if (i > 0) {
                    AnonymousClass606 A022 = r6.A02(i);
                    r4.A01(i);
                    int i4 = 0;
                    A03(r10, false);
                    C128976Ek r9 = r10.A05.A00;
                    C93684gy r8 = C93684gy.A00;
                    r9.A05(r8);
                    AnonymousClass6G3.A01(r9, A022, 0);
                    int i5 = r9.A03;
                    int i6 = r8.A00;
                    if (i6 != 0) {
                        i4 = -1 >>> (32 - i6);
                    }
                    if (i5 == i4 && r9.A04 == C90464aC.A07(r8.A01)) {
                        r10.A06 = true;
                        return;
                    }
                    StringBuilder A0u = AnonymousClass000.A0u();
                    int i7 = 0;
                    for (int i8 = 0; i8 < i6; i8++) {
                        if (C128976Ek.A00(r9, i8) != 0) {
                            if (i7 > 0) {
                                A0u.append(", ");
                            }
                            i7 = AnonymousClass6EM.A00(r8, A0u, i8, i7);
                        }
                    }
                    String A0y = C36381kD.A0y(A0u);
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    int i9 = r8.A01;
                    int i10 = 0;
                    for (int i11 = 0; i11 < i9; i11++) {
                        if (C128976Ek.A01(r9, i11) != 0) {
                            if (i7 > 0) {
                                A0u2.append(", ");
                            }
                            i10 = AnonymousClass6EM.A01(r8, A0u2, i11, i10);
                        }
                    }
                    throw C90464aC.A0Q(A0u2, r8, A0y, i7, i10);
                }
            }
        }
    }

    public static final void A00(AnonymousClass6WG r10) {
        int i = r10.A07;
        if (i > 0) {
            C128976Ek r9 = r10.A05.A00;
            C93784h8 r8 = C93784h8.A00;
            r9.A05(r8);
            AnonymousClass6G3.A00(r9, 0, i);
            int i2 = r9.A03;
            int i3 = r8.A00;
            if (i2 == C90464aC.A07(i3) && r9.A04 == C90464aC.A07(r8.A01)) {
                r10.A07 = 0;
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    if (C128976Ek.A00(r9, i5) != 0) {
                        if (i4 > 0) {
                            A0u.append(", ");
                        }
                        i4 = AnonymousClass6EM.A00(r8, A0u, i5, i4);
                    }
                }
                String A0y = C36381kD.A0y(A0u);
                StringBuilder A0u2 = AnonymousClass000.A0u();
                int i6 = r8.A01;
                int i7 = 0;
                for (int i8 = 0; i8 < i6; i8++) {
                    if (C128976Ek.A01(r9, i8) != 0) {
                        if (i4 > 0) {
                            A0u2.append(", ");
                        }
                        i7 = AnonymousClass6EM.A01(r8, A0u2, i8, i7);
                    }
                }
                throw C90464aC.A0Q(A0u2, r8, A0y, i4, i7);
            }
        }
        ArrayList arrayList = r10.A04.A00;
        if (C36411kG.A1a(arrayList)) {
            C114315h1 r5 = r10.A05;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i9 = 0; i9 < size; i9++) {
                objArr[i9] = arrayList.get(i9);
            }
            if (size != 0) {
                C128976Ek r82 = r5.A00;
                C93664gw r7 = C93664gw.A00;
                r82.A05(r7);
                AnonymousClass6G3.A01(r82, objArr, 0);
                int i10 = r82.A03;
                int i11 = r7.A00;
                if (!(i10 == C90464aC.A07(i11) && r82.A04 == C90464aC.A07(r7.A01))) {
                    StringBuilder A0u3 = AnonymousClass000.A0u();
                    int i12 = 0;
                    for (int i13 = 0; i13 < i11; i13++) {
                        if (C128976Ek.A00(r82, i13) != 0) {
                            if (i12 > 0) {
                                A0u3.append(", ");
                            }
                            i12 = AnonymousClass6EM.A00(r7, A0u3, i13, i12);
                        }
                    }
                    String A0y2 = C36381kD.A0y(A0u3);
                    StringBuilder A0u4 = AnonymousClass000.A0u();
                    int i14 = r7.A01;
                    int i15 = 0;
                    for (int i16 = 0; i16 < i14; i16++) {
                        if (C128976Ek.A01(r82, i16) != 0) {
                            if (i12 > 0) {
                                A0u4.append(", ");
                            }
                            i15 = AnonymousClass6EM.A01(r7, A0u4, i16, i15);
                        }
                    }
                    throw C90464aC.A0Q(A0u4, r7, A0y2, i12, i15);
                }
            }
            arrayList.clear();
        }
    }

    public static final void A02(AnonymousClass6WG r10) {
        int i;
        int i2 = r10.A00;
        if (i2 > 0) {
            int i3 = r10.A08;
            if (i3 >= 0) {
                A00(r10);
                C128976Ek r9 = r10.A05.A00;
                C93744h4 r8 = C93744h4.A00;
                r9.A05(r8);
                i = 0;
                AnonymousClass6G3.A00(r9, 0, i3);
                AnonymousClass6G3.A00(r9, 1, i2);
                int i4 = r9.A03;
                int i5 = r8.A00;
                int i6 = -1 >>> (32 - i5);
                if (i5 == 0) {
                    i6 = 0;
                }
                if (i4 == i6) {
                    int i7 = r9.A04;
                    int i8 = r8.A01;
                    int i9 = -1 >>> (32 - i8);
                    if (i8 == 0) {
                        i9 = 0;
                    }
                    if (i7 == i9) {
                        r10.A08 = -1;
                    }
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                int i10 = 0;
                for (int i11 = 0; i11 < i5; i11++) {
                    if (C128976Ek.A00(r9, i11) != 0) {
                        if (i10 > 0) {
                            A0u.append(", ");
                        }
                        i10 = AnonymousClass6EM.A00(r8, A0u, i11, i10);
                    }
                }
                String A0y = C36381kD.A0y(A0u);
                StringBuilder A0u2 = AnonymousClass000.A0u();
                int i12 = r8.A01;
                int i13 = 0;
                while (i < i12) {
                    if (C128976Ek.A01(r9, i) != 0) {
                        if (i10 > 0) {
                            A0u2.append(", ");
                        }
                        i13 = AnonymousClass6EM.A01(r8, A0u2, i, i13);
                    }
                    i++;
                }
                throw C90464aC.A0Q(A0u2, r8, A0y, i10, i13);
            }
            int i14 = r10.A02;
            int i15 = r10.A01;
            A00(r10);
            C128976Ek r92 = r10.A05.A00;
            C93724h2 r82 = C93724h2.A00;
            r92.A05(r82);
            AnonymousClass6G3.A00(r92, 1, i14);
            i = 0;
            int i16 = 0;
            AnonymousClass6G3.A00(r92, 0, i15);
            AnonymousClass6G3.A00(r92, 2, i2);
            int i17 = r92.A03;
            int i18 = r82.A00;
            int i19 = -1 >>> (32 - i18);
            if (i18 == 0) {
                i19 = 0;
            }
            if (i17 == i19) {
                int i20 = r92.A04;
                int i21 = r82.A01;
                int i22 = -1 >>> (32 - i21);
                if (i21 == 0) {
                    i22 = 0;
                }
                if (i20 == i22) {
                    r10.A01 = -1;
                    r10.A02 = -1;
                }
            }
            StringBuilder A0u3 = AnonymousClass000.A0u();
            for (int i23 = 0; i23 < i18; i23++) {
                if (C128976Ek.A00(r92, i23) != 0) {
                    if (i16 > 0) {
                        A0u3.append(", ");
                    }
                    i16 = AnonymousClass6EM.A00(r82, A0u3, i23, i16);
                }
            }
            String A0y2 = C36381kD.A0y(A0u3);
            StringBuilder A0u4 = AnonymousClass000.A0u();
            int i24 = r82.A01;
            int i25 = 0;
            while (i < i24) {
                if (C128976Ek.A01(r92, i) != 0) {
                    if (i16 > 0) {
                        A0u4.append(", ");
                    }
                    i25 = AnonymousClass6EM.A01(r82, A0u4, i, i25);
                }
                i++;
            }
            throw C90464aC.A0Q(A0u4, r82, A0y2, i16, i25);
            r10.A00 = i;
        }
    }

    public static final void A03(AnonymousClass6WG r10, boolean z) {
        int i;
        AnonymousClass6QL r0 = r10.A09.A0C;
        if (z) {
            i = r0.A05;
        } else {
            i = r0.A01;
        }
        int i2 = i - r10.A03;
        if (i2 < 0) {
            throw AnonymousClass6XJ.A01("Tried to seek backward");
        } else if (i2 > 0) {
            C128976Ek r9 = r10.A05.A00;
            C93654gv r8 = C93654gv.A00;
            r9.A05(r8);
            AnonymousClass6G3.A00(r9, 0, i2);
            int i3 = r9.A03;
            int i4 = r8.A00;
            if (i3 == C90464aC.A07(i4) && r9.A04 == C90464aC.A07(r8.A01)) {
                r10.A03 = i;
                return;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                if (C128976Ek.A00(r9, i6) != 0) {
                    if (i5 > 0) {
                        A0u.append(", ");
                    }
                    i5 = AnonymousClass6EM.A00(r8, A0u, i6, i5);
                }
            }
            String A0y = C36381kD.A0y(A0u);
            StringBuilder A0u2 = AnonymousClass000.A0u();
            int i7 = r8.A01;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                if (C128976Ek.A01(r9, i9) != 0) {
                    if (i5 > 0) {
                        A0u2.append(", ");
                    }
                    i8 = AnonymousClass6EM.A01(r8, A0u2, i9, i8);
                }
            }
            throw C90464aC.A0Q(A0u2, r8, A0y, i5, i8);
        }
    }

    public final void A04() {
        ArrayList arrayList = this.A04.A00;
        if (C36411kG.A1a(arrayList)) {
            arrayList.remove(C90504aG.A0C(arrayList));
        } else {
            this.A07++;
        }
    }

    public final void A05(int i, int i2) {
        if (i2 <= 0) {
            return;
        }
        if (i < 0) {
            throw AnonymousClass6XJ.A01(AnonymousClass000.A0r("Invalid remove index ", AnonymousClass000.A0u(), i));
        } else if (this.A08 == i) {
            this.A00 += i2;
        } else {
            A02(this);
            this.A08 = i;
            this.A00 = i2;
        }
    }

    public AnonymousClass6WG(C136916fF r2, C114315h1 r3) {
        this.A09 = r2;
        this.A05 = r3;
    }
}
