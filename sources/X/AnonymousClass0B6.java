package X;

import java.util.ArrayList;

/* renamed from: X.0B6  reason: invalid class name */
public class AnonymousClass0B6 implements AnonymousClass0B5 {
    public float A00 = 0.0f;
    public AnonymousClass0BB A01;
    public AnonymousClass0B4 A02 = null;
    public ArrayList A03 = new ArrayList();
    public boolean A04 = false;

    public void A04(AnonymousClass0B4 r5, AnonymousClass0B4 r6, AnonymousClass0B4 r7, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.A00 = (float) i;
        }
        AnonymousClass0BB r0 = this.A01;
        if (!z) {
            r0.BmZ(r5, -1.0f);
            this.A01.BmZ(r6, 1.0f);
            this.A01.BmZ(r7, 1.0f);
            return;
        }
        r0.BmZ(r5, 1.0f);
        this.A01.BmZ(r6, -1.0f);
        this.A01.BmZ(r7, -1.0f);
    }

    public void A05(AnonymousClass0B4 r5, AnonymousClass0B4 r6, AnonymousClass0B4 r7, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.A00 = (float) i;
        }
        AnonymousClass0BB r0 = this.A01;
        if (!z) {
            r0.BmZ(r5, -1.0f);
            this.A01.BmZ(r6, 1.0f);
            this.A01.BmZ(r7, -1.0f);
            return;
        }
        r0.BmZ(r5, 1.0f);
        this.A01.BmZ(r6, -1.0f);
        this.A01.BmZ(r7, 1.0f);
    }

    public AnonymousClass0B4 BFw(AnonymousClass0B3 r2, boolean[] zArr) {
        return A00(this, (AnonymousClass0B4) null, zArr);
    }

    public static AnonymousClass0B4 A00(AnonymousClass0B6 r9, AnonymousClass0B4 r10, boolean[] zArr) {
        Integer num;
        AnonymousClass0BB r8 = r9.A01;
        int BAh = r8.BAh();
        AnonymousClass0B4 r6 = null;
        float f = 0.0f;
        for (int i = 0; i < BAh; i++) {
            float BIt = r8.BIt(i);
            if (BIt < 0.0f) {
                AnonymousClass0B4 BIs = r8.BIs(i);
                if ((zArr == null || !zArr[BIs.A04]) && BIs != r10 && (((num = BIs.A07) == C023109s.A0C || num == C023109s.A0G) && BIt < f)) {
                    f = BIt;
                    r6 = BIs;
                }
            }
        }
        return r6;
    }

    public void A03(AnonymousClass0B4 r5) {
        AnonymousClass0B4 r1 = this.A02;
        if (r1 != null) {
            this.A01.BmZ(r1, -1.0f);
            this.A02 = null;
        }
        AnonymousClass0BB r2 = this.A01;
        float Bnb = r2.Bnb(r5, true) * -1.0f;
        this.A02 = r5;
        if (Bnb != 1.0f) {
            this.A00 /= Bnb;
            r2.B5l(Bnb);
        }
    }

    public void A06(AnonymousClass0B6 r4, boolean z) {
        this.A00 += r4.A00 * this.A01.BxB(r4, z);
        if (z) {
            r4.A02.A03(this);
        }
    }

    public void B0N(AnonymousClass0B4 r4) {
        int i = r4.A05;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.A01.BmZ(r4, f);
    }

    public void clear() {
        this.A01.clear();
        this.A02 = null;
        this.A00 = 0.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        r4 = r0.BIt(r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            X.0B4 r2 = r10.A02
            if (r2 != 0) goto L_0x00a6
            java.lang.String r0 = "0"
        L_0x0006:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            float r1 = r10.A00
            r6 = 0
            r9 = 0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00a4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r1)
            java.lang.String r7 = r0.toString()
            r8 = 1
        L_0x002f:
            X.0BB r0 = r10.A01
            int r5 = r0.BAh()
        L_0x0035:
            if (r6 >= r5) goto L_0x00b9
            X.0BB r0 = r10.A01
            X.0B4 r1 = r0.BIs(r6)
            if (r1 == 0) goto L_0x007b
            float r4 = r0.BIt(r6)
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x007b
            java.lang.String r3 = r1.toString()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 != 0) goto L_0x008a
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0065
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r0 = "- "
        L_0x005d:
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            float r4 = r4 * r2
        L_0x0065:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            if (r1 != 0) goto L_0x007e
            r0.<init>()
        L_0x0070:
            r0.append(r7)
            r0.append(r3)
            java.lang.String r7 = r0.toString()
            r8 = 1
        L_0x007b:
            int r6 = r6 + 1
            goto L_0x0035
        L_0x007e:
            r0.<init>()
            r0.append(r7)
            r0.append(r4)
            java.lang.String r7 = " "
            goto L_0x0070
        L_0x008a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r0 <= 0) goto L_0x009e
            r1.append(r7)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            goto L_0x0065
        L_0x009e:
            r1.append(r7)
            java.lang.String r0 = " - "
            goto L_0x005d
        L_0x00a4:
            r8 = 0
            goto L_0x002f
        L_0x00a6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = ""
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            goto L_0x0006
        L_0x00b9:
            if (r8 != 0) goto L_0x00cc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r7 = r1.toString()
        L_0x00cc:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0B6.toString():java.lang.String");
    }

    public AnonymousClass0B6(AnonymousClass0B7 r3) {
        this.A01 = new AnonymousClass0BC(this, r3);
    }

    public AnonymousClass0B6() {
    }
}
