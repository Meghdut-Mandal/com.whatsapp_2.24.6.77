package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0GO  reason: invalid class name */
public class AnonymousClass0GO extends C02540Au {
    public int A00;
    public ArrayList A01;

    public void A0A() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A01;
            if (i < arrayList.size()) {
                ((C02540Au) arrayList.get(i)).A0A();
                i++;
            } else {
                return;
            }
        }
    }

    public void A0B() {
        this.A00 = null;
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((C02540Au) it.next()).A0B();
        }
    }

    public long A08() {
        ArrayList arrayList = this.A01;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C02540Au r2 = (C02540Au) arrayList.get(i);
            j = j + ((long) r2.A05.A04) + r2.A08() + ((long) r2.A04.A04);
        }
        return j;
    }

    public void A09() {
        C02560Aw A012;
        int A002;
        AnonymousClass0Az r0;
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C02540Au) it.next()).A09();
        }
        int size = arrayList.size();
        if (size >= 1) {
            C02500Aq A04 = A04(arrayList, 0);
            C02500Aq A042 = A04(arrayList, size - 1);
            if (this.A02 != 0) {
                AnonymousClass0Az r02 = A04.A0Y;
                AnonymousClass0Az r6 = A042.A0S;
                C02560Aw A013 = C02540Au.A01(r02, 1);
                int A003 = r02.A00();
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    }
                    C02500Aq A043 = A04(arrayList, i);
                    if (A043.A0N != 8) {
                        A003 = A043.A0Y.A00();
                        break;
                    }
                    i++;
                }
                if (A013 != null) {
                    C02540Au.A02(this.A05, A013, A003);
                }
                A012 = C02540Au.A01(r6, 1);
                A002 = r6.A00();
                int size2 = arrayList.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    }
                    C02500Aq A044 = A04(arrayList, size2);
                    if (A044.A0N != 8) {
                        r0 = A044.A0S;
                        break;
                    }
                }
            } else {
                AnonymousClass0Az r03 = A04.A0W;
                AnonymousClass0Az r62 = A042.A0X;
                C02560Aw A014 = C02540Au.A01(r03, 0);
                int A004 = r03.A00();
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    C02500Aq A045 = A04(arrayList, i2);
                    if (A045.A0N != 8) {
                        A004 = A045.A0W.A00();
                        break;
                    }
                    i2++;
                }
                if (A014 != null) {
                    C02540Au.A02(this.A05, A014, A004);
                }
                A012 = C02540Au.A01(r62, 0);
                A002 = r62.A00();
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 < 0) {
                        break;
                    }
                    C02500Aq A046 = A04(arrayList, size3);
                    if (A046.A0N != 8) {
                        r0 = A046.A0X;
                        break;
                    }
                }
            }
            A002 = r0.A00();
            if (A012 != null) {
                C02540Au.A02(this.A04, A012, -A002);
            }
            this.A05.A06 = this;
            this.A04.A06 = this;
        }
    }

    public boolean A0C() {
        ArrayList arrayList = this.A01;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((C02540Au) arrayList.get(i)).A0C()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0240, code lost:
        if (r13 != false) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x02bf, code lost:
        if (r13 != false) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0349, code lost:
        if (r13 != false) goto L_0x031a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BwU(X.C02530At r24) {
        /*
            r23 = this;
            r14 = r23
            X.0Aw r3 = r14.A05
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0358
            X.0Aw r2 = r14.A04
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x0358
            X.0Aq r0 = r14.A03
            X.0Aq r1 = r0.A0Z
            if (r1 == 0) goto L_0x003b
            boolean r0 = r1 instanceof X.C02520As
            if (r0 == 0) goto L_0x003b
            X.0As r1 = (X.C02520As) r1
            boolean r13 = r1.A09
        L_0x001c:
            int r0 = r2.A05
            r19 = r0
            int r12 = r3.A05
            int r11 = r0 - r12
            java.util.ArrayList r10 = r14.A01
            int r9 = r10.size()
            r8 = 0
        L_0x002b:
            r7 = -1
            r15 = 8
            if (r8 >= r9) goto L_0x003d
            X.0Aq r0 = A04(r10, r8)
            int r0 = r0.A0N
            if (r0 != r15) goto L_0x003e
            int r8 = r8 + 1
            goto L_0x002b
        L_0x003b:
            r13 = 0
            goto L_0x001c
        L_0x003d:
            r8 = -1
        L_0x003e:
            int r6 = r9 + -1
            r1 = r6
        L_0x0041:
            if (r1 < 0) goto L_0x004f
            X.0Aq r0 = A04(r10, r1)
            int r0 = r0.A0N
            if (r0 != r15) goto L_0x004e
            int r1 = r1 + -1
            goto L_0x0041
        L_0x004e:
            r7 = r1
        L_0x004f:
            r17 = 0
        L_0x0051:
            r2 = 0
            r5 = 0
            r4 = 0
            r3 = 0
            r18 = 0
        L_0x0057:
            if (r2 >= r9) goto L_0x00d0
            java.lang.Object r1 = r10.get(r2)
            X.0Au r1 = (X.C02540Au) r1
            X.0Aq r0 = r1.A03
            int r0 = r0.A0N
            if (r0 == r15) goto L_0x00b2
            int r3 = r3 + 1
            if (r2 <= 0) goto L_0x0070
            if (r2 < r8) goto L_0x0070
            X.0Aw r0 = r1.A05
            int r0 = r0.A04
            int r5 = r5 + r0
        L_0x0070:
            X.0Ax r0 = r1.A06
            r20 = r0
            int r0 = r0.A05
            r16 = r0
            java.lang.Integer r0 = r1.A07
            r15 = r0
            java.lang.Integer r0 = X.C023109s.A0C
            if (r15 == r0) goto L_0x0096
            int r15 = r14.A02
            if (r15 != 0) goto L_0x008e
            X.0Aq r0 = r1.A03
            X.0Av r0 = r0.A0c
        L_0x0087:
            X.0Ax r0 = r0.A06
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x00a6
            return
        L_0x008e:
            r0 = 1
            if (r15 != r0) goto L_0x00a6
            X.0Aq r0 = r1.A03
            X.0Ay r0 = r0.A0d
            goto L_0x0087
        L_0x0096:
            int r0 = r1.A01
            r15 = r0
            r0 = 1
            if (r15 != r0) goto L_0x00b7
            if (r17 != 0) goto L_0x00b7
            r0 = r20
            int r0 = r0.A00
            r16 = r0
            int r4 = r4 + 1
        L_0x00a6:
            int r5 = r5 + r16
        L_0x00a8:
            if (r2 >= r6) goto L_0x00b2
            if (r2 >= r7) goto L_0x00b2
            X.0Aw r0 = r1.A04
            int r0 = r0.A04
            int r0 = -r0
            int r5 = r5 + r0
        L_0x00b2:
            int r2 = r2 + 1
            r15 = 8
            goto L_0x0057
        L_0x00b7:
            r0 = r20
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x00a6
            int r4 = r4 + 1
            X.0Aq r0 = r1.A03
            float[] r0 = r0.A0j
            r15 = r0
            int r0 = r14.A02
            r15 = r15[r0]
            r0 = 0
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00a8
            float r18 = r18 + r15
            goto L_0x00a8
        L_0x00d0:
            if (r5 < r11) goto L_0x00e2
            if (r4 == 0) goto L_0x00e2
            int r17 = r17 + 1
            r1 = 2
            r3 = 0
            r5 = 0
            r4 = 0
            r18 = 0
            r0 = r17
            if (r0 >= r1) goto L_0x00e2
            goto L_0x0051
        L_0x00e2:
            if (r13 == 0) goto L_0x00e6
            r12 = r19
        L_0x00e6:
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r5 <= r11) goto L_0x00f5
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = r5 - r11
            float r0 = (float) r0
            float r0 = r0 / r1
            float r0 = r0 + r2
            int r0 = (int) r0
            if (r13 == 0) goto L_0x0180
            int r12 = r12 + r0
        L_0x00f5:
            if (r4 <= 0) goto L_0x01b4
            int r0 = r11 - r5
            float r0 = (float) r0
            r17 = r0
            float r0 = (float) r4
            float r0 = r17 / r0
            float r0 = r0 + r2
            int r0 = (int) r0
            r22 = r0
            r2 = 0
            r16 = 0
        L_0x0106:
            if (r2 >= r9) goto L_0x0183
            java.lang.Object r15 = r10.get(r2)
            X.0Au r15 = (X.C02540Au) r15
            X.0Aq r0 = r15.A03
            int r1 = r0.A0N
            r0 = 8
            if (r1 == r0) goto L_0x0172
            java.lang.Integer r1 = r15.A07
            java.lang.Integer r0 = X.C023109s.A0C
            if (r1 != r0) goto L_0x0172
            X.0Ax r0 = r15.A06
            r21 = r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x0172
            r0 = 0
            int r0 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x017d
            X.0Aq r0 = r15.A03
            float[] r1 = r0.A0j
            int r0 = r14.A02
            r1 = r1[r0]
            float r1 = r1 * r17
            float r1 = r1 / r18
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            r20 = r0
        L_0x013b:
            int r1 = r14.A02
            X.0Aq r0 = r15.A03
            if (r1 != 0) goto L_0x0178
            int r1 = r0.A0F
            int r0 = r0.A0H
        L_0x0145:
            r19 = r0
            int r0 = r15.A01
            r15 = r0
            r0 = 1
            if (r15 != r0) goto L_0x0175
            r0 = r21
            int r0 = r0.A00
            r15 = r20
            int r15 = java.lang.Math.min(r15, r0)
        L_0x0157:
            r0 = r19
            int r15 = java.lang.Math.max(r0, r15)
            if (r1 <= 0) goto L_0x0163
            int r15 = java.lang.Math.min(r1, r15)
        L_0x0163:
            r0 = r20
            if (r15 == r0) goto L_0x016b
            int r16 = r16 + 1
            r20 = r15
        L_0x016b:
            r1 = r21
            r0 = r20
            r1.A01(r0)
        L_0x0172:
            int r2 = r2 + 1
            goto L_0x0106
        L_0x0175:
            r15 = r20
            goto L_0x0157
        L_0x0178:
            int r1 = r0.A0E
            int r0 = r0.A0G
            goto L_0x0145
        L_0x017d:
            r20 = r22
            goto L_0x013b
        L_0x0180:
            int r12 = r12 - r0
            goto L_0x00f5
        L_0x0183:
            if (r16 <= 0) goto L_0x01b6
            int r4 = r4 - r16
            r1 = 0
            r5 = 0
        L_0x0189:
            if (r1 >= r9) goto L_0x01b6
            java.lang.Object r2 = r10.get(r1)
            X.0Au r2 = (X.C02540Au) r2
            X.0Aq r0 = r2.A03
            int r15 = r0.A0N
            r0 = 8
            if (r15 == r0) goto L_0x01b1
            if (r1 <= 0) goto L_0x01a2
            if (r1 < r8) goto L_0x01a2
            X.0Aw r0 = r2.A05
            int r0 = r0.A04
            int r5 = r5 + r0
        L_0x01a2:
            X.0Ax r0 = r2.A06
            int r0 = r0.A05
            int r5 = r5 + r0
            if (r1 >= r6) goto L_0x01b1
            if (r1 >= r7) goto L_0x01b1
            X.0Aw r0 = r2.A04
            int r0 = r0.A04
            int r0 = -r0
            int r5 = r5 + r0
        L_0x01b1:
            int r1 = r1 + 1
            goto L_0x0189
        L_0x01b4:
            r1 = 2
            goto L_0x01c0
        L_0x01b6:
            int r0 = r14.A00
            r1 = 2
            if (r0 != r1) goto L_0x01c0
            if (r16 != 0) goto L_0x01c0
            r0 = 0
            r14.A00 = r0
        L_0x01c0:
            if (r5 <= r11) goto L_0x01c4
            r14.A00 = r1
        L_0x01c4:
            if (r3 <= 0) goto L_0x01cc
            if (r4 != 0) goto L_0x01cc
            if (r8 != r7) goto L_0x01cc
            r14.A00 = r1
        L_0x01cc:
            int r1 = r14.A00
            r0 = 1
            if (r1 != r0) goto L_0x0250
            if (r3 <= r0) goto L_0x0249
            int r11 = r11 - r5
            int r3 = r3 - r0
        L_0x01d5:
            int r11 = r11 / r3
        L_0x01d6:
            if (r4 <= 0) goto L_0x01d9
            r11 = 0
        L_0x01d9:
            r2 = 0
        L_0x01da:
            if (r2 >= r9) goto L_0x0358
            r0 = r2
            if (r13 == 0) goto L_0x01e3
            int r0 = r2 + 1
            int r0 = r9 - r0
        L_0x01e3:
            java.lang.Object r3 = r10.get(r0)
            X.0Au r3 = (X.C02540Au) r3
            X.0Aq r0 = r3.A03
            int r1 = r0.A0N
            r0 = 8
            if (r1 != r0) goto L_0x01fe
            X.0Aw r0 = r3.A05
            r0.A01(r12)
            X.0Aw r0 = r3.A04
            r0.A01(r12)
        L_0x01fb:
            int r2 = r2 + 1
            goto L_0x01da
        L_0x01fe:
            if (r2 <= 0) goto L_0x0240
            if (r13 == 0) goto L_0x023e
            int r12 = r12 - r11
        L_0x0203:
            if (r2 < r8) goto L_0x0240
            X.0Aw r0 = r3.A05
            int r0 = r0.A04
            if (r13 == 0) goto L_0x0243
            int r12 = r12 - r0
        L_0x020c:
            X.0Aw r0 = r3.A04
        L_0x020e:
            r0.A01(r12)
            X.0Ax r5 = r3.A06
            int r4 = r5.A05
            java.lang.Integer r1 = r3.A07
            java.lang.Integer r0 = X.C023109s.A0C
            if (r1 != r0) goto L_0x0222
            int r1 = r3.A01
            r0 = 1
            if (r1 != r0) goto L_0x0222
            int r4 = r5.A00
        L_0x0222:
            if (r13 == 0) goto L_0x023a
            int r12 = r12 - r4
            X.0Aw r0 = r3.A05
        L_0x0227:
            r0.A01(r12)
            r0 = 1
            r3.A08 = r0
            if (r2 >= r6) goto L_0x01fb
            if (r2 >= r7) goto L_0x01fb
            X.0Aw r0 = r3.A04
            int r0 = r0.A04
            int r0 = -r0
            if (r13 == 0) goto L_0x0247
            int r12 = r12 - r0
            goto L_0x01fb
        L_0x023a:
            int r12 = r12 + r4
            X.0Aw r0 = r3.A04
            goto L_0x0227
        L_0x023e:
            int r12 = r12 + r11
            goto L_0x0203
        L_0x0240:
            if (r13 == 0) goto L_0x0244
            goto L_0x020c
        L_0x0243:
            int r12 = r12 + r0
        L_0x0244:
            X.0Aw r0 = r3.A05
            goto L_0x020e
        L_0x0247:
            int r12 = r12 + r0
            goto L_0x01fb
        L_0x0249:
            if (r3 != r0) goto L_0x024e
            int r11 = r11 - r5
            r3 = 2
            goto L_0x01d5
        L_0x024e:
            r11 = 0
            goto L_0x01d6
        L_0x0250:
            if (r1 != 0) goto L_0x02ca
            int r11 = r11 - r5
            int r0 = r3 + 1
            int r11 = r11 / r0
            if (r4 <= 0) goto L_0x0259
            r11 = 0
        L_0x0259:
            r2 = 0
        L_0x025a:
            if (r2 >= r9) goto L_0x0358
            r0 = r2
            if (r13 == 0) goto L_0x0263
            int r0 = r2 + 1
            int r0 = r9 - r0
        L_0x0263:
            java.lang.Object r3 = r10.get(r0)
            X.0Au r3 = (X.C02540Au) r3
            X.0Aq r0 = r3.A03
            int r1 = r0.A0N
            r0 = 8
            if (r1 != r0) goto L_0x027e
            X.0Aw r0 = r3.A05
            r0.A01(r12)
            X.0Aw r0 = r3.A04
            r0.A01(r12)
        L_0x027b:
            int r2 = r2 + 1
            goto L_0x025a
        L_0x027e:
            if (r13 == 0) goto L_0x02c6
            int r12 = r12 - r11
        L_0x0281:
            if (r2 <= 0) goto L_0x02bf
            if (r2 < r8) goto L_0x02bf
            X.0Aw r0 = r3.A05
            int r0 = r0.A04
            if (r13 == 0) goto L_0x02c2
            int r12 = r12 - r0
        L_0x028c:
            X.0Aw r0 = r3.A04
        L_0x028e:
            r0.A01(r12)
            X.0Ax r5 = r3.A06
            int r4 = r5.A05
            java.lang.Integer r1 = r3.A07
            java.lang.Integer r0 = X.C023109s.A0C
            if (r1 != r0) goto L_0x02a6
            int r1 = r3.A01
            r0 = 1
            if (r1 != r0) goto L_0x02a6
            int r0 = r5.A00
            int r4 = java.lang.Math.min(r4, r0)
        L_0x02a6:
            if (r13 == 0) goto L_0x02bb
            int r12 = r12 - r4
            X.0Aw r0 = r3.A05
        L_0x02ab:
            r0.A01(r12)
            if (r2 >= r6) goto L_0x027b
            if (r2 >= r7) goto L_0x027b
            X.0Aw r0 = r3.A04
            int r0 = r0.A04
            int r0 = -r0
            if (r13 == 0) goto L_0x02c8
            int r12 = r12 - r0
            goto L_0x027b
        L_0x02bb:
            int r12 = r12 + r4
            X.0Aw r0 = r3.A04
            goto L_0x02ab
        L_0x02bf:
            if (r13 == 0) goto L_0x02c3
            goto L_0x028c
        L_0x02c2:
            int r12 = r12 + r0
        L_0x02c3:
            X.0Aw r0 = r3.A05
            goto L_0x028e
        L_0x02c6:
            int r12 = r12 + r11
            goto L_0x0281
        L_0x02c8:
            int r12 = r12 + r0
            goto L_0x027b
        L_0x02ca:
            r0 = 2
            if (r1 != r0) goto L_0x0358
            int r1 = r14.A02
            X.0Aq r0 = r14.A03
            if (r1 != 0) goto L_0x0354
            float r2 = r0.A02
        L_0x02d5:
            if (r13 == 0) goto L_0x02db
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = r0 - r2
        L_0x02db:
            int r11 = r11 - r5
            float r1 = (float) r11
            float r1 = r1 * r2
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            if (r0 < 0) goto L_0x02e6
            if (r4 <= 0) goto L_0x02e7
        L_0x02e6:
            r0 = 0
        L_0x02e7:
            if (r13 == 0) goto L_0x0352
            int r12 = r12 - r0
        L_0x02ea:
            r2 = 0
        L_0x02eb:
            if (r2 >= r9) goto L_0x0358
            r0 = r2
            if (r13 == 0) goto L_0x02f4
            int r0 = r2 + 1
            int r0 = r9 - r0
        L_0x02f4:
            java.lang.Object r5 = r10.get(r0)
            X.0Au r5 = (X.C02540Au) r5
            X.0Aq r0 = r5.A03
            int r1 = r0.A0N
            r0 = 8
            if (r1 != r0) goto L_0x030f
            X.0Aw r0 = r5.A05
            r0.A01(r12)
            X.0Aw r0 = r5.A04
            r0.A01(r12)
        L_0x030c:
            int r2 = r2 + 1
            goto L_0x02eb
        L_0x030f:
            if (r2 <= 0) goto L_0x0349
            if (r2 < r8) goto L_0x0349
            X.0Aw r0 = r5.A05
            int r0 = r0.A04
            if (r13 == 0) goto L_0x034c
            int r12 = r12 - r0
        L_0x031a:
            X.0Aw r0 = r5.A04
        L_0x031c:
            r0.A01(r12)
            X.0Ax r4 = r5.A06
            int r3 = r4.A05
            java.lang.Integer r1 = r5.A07
            java.lang.Integer r0 = X.C023109s.A0C
            if (r1 != r0) goto L_0x0330
            int r1 = r5.A01
            r0 = 1
            if (r1 != r0) goto L_0x0330
            int r3 = r4.A00
        L_0x0330:
            if (r13 == 0) goto L_0x0345
            int r12 = r12 - r3
            X.0Aw r0 = r5.A05
        L_0x0335:
            r0.A01(r12)
            if (r2 >= r6) goto L_0x030c
            if (r2 >= r7) goto L_0x030c
            X.0Aw r0 = r5.A04
            int r0 = r0.A04
            int r0 = -r0
            if (r13 == 0) goto L_0x0350
            int r12 = r12 - r0
            goto L_0x030c
        L_0x0345:
            int r12 = r12 + r3
            X.0Aw r0 = r5.A04
            goto L_0x0335
        L_0x0349:
            if (r13 == 0) goto L_0x034d
            goto L_0x031a
        L_0x034c:
            int r12 = r12 + r0
        L_0x034d:
            X.0Aw r0 = r5.A05
            goto L_0x031c
        L_0x0350:
            int r12 = r12 + r0
            goto L_0x030c
        L_0x0352:
            int r12 = r12 + r0
            goto L_0x02ea
        L_0x0354:
            float r2 = r0.A06
            goto L_0x02d5
        L_0x0358:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0GO.BwU(X.0At):void");
    }

    public AnonymousClass0GO(C02500Aq r7, int i) {
        super(r7);
        AnonymousClass0Az r2;
        C02500Aq r0;
        C02500Aq r1;
        Object obj;
        AnonymousClass0Az r22;
        int i2;
        AnonymousClass0Az r23;
        ArrayList A0I = AnonymousClass001.A0I();
        this.A01 = A0I;
        this.A02 = i;
        C02500Aq r5 = this.A03;
        C02500Aq r3 = r5;
        if (i == 0) {
            r2 = r5.A0W;
        } else {
            r2 = r5.A0Y;
        }
        while (true) {
            AnonymousClass0Az r12 = r2.A03;
            if (r12 == null || r12.A03 != r2) {
                r0 = null;
            } else {
                r0 = r12.A05;
            }
            r1 = r5;
            r5 = r0;
            if (r0 == null) {
                break;
            }
            r3 = r0;
            if (i == 0) {
                r23 = r0.A0W;
            } else {
                r23 = r0.A0Y;
            }
        }
        this.A03 = r3;
        while (true) {
            if (i == 0) {
                obj = r1.A0c;
            } else {
                obj = r1.A0d;
            }
            A0I.add(obj);
            if (i == 0) {
                r22 = r1.A0X;
            } else {
                r22 = r1.A0S;
            }
            AnonymousClass0Az r13 = r22.A03;
            if (r13 == null || r13.A03 != r22) {
                Iterator it = A0I.iterator();
            } else {
                r1 = r13.A05;
            }
        }
        Iterator it2 = A0I.iterator();
        while (it2.hasNext()) {
            C02540Au r14 = (C02540Au) it2.next();
            int i3 = this.A02;
            if (i3 == 0) {
                r14.A03.A0a = this;
            } else if (i3 == 1) {
                r14.A03.A0b = this;
            }
        }
        int i4 = this.A02;
        if (i4 == 0 && ((C02520As) this.A03.A0Z).A09 && A0I.size() > 1) {
            this.A03 = A04(A0I, A0I.size() - 1);
        }
        C02500Aq r02 = this.A03;
        if (i4 == 0) {
            i2 = r02.A0A;
        } else {
            i2 = r02.A0L;
        }
        this.A00 = i2;
    }

    public static C02500Aq A04(AbstractList abstractList, int i) {
        return ((C02540Au) abstractList.get(i)).A03;
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ChainRun ");
        if (this.A02 == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        String A0q = AnonymousClass000.A0q(str, A0u);
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            A0q = AnonymousClass000.A0q("> ", AnonymousClass000.A0v(AnonymousClass000.A0l(it.next(), AnonymousClass000.A0q("<", AnonymousClass000.A0v(A0q)), AnonymousClass000.A0u())));
        }
        return A0q;
    }
}
