package X;

/* renamed from: X.0UZ  reason: invalid class name */
public class AnonymousClass0UZ {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public int A05;
    public int A06 = 0;
    public int A07 = 0;
    public int A08 = 0;
    public int A09 = 0;
    public int A0A = 0;
    public int A0B = 0;
    public AnonymousClass0Az A0C;
    public AnonymousClass0Az A0D;
    public AnonymousClass0Az A0E;
    public AnonymousClass0Az A0F;
    public C02500Aq A0G = null;
    public final /* synthetic */ AnonymousClass0GI A0H;

    public AnonymousClass0UZ(AnonymousClass0Az r2, AnonymousClass0Az r3, AnonymousClass0Az r4, AnonymousClass0Az r5, AnonymousClass0GI r6, int i, int i2) {
        this.A0H = r6;
        this.A05 = i;
        this.A0D = r2;
        this.A0F = r3;
        this.A0E = r4;
        this.A0C = r5;
        this.A07 = r6.A07;
        this.A09 = r6.A06;
        this.A08 = r6.A08;
        this.A06 = r6.A03;
        this.A03 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r18 != 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0140, code lost:
        if (r7 != 1) goto L_0x0142;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(int r18, boolean r19, boolean r20) {
        /*
            r17 = this;
            r6 = r17
            int r5 = r6.A01
            r4 = 0
            r7 = 0
        L_0x0006:
            if (r7 >= r5) goto L_0x0031
            int r3 = r6.A0A
            int r2 = r3 + r7
            X.0GI r1 = r6.A0H
            int r0 = r1.A06
            if (r2 >= r0) goto L_0x0031
            X.0Aq[] r0 = r1.A0O
            int r3 = r3 + r7
            r0 = r0[r3]
            if (r0 == 0) goto L_0x002e
            r3 = 0
            java.util.ArrayList r2 = r0.A0g
            int r1 = r2.size()
        L_0x0020:
            if (r3 >= r1) goto L_0x002e
            java.lang.Object r0 = r2.get(r3)
            X.0Az r0 = (X.AnonymousClass0Az) r0
            r0.A02()
            int r3 = r3 + 1
            goto L_0x0020
        L_0x002e:
            int r7 = r7 + 1
            goto L_0x0006
        L_0x0031:
            if (r5 == 0) goto L_0x0270
            X.0Aq r10 = r6.A0G
            if (r10 == 0) goto L_0x0270
            if (r20 == 0) goto L_0x003d
            r16 = 1
            if (r18 == 0) goto L_0x003f
        L_0x003d:
            r16 = 0
        L_0x003f:
            r9 = -1
            r3 = 0
            r8 = -1
            r15 = -1
        L_0x0043:
            if (r3 >= r5) goto L_0x0063
            r0 = r3
            if (r19 == 0) goto L_0x004b
            int r0 = r5 + -1
            int r0 = r0 - r3
        L_0x004b:
            int r2 = r6.A0A
            int r2 = r2 + r0
            X.0GI r1 = r6.A0H
            int r0 = r1.A06
            if (r2 >= r0) goto L_0x0063
            X.0Aq[] r0 = r1.A0O
            r0 = r0[r2]
            int r0 = r0.A0N
            if (r0 != 0) goto L_0x0060
            if (r8 != r9) goto L_0x005f
            r8 = r3
        L_0x005f:
            r15 = r3
        L_0x0060:
            int r3 = r3 + 1
            goto L_0x0043
        L_0x0063:
            r7 = 0
            int r0 = r6.A05
            if (r0 != 0) goto L_0x0174
            X.0GI r1 = r6.A0H
            int r0 = r1.A0I
            r10.A0L = r0
            int r3 = r6.A09
            if (r18 <= 0) goto L_0x0075
            int r0 = r1.A0H
            int r3 = r3 + r0
        L_0x0075:
            X.0Az r2 = r10.A0Y
            X.0Az r0 = r6.A0F
            r2.A04(r0, r3)
            if (r20 == 0) goto L_0x0087
            X.0Az r3 = r10.A0S
            X.0Az r2 = r6.A0C
            int r0 = r6.A06
            r3.A04(r2, r0)
        L_0x0087:
            if (r18 <= 0) goto L_0x0094
            X.0Az r0 = r6.A0F
            X.0Aq r0 = r0.A05
            X.0Az r2 = r0.A0S
            X.0Az r0 = r10.A0Y
            r2.A04(r0, r4)
        L_0x0094:
            int r2 = r1.A0G
            r0 = 3
            if (r2 != r0) goto L_0x0171
            boolean r0 = r10.A0h
            if (r0 != 0) goto L_0x0171
            r11 = 0
        L_0x009e:
            if (r11 >= r5) goto L_0x0171
            r0 = r11
            if (r19 == 0) goto L_0x00a6
            int r0 = r5 + -1
            int r0 = r0 - r11
        L_0x00a6:
            int r2 = r6.A0A
            int r2 = r2 + r0
            int r0 = r1.A06
            if (r2 >= r0) goto L_0x0171
            X.0Aq[] r0 = r1.A0O
            r3 = r0[r2]
            boolean r0 = r3.A0h
            int r11 = r11 + 1
            if (r0 == 0) goto L_0x009e
        L_0x00b7:
            r11 = 0
        L_0x00b8:
            if (r11 >= r5) goto L_0x0270
            r14 = r11
            if (r19 == 0) goto L_0x00c0
            int r14 = r5 + -1
            int r14 = r14 - r11
        L_0x00c0:
            int r2 = r6.A0A
            int r2 = r2 + r14
            int r0 = r1.A06
            if (r2 >= r0) goto L_0x0270
            X.0Aq[] r0 = r1.A0O
            r2 = r0[r2]
            if (r11 != 0) goto L_0x00d6
            X.0Az r13 = r2.A0W
            X.0Az r12 = r6.A0D
            int r0 = r6.A07
            r2.A0D(r13, r12, r0)
        L_0x00d6:
            if (r14 != 0) goto L_0x00eb
            int r13 = r1.A0B
            float r12 = r1.A02
            int r0 = r6.A0A
            if (r0 != 0) goto L_0x0166
            int r0 = r1.A07
            if (r0 == r9) goto L_0x0166
            r13 = r0
            float r12 = r1.A00
        L_0x00e7:
            r2.A0A = r13
            r2.A02 = r12
        L_0x00eb:
            int r0 = r5 + -1
            if (r11 != r0) goto L_0x00f8
            X.0Az r13 = r2.A0X
            X.0Az r12 = r6.A0E
            int r0 = r6.A08
            r2.A0D(r13, r12, r0)
        L_0x00f8:
            if (r7 == 0) goto L_0x0120
            X.0Az r12 = r2.A0W
            X.0Az r13 = r7.A0X
            int r0 = r1.A0A
            r12.A04(r13, r0)
            if (r11 != r8) goto L_0x010d
            int r13 = r6.A07
            X.0Az r0 = r12.A03
            if (r0 == 0) goto L_0x010d
            r12.A00 = r13
        L_0x010d:
            X.0Az r0 = r7.A0X
            r0.A04(r12, r4)
            int r0 = r15 + 1
            if (r11 != r0) goto L_0x0120
            X.0Az r12 = r7.A0X
            int r7 = r6.A08
            X.0Az r0 = r12.A03
            if (r0 == 0) goto L_0x0120
            r12.A00 = r7
        L_0x0120:
            if (r2 == r10) goto L_0x0138
            int r7 = r1.A0G
            r0 = 3
            if (r7 != r0) goto L_0x013d
            boolean r0 = r3.A0h
            if (r0 == 0) goto L_0x0142
            if (r2 == r3) goto L_0x0142
            boolean r0 = r2.A0h
            if (r0 == 0) goto L_0x0142
            X.0Az r7 = r2.A0R
            X.0Az r0 = r3.A0R
        L_0x0135:
            r7.A04(r0, r4)
        L_0x0138:
            int r11 = r11 + 1
            r7 = r2
            goto L_0x00b8
        L_0x013d:
            if (r7 == 0) goto L_0x0161
            r0 = 1
            if (r7 == r0) goto L_0x015c
        L_0x0142:
            X.0Az r12 = r2.A0Y
            if (r16 == 0) goto L_0x0157
            X.0Az r7 = r6.A0F
            int r0 = r6.A09
            r12.A04(r7, r0)
            X.0Az r12 = r2.A0S
            X.0Az r7 = r6.A0C
            int r0 = r6.A06
            r12.A04(r7, r0)
            goto L_0x0138
        L_0x0157:
            X.0Az r0 = r10.A0Y
            r12.A04(r0, r4)
        L_0x015c:
            X.0Az r7 = r2.A0S
            X.0Az r0 = r10.A0S
            goto L_0x0135
        L_0x0161:
            X.0Az r7 = r2.A0Y
            X.0Az r0 = r10.A0Y
            goto L_0x0135
        L_0x0166:
            if (r20 == 0) goto L_0x00e7
            int r0 = r1.A0C
            if (r0 == r9) goto L_0x00e7
            r13 = r0
            float r12 = r1.A03
            goto L_0x00e7
        L_0x0171:
            r3 = r10
            goto L_0x00b7
        L_0x0174:
            X.0GI r3 = r6.A0H
            int r0 = r3.A0B
            r10.A0A = r0
            int r2 = r6.A07
            if (r18 <= 0) goto L_0x0181
            int r0 = r3.A0A
            int r2 = r2 + r0
        L_0x0181:
            if (r19 == 0) goto L_0x0252
            X.0Az r1 = r10.A0X
            X.0Az r0 = r6.A0E
            r1.A04(r0, r2)
            if (r20 == 0) goto L_0x0195
            X.0Az r2 = r10.A0W
            X.0Az r1 = r6.A0D
            int r0 = r6.A08
            r2.A04(r1, r0)
        L_0x0195:
            if (r18 <= 0) goto L_0x01a2
            X.0Az r0 = r6.A0E
            X.0Aq r0 = r0.A05
            X.0Az r1 = r0.A0W
            X.0Az r0 = r10.A0X
        L_0x019f:
            r1.A04(r0, r4)
        L_0x01a2:
            r11 = 0
        L_0x01a3:
            if (r11 >= r5) goto L_0x0270
            int r2 = r6.A0A
            int r1 = r2 + r11
            int r0 = r3.A06
            if (r1 >= r0) goto L_0x0270
            X.0Aq[] r0 = r3.A0O
            int r2 = r2 + r11
            r2 = r0[r2]
            if (r11 != 0) goto L_0x01d0
            X.0Az r12 = r2.A0Y
            X.0Az r1 = r6.A0F
            int r0 = r6.A09
            r2.A0D(r12, r1, r0)
            int r12 = r3.A0I
            float r1 = r3.A05
            int r0 = r6.A0A
            if (r0 != 0) goto L_0x0247
            int r0 = r3.A08
            if (r0 == r9) goto L_0x0247
            r12 = r0
            float r1 = r3.A01
        L_0x01cc:
            r2.A0L = r12
            r2.A06 = r1
        L_0x01d0:
            int r0 = r5 + -1
            if (r11 != r0) goto L_0x01dd
            X.0Az r12 = r2.A0S
            X.0Az r1 = r6.A0C
            int r0 = r6.A06
            r2.A0D(r12, r1, r0)
        L_0x01dd:
            if (r7 == 0) goto L_0x0205
            X.0Az r12 = r2.A0Y
            X.0Az r1 = r7.A0S
            int r0 = r3.A0H
            r12.A04(r1, r0)
            if (r11 != r8) goto L_0x01f2
            int r1 = r6.A09
            X.0Az r0 = r12.A03
            if (r0 == 0) goto L_0x01f2
            r12.A00 = r1
        L_0x01f2:
            X.0Az r0 = r7.A0S
            r0.A04(r12, r4)
            int r0 = r15 + 1
            if (r11 != r0) goto L_0x0205
            X.0Az r7 = r7.A0S
            int r1 = r6.A06
            X.0Az r0 = r7.A03
            if (r0 == 0) goto L_0x0205
            r7.A00 = r1
        L_0x0205:
            if (r2 == r10) goto L_0x0213
            r7 = 2
            int r1 = r3.A09
            if (r19 == 0) goto L_0x0217
            if (r1 == 0) goto L_0x023a
            r0 = 1
            if (r1 == r0) goto L_0x023f
            if (r1 == r7) goto L_0x0233
        L_0x0213:
            int r11 = r11 + 1
            r7 = r2
            goto L_0x01a3
        L_0x0217:
            if (r1 == 0) goto L_0x023f
            r0 = 1
            if (r1 == r0) goto L_0x023a
            if (r1 != r7) goto L_0x0213
            if (r16 == 0) goto L_0x0233
            X.0Az r7 = r2.A0W
            X.0Az r1 = r6.A0D
            int r0 = r6.A07
            r7.A04(r1, r0)
            X.0Az r7 = r2.A0X
            X.0Az r1 = r6.A0E
            int r0 = r6.A08
            r7.A04(r1, r0)
            goto L_0x0213
        L_0x0233:
            X.0Az r1 = r2.A0W
            X.0Az r0 = r10.A0W
            r1.A04(r0, r4)
        L_0x023a:
            X.0Az r1 = r2.A0X
            X.0Az r0 = r10.A0X
            goto L_0x0243
        L_0x023f:
            X.0Az r1 = r2.A0W
            X.0Az r0 = r10.A0W
        L_0x0243:
            r1.A04(r0, r4)
            goto L_0x0213
        L_0x0247:
            if (r20 == 0) goto L_0x01cc
            int r0 = r3.A0D
            if (r0 == r9) goto L_0x01cc
            r12 = r0
            float r1 = r3.A04
            goto L_0x01cc
        L_0x0252:
            X.0Az r1 = r10.A0W
            X.0Az r0 = r6.A0D
            r1.A04(r0, r2)
            if (r20 == 0) goto L_0x0264
            X.0Az r2 = r10.A0X
            X.0Az r1 = r6.A0E
            int r0 = r6.A08
            r2.A04(r1, r0)
        L_0x0264:
            if (r18 <= 0) goto L_0x01a2
            X.0Az r0 = r6.A0D
            X.0Aq r0 = r0.A05
            X.0Az r1 = r0.A0X
            X.0Az r0 = r10.A0W
            goto L_0x019f
        L_0x0270:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0UZ.A00(int, boolean, boolean):void");
    }

    public void A01(C02500Aq r8) {
        int i = this.A05;
        int i2 = 0;
        AnonymousClass0GI r4 = this.A0H;
        int i3 = this.A03;
        if (i == 0) {
            int A012 = AnonymousClass0GI.A01(r8, r4, i3);
            if (r8.A0q[0] == C023109s.A0C) {
                this.A04++;
                A012 = 0;
            }
            int i4 = r4.A0A;
            if (r8.A0N != 8) {
                i2 = i4;
            }
            this.A0B += A012 + i2;
            int A002 = AnonymousClass0GI.A00(r8, r4, this.A03);
            if (this.A0G == null || this.A00 < A002) {
                this.A0G = r8;
                this.A00 = A002;
                this.A02 = A002;
            }
        } else {
            int A013 = AnonymousClass0GI.A01(r8, r4, i3);
            int A003 = AnonymousClass0GI.A00(r8, r4, this.A03);
            if (r8.A0q[1] == C023109s.A0C) {
                this.A04++;
                A003 = 0;
            }
            int i5 = r4.A0H;
            if (r8.A0N != 8) {
                i2 = i5;
            }
            this.A02 += A003 + i2;
            if (this.A0G == null || this.A00 < A013) {
                this.A0G = r8;
                this.A00 = A013;
                this.A0B = A013;
            }
        }
        this.A01++;
    }
}
