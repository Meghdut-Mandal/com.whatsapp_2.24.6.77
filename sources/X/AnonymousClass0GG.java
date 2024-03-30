package X;

import java.util.ArrayList;

/* renamed from: X.0GG  reason: invalid class name */
public class AnonymousClass0GG extends C02500Aq {
    public float A00 = -1.0f;
    public int A01;
    public int A02 = -1;
    public int A03 = -1;
    public AnonymousClass0Az A04;

    public boolean A0G() {
        return true;
    }

    public void A0C(AnonymousClass0B3 r6) {
        C02500Aq r4 = this.A0Z;
        if (r4 != null) {
            int A002 = AnonymousClass0B3.A00(this.A04);
            if (this.A01 == 1) {
                this.A0P = A002;
                this.A0Q = 0;
                A08(r4.A02());
                A09(0);
                return;
            }
            this.A0P = 0;
            this.A0Q = A002;
            A09(r4.A03());
            A08(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0.A0q[0] != r2) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J(X.AnonymousClass0B3 r10) {
        /*
            r9 = this;
            X.0Aq r3 = r9.A0Z
            if (r3 == 0) goto L_0x0059
            java.lang.Integer r2 = X.C023109s.A01
            X.0Az r7 = r3.A06(r2)
            java.lang.Integer r0 = X.C023109s.A0G
            X.0Az r6 = r3.A06(r0)
            X.0Aq r0 = r9.A0Z
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L_0x001d
            java.lang.Integer[] r0 = r0.A0q
            r0 = r0[r4]
            r8 = 1
            if (r0 == r2) goto L_0x001e
        L_0x001d:
            r8 = 0
        L_0x001e:
            int r0 = r9.A01
            if (r0 != 0) goto L_0x0039
            java.lang.Integer r0 = X.C023109s.A0C
            X.0Az r7 = r3.A06(r0)
            java.lang.Integer r0 = X.C023109s.A0R
            X.0Az r6 = r3.A06(r0)
            X.0Aq r0 = r9.A0Z
            if (r0 == 0) goto L_0x00a3
            java.lang.Integer[] r0 = r0.A0q
            r0 = r0[r1]
            if (r0 != r2) goto L_0x00a3
        L_0x0038:
            r8 = r1
        L_0x0039:
            int r0 = r9.A02
            r5 = 8
            r1 = -1
            r3 = 5
            if (r0 == r1) goto L_0x005a
            X.0Az r0 = r9.A04
            X.0B4 r2 = r10.A09(r0)
            X.0B4 r1 = r10.A09(r7)
            int r0 = r9.A02
            r10.A0D(r2, r1, r0, r5)
            if (r8 == 0) goto L_0x0059
            X.0B4 r0 = r10.A09(r6)
            r10.A0E(r0, r2, r4, r3)
        L_0x0059:
            return
        L_0x005a:
            int r0 = r9.A03
            if (r0 == r1) goto L_0x007b
            X.0Az r0 = r9.A04
            X.0B4 r2 = r10.A09(r0)
            X.0B4 r1 = r10.A09(r6)
            int r0 = r9.A03
            int r0 = -r0
            r10.A0D(r2, r1, r0, r5)
            if (r8 == 0) goto L_0x0059
            X.0B4 r0 = r10.A09(r7)
            r10.A0E(r2, r0, r4, r3)
            r10.A0E(r1, r2, r4, r3)
            return
        L_0x007b:
            float r1 = r9.A00
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0059
            X.0Az r0 = r9.A04
            X.0B4 r5 = r10.A09(r0)
            X.0B4 r4 = r10.A09(r6)
            float r3 = r9.A00
            X.0B6 r2 = r10.A06()
            X.0BB r1 = r2.A01
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.BmZ(r5, r0)
            X.0BB r0 = r2.A01
            r0.BmZ(r4, r3)
            r10.A0B(r2)
            return
        L_0x00a3:
            r1 = 0
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0GG.A0J(X.0B3):void");
    }

    public void A0K(int i) {
        AnonymousClass0Az r3;
        if (this.A01 != i) {
            this.A01 = i;
            ArrayList arrayList = this.A0g;
            arrayList.clear();
            if (i == 1) {
                r3 = this.A0W;
            } else {
                r3 = this.A0Y;
            }
            this.A04 = r3;
            arrayList.add(r3);
            AnonymousClass0Az[] r2 = this.A0n;
            int length = r2.length;
            for (int i2 = 0; i2 < length; i2++) {
                r2[i2] = r3;
            }
        }
    }

    public AnonymousClass0GG() {
        AnonymousClass0Az r3 = this.A0Y;
        this.A04 = r3;
        this.A01 = 0;
        ArrayList arrayList = this.A0g;
        arrayList.clear();
        arrayList.add(r3);
        AnonymousClass0Az[] r1 = this.A0n;
        int length = r1.length;
        for (int i = 0; i < length; i++) {
            r1[i] = r3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        throw new java.lang.AssertionError(X.AnonymousClass0PF.A00(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r2.A01 == 1) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r2.A01 == 0) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return r2.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0Az A06(java.lang.Integer r3) {
        /*
            r2 = this;
            int r0 = r3.intValue()
            switch(r0) {
                case 1: goto L_0x0009;
                case 2: goto L_0x000f;
                case 3: goto L_0x0009;
                case 4: goto L_0x000f;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 0
            return r0
        L_0x0009:
            int r1 = r2.A01
            r0 = 1
            if (r1 != r0) goto L_0x0016
            goto L_0x0013
        L_0x000f:
            int r0 = r2.A01
            if (r0 != 0) goto L_0x0016
        L_0x0013:
            X.0Az r0 = r2.A04
            return r0
        L_0x0016:
            java.lang.String r1 = X.AnonymousClass0PF.A00(r3)
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0GG.A06(java.lang.Integer):X.0Az");
    }
}
