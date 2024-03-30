package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0B2  reason: invalid class name */
public class AnonymousClass0B2 {
    public ArrayList A00 = new ArrayList();
    public C02520As A01;
    public C02520As A02;
    public AnonymousClass0BH A03 = null;
    public ArrayList A04 = new ArrayList();
    public boolean A05 = true;
    public boolean A06 = true;
    public AnonymousClass0B1 A07 = new AnonymousClass0B1();
    public ArrayList A08 = new ArrayList();

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cb, code lost:
        if ((r11 instanceof X.C02550Av) == false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d2, code lost:
        if ((r11 instanceof X.C02570Ay) == false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d5, code lost:
        r0 = r1.A0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (r23 == 0) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C02520As r21, X.AnonymousClass0B2 r22, int r23) {
        /*
            r0 = r22
            java.util.ArrayList r0 = r0.A00
            r20 = r0
            int r19 = r20.size()
            r6 = 0
            r12 = 0
        L_0x000d:
            r0 = r19
            if (r12 >= r0) goto L_0x00d9
            r0 = r20
            java.lang.Object r2 = r0.get(r12)
            X.0Y1 r2 = (X.AnonymousClass0Y1) r2
            X.0Au r11 = r2.A00
            boolean r0 = r11 instanceof X.AnonymousClass0GO
            r4 = 0
            r1 = r21
            r14 = r23
            if (r0 == 0) goto L_0x00c7
            int r0 = r11.A02
            if (r0 != r14) goto L_0x00cd
            if (r23 != 0) goto L_0x00d5
        L_0x002b:
            X.0Av r0 = r1.A0c
        L_0x002d:
            X.0Aw r1 = r0.A05
            X.0Aw r3 = r0.A04
            X.0Aw r13 = r11.A05
            java.util.List r0 = r13.A08
            boolean r1 = r0.contains(r1)
            X.0Aw r10 = r11.A04
            java.util.List r0 = r10.A08
            boolean r0 = r0.contains(r3)
            long r17 = r11.A08()
            if (r1 == 0) goto L_0x009c
            if (r0 == 0) goto L_0x00ad
            long r8 = X.AnonymousClass0Y1.A01(r13, r2, r4)
            long r15 = X.AnonymousClass0Y1.A00(r10, r2, r4)
            long r8 = r8 - r17
            int r2 = r10.A04
            int r0 = -r2
            long r0 = (long) r0
            int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x005d
            long r0 = (long) r2
            long r8 = r8 + r0
        L_0x005d:
            long r2 = -r15
            long r2 = r2 - r17
            int r0 = r13.A04
            long r0 = (long) r0
            long r2 = r2 - r0
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 < 0) goto L_0x0069
            long r2 = r2 - r0
        L_0x0069:
            X.0Aq r11 = r11.A03
            if (r23 != 0) goto L_0x0099
            float r11 = r11.A02
        L_0x006f:
            r13 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 <= 0) goto L_0x007e
            float r4 = (float) r2
            float r4 = r4 / r11
            float r3 = (float) r8
            float r2 = r14 - r11
            float r3 = r3 / r2
            float r4 = r4 + r3
            long r4 = (long) r4
        L_0x007e:
            float r8 = (float) r4
            float r3 = r8 * r11
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            long r4 = (long) r3
            float r14 = r14 - r11
            float r8 = r8 * r14
            float r8 = r8 + r2
            long r2 = (long) r8
            long r4 = r4 + r17
            long r4 = r4 + r2
            long r0 = r0 + r4
        L_0x008d:
            int r2 = r10.A04
            long r2 = (long) r2
            long r0 = r0 - r2
        L_0x0091:
            long r6 = java.lang.Math.max(r6, r0)
            int r12 = r12 + 1
            goto L_0x000d
        L_0x0099:
            float r11 = r11.A06
            goto L_0x006f
        L_0x009c:
            if (r0 == 0) goto L_0x00be
            int r0 = r10.A04
            long r0 = (long) r0
            long r8 = X.AnonymousClass0Y1.A00(r10, r2, r0)
            int r0 = r10.A04
            int r0 = -r0
            long r3 = (long) r0
            long r3 = r3 + r17
            long r1 = -r8
            goto L_0x00b9
        L_0x00ad:
            int r0 = r13.A04
            long r0 = (long) r0
            long r1 = X.AnonymousClass0Y1.A01(r13, r2, r0)
            int r0 = r13.A04
            long r3 = (long) r0
            long r3 = r3 + r17
        L_0x00b9:
            long r0 = java.lang.Math.max(r1, r3)
            goto L_0x0091
        L_0x00be:
            int r0 = r13.A04
            long r0 = (long) r0
            long r2 = r11.A08()
            long r0 = r0 + r2
            goto L_0x008d
        L_0x00c7:
            if (r23 != 0) goto L_0x00d0
            boolean r0 = r11 instanceof X.C02550Av
            if (r0 != 0) goto L_0x002b
        L_0x00cd:
            r0 = 0
            goto L_0x0091
        L_0x00d0:
            boolean r0 = r11 instanceof X.C02570Ay
            if (r0 != 0) goto L_0x00d5
            goto L_0x00cd
        L_0x00d5:
            X.0Ay r0 = r1.A0d
            goto L_0x002d
        L_0x00d9:
            int r0 = (int) r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0B2.A00(X.0As, X.0B2, int):int");
    }

    private void A01(C02500Aq r3, Integer num, Integer num2, int i, int i2) {
        AnonymousClass0B1 r1 = this.A07;
        r1.A05 = num;
        r1.A06 = num2;
        r1.A00 = i;
        r1.A04 = i2;
        this.A03.BPg(r3, r1);
        r3.A09(r1.A03);
        r3.A08(r1.A02);
        r3.A0h = r1.A07;
        int i3 = r1.A01;
        r3.A07 = i3;
        boolean z = false;
        if (i3 > 0) {
            z = true;
        }
        r3.A0h = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0227, code lost:
        if (r1.A0C == 0) goto L_0x0217;
     */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0008 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C02520As r26, X.AnonymousClass0B2 r27) {
        /*
            r0 = r26
            java.util.ArrayList r0 = r0.A00
            java.util.Iterator r18 = r0.iterator()
        L_0x0008:
            boolean r0 = r18.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x022a
            java.lang.Object r1 = r18.next()
            X.0Aq r1 = (X.C02500Aq) r1
            java.lang.Integer[] r0 = r1.A0q
            r12 = r0[r2]
            r7 = 1
            r11 = r0[r7]
            int r3 = r1.A0N
            r0 = 8
            if (r3 == r0) goto L_0x00f4
            float r13 = r1.A04
            r17 = 1065353216(0x3f800000, float:1.0)
            r15 = 2
            int r0 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x0031
            java.lang.Integer r0 = X.C023109s.A0C
            if (r12 != r0) goto L_0x0031
            r1.A0D = r15
        L_0x0031:
            float r10 = r1.A03
            int r0 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x003d
            java.lang.Integer r0 = X.C023109s.A0C
            if (r11 != r0) goto L_0x003d
            r1.A0C = r15
        L_0x003d:
            float r3 = r1.A01
            r0 = 0
            r14 = 3
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0053
            java.lang.Integer r3 = X.C023109s.A0C
            if (r12 != r3) goto L_0x020d
            java.lang.Integer r0 = X.C023109s.A01
            if (r11 == r0) goto L_0x0051
            java.lang.Integer r0 = X.C023109s.A00
            if (r11 != r0) goto L_0x020d
        L_0x0051:
            r1.A0D = r14
        L_0x0053:
            java.lang.Integer r9 = X.C023109s.A0C
            if (r12 != r9) goto L_0x0069
            int r0 = r1.A0D
            if (r0 != r7) goto L_0x0069
            X.0Az r0 = r1.A0W
            X.0Az r0 = r0.A03
            if (r0 == 0) goto L_0x0067
            X.0Az r0 = r1.A0X
            X.0Az r0 = r0.A03
            if (r0 != 0) goto L_0x0069
        L_0x0067:
            java.lang.Integer r12 = X.C023109s.A01
        L_0x0069:
            if (r11 != r9) goto L_0x007d
            int r0 = r1.A0C
            if (r0 != r7) goto L_0x007d
            X.0Az r0 = r1.A0Y
            X.0Az r0 = r0.A03
            if (r0 == 0) goto L_0x007b
            X.0Az r0 = r1.A0S
            X.0Az r0 = r0.A03
            if (r0 != 0) goto L_0x007d
        L_0x007b:
            java.lang.Integer r11 = X.C023109s.A01
        L_0x007d:
            X.0Av r4 = r1.A0c
            r4.A07 = r12
            int r8 = r1.A0D
            r4.A01 = r8
            X.0Ay r0 = r1.A0d
            r25 = r0
            r0.A07 = r11
            int r6 = r1.A0C
            r0.A01 = r6
            java.lang.Integer r5 = X.C023109s.A0G
            r19 = r27
            if (r12 == r5) goto L_0x009d
            java.lang.Integer r3 = X.C023109s.A00
            if (r12 == r3) goto L_0x009d
            java.lang.Integer r0 = X.C023109s.A01
            if (r12 != r0) goto L_0x00f8
        L_0x009d:
            if (r11 == r5) goto L_0x00a7
            java.lang.Integer r3 = X.C023109s.A00
            if (r11 == r3) goto L_0x00a7
            java.lang.Integer r0 = X.C023109s.A01
            if (r11 != r0) goto L_0x00f8
        L_0x00a7:
            int r2 = r1.A03()
            if (r12 != r5) goto L_0x00bd
            int r2 = r26.A03()
            X.0Az r0 = r1.A0W
            int r0 = r0.A01
            int r2 = r2 - r0
            X.0Az r0 = r1.A0X
            int r0 = r0.A01
            int r2 = r2 - r0
            java.lang.Integer r12 = X.C023109s.A00
        L_0x00bd:
            int r6 = r1.A02()
            if (r11 != r5) goto L_0x00d3
            int r6 = r26.A02()
            X.0Az r0 = r1.A0Y
            int r0 = r0.A01
            int r6 = r6 - r0
            X.0Az r0 = r1.A0S
            int r0 = r0.A01
            int r6 = r6 - r0
            java.lang.Integer r11 = X.C023109s.A00
        L_0x00d3:
            r20 = r1
            r21 = r12
            r22 = r11
            r23 = r2
            r24 = r6
            r19.A01(r20, r21, r22, r23, r24)
            X.0Ax r2 = r4.A06
            int r0 = r1.A03()
            r2.A01(r0)
            r0 = r25
            X.0Ax r2 = r0.A06
            int r0 = r1.A02()
            r2.A01(r0)
        L_0x00f4:
            r1.A0i = r7
            goto L_0x0008
        L_0x00f8:
            r16 = 1056964608(0x3f000000, float:0.5)
            if (r12 != r9) goto L_0x0136
            if (r11 == r0) goto L_0x0100
            if (r11 != r3) goto L_0x0136
        L_0x0100:
            if (r8 != r14) goto L_0x011f
            if (r11 != r0) goto L_0x0111
            r22 = r0
            r23 = 0
            r24 = 0
            r20 = r1
            r21 = r0
            r19.A01(r20, r21, r22, r23, r24)
        L_0x0111:
            int r6 = r1.A02()
            float r2 = (float) r6
            float r0 = r1.A01
            float r2 = r2 * r0
            float r2 = r2 + r16
            int r2 = (int) r2
        L_0x011c:
            r12 = r3
        L_0x011d:
            r11 = r3
            goto L_0x00d3
        L_0x011f:
            if (r8 != r7) goto L_0x01d4
            r23 = 0
            r24 = 0
            r20 = r1
            r21 = r0
            r22 = r11
            r19.A01(r20, r21, r22, r23, r24)
            X.0Ax r2 = r4.A06
            int r0 = r1.A03()
            goto L_0x01b5
        L_0x0136:
            if (r11 != r9) goto L_0x0160
            if (r12 == r0) goto L_0x013c
            if (r12 != r3) goto L_0x0160
        L_0x013c:
            if (r6 != r14) goto L_0x01a1
            if (r12 != r0) goto L_0x014d
            r22 = r0
            r23 = 0
            r24 = 0
            r20 = r1
            r21 = r0
            r19.A01(r20, r21, r22, r23, r24)
        L_0x014d:
            int r2 = r1.A03()
            float r6 = r1.A01
            int r5 = r1.A08
            r0 = -1
            if (r5 != r0) goto L_0x015a
            float r6 = r17 / r6
        L_0x015a:
            float r10 = (float) r2
        L_0x015b:
            float r10 = r10 * r6
            float r10 = r10 + r16
            int r6 = (int) r10
            goto L_0x011c
        L_0x0160:
            if (r12 != r9) goto L_0x0008
            if (r11 != r9) goto L_0x0008
            if (r8 == r7) goto L_0x018b
            if (r6 == r7) goto L_0x018b
            if (r6 != r15) goto L_0x0008
            if (r8 != r15) goto L_0x0008
            r0 = r26
            java.lang.Integer[] r5 = r0.A0q
            r0 = r5[r2]
            if (r0 == r3) goto L_0x0176
            if (r0 != r3) goto L_0x0008
        L_0x0176:
            r0 = r5[r7]
            if (r0 == r3) goto L_0x017c
            if (r0 != r3) goto L_0x0008
        L_0x017c:
            int r0 = r26.A03()
            float r0 = (float) r0
            float r13 = r13 * r0
            float r13 = r13 + r16
            int r2 = (int) r13
            int r0 = r26.A02()
            float r6 = (float) r0
            goto L_0x015b
        L_0x018b:
            r22 = r0
            r23 = 0
            r24 = 0
            r20 = r1
            r21 = r0
            r19.A01(r20, r21, r22, r23, r24)
            X.0Ax r2 = r4.A06
            int r0 = r1.A03()
            r2.A00 = r0
            goto L_0x01ad
        L_0x01a1:
            if (r6 != r7) goto L_0x01b9
            r6 = 0
            r7 = 0
            r2 = r19
            r3 = r1
            r4 = r12
            r5 = r0
            r2.A01(r3, r4, r5, r6, r7)
        L_0x01ad:
            r0 = r25
            X.0Ax r2 = r0.A06
            int r0 = r1.A02()
        L_0x01b5:
            r2.A00 = r0
            goto L_0x0008
        L_0x01b9:
            if (r6 != r15) goto L_0x01f0
            r0 = r26
            java.lang.Integer[] r0 = r0.A0q
            r0 = r0[r7]
            if (r0 == r3) goto L_0x01c5
            if (r0 != r5) goto L_0x0008
        L_0x01c5:
            int r2 = r1.A03()
            int r0 = r26.A02()
            float r0 = (float) r0
            float r10 = r10 * r0
            float r10 = r10 + r16
            int r6 = (int) r10
            goto L_0x011d
        L_0x01d4:
            if (r8 != r15) goto L_0x01fb
            r0 = r26
            java.lang.Integer[] r0 = r0.A0q
            r0 = r0[r2]
            if (r0 == r3) goto L_0x01e0
            if (r0 != r5) goto L_0x0008
        L_0x01e0:
            int r0 = r26.A03()
            float r0 = (float) r0
            float r13 = r13 * r0
            float r13 = r13 + r16
            int r2 = (int) r13
            int r6 = r1.A02()
            r12 = r3
            goto L_0x00d3
        L_0x01f0:
            X.0Az[] r5 = r1.A0n
            r3 = r5[r15]
            X.0Az r3 = r3.A03
            if (r3 == 0) goto L_0x0209
            r3 = r5[r14]
            goto L_0x0205
        L_0x01fb:
            X.0Az[] r5 = r1.A0n
            r3 = r5[r2]
            X.0Az r3 = r3.A03
            if (r3 == 0) goto L_0x0209
            r3 = r5[r7]
        L_0x0205:
            X.0Az r3 = r3.A03
            if (r3 != 0) goto L_0x0008
        L_0x0209:
            r12 = r0
            r6 = 0
            goto L_0x00d3
        L_0x020d:
            if (r11 != r3) goto L_0x021b
            java.lang.Integer r0 = X.C023109s.A01
            if (r12 == r0) goto L_0x0217
            java.lang.Integer r0 = X.C023109s.A00
            if (r12 != r0) goto L_0x021b
        L_0x0217:
            r1.A0C = r14
            goto L_0x0053
        L_0x021b:
            if (r12 != r3) goto L_0x0053
            if (r11 != r3) goto L_0x0053
            int r0 = r1.A0D
            if (r0 != 0) goto L_0x0225
            r1.A0D = r14
        L_0x0225:
            int r0 = r1.A0C
            if (r0 != 0) goto L_0x0053
            goto L_0x0217
        L_0x022a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0B2.A02(X.0As, X.0B2):void");
    }

    private void A03(C02560Aw r19, C02560Aw r20, AnonymousClass0Y1 r21, ArrayList arrayList, int i) {
        C02560Aw r8;
        int i2;
        AnonymousClass0Y1 r9 = r21;
        C02540Au r2 = r19.A02;
        if (r2.A00 == null) {
            C02520As r1 = this.A01;
            if (r2 != r1.A0c && r2 != r1.A0d) {
                ArrayList arrayList2 = arrayList;
                if (r21 == null) {
                    r9 = new AnonymousClass0Y1(r2);
                    arrayList2.add(r9);
                }
                r2.A00 = r9;
                r9.A02.add(r2);
                r9.A01 = r2;
                C02560Aw r5 = r2.A05;
                Iterator it = r5.A07.iterator();
                while (true) {
                    r8 = r20;
                    i2 = i;
                    if (!it.hasNext()) {
                        break;
                    }
                    C02530At r7 = (C02530At) it.next();
                    if (r7 instanceof C02560Aw) {
                        A03((C02560Aw) r7, r8, r9, arrayList2, i2);
                    }
                }
                C02560Aw r4 = r2.A04;
                for (C02530At r72 : r4.A07) {
                    if (r72 instanceof C02560Aw) {
                        A03((C02560Aw) r72, r8, r9, arrayList2, i2);
                    }
                }
                if (i2 == 1 && (r2 instanceof C02570Ay)) {
                    for (C02530At r13 : ((C02570Ay) r2).A01.A07) {
                        if (r13 instanceof C02560Aw) {
                            A03((C02560Aw) r13, r8, r9, arrayList2, 1);
                        }
                    }
                }
                for (C02560Aw A032 : r5.A08) {
                    A03(A032, r8, r9, arrayList2, i2);
                }
                for (C02560Aw A033 : r4.A08) {
                    A03(A033, r8, r9, arrayList2, i2);
                }
                if (i2 == 1 && (r2 instanceof C02570Ay)) {
                    for (C02560Aw A034 : ((C02570Ay) r2).A01.A08) {
                        A03(A034, r8, r9, arrayList2, 1);
                    }
                }
            }
        }
    }

    private void A04(C02540Au r15, ArrayList arrayList, int i) {
        ArrayList arrayList2;
        int i2;
        C02560Aw r9;
        C02560Aw r3;
        C02560Aw r10 = r15.A05;
        Iterator it = r10.A07.iterator();
        while (true) {
            arrayList2 = arrayList;
            i2 = i;
            if (!it.hasNext()) {
                break;
            }
            C02530At r32 = (C02530At) it.next();
            if (r32 instanceof C02560Aw) {
                r3 = (C02560Aw) r32;
            } else if (r32 instanceof C02540Au) {
                r3 = ((C02540Au) r32).A05;
            }
            A03(r3, r15.A04, (AnonymousClass0Y1) null, arrayList2, i2);
        }
        for (C02530At r92 : r15.A04.A07) {
            if (r92 instanceof C02560Aw) {
                r9 = (C02560Aw) r92;
            } else if (r92 instanceof C02540Au) {
                r9 = ((C02540Au) r92).A04;
            }
            A03(r9, r10, (AnonymousClass0Y1) null, arrayList2, i2);
        }
        if (i2 == 1) {
            for (C02530At r33 : ((C02570Ay) r15).A01.A07) {
                if (r33 instanceof C02560Aw) {
                    A03((C02560Aw) r33, (C02560Aw) null, (AnonymousClass0Y1) null, arrayList2, 1);
                }
            }
        }
    }

    public void A05() {
        Object r0;
        ArrayList arrayList = this.A04;
        arrayList.clear();
        C02520As r3 = this.A02;
        C02550Av r1 = r3.A0c;
        r1.A0B();
        C02570Ay r02 = r3.A0d;
        r02.A0B();
        arrayList.add(r1);
        arrayList.add(r02);
        Iterator it = r3.A00.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C02500Aq r4 = (C02500Aq) it.next();
            if (r4 instanceof AnonymousClass0GG) {
                r0 = new AnonymousClass0GM(r4);
            } else {
                if (r4.A0H()) {
                    AnonymousClass0GO r12 = r4.A0a;
                    if (r12 == null) {
                        r12 = new AnonymousClass0GO(r4, 0);
                        r4.A0a = r12;
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(r12);
                } else {
                    arrayList.add(r4.A0c);
                }
                if (r4.A0I()) {
                    AnonymousClass0GO r13 = r4.A0b;
                    if (r13 == null) {
                        r13 = new AnonymousClass0GO(r4, 1);
                        r4.A0b = r13;
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(r13);
                } else {
                    arrayList.add(r4.A0d);
                }
                if (r4 instanceof AnonymousClass0GK) {
                    r0 = new AnonymousClass0GN(r4);
                }
            }
            arrayList.add(r0);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C02540Au) it2.next()).A0B();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C02540Au r14 = (C02540Au) it3.next();
            if (r14.A03 != r3) {
                r14.A09();
            }
        }
        ArrayList arrayList2 = this.A00;
        arrayList2.clear();
        AnonymousClass0Y1.A03 = 0;
        C02520As r15 = this.A01;
        A04(r15.A0c, arrayList2, 0);
        A04(r15.A0d, arrayList2, 1);
        this.A05 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007b, code lost:
        if (r7 == r0) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        if (r6 == r0) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009a, code lost:
        r5.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009d, code lost:
        r5.A01(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06() {
        /*
            r20 = this;
            r11 = r20
            X.0As r0 = r11.A01
            java.util.ArrayList r0 = r0.A00
            java.util.Iterator r10 = r0.iterator()
        L_0x000a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r12 = r10.next()
            X.0Aq r12 = (X.C02500Aq) r12
            boolean r0 = r12.A0i
            if (r0 != 0) goto L_0x000a
            java.lang.Integer[] r0 = r12.A0q
            r9 = 0
            r7 = r0[r9]
            r3 = 1
            r6 = r0[r3]
            int r2 = r12.A0D
            int r1 = r12.A0C
            java.lang.Integer r13 = X.C023109s.A01
            if (r7 == r13) goto L_0x0030
            java.lang.Integer r0 = X.C023109s.A0C
            if (r7 != r0) goto L_0x00a1
            if (r2 != r3) goto L_0x00a1
        L_0x0030:
            r8 = 1
        L_0x0031:
            if (r6 == r13) goto L_0x0039
            java.lang.Integer r0 = X.C023109s.A0C
            if (r6 != r0) goto L_0x003a
            if (r1 != r3) goto L_0x003a
        L_0x0039:
            r9 = 1
        L_0x003a:
            X.0Av r0 = r12.A0c
            X.0Ax r5 = r0.A06
            boolean r1 = r5.A0B
            X.0Ay r2 = r12.A0d
            X.0Ax r4 = r2.A06
            boolean r0 = r4.A0B
            if (r1 == 0) goto L_0x0066
            if (r0 == 0) goto L_0x007e
            java.lang.Integer r13 = X.C023109s.A00
            int r15 = r5.A05
            int r0 = r4.A05
            r14 = r13
            r16 = r0
            r11.A01(r12, r13, r14, r15, r16)
        L_0x0056:
            r12.A0i = r3
        L_0x0058:
            boolean r0 = r12.A0i
            if (r0 == 0) goto L_0x000a
            X.0Ax r1 = r2.A00
            if (r1 == 0) goto L_0x000a
            int r0 = r12.A07
            r1.A01(r0)
            goto L_0x000a
        L_0x0066:
            if (r0 == 0) goto L_0x0058
            if (r8 == 0) goto L_0x0058
            int r15 = r5.A05
            java.lang.Integer r14 = X.C023109s.A00
            int r0 = r4.A05
            r16 = r0
            r11.A01(r12, r13, r14, r15, r16)
            java.lang.Integer r0 = X.C023109s.A0C
            int r1 = r12.A03()
            if (r7 != r0) goto L_0x009d
            goto L_0x009a
        L_0x007e:
            if (r9 == 0) goto L_0x0058
            java.lang.Integer r16 = X.C023109s.A00
            int r1 = r5.A05
            int r0 = r4.A05
            r14 = r11
            r15 = r12
            r17 = r13
            r18 = r1
            r19 = r0
            r14.A01(r15, r16, r17, r18, r19)
            java.lang.Integer r0 = X.C023109s.A0C
            r5 = r4
            int r1 = r12.A02()
            if (r6 != r0) goto L_0x009d
        L_0x009a:
            r5.A00 = r1
            goto L_0x0058
        L_0x009d:
            r5.A01(r1)
            goto L_0x0056
        L_0x00a1:
            r8 = 0
            goto L_0x0031
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0B2.A06():void");
    }

    public AnonymousClass0B2(C02520As r2) {
        this.A01 = r2;
        this.A02 = r2;
    }
}
