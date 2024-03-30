package X;

import java.util.ArrayList;

/* renamed from: X.0Aq  reason: invalid class name and case insensitive filesystem */
public class C02500Aq {
    public float A00 = 0.0f;
    public float A01;
    public float A02;
    public float A03 = 1.0f;
    public float A04 = 1.0f;
    public float A05 = 1.0f;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B = -1;
    public int A0C = 0;
    public int A0D = 0;
    public int A0E = 0;
    public int A0F = 0;
    public int A0G = 0;
    public int A0H = 0;
    public int A0I;
    public int A0J;
    public int A0K = -1;
    public int A0L;
    public int A0M = -1;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public AnonymousClass0Az A0R;
    public AnonymousClass0Az A0S;
    public AnonymousClass0Az A0T;
    public AnonymousClass0Az A0U;
    public AnonymousClass0Az A0V;
    public AnonymousClass0Az A0W;
    public AnonymousClass0Az A0X;
    public AnonymousClass0Az A0Y;
    public C02500Aq A0Z;
    public AnonymousClass0GO A0a;
    public AnonymousClass0GO A0b;
    public C02550Av A0c = new C02550Av(this);
    public C02570Ay A0d = new C02570Ay(this);
    public Object A0e;
    public String A0f;
    public ArrayList A0g;
    public boolean A0h = false;
    public boolean A0i = false;
    public float[] A0j;
    public int[] A0k = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public int[] A0l = new int[2];
    public int[] A0m = {0, 0, 0, 0};
    public AnonymousClass0Az[] A0n;
    public C02500Aq[] A0o;
    public C02500Aq[] A0p;
    public Integer[] A0q;
    public boolean[] A0r = {true, true};
    public boolean[] A0s;

    public int A02() {
        if (this.A0N == 8) {
            return 0;
        }
        return this.A09;
    }

    public int A03() {
        if (this.A0N == 8) {
            return 0;
        }
        return this.A0O;
    }

    public int A04() {
        C02500Aq r1 = this.A0Z;
        if (r1 == null || !(r1 instanceof C02520As)) {
            return this.A0P;
        }
        return ((C02520As) r1).A02 + this.A0P;
    }

    public int A05() {
        C02500Aq r1 = this.A0Z;
        if (r1 == null || !(r1 instanceof C02520As)) {
            return this.A0Q;
        }
        return ((C02520As) r1).A03 + this.A0Q;
    }

    public void A07() {
        this.A0W.A02();
        this.A0Y.A02();
        this.A0X.A02();
        this.A0S.A02();
        this.A0R.A02();
        this.A0U.A02();
        this.A0V.A02();
        this.A0T.A02();
        this.A0Z = null;
        this.A00 = 0.0f;
        this.A0O = 0;
        this.A09 = 0;
        this.A01 = 0.0f;
        this.A08 = -1;
        this.A0P = 0;
        this.A0Q = 0;
        this.A07 = 0;
        this.A0J = 0;
        this.A0I = 0;
        this.A02 = 0.5f;
        this.A06 = 0.5f;
        Integer[] numArr = this.A0q;
        Integer num = C023109s.A00;
        numArr[0] = num;
        numArr[1] = num;
        this.A0e = null;
        this.A0N = 0;
        this.A0A = 0;
        this.A0L = 0;
        float[] fArr = this.A0j;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.A0B = -1;
        this.A0M = -1;
        int[] iArr = this.A0k;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.A0D = 0;
        this.A0C = 0;
        this.A04 = 1.0f;
        this.A03 = 1.0f;
        this.A0F = Integer.MAX_VALUE;
        this.A0E = Integer.MAX_VALUE;
        this.A0H = 0;
        this.A0G = 0;
        this.A0K = -1;
        this.A05 = 1.0f;
        boolean[] zArr = this.A0r;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.A0s;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public void A08(int i) {
        this.A09 = i;
        int i2 = this.A0I;
        if (i < i2) {
            this.A09 = i2;
        }
    }

    public void A09(int i) {
        this.A0O = i;
        int i2 = this.A0J;
        if (i < i2) {
            this.A0O = i2;
        }
    }

    public void A0A(AnonymousClass0B7 r2) {
        this.A0W.A03();
        this.A0Y.A03();
        this.A0X.A03();
        this.A0S.A03();
        this.A0R.A03();
        this.A0T.A03();
        this.A0U.A03();
        this.A0V.A03();
    }

    public void A0B(AnonymousClass0B3 r2) {
        r2.A09(this.A0W);
        r2.A09(this.A0Y);
        r2.A09(this.A0X);
        r2.A09(this.A0S);
        if (this.A07 > 0) {
            r2.A09(this.A0R);
        }
    }

    public void A0C(AnonymousClass0B3 r8) {
        int i;
        int i2;
        int A002 = AnonymousClass0B3.A00(this.A0W);
        int A003 = AnonymousClass0B3.A00(this.A0Y);
        int A004 = AnonymousClass0B3.A00(this.A0X);
        int A005 = AnonymousClass0B3.A00(this.A0S);
        C02550Av r1 = this.A0c;
        C02560Aw r2 = r1.A05;
        if (r2.A0B) {
            C02560Aw r12 = r1.A04;
            if (r12.A0B) {
                A002 = r2.A05;
                A004 = r12.A05;
            }
        }
        C02570Ay r13 = this.A0d;
        C02560Aw r22 = r13.A05;
        if (r22.A0B) {
            C02560Aw r14 = r13.A04;
            if (r14.A0B) {
                A003 = r22.A05;
                A005 = r14.A05;
            }
        }
        int i3 = A005 - A003;
        if (A004 - A002 < 0 || i3 < 0 || A002 == Integer.MIN_VALUE || A002 == Integer.MAX_VALUE || A003 == Integer.MIN_VALUE || A003 == Integer.MAX_VALUE || A004 == Integer.MIN_VALUE || A004 == Integer.MAX_VALUE || A005 == Integer.MIN_VALUE || A005 == Integer.MAX_VALUE) {
            A005 = 0;
            A002 = 0;
            A003 = 0;
            A004 = 0;
        }
        int i4 = A004 - A002;
        int i5 = A005 - A003;
        this.A0P = A002;
        this.A0Q = A003;
        if (this.A0N == 8) {
            this.A0O = 0;
            this.A09 = 0;
            return;
        }
        Integer[] numArr = this.A0q;
        Integer num = numArr[0];
        Integer num2 = C023109s.A00;
        if (num == num2 && i4 < (i2 = this.A0O)) {
            i4 = i2;
        }
        if (numArr[1] == num2 && i5 < (i = this.A09)) {
            i5 = i;
        }
        this.A0O = i4;
        this.A09 = i5;
        int i6 = this.A0I;
        if (i5 < i6) {
            this.A09 = i6;
        }
        int i7 = this.A0J;
        if (i4 < i7) {
            this.A0O = i7;
        }
    }

    public void A0D(AnonymousClass0Az r4, AnonymousClass0Az r5, int i) {
        if (r4.A05 == this) {
            A0E(r5.A05, r4.A06, r5.A06, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0108, code lost:
        if (r13 == r6) goto L_0x010a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(X.C02500Aq r12, java.lang.Integer r13, java.lang.Integer r14, int r15) {
        /*
            r11 = this;
            java.lang.Integer r2 = X.C023109s.A0V
            r3 = 0
            if (r13 != r2) goto L_0x0093
            java.lang.Integer r10 = X.C023109s.A01
            if (r14 != r2) goto L_0x006b
            X.0Az r0 = r11.A06(r10)
            java.lang.Integer r9 = X.C023109s.A0G
            X.0Az r1 = r11.A06(r9)
            java.lang.Integer r8 = X.C023109s.A0C
            X.0Az r7 = r11.A06(r8)
            java.lang.Integer r6 = X.C023109s.A0R
            X.0Az r5 = r11.A06(r6)
            r4 = 1
            if (r0 == 0) goto L_0x005c
            X.0Az r0 = r0.A03
            if (r0 == 0) goto L_0x005c
        L_0x0026:
            r1 = 0
        L_0x0027:
            if (r7 == 0) goto L_0x004e
            X.0Az r0 = r7.A03
            if (r0 == 0) goto L_0x004e
        L_0x002d:
            r4 = 0
        L_0x002e:
            if (r1 == 0) goto L_0x003e
            if (r4 == 0) goto L_0x0043
            X.0Az r1 = r11.A06(r2)
            X.0Az r2 = r12.A06(r2)
        L_0x003a:
            r1.A04(r2, r3)
        L_0x003d:
            return
        L_0x003e:
            if (r4 == 0) goto L_0x003d
            java.lang.Integer r0 = X.C023109s.A0X
            goto L_0x0045
        L_0x0043:
            java.lang.Integer r0 = X.C023109s.A0W
        L_0x0045:
            X.0Az r1 = r11.A06(r0)
            X.0Az r2 = r12.A06(r0)
            goto L_0x003a
        L_0x004e:
            if (r5 == 0) goto L_0x0055
            X.0Az r0 = r5.A03
            if (r0 == 0) goto L_0x0055
            goto L_0x002d
        L_0x0055:
            r11.A0E(r12, r8, r8, r3)
            r11.A0E(r12, r6, r6, r3)
            goto L_0x002e
        L_0x005c:
            if (r1 == 0) goto L_0x0063
            X.0Az r0 = r1.A03
            if (r0 == 0) goto L_0x0063
            goto L_0x0026
        L_0x0063:
            r11.A0E(r12, r10, r10, r3)
            r11.A0E(r12, r9, r9, r3)
            r1 = 1
            goto L_0x0027
        L_0x006b:
            if (r14 == r10) goto L_0x0086
            java.lang.Integer r0 = X.C023109s.A0G
            if (r14 == r0) goto L_0x0086
            java.lang.Integer r1 = X.C023109s.A0C
            if (r14 == r1) goto L_0x0079
            java.lang.Integer r0 = X.C023109s.A0R
            if (r14 != r0) goto L_0x003d
        L_0x0079:
            r11.A0E(r12, r1, r14, r3)
            java.lang.Integer r0 = X.C023109s.A0R
            r11.A0E(r12, r0, r14, r3)
            X.0Az r1 = r11.A06(r2)
            goto L_0x0102
        L_0x0086:
            r11.A0E(r12, r10, r14, r3)
            java.lang.Integer r0 = X.C023109s.A0G
            r11.A0E(r12, r0, r14, r3)     // Catch:{ all -> 0x01a9 }
            X.0Az r1 = r11.A06(r2)
            goto L_0x0102
        L_0x0093:
            java.lang.Integer r5 = X.C023109s.A0W
            if (r13 != r5) goto L_0x00b8
            java.lang.Integer r1 = X.C023109s.A01
            if (r14 == r1) goto L_0x009f
            java.lang.Integer r0 = X.C023109s.A0G
            if (r14 != r0) goto L_0x00b8
        L_0x009f:
            X.0Az r1 = r11.A06(r1)
            X.0Az r2 = r12.A06(r14)
            java.lang.Integer r0 = X.C023109s.A0G
            X.0Az r0 = r11.A06(r0)
            r1.A04(r2, r3)
            r0.A04(r2, r3)
            X.0Az r1 = r11.A06(r5)
            goto L_0x003a
        L_0x00b8:
            java.lang.Integer r6 = X.C023109s.A0X
            if (r13 != r6) goto L_0x00e0
            java.lang.Integer r4 = X.C023109s.A0C
            if (r14 == r4) goto L_0x00c4
            java.lang.Integer r0 = X.C023109s.A0R
            if (r14 != r0) goto L_0x010a
        L_0x00c4:
            X.0Az r1 = r12.A06(r14)
            X.0Az r0 = r11.A06(r4)
            r0.A04(r1, r3)
            java.lang.Integer r0 = X.C023109s.A0R
            X.0Az r0 = r11.A06(r0)
            r0.A04(r1, r3)
            X.0Az r0 = r11.A06(r6)
            r0.A04(r1, r3)
            return
        L_0x00e0:
            if (r13 != r5) goto L_0x0108
            if (r14 != r5) goto L_0x012b
            java.lang.Integer r0 = X.C023109s.A01
            X.0Az r1 = r11.A06(r0)
            X.0Az r0 = r12.A06(r0)
            r1.A04(r0, r3)
            java.lang.Integer r0 = X.C023109s.A0G
            X.0Az r1 = r11.A06(r0)
            X.0Az r0 = r12.A06(r0)
            r1.A04(r0, r3)
            X.0Az r1 = r11.A06(r5)
        L_0x0102:
            X.0Az r2 = r12.A06(r14)
            goto L_0x003a
        L_0x0108:
            if (r13 != r6) goto L_0x012b
        L_0x010a:
            if (r14 != r6) goto L_0x012b
            java.lang.Integer r0 = X.C023109s.A0C
            X.0Az r1 = r11.A06(r0)
            X.0Az r0 = r12.A06(r0)
            r1.A04(r0, r3)
            java.lang.Integer r0 = X.C023109s.A0R
            X.0Az r1 = r11.A06(r0)
            X.0Az r0 = r12.A06(r0)
            r1.A04(r0, r3)
            X.0Az r1 = r11.A06(r6)
            goto L_0x0102
        L_0x012b:
            X.0Az r3 = r11.A06(r13)
            X.0Az r4 = r12.A06(r14)
            boolean r0 = r3.A07(r4)
            if (r0 == 0) goto L_0x003d
            java.lang.Integer r1 = X.C023109s.A0S
            java.lang.Integer r0 = X.C023109s.A0C
            if (r13 != r1) goto L_0x0158
            X.0Az r1 = r11.A06(r0)
            java.lang.Integer r0 = X.C023109s.A0R
            X.0Az r0 = r11.A06(r0)
            if (r1 == 0) goto L_0x014e
            r1.A02()
        L_0x014e:
            if (r0 == 0) goto L_0x0153
            r0.A02()
        L_0x0153:
            r15 = 0
        L_0x0154:
            r3.A04(r4, r15)
            return
        L_0x0158:
            if (r13 == r0) goto L_0x0188
            java.lang.Integer r0 = X.C023109s.A0R
            if (r13 == r0) goto L_0x0188
            java.lang.Integer r0 = X.C023109s.A01
            if (r13 == r0) goto L_0x0166
            java.lang.Integer r0 = X.C023109s.A0G
            if (r13 != r0) goto L_0x0154
        L_0x0166:
            X.0Az r1 = r11.A06(r2)
            X.0Az r0 = r1.A03
            if (r0 == r4) goto L_0x0171
            r1.A02()
        L_0x0171:
            X.0Az r0 = r11.A06(r13)
            X.0Az r2 = r0.A01()
            X.0Az r1 = r11.A06(r5)
        L_0x017d:
            X.0Az r0 = r1.A03
            if (r0 == 0) goto L_0x0154
            r2.A02()
            r1.A02()
            goto L_0x0154
        L_0x0188:
            X.0Az r0 = r11.A06(r1)
            if (r0 == 0) goto L_0x0191
            r0.A02()
        L_0x0191:
            X.0Az r1 = r11.A06(r2)
            X.0Az r0 = r1.A03
            if (r0 == r4) goto L_0x019c
            r1.A02()
        L_0x019c:
            X.0Az r0 = r11.A06(r13)
            X.0Az r2 = r0.A01()
            X.0Az r1 = r11.A06(r6)
            goto L_0x017d
        L_0x01a9:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02500Aq.A0E(X.0Aq, java.lang.Integer, java.lang.Integer, int):void");
    }

    public void A0F(boolean z, boolean z2) {
        int i;
        int i2;
        C02550Av r2 = this.A0c;
        boolean z3 = z & r2.A08;
        C02570Ay r1 = this.A0d;
        boolean z4 = z2 & r1.A08;
        int i3 = r2.A05.A05;
        int i4 = r1.A05.A05;
        int i5 = r2.A04.A05;
        int i6 = r1.A04.A05;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.A0P = i3;
        }
        if (z4) {
            this.A0Q = i4;
        }
        if (this.A0N == 8) {
            this.A0O = 0;
            this.A09 = 0;
            return;
        }
        if (z3) {
            if (this.A0q[0] == C023109s.A00 && i8 < (i2 = this.A0O)) {
                i8 = i2;
            }
            this.A0O = i8;
            int i10 = this.A0J;
            if (i8 < i10) {
                this.A0O = i10;
            }
        }
        if (z4) {
            if (this.A0q[1] == C023109s.A00 && i9 < (i = this.A09)) {
                i9 = i;
            }
            this.A09 = i9;
            int i11 = this.A0I;
            if (i9 < i11) {
                this.A09 = i11;
            }
        }
    }

    public boolean A0G() {
        if (this.A0N != 8) {
            return true;
        }
        return false;
    }

    public boolean A0H() {
        AnonymousClass0Az r1 = this.A0W;
        AnonymousClass0Az r0 = r1.A03;
        if (r0 != null && r0.A03 == r1) {
            return true;
        }
        AnonymousClass0Az r12 = this.A0X;
        AnonymousClass0Az r02 = r12.A03;
        if (r02 == null || r02.A03 != r12) {
            return false;
        }
        return true;
    }

    public boolean A0I() {
        AnonymousClass0Az r1 = this.A0Y;
        AnonymousClass0Az r0 = r1.A03;
        if (r0 != null && r0.A03 == r1) {
            return true;
        }
        AnonymousClass0Az r12 = this.A0S;
        AnonymousClass0Az r02 = r12.A03;
        if (r02 == null || r02.A03 != r12) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        String str2 = this.A0f;
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("id: ");
            sb2.append(str2);
            sb2.append(" ");
            str = sb2.toString();
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.A0P);
        sb.append(", ");
        sb.append(this.A0Q);
        sb.append(") - (");
        sb.append(this.A0O);
        sb.append(" x ");
        sb.append(this.A09);
        sb.append(")");
        return sb.toString();
    }

    public C02500Aq() {
        AnonymousClass0Az r2 = new AnonymousClass0Az(this, C023109s.A01);
        this.A0W = r2;
        AnonymousClass0Az r12 = new AnonymousClass0Az(this, C023109s.A0C);
        this.A0Y = r12;
        AnonymousClass0Az r10 = new AnonymousClass0Az(this, C023109s.A0G);
        this.A0X = r10;
        AnonymousClass0Az r9 = new AnonymousClass0Az(this, C023109s.A0R);
        this.A0S = r9;
        AnonymousClass0Az r8 = new AnonymousClass0Az(this, C023109s.A0S);
        this.A0R = r8;
        this.A0U = new AnonymousClass0Az(this, C023109s.A0W);
        this.A0V = new AnonymousClass0Az(this, C023109s.A0X);
        AnonymousClass0Az r5 = new AnonymousClass0Az(this, C023109s.A0V);
        this.A0T = r5;
        this.A0n = new AnonymousClass0Az[]{r2, r10, r12, r9, r8, r5};
        this.A0g = new ArrayList();
        this.A0s = new boolean[2];
        Integer num = C023109s.A00;
        this.A0q = new Integer[]{num, num};
        this.A0Z = null;
        this.A0O = 0;
        this.A09 = 0;
        this.A01 = 0.0f;
        this.A08 = -1;
        this.A0P = 0;
        this.A0Q = 0;
        this.A07 = 0;
        this.A02 = 0.5f;
        this.A06 = 0.5f;
        this.A0N = 0;
        this.A0f = null;
        this.A0A = 0;
        this.A0L = 0;
        this.A0j = new float[]{-1.0f, -1.0f};
        this.A0o = new C02500Aq[]{null, null};
        this.A0p = new C02500Aq[]{null, null};
        ArrayList arrayList = this.A0g;
        arrayList.add(this.A0W);
        arrayList.add(this.A0Y);
        arrayList.add(this.A0X);
        arrayList.add(this.A0S);
        arrayList.add(this.A0U);
        arrayList.add(this.A0V);
        arrayList.add(this.A0T);
        arrayList.add(this.A0R);
    }

    public AnonymousClass0Az A06(Integer num) {
        switch (num.intValue()) {
            case 1:
                return this.A0W;
            case 2:
                return this.A0Y;
            case 3:
                return this.A0X;
            case 4:
                return this.A0S;
            case 5:
                return this.A0R;
            case 6:
                return this.A0T;
            case 7:
                return this.A0U;
            default:
                return this.A0V;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01aa, code lost:
        if (r16 != false) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x01dd, code lost:
        if (r7 == 1) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0205, code lost:
        if (r9 == r10) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x021d, code lost:
        if (r8 != false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0273, code lost:
        r5 = r5.A0q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        if (r3 == 4) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f4, code lost:
        if (r21 != 0) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0105, code lost:
        if ((r9 instanceof X.AnonymousClass0GH) != false) goto L_0x0107;
     */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:250:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(X.AnonymousClass0B3 r36, X.AnonymousClass0B4 r37, X.AnonymousClass0B4 r38, X.AnonymousClass0Az r39, X.AnonymousClass0Az r40, java.lang.Integer r41, float r42, float r43, int r44, int r45, int r46, int r47, int r48, int r49, int r50, int r51, boolean r52, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57, boolean r58, boolean r59, boolean r60, boolean r61) {
        /*
            r35 = this;
            r3 = r48
            r5 = r45
            r21 = r50
            r7 = r51
            r2 = r36
            r33 = r39
            r0 = r33
            X.0B4 r1 = r2.A09(r0)
            r32 = r40
            r0 = r32
            X.0B4 r0 = r2.A09(r0)
            r4 = r33
            X.0Az r4 = r4.A03
            X.0B4 r15 = r2.A09(r4)
            r4 = r32
            X.0Az r4 = r4.A03
            X.0B4 r20 = r2.A09(r4)
            r4 = r33
            X.0Az r4 = r4.A03
            r17 = 0
            if (r4 == 0) goto L_0x0034
            r17 = 1
        L_0x0034:
            r4 = r32
            X.0Az r4 = r4.A03
            r16 = 0
            if (r4 == 0) goto L_0x003e
            r16 = 1
        L_0x003e:
            r11 = r35
            X.0Az r4 = r11.A0T
            X.0Az r4 = r4.A03
            r9 = 0
            if (r4 == 0) goto L_0x0048
            r9 = 1
        L_0x0048:
            r12 = r17
            if (r16 == 0) goto L_0x004e
            int r12 = r17 + 1
        L_0x004e:
            if (r9 == 0) goto L_0x0052
            int r12 = r12 + 1
        L_0x0052:
            if (r57 == 0) goto L_0x0055
            r3 = 3
        L_0x0055:
            int r4 = r41.intValue()
            r14 = 0
            if (r4 == r14) goto L_0x006a
            r6 = 1
            if (r4 == r6) goto L_0x006a
            r6 = 3
            if (r4 == r6) goto L_0x006a
            r8 = 4
            r6 = 2
            if (r4 != r6) goto L_0x006a
            r19 = 1
            if (r3 != r8) goto L_0x006c
        L_0x006a:
            r19 = 0
        L_0x006c:
            int r6 = r11.A0N
            r4 = 8
            if (r6 != r4) goto L_0x0075
            r5 = 0
            r19 = 0
        L_0x0075:
            if (r61 == 0) goto L_0x0082
            if (r17 != 0) goto L_0x0340
            if (r16 != 0) goto L_0x0082
            if (r9 != 0) goto L_0x0082
            r6 = r44
            r2.A0C(r1, r6)
        L_0x0082:
            r22 = r46
            if (r19 != 0) goto L_0x0286
            if (r56 == 0) goto L_0x0335
            r4 = 3
            r2.A0D(r0, r1, r14, r4)
            r5 = 8
            if (r46 <= 0) goto L_0x0095
            r4 = r22
            r2.A0E(r0, r1, r4, r5)
        L_0x0095:
            r4 = 2147483647(0x7fffffff, float:NaN)
            r6 = r47
            if (r6 >= r4) goto L_0x009f
            r2.A0F(r0, r1, r6, r5)
        L_0x009f:
            r13 = r37
            r34 = r38
            if (r61 == 0) goto L_0x0256
            if (r58 != 0) goto L_0x0256
            if (r17 != 0) goto L_0x00d8
            if (r16 == 0) goto L_0x0252
            int r3 = r32.A00()
            int r5 = -r3
            r4 = 8
            r3 = r20
            r2.A0D(r0, r3, r5, r4)
            if (r53 == 0) goto L_0x00d5
            r3 = 5
            r2.A0E(r1, r13, r14, r3)
        L_0x00bd:
            if (r55 == 0) goto L_0x00d5
            r1 = r32
            X.0Az r1 = r1.A03
            if (r1 == 0) goto L_0x00d6
            int r4 = r32.A00()
        L_0x00c9:
            r3 = r34
            r1 = r20
            if (r1 == r3) goto L_0x00d5
            r3 = 5
            r1 = r34
            r2.A0E(r1, r0, r4, r3)
        L_0x00d5:
            return
        L_0x00d6:
            r4 = 0
            goto L_0x00c9
        L_0x00d8:
            if (r16 == 0) goto L_0x0252
            r4 = r33
            X.0Az r4 = r4.A03
            X.0Aq r6 = r4.A05
            r4 = r32
            X.0Az r4 = r4.A03
            X.0Aq r9 = r4.A05
            X.0Aq r10 = r11.A0Z
            r12 = 6
            if (r19 == 0) goto L_0x0214
            if (r3 != 0) goto L_0x01ad
            if (r7 != 0) goto L_0x00f6
            r5 = 8
            r8 = 0
            r18 = 1
            if (r21 == 0) goto L_0x00fa
        L_0x00f6:
            r5 = 5
            r8 = 1
            r18 = 0
        L_0x00fa:
            boolean r4 = r6 instanceof X.AnonymousClass0GH
            if (r4 != 0) goto L_0x0107
            boolean r7 = r9 instanceof X.AnonymousClass0GH
            r4 = r5
            r31 = 6
            r17 = 0
            if (r7 == 0) goto L_0x010c
        L_0x0107:
            r17 = 0
            r4 = 4
            r31 = 6
        L_0x010c:
            r16 = 1
            if (r8 != 0) goto L_0x0229
            r8 = 8
        L_0x0112:
            int r7 = r11.A0N
            if (r7 == r8) goto L_0x00d5
            if (r17 == 0) goto L_0x013a
            if (r53 == 0) goto L_0x0129
            r7 = r20
            if (r15 == r7) goto L_0x0129
            if (r19 != 0) goto L_0x0129
            boolean r7 = r6 instanceof X.AnonymousClass0GH
            if (r7 != 0) goto L_0x0128
            boolean r7 = r9 instanceof X.AnonymousClass0GH
            if (r7 == 0) goto L_0x0129
        L_0x0128:
            r5 = 6
        L_0x0129:
            int r7 = r33.A00()
            r2.A0E(r1, r15, r7, r5)
            int r7 = r32.A00()
            int r11 = -r7
            r7 = r20
            r2.A0F(r0, r7, r11, r5)
        L_0x013a:
            if (r53 == 0) goto L_0x01aa
            if (r60 == 0) goto L_0x01aa
            boolean r7 = r6 instanceof X.AnonymousClass0GH
            if (r7 != 0) goto L_0x01aa
            boolean r7 = r9 instanceof X.AnonymousClass0GH
            if (r7 != 0) goto L_0x01aa
            r4 = 6
            r5 = 6
        L_0x0148:
            if (r18 == 0) goto L_0x016c
            if (r59 == 0) goto L_0x014e
            if (r54 == 0) goto L_0x016c
        L_0x014e:
            if (r6 == r10) goto L_0x0153
            if (r9 == r10) goto L_0x0153
            r12 = r4
        L_0x0153:
            boolean r7 = r6 instanceof X.AnonymousClass0GG
            if (r7 != 0) goto L_0x015b
            boolean r7 = r9 instanceof X.AnonymousClass0GG
            if (r7 == 0) goto L_0x015c
        L_0x015b:
            r12 = 5
        L_0x015c:
            boolean r7 = r6 instanceof X.AnonymousClass0GH
            if (r7 != 0) goto L_0x0164
            boolean r7 = r9 instanceof X.AnonymousClass0GH
            if (r7 == 0) goto L_0x0165
        L_0x0164:
            r12 = 5
        L_0x0165:
            if (r59 == 0) goto L_0x0168
            r12 = 5
        L_0x0168:
            int r4 = java.lang.Math.max(r12, r4)
        L_0x016c:
            if (r53 == 0) goto L_0x017b
            int r4 = java.lang.Math.min(r5, r4)
            if (r57 == 0) goto L_0x017b
            if (r59 != 0) goto L_0x017b
            if (r6 == r10) goto L_0x017a
            if (r9 != r10) goto L_0x017b
        L_0x017a:
            r4 = 4
        L_0x017b:
            int r5 = r33.A00()
            r2.A0D(r1, r15, r5, r4)
            int r5 = r32.A00()
            int r6 = -r5
            r5 = r20
            r2.A0D(r0, r5, r6, r4)
        L_0x018c:
            if (r53 == 0) goto L_0x00d5
            if (r13 != r15) goto L_0x01a8
            int r5 = r33.A00()
        L_0x0194:
            if (r15 == r13) goto L_0x019a
            r4 = 5
            r2.A0E(r1, r13, r5, r4)
        L_0x019a:
            if (r19 == 0) goto L_0x00bd
            if (r46 != 0) goto L_0x00bd
            if (r21 != 0) goto L_0x00bd
            r4 = 3
            if (r3 != r4) goto L_0x024c
            r2.A0E(r0, r1, r14, r8)
            goto L_0x00bd
        L_0x01a8:
            r5 = 0
            goto L_0x0194
        L_0x01aa:
            if (r16 == 0) goto L_0x018c
            goto L_0x0148
        L_0x01ad:
            r8 = 1
            if (r3 != r8) goto L_0x01b8
            r31 = 6
            r17 = 1
            r4 = 4
            r5 = 8
            goto L_0x021b
        L_0x01b8:
            r4 = 3
            if (r3 != r4) goto L_0x020e
            int r5 = r11.A0K
            r4 = -1
            if (r5 != r4) goto L_0x01d3
            if (r59 == 0) goto L_0x01d0
            r31 = 4
            if (r53 == 0) goto L_0x01c8
            r31 = 5
        L_0x01c8:
            r17 = 1
            r4 = 5
            r5 = 8
        L_0x01cd:
            r18 = 1
            goto L_0x021f
        L_0x01d0:
            r31 = 8
            goto L_0x01c8
        L_0x01d3:
            if (r57 == 0) goto L_0x01e6
            r4 = 2
            r7 = r49
            if (r7 == r4) goto L_0x01df
            r5 = 8
            r4 = 5
            if (r7 != r8) goto L_0x01e1
        L_0x01df:
            r5 = 5
            r4 = 4
        L_0x01e1:
            r31 = 6
            r17 = 1
            goto L_0x01cd
        L_0x01e6:
            if (r7 <= 0) goto L_0x01ef
            r31 = 6
            r17 = 1
            r4 = 5
        L_0x01ed:
            r5 = 5
            goto L_0x01cd
        L_0x01ef:
            if (r7 != 0) goto L_0x01fc
            if (r21 != 0) goto L_0x01fc
            if (r59 != 0) goto L_0x0202
            r31 = 6
            r17 = 1
            r4 = 8
            goto L_0x01ed
        L_0x01fc:
            r31 = 6
            r17 = 1
            r4 = 4
            goto L_0x01ed
        L_0x0202:
            if (r6 == r10) goto L_0x0207
            r5 = 4
            if (r9 != r10) goto L_0x0208
        L_0x0207:
            r5 = 5
        L_0x0208:
            r31 = 6
            r17 = 1
            r4 = 4
            goto L_0x01cd
        L_0x020e:
            r31 = 6
            r17 = 0
            r8 = 0
            goto L_0x0219
        L_0x0214:
            r31 = 6
            r17 = 1
            r8 = 1
        L_0x0219:
            r4 = 4
            r5 = 5
        L_0x021b:
            r18 = 0
            if (r8 == 0) goto L_0x010c
        L_0x021f:
            r7 = r20
            if (r15 != r7) goto L_0x010c
            if (r6 == r10) goto L_0x010c
            r17 = 0
            r16 = 0
        L_0x0229:
            int r8 = r11.A0N
            r7 = 8
            if (r8 != r7) goto L_0x0231
            r31 = 4
        L_0x0231:
            int r29 = r33.A00()
            int r30 = r32.A00()
            r8 = 8
            r28 = r42
            r25 = r15
            r26 = r20
            r27 = r0
            r23 = r2
            r24 = r1
            r23.A0G(r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x0112
        L_0x024c:
            r3 = 5
            r2.A0E(r0, r1, r14, r3)
            goto L_0x00bd
        L_0x0252:
            if (r53 == 0) goto L_0x00d5
            goto L_0x00bd
        L_0x0256:
            r4 = 8
            r3 = 2
            if (r12 >= r3) goto L_0x00d5
            if (r53 == 0) goto L_0x00d5
            if (r55 == 0) goto L_0x00d5
            r2.A0E(r1, r13, r14, r4)
            if (r52 != 0) goto L_0x0280
            X.0Az r1 = r11.A0R
            X.0Az r1 = r1.A03
            if (r1 == 0) goto L_0x0280
            X.0Aq r5 = r1.A05
            float r3 = r5.A01
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x00d5
            java.lang.Integer[] r5 = r5.A0q
            r1 = r5[r14]
            java.lang.Integer r3 = X.C023109s.A0C
            if (r1 != r3) goto L_0x00d5
            r1 = 1
            r1 = r5[r1]
            if (r1 != r3) goto L_0x00d5
        L_0x0280:
            r1 = r34
            r2.A0E(r1, r0, r14, r4)
            return
        L_0x0286:
            r6 = 2
            if (r12 == r6) goto L_0x02a3
            if (r57 != 0) goto L_0x02a3
            r6 = 1
            if (r3 == r6) goto L_0x0290
            if (r3 != 0) goto L_0x02a3
        L_0x0290:
            r6 = r21
            int r5 = java.lang.Math.max(r6, r5)
            if (r51 <= 0) goto L_0x029c
            int r5 = java.lang.Math.min(r7, r5)
        L_0x029c:
            r2.A0D(r0, r1, r5, r4)
        L_0x029f:
            r19 = 0
            goto L_0x009f
        L_0x02a3:
            r8 = -2
            r6 = r21
            if (r6 != r8) goto L_0x02aa
            r21 = r5
        L_0x02aa:
            if (r7 != r8) goto L_0x02ad
            r7 = r5
        L_0x02ad:
            if (r5 <= 0) goto L_0x02b3
            r6 = 1
            if (r3 == r6) goto L_0x02b3
            r5 = 0
        L_0x02b3:
            if (r21 <= 0) goto L_0x02be
            r6 = r21
            r2.A0E(r0, r1, r6, r4)
            int r5 = java.lang.Math.max(r5, r6)
        L_0x02be:
            if (r7 <= 0) goto L_0x02c9
            if (r53 == 0) goto L_0x02d7
            r6 = 1
            if (r3 != r6) goto L_0x02d7
        L_0x02c5:
            int r5 = java.lang.Math.min(r5, r7)
        L_0x02c9:
            r6 = 1
            if (r3 != r6) goto L_0x02db
            if (r53 != 0) goto L_0x0335
            r6 = 5
            r2.A0D(r0, r1, r5, r6)
            r2.A0F(r0, r1, r5, r4)
            goto L_0x009f
        L_0x02d7:
            r2.A0F(r0, r1, r7, r4)
            goto L_0x02c5
        L_0x02db:
            r4 = 2
            if (r3 != r4) goto L_0x033a
            r4 = r33
            java.lang.Integer r5 = r4.A06
            java.lang.Integer r4 = X.C023109s.A0C
            if (r5 == r4) goto L_0x0326
            java.lang.Integer r6 = X.C023109s.A0R
            if (r5 == r6) goto L_0x0326
            X.0Aq r5 = r11.A0Z
            java.lang.Integer r4 = X.C023109s.A01
            X.0Az r4 = r5.A06(r4)
            X.0B4 r6 = r2.A09(r4)
            X.0Aq r5 = r11.A0Z
            java.lang.Integer r4 = X.C023109s.A0G
        L_0x02fa:
            X.0Az r4 = r5.A06(r4)
            X.0B4 r10 = r2.A09(r4)
            X.0B6 r4 = r2.A06()
            X.0BB r8 = r4.A01
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.BmZ(r0, r5)
            X.0BB r8 = r4.A01
            r5 = 1065353216(0x3f800000, float:1.0)
            r8.BmZ(r1, r5)
            X.0BB r5 = r4.A01
            r9 = r43
            r5.BmZ(r10, r9)
            X.0BB r8 = r4.A01
            float r5 = -r9
            r8.BmZ(r6, r5)
            r2.A0B(r4)
            goto L_0x029f
        L_0x0326:
            X.0Aq r5 = r11.A0Z
            X.0Az r4 = r5.A06(r4)
            X.0B4 r6 = r2.A09(r4)
            X.0Aq r5 = r11.A0Z
            java.lang.Integer r4 = X.C023109s.A0R
            goto L_0x02fa
        L_0x0335:
            r2.A0D(r0, r1, r5, r4)
            goto L_0x009f
        L_0x033a:
            r19 = 1
            r55 = 1
            goto L_0x009f
        L_0x0340:
            if (r16 != 0) goto L_0x0082
            int r6 = r33.A00()
            r2.A0D(r1, r15, r6, r4)
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02500Aq.A00(X.0B3, X.0B4, X.0B4, X.0Az, X.0Az, java.lang.Integer, float, float, int, int, int, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0209, code lost:
        if (r59.A03 != null) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04bc, code lost:
        if (r11 == 0) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04ce, code lost:
        if (r5.A03 != null) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04e4, code lost:
        if (r5.A03 != null) goto L_0x04e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04ec, code lost:
        if (r0.A0G == 0) goto L_0x04ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04f9, code lost:
        if (r5.A03 != null) goto L_0x0502;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0500, code lost:
        if (r0.A0G > 0) goto L_0x0502;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0502, code lost:
        r0.A05 = 1.0f / r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:269:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J(X.AnonymousClass0B3 r82) {
        /*
            r81 = this;
            r0 = r81
            X.0Az r13 = r0.A0W
            r1 = r82
            X.0B4 r21 = r1.A09(r13)
            X.0Az r5 = r0.A0X
            X.0B4 r22 = r1.A09(r5)
            X.0Az r2 = r0.A0Y
            r58 = r2
            X.0B4 r24 = r1.A09(r2)
            X.0Az r2 = r0.A0S
            r59 = r2
            X.0B4 r23 = r1.A09(r2)
            X.0Az r2 = r0.A0R
            r26 = r2
            X.0B4 r25 = r1.A09(r2)
            X.0Av r2 = r0.A0c
            r28 = r2
            X.0Aw r4 = r2.A05
            boolean r2 = r4.A0B
            r3 = 0
            if (r2 == 0) goto L_0x00bd
            r2 = r28
            X.0Aw r9 = r2.A04
            boolean r2 = r9.A0B
            if (r2 == 0) goto L_0x00bd
            X.0Ay r6 = r0.A0d
            X.0Aw r8 = r6.A05
            boolean r2 = r8.A0B
            if (r2 == 0) goto L_0x00bd
            X.0Aw r7 = r6.A04
            boolean r2 = r7.A0B
            if (r2 == 0) goto L_0x00bd
            int r4 = r4.A05
            r2 = r21
            r1.A0C(r2, r4)
            int r4 = r9.A05
            r2 = r22
            r1.A0C(r2, r4)
            int r4 = r8.A05
            r2 = r24
            r1.A0C(r2, r4)
            int r4 = r7.A05
            r2 = r23
            r1.A0C(r2, r4)
            X.0Aw r2 = r6.A01
            int r4 = r2.A05
            r2 = r25
            r1.A0C(r2, r4)
            X.0Aq r7 = r0.A0Z
            if (r7 == 0) goto L_0x00bc
            java.lang.Integer[] r6 = r7.A0q
            r2 = r6[r3]
            java.lang.Integer r5 = X.C023109s.A01
            r4 = 0
            if (r2 != r5) goto L_0x007c
            r4 = 1
        L_0x007c:
            r2 = 1
            r2 = r6[r2]
            r6 = 0
            if (r2 != r5) goto L_0x0083
            r6 = 1
        L_0x0083:
            if (r4 == 0) goto L_0x009e
            boolean[] r2 = r0.A0r
            boolean r2 = r2[r3]
            if (r2 == 0) goto L_0x009e
            boolean r2 = r0.A0H()
            if (r2 != 0) goto L_0x009e
            X.0Az r2 = r7.A0X
            X.0B4 r5 = r1.A09(r2)
            r4 = 8
            r2 = r22
            r1.A0E(r5, r2, r3, r4)
        L_0x009e:
            if (r6 == 0) goto L_0x00bc
            boolean[] r4 = r0.A0r
            r2 = 1
            boolean r2 = r4[r2]
            if (r2 == 0) goto L_0x00bc
            boolean r2 = r0.A0I()
            if (r2 != 0) goto L_0x00bc
            X.0Aq r0 = r0.A0Z
            X.0Az r0 = r0.A0S
            X.0B4 r4 = r1.A09(r0)
            r2 = 8
            r0 = r23
            r1.A0E(r4, r0, r3, r2)
        L_0x00bc:
            return
        L_0x00bd:
            X.0Aq r10 = r0.A0Z
            if (r10 == 0) goto L_0x054e
            java.lang.Integer[] r7 = r10.A0q
            r2 = r7[r3]
            java.lang.Integer r6 = X.C023109s.A01
            r45 = 0
            if (r2 != r6) goto L_0x00cd
            r45 = 1
        L_0x00cd:
            r2 = 1
            r2 = r7[r2]
            r46 = 0
            if (r2 != r6) goto L_0x00d6
            r46 = 1
        L_0x00d6:
            X.0Az[] r7 = r0.A0n
            r6 = r7[r3]
            X.0Az r2 = r6.A03
            if (r2 == 0) goto L_0x0548
            X.0Az r2 = r2.A03
            if (r2 == r6) goto L_0x0548
            r2 = 1
            r6 = r7[r2]
            X.0Az r2 = r6.A03
            if (r2 == 0) goto L_0x0548
            X.0Az r2 = r2.A03
            if (r2 != r6) goto L_0x0548
            X.0As r10 = (X.C02520As) r10
            int r2 = r10.A00
            int r6 = r2 + 1
            X.0BG[] r9 = r10.A0B
            int r2 = r9.length
            if (r6 < r2) goto L_0x0102
            int r2 = r2 * 2
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r2)
            X.0BG[] r9 = (X.AnonymousClass0BG[]) r9
            r10.A0B = r9
        L_0x0102:
            int r8 = r10.A00
            boolean r6 = r10.A09
            X.0BG r2 = new X.0BG
            r2.<init>(r0, r3, r6)
            r9[r8] = r2
            int r2 = r8 + 1
            r10.A00 = r2
            r50 = 1
        L_0x0113:
            r51 = 1
            r2 = 2
            r6 = r7[r2]
            X.0Az r2 = r6.A03
            if (r2 == 0) goto L_0x0542
            X.0Az r2 = r2.A03
            if (r2 == r6) goto L_0x0542
            r2 = 3
            r6 = r7[r2]
            X.0Az r2 = r6.A03
            if (r2 == 0) goto L_0x0542
            X.0Az r2 = r2.A03
            if (r2 != r6) goto L_0x0542
            X.0Aq r9 = r0.A0Z
            X.0As r9 = (X.C02520As) r9
            int r2 = r9.A04
            int r6 = r2 + 1
            X.0BG[] r10 = r9.A0C
            int r2 = r10.length
            if (r6 < r2) goto L_0x0142
            int r2 = r2 * 2
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r2)
            X.0BG[] r10 = (X.AnonymousClass0BG[]) r10
            r9.A0C = r10
        L_0x0142:
            int r8 = r9.A04
            boolean r7 = r9.A09
            X.0BG r6 = new X.0BG
            r2 = 1
            r6.<init>(r0, r2, r7)
            r10[r8] = r6
            int r2 = r8 + 1
            r9.A04 = r2
        L_0x0152:
            if (r50 != 0) goto L_0x0172
            if (r45 == 0) goto L_0x0172
            int r6 = r0.A0N
            r2 = 8
            if (r6 == r2) goto L_0x0172
            X.0Az r2 = r13.A03
            if (r2 != 0) goto L_0x0172
            X.0Az r2 = r5.A03
            if (r2 != 0) goto L_0x0172
            X.0Aq r2 = r0.A0Z
            X.0Az r2 = r2.A0X
            X.0B4 r7 = r1.A09(r2)
            r6 = 1
            r2 = r22
            r1.A0E(r7, r2, r3, r6)
        L_0x0172:
            if (r51 != 0) goto L_0x0198
            if (r46 == 0) goto L_0x0198
            int r6 = r0.A0N
            r2 = 8
            if (r6 == r2) goto L_0x0198
            r2 = r58
            X.0Az r2 = r2.A03
            if (r2 != 0) goto L_0x0198
            r2 = r59
            X.0Az r2 = r2.A03
            if (r2 != 0) goto L_0x0198
            if (r26 != 0) goto L_0x0198
            X.0Aq r2 = r0.A0Z
            X.0Az r2 = r2.A0S
            X.0B4 r7 = r1.A09(r2)
            r6 = 1
            r2 = r23
            r1.A0E(r7, r2, r3, r6)
        L_0x0198:
            int r2 = r0.A0O
            r20 = r2
            r27 = r2
            int r6 = r0.A0J
            if (r2 >= r6) goto L_0x01a4
            r20 = r6
        L_0x01a4:
            int r2 = r0.A09
            r19 = r2
            r12 = r2
            int r6 = r0.A0I
            if (r2 >= r6) goto L_0x01af
            r19 = r6
        L_0x01af:
            java.lang.Integer[] r2 = r0.A0q
            r18 = r2
            r10 = r2[r3]
            java.lang.Integer r7 = X.C023109s.A0C
            r17 = 0
            if (r10 == r7) goto L_0x01bd
            r17 = 1
        L_0x01bd:
            r2 = 1
            r6 = r18[r2]
            r16 = 0
            if (r6 == r7) goto L_0x01c6
            r16 = 1
        L_0x01c6:
            int r11 = r0.A08
            r0.A0K = r11
            r9 = r11
            float r8 = r0.A01
            r0.A05 = r8
            int r14 = r0.A0D
            int r15 = r0.A0C
            r2 = 0
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x053e
            int r3 = r0.A0N
            r2 = 8
            if (r3 == r2) goto L_0x053e
            r3 = 3
            if (r10 != r7) goto L_0x01e4
            if (r14 != 0) goto L_0x01e4
            r14 = 3
        L_0x01e4:
            if (r6 != r7) goto L_0x01e9
            if (r15 != 0) goto L_0x01e9
            r15 = 3
        L_0x01e9:
            if (r10 != r7) goto L_0x050a
            if (r6 != r7) goto L_0x050a
            if (r14 != r3) goto L_0x050a
            if (r15 != r3) goto L_0x050a
            r6 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r12 = -1
            r2 = 1
            if (r11 != r12) goto L_0x04bc
            if (r17 == 0) goto L_0x04c0
            if (r16 != 0) goto L_0x04d2
            r0.A0K = r3
            r9 = 0
        L_0x01ff:
            r3 = r58
            X.0Az r3 = r3.A03
            if (r3 == 0) goto L_0x0505
            r3 = r59
            X.0Az r3 = r3.A03
            if (r3 == 0) goto L_0x0505
        L_0x020b:
            r16 = 1
        L_0x020d:
            int[] r3 = r0.A0l
            r2 = 0
            r3[r2] = r14
            r2 = 1
            r3[r2] = r15
            if (r16 == 0) goto L_0x04b8
            r2 = -1
            if (r9 == 0) goto L_0x021c
            if (r9 != r2) goto L_0x04b8
        L_0x021c:
            r49 = 1
        L_0x021e:
            java.lang.Integer r11 = X.C023109s.A01
            if (r10 != r11) goto L_0x04b4
            boolean r2 = r0 instanceof X.C02520As
            if (r2 == 0) goto L_0x04b4
            r48 = 1
            r20 = 0
        L_0x022a:
            X.0Az r12 = r0.A0T
            X.0Az r2 = r12.A03
            r3 = 0
            if (r2 == 0) goto L_0x0232
            r3 = 1
        L_0x0232:
            r6 = 1
            r53 = r3 ^ 1
            boolean[] r3 = r0.A0s
            r2 = 0
            boolean r52 = r3[r2]
            boolean r79 = r3[r6]
            int r6 = r0.A0B
            r3 = 2
            r56 = 0
            if (r6 == r3) goto L_0x027c
            boolean r3 = r4.A0B
            if (r3 == 0) goto L_0x0463
            r3 = r28
            X.0Aw r3 = r3.A04
            boolean r6 = r3.A0B
            if (r6 == 0) goto L_0x0463
            int r5 = r4.A05
            r4 = r21
            r1.A0C(r4, r5)
            int r4 = r3.A05
            r3 = r22
            r1.A0C(r3, r4)
            X.0Aq r4 = r0.A0Z
            if (r4 == 0) goto L_0x027c
            if (r45 == 0) goto L_0x027c
            boolean[] r3 = r0.A0r
            boolean r3 = r3[r2]
            if (r3 == 0) goto L_0x027c
            boolean r3 = r0.A0H()
            if (r3 != 0) goto L_0x027c
            X.0Az r3 = r4.A0X
            X.0B4 r5 = r1.A09(r3)
            r4 = 8
            r3 = r22
            r1.A0E(r5, r3, r2, r4)
        L_0x027c:
            X.0Ay r5 = r0.A0d
            X.0Aw r3 = r5.A05
            boolean r2 = r3.A0B
            if (r2 == 0) goto L_0x045c
            X.0Aw r4 = r5.A04
            boolean r2 = r4.A0B
            if (r2 == 0) goto L_0x045c
            int r3 = r3.A05
            r2 = r24
            r1.A0C(r2, r3)
            int r3 = r4.A05
            r2 = r23
            r1.A0C(r2, r3)
            X.0Aw r2 = r5.A01
            int r3 = r2.A05
            r2 = r25
            r1.A0C(r2, r3)
            X.0Aq r4 = r0.A0Z
            if (r4 == 0) goto L_0x0456
            if (r51 != 0) goto L_0x0456
            if (r46 == 0) goto L_0x0456
            boolean[] r3 = r0.A0r
            r2 = 1
            boolean r3 = r3[r2]
            if (r3 == 0) goto L_0x0451
            X.0Az r3 = r4.A0S
            X.0B4 r4 = r1.A09(r3)
            r6 = 8
            r5 = 0
            r3 = r23
            r1.A0E(r4, r3, r5, r6)
        L_0x02be:
            r8 = 0
        L_0x02bf:
            int r4 = r0.A0M
            r3 = 2
            if (r4 == r3) goto L_0x035a
            if (r8 == 0) goto L_0x035a
            r3 = r18[r2]
            if (r3 != r11) goto L_0x044d
            boolean r3 = r0 instanceof X.C02520As
            if (r3 == 0) goto L_0x044d
            r75 = 1
            r19 = 0
        L_0x02d2:
            if (r16 == 0) goto L_0x0449
            int r4 = r0.A0K
            if (r4 == r2) goto L_0x02db
            r3 = -1
            if (r4 != r3) goto L_0x0449
        L_0x02db:
            r76 = 1
        L_0x02dd:
            X.0Aq r3 = r0.A0Z
            if (r3 == 0) goto L_0x0445
            X.0Az r3 = r3.A0S
            X.0B4 r9 = r1.A09(r3)
        L_0x02e7:
            X.0Aq r3 = r0.A0Z
            if (r3 == 0) goto L_0x02f1
            X.0Az r3 = r3.A0Y
            X.0B4 r56 = r1.A09(r3)
        L_0x02f1:
            int r8 = r0.A07
            if (r8 > 0) goto L_0x02f9
            int r3 = r0.A0N
            if (r3 != r6) goto L_0x031d
        L_0x02f9:
            r4 = r25
            r3 = r24
            r1.A0D(r4, r3, r8, r6)
            r3 = r26
            X.0Az r3 = r3.A03
            if (r3 == 0) goto L_0x043a
            X.0B4 r4 = r1.A09(r3)
            r3 = r25
            r1.A0D(r3, r4, r5, r6)
            if (r46 == 0) goto L_0x031b
            r3 = r59
            X.0B4 r4 = r1.A09(r3)
            r3 = 5
            r1.A0E(r9, r4, r5, r3)
        L_0x031b:
            r53 = 0
        L_0x031d:
            boolean[] r3 = r0.A0r
            boolean r74 = r3[r2]
            r60 = r18[r2]
            int r10 = r0.A0Q
            int r8 = r0.A0I
            int[] r3 = r0.A0k
            r66 = r3[r2]
            float r6 = r0.A06
            int r5 = r0.A0G
            int r4 = r0.A0E
            float r3 = r0.A03
            r71 = 0
            r54 = r0
            r55 = r1
            r57 = r9
            r61 = r6
            r62 = r3
            r63 = r10
            r64 = r19
            r65 = r8
            r67 = r15
            r68 = r14
            r69 = r5
            r70 = r4
            r72 = r46
            r73 = r45
            r77 = r51
            r78 = r50
            r80 = r53
            r54.A00(r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80)
        L_0x035a:
            if (r16 == 0) goto L_0x0392
            int r3 = r0.A0K
            float r6 = r0.A05
            r8 = r23
            r4 = r24
            if (r3 == r2) goto L_0x036e
            r8 = r22
            r4 = r21
            r22 = r23
            r21 = r24
        L_0x036e:
            X.0B6 r5 = r1.A06()
            X.0BB r3 = r5.A01
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.BmZ(r8, r2)
            X.0BB r3 = r5.A01
            r2 = 1065353216(0x3f800000, float:1.0)
            r3.BmZ(r4, r2)
            X.0BB r3 = r5.A01
            r2 = r22
            r3.BmZ(r2, r6)
            X.0BB r4 = r5.A01
            float r3 = -r6
            r2 = r21
            r4.BmZ(r2, r3)
            r1.A0B(r5)
        L_0x0392:
            X.0Az r2 = r12.A03
            if (r2 == 0) goto L_0x00bc
            X.0Aq r6 = r2.A05
            float r3 = r0.A00
            r2 = 1119092736(0x42b40000, float:90.0)
            float r3 = r3 + r2
            double r2 = (double) r3
            double r4 = java.lang.Math.toRadians(r2)
            float r3 = (float) r4
            int r2 = r12.A00()
            X.0Az r4 = r0.A06(r11)
            X.0B4 r10 = r1.A09(r4)
            X.0Az r4 = r0.A06(r7)
            X.0B4 r12 = r1.A09(r4)
            java.lang.Integer r5 = X.C023109s.A0G
            X.0Az r4 = r0.A06(r5)
            X.0B4 r9 = r1.A09(r4)
            java.lang.Integer r4 = X.C023109s.A0R
            X.0Az r0 = r0.A06(r4)
            X.0B4 r13 = r1.A09(r0)
            X.0Az r0 = r6.A06(r11)
            X.0B4 r11 = r1.A09(r0)
            X.0Az r0 = r6.A06(r7)
            X.0B4 r14 = r1.A09(r0)
            X.0Az r0 = r6.A06(r5)
            X.0B4 r8 = r1.A09(r0)
            X.0Az r0 = r6.A06(r4)
            X.0B4 r0 = r1.A09(r0)
            X.0B6 r7 = r1.A06()
            double r15 = (double) r3
            double r3 = java.lang.Math.sin(r15)
            double r5 = (double) r2
            double r3 = r3 * r5
            float r2 = (float) r3
            X.0BB r3 = r7.A01
            r4 = 1056964608(0x3f000000, float:0.5)
            r3.BmZ(r14, r4)
            X.0BB r3 = r7.A01
            r3.BmZ(r0, r4)
            X.0BB r3 = r7.A01
            r0 = -1090519040(0xffffffffbf000000, float:-0.5)
            r3.BmZ(r12, r0)
            X.0BB r3 = r7.A01
            r3.BmZ(r13, r0)
            float r2 = -r2
            r7.A00 = r2
            r1.A0B(r7)
            X.0B6 r7 = r1.A06()
            double r2 = java.lang.Math.cos(r15)
            double r2 = r2 * r5
            float r5 = (float) r2
            X.0BB r2 = r7.A01
            r2.BmZ(r11, r4)
            X.0BB r2 = r7.A01
            r2.BmZ(r8, r4)
            X.0BB r2 = r7.A01
            r2.BmZ(r10, r0)
            X.0BB r2 = r7.A01
            r2.BmZ(r9, r0)
            float r0 = -r5
            r7.A00 = r0
            r1.A0B(r7)
            return
        L_0x043a:
            int r3 = r0.A0N
            if (r3 != r6) goto L_0x031d
            r3 = r24
            r1.A0D(r4, r3, r5, r6)
            goto L_0x031d
        L_0x0445:
            r9 = r56
            goto L_0x02e7
        L_0x0449:
            r76 = 0
            goto L_0x02dd
        L_0x044d:
            r75 = 0
            goto L_0x02d2
        L_0x0451:
            r6 = 8
            r5 = 0
            goto L_0x02be
        L_0x0456:
            r6 = 8
            r5 = 0
            r2 = 1
            goto L_0x02be
        L_0x045c:
            r6 = 8
            r5 = 0
            r2 = 1
            r8 = 1
            goto L_0x02bf
        L_0x0463:
            X.0Aq r3 = r0.A0Z
            if (r3 == 0) goto L_0x04b1
            X.0Az r3 = r3.A0X
            X.0B4 r30 = r1.A09(r3)
        L_0x046d:
            X.0Aq r3 = r0.A0Z
            if (r3 == 0) goto L_0x04ae
            X.0Az r3 = r3.A0W
            X.0B4 r29 = r1.A09(r3)
        L_0x0477:
            boolean[] r3 = r0.A0r
            boolean r47 = r3[r2]
            r33 = r18[r2]
            int r9 = r0.A0P
            int r8 = r0.A0J
            int[] r3 = r0.A0k
            r39 = r3[r2]
            float r6 = r0.A02
            int r4 = r0.A0H
            int r3 = r0.A0F
            float r2 = r0.A04
            r44 = 1
            r27 = r0
            r28 = r1
            r31 = r13
            r32 = r5
            r34 = r6
            r35 = r2
            r36 = r9
            r37 = r20
            r38 = r8
            r40 = r14
            r41 = r15
            r42 = r4
            r43 = r3
            r27.A00(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            goto L_0x027c
        L_0x04ae:
            r29 = r56
            goto L_0x0477
        L_0x04b1:
            r30 = r56
            goto L_0x046d
        L_0x04b4:
            r48 = 0
            goto L_0x022a
        L_0x04b8:
            r49 = 0
            goto L_0x021e
        L_0x04bc:
            if (r11 != 0) goto L_0x04c8
            goto L_0x01ff
        L_0x04c0:
            if (r16 == 0) goto L_0x04d2
            r0.A0K = r2
            r9 = 1
            float r6 = r6 / r8
            r0.A05 = r6
        L_0x04c8:
            X.0Az r2 = r13.A03
            if (r2 == 0) goto L_0x04ee
            X.0Az r2 = r5.A03
            if (r2 == 0) goto L_0x04ee
            goto L_0x020b
        L_0x04d2:
            r11 = r58
            X.0Az r11 = r11.A03
            if (r11 == 0) goto L_0x04f3
            r11 = r59
            X.0Az r11 = r11.A03
            if (r11 == 0) goto L_0x04f3
            X.0Az r11 = r13.A03
            if (r11 == 0) goto L_0x04ee
            X.0Az r11 = r5.A03
            if (r11 == 0) goto L_0x04ee
        L_0x04e6:
            int r11 = r0.A0H
            if (r11 <= 0) goto L_0x04fc
            int r2 = r0.A0G
            if (r2 != 0) goto L_0x020b
        L_0x04ee:
            r0.A0K = r3
            r9 = 0
            goto L_0x020b
        L_0x04f3:
            X.0Az r11 = r13.A03
            if (r11 == 0) goto L_0x04e6
            X.0Az r11 = r5.A03
            if (r11 == 0) goto L_0x04e6
            goto L_0x0502
        L_0x04fc:
            if (r11 != 0) goto L_0x020b
            int r3 = r0.A0G
            if (r3 <= 0) goto L_0x020b
        L_0x0502:
            float r6 = r6 / r8
            r0.A05 = r6
        L_0x0505:
            r0.A0K = r2
            r9 = 1
            goto L_0x020b
        L_0x050a:
            r2 = 0
            if (r10 != r7) goto L_0x051f
            if (r14 != r3) goto L_0x051f
            r0.A0K = r2
            r9 = 0
            float r2 = (float) r12
            float r8 = r8 * r2
            int r2 = (int) r8
            r20 = r2
            r14 = 3
            if (r6 == r7) goto L_0x020b
            r16 = 0
            r14 = 4
            goto L_0x020d
        L_0x051f:
            r2 = 1
            if (r6 != r7) goto L_0x020b
            if (r15 != r3) goto L_0x020b
            r0.A0K = r2
            r9 = 1
            r2 = -1
            if (r11 != r2) goto L_0x0530
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 / r8
            r0.A05 = r2
            r8 = r2
        L_0x0530:
            r2 = r27
            float r2 = (float) r2
            float r8 = r8 * r2
            int r2 = (int) r8
            r19 = r2
            if (r10 == r7) goto L_0x020b
            r16 = 0
            r15 = 4
            goto L_0x020d
        L_0x053e:
            r16 = 0
            goto L_0x020d
        L_0x0542:
            boolean r51 = r0.A0I()
            goto L_0x0152
        L_0x0548:
            boolean r50 = r0.A0H()
            goto L_0x0113
        L_0x054e:
            r46 = 0
            r45 = 0
            r51 = 0
            r50 = 0
            goto L_0x0198
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02500Aq.A0J(X.0B3):void");
    }
}
