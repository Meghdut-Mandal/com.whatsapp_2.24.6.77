package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0X4  reason: invalid class name */
public class AnonymousClass0X4 {
    public final int A00;
    public final int A01;
    public final C06730Uv A02;
    public final List A03;
    public final int[] A04;
    public final int[] A05;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b6, code lost:
        r3 = r14.A02;
        r15 = r15 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fb, code lost:
        r3 = r13.A01;
        r14 = r14 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0X4(X.C06730Uv r19, java.util.List r20, int[] r21, int[] r22) {
        /*
            r18 = this;
            r17 = 1
            r6 = r18
            r6.<init>()
            r0 = r20
            r6.A03 = r0
            r2 = r21
            r6.A05 = r2
            r1 = r22
            r6.A04 = r1
            r0 = 0
            java.util.Arrays.fill(r2, r0)
            java.util.Arrays.fill(r1, r0)
            r1 = r19
            r6.A02 = r1
            int r0 = r1.A01()
            r6.A01 = r0
            int r0 = r1.A00()
            r6.A00 = r0
            java.util.List r3 = r6.A03
            boolean r0 = r3.isEmpty()
            r2 = 0
            if (r0 != 0) goto L_0x0043
            java.lang.Object r1 = r3.get(r2)
            X.0TK r1 = (X.AnonymousClass0TK) r1
            if (r1 == 0) goto L_0x0043
            int r0 = r1.A01
            if (r0 != 0) goto L_0x0043
            int r0 = r1.A02
            if (r0 == 0) goto L_0x0055
        L_0x0043:
            X.0TK r0 = new X.0TK
            r0.<init>()
            r0.A01 = r2
            r0.A02 = r2
            r0.A03 = r2
            r0.A00 = r2
            r0.A04 = r2
            r3.add(r2, r0)
        L_0x0055:
            int r10 = r6.A01
            int r5 = r6.A00
            java.util.List r9 = r6.A03
            int r8 = r9.size()
            int r8 = r8 - r17
        L_0x0061:
            if (r8 < 0) goto L_0x012e
            java.lang.Object r7 = r9.get(r8)
            X.0TK r7 = (X.AnonymousClass0TK) r7
            int r11 = r7.A01
            int r0 = r7.A00
            int r11 = r11 + r0
            int r4 = r7.A02
            int r4 = r4 + r0
        L_0x0071:
            if (r10 <= r11) goto L_0x00bb
            r3 = r5
            r15 = r8
            int[] r12 = r6.A05
            int r2 = r10 + -1
            r0 = r12[r2]
            if (r0 == 0) goto L_0x0081
        L_0x007d:
            r10 = r2
            goto L_0x0071
        L_0x007f:
            if (r15 < 0) goto L_0x007d
        L_0x0081:
            java.lang.Object r14 = r9.get(r15)
            X.0TK r14 = (X.AnonymousClass0TK) r14
            int r0 = r14.A00
            int r13 = r14.A02
            int r13 = r13 + r0
            r16 = 8
            int r3 = r3 - r17
        L_0x0090:
            if (r3 < r13) goto L_0x00b6
            X.0Uv r1 = r6.A02
            boolean r0 = r1.A04(r2, r3)
            if (r0 == 0) goto L_0x00b3
            boolean r0 = r1.A03(r2, r3)
            if (r0 != 0) goto L_0x00a2
            r16 = 4
        L_0x00a2:
            int r10 = r10 - r17
            int r0 = r3 << 5
            r0 = r0 | 16
            r12[r10] = r0
            int[] r1 = r6.A04
            int r0 = r10 << 5
            r0 = r0 | r16
            r1[r3] = r0
            goto L_0x007d
        L_0x00b3:
            int r3 = r3 + -1
            goto L_0x0090
        L_0x00b6:
            int r3 = r14.A02
            int r15 = r15 + -1
            goto L_0x007f
        L_0x00bb:
            if (r5 <= r4) goto L_0x0100
            r3 = r10
            r14 = r8
            int[] r11 = r6.A04
            int r5 = r5 + -1
            r0 = r11[r5]
            if (r0 == 0) goto L_0x00ca
            goto L_0x00bb
        L_0x00c8:
            if (r14 < 0) goto L_0x00bb
        L_0x00ca:
            java.lang.Object r13 = r9.get(r14)
            X.0TK r13 = (X.AnonymousClass0TK) r13
            int r12 = r13.A01
            int r0 = r13.A00
            int r12 = r12 + r0
            r2 = 8
            int r3 = r3 - r17
        L_0x00d9:
            if (r3 < r12) goto L_0x00fb
            X.0Uv r1 = r6.A02
            boolean r0 = r1.A04(r3, r5)
            if (r0 == 0) goto L_0x00f8
            boolean r0 = r1.A03(r3, r5)
            if (r0 != 0) goto L_0x00ea
            r2 = 4
        L_0x00ea:
            int r0 = r3 << 5
            r0 = r0 | 16
            r11[r5] = r0
            int[] r1 = r6.A05
            int r0 = r5 << 5
            r0 = r0 | r2
            r1[r3] = r0
            goto L_0x00bb
        L_0x00f8:
            int r3 = r3 + -1
            goto L_0x00d9
        L_0x00fb:
            int r3 = r13.A01
            int r14 = r14 + -1
            goto L_0x00c8
        L_0x0100:
            r5 = 0
        L_0x0101:
            int r0 = r7.A00
            if (r5 >= r0) goto L_0x0126
            int r4 = r7.A01
            int r4 = r4 + r5
            int r3 = r7.A02
            int r3 = r3 + r5
            X.0Uv r0 = r6.A02
            boolean r0 = r0.A03(r4, r3)
            r2 = 2
            if (r0 == 0) goto L_0x0115
            r2 = 1
        L_0x0115:
            int[] r1 = r6.A05
            int r0 = r3 << 5
            r0 = r0 | r2
            r1[r4] = r0
            int[] r1 = r6.A04
            int r0 = r4 << 5
            r0 = r0 | r2
            r1[r3] = r0
            int r5 = r5 + 1
            goto L_0x0101
        L_0x0126:
            int r10 = r7.A01
            int r5 = r7.A02
            int r8 = r8 + -1
            goto L_0x0061
        L_0x012e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0X4.<init>(X.0Uv, java.util.List, int[], int[]):void");
    }

    public void A01(C02860Ce r19) {
        C09930dO r6;
        C02860Ce r62 = r19;
        if (r62 instanceof C09930dO) {
            r6 = (C09930dO) r62;
        } else {
            r6 = new C09930dO(r62);
        }
        ArrayList A0I = AnonymousClass001.A0I();
        int i = this.A01;
        int i2 = this.A00;
        List list = this.A03;
        for (int size = list.size() - 1; size >= 0; size--) {
            AnonymousClass0TK r9 = (AnonymousClass0TK) list.get(size);
            int i3 = r9.A00;
            int i4 = r9.A01 + i3;
            int i5 = r9.A02 + i3;
            if (i4 < i) {
                for (int i6 = (i - i4) - 1; i6 >= 0; i6--) {
                    int[] iArr = this.A05;
                    int i7 = i4 + i6;
                    int i8 = iArr[i7] & 31;
                    if (i8 == 0) {
                        r6.Beb(i4 + i6, 1);
                        Iterator it = A0I.iterator();
                        while (it.hasNext()) {
                            ((C06160Sn) it.next()).A02--;
                        }
                    } else if (i8 == 4 || i8 == 8) {
                        int i9 = iArr[i7] >> 5;
                        C06160Sn A002 = A00(A0I, i9, false);
                        r6.BbD(i4 + i6, A002.A02 - 1);
                        if (i8 == 4) {
                            r6.BTI(this.A02.A02(i7, i9), A002.A02 - 1, 1);
                        }
                    } else if (i8 == 16) {
                        A0I.add(new C06160Sn(i7, i4 + i6, true));
                    } else {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("unknown flag for pos ");
                        A0u.append(i7);
                        A0u.append(" ");
                        throw AnonymousClass000.A0g(Long.toBinaryString((long) i8), A0u);
                    }
                }
            }
            if (i5 < i2) {
                for (int i10 = (i2 - i5) - 1; i10 >= 0; i10--) {
                    int[] iArr2 = this.A04;
                    int i11 = i5 + i10;
                    int i12 = iArr2[i11] & 31;
                    if (i12 == 0) {
                        r6.BZE(i4, 1);
                        Iterator it2 = A0I.iterator();
                        while (it2.hasNext()) {
                            ((C06160Sn) it2.next()).A02++;
                        }
                    } else if (i12 == 4 || i12 == 8) {
                        int i13 = iArr2[i11] >> 5;
                        r6.BbD(A00(A0I, i13, true).A02, i4);
                        if (i12 == 4) {
                            r6.BTI(this.A02.A02(i13, i11), i4, 1);
                        }
                    } else if (i12 == 16) {
                        A0I.add(new C06160Sn(i11, i4, false));
                    } else {
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        A0u2.append("unknown flag for pos ");
                        A0u2.append(i11);
                        A0u2.append(" ");
                        throw AnonymousClass000.A0g(Long.toBinaryString((long) i12), A0u2);
                    }
                }
            }
            while (true) {
                i3--;
                if (i3 < 0) {
                    break;
                } else if ((this.A05[r9.A01 + i3] & 31) == 2) {
                    int i14 = r9.A01 + i3;
                    r6.BTI(this.A02.A02(i14, r9.A02 + i3), i14, 1);
                }
            }
            i = r9.A01;
            i2 = r9.A02;
        }
        r6.A00();
    }

    public void A02(AnonymousClass0CZ r2) {
        A01(new C02870Cf(r2));
    }

    public static C06160Sn A00(List list, int i, boolean z) {
        int size = list.size() - 1;
        while (size >= 0) {
            C06160Sn r3 = (C06160Sn) list.get(size);
            if (r3.A00 == i && r3.A01 == z) {
                list.remove(size);
                while (size < list.size()) {
                    C06160Sn r2 = (C06160Sn) list.get(size);
                    int i2 = r2.A02;
                    int i3 = -1;
                    if (z) {
                        i3 = 1;
                    }
                    r2.A02 = i2 + i3;
                    size++;
                }
                return r3;
            }
            size--;
        }
        return null;
    }
}
