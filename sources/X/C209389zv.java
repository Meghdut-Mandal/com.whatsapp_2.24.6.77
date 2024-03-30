package X;

/* renamed from: X.9zv  reason: invalid class name and case insensitive filesystem */
public class C209389zv implements C22859AxB {
    public final /* synthetic */ C1690082w A00;
    public final /* synthetic */ Object A01;

    public C209389zv(C1690082w r1, Object obj) {
        this.A00 = r1;
        this.A01 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bgs(com.facebook.android.exoplayer2.Timeline r13, X.B38 r14, java.lang.Object r15) {
        /*
            r12 = this;
            X.82w r5 = r12.A00
            java.lang.Object r4 = r12.A01
            boolean r0 = r5 instanceof X.C1689882u
            if (r0 == 0) goto L_0x0044
            X.82u r5 = (X.C1689882u) r5
            X.8xa r0 = r5.A02
            if (r0 != 0) goto L_0x003b
            int r2 = r5.A00
            r1 = -1
            int r0 = r13.A00()
            if (r2 != r1) goto L_0x003c
            r5.A00 = r0
        L_0x0019:
            r0 = 0
        L_0x001a:
            r5.A02 = r0
            if (r0 != 0) goto L_0x003b
            java.util.ArrayList r2 = r5.A05
            r2.remove(r14)
            X.B38[] r1 = r5.A06
            r0 = 0
            r0 = r1[r0]
            if (r14 != r0) goto L_0x002e
            r5.A01 = r13
            r5.A03 = r15
        L_0x002e:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x003b
            com.facebook.android.exoplayer2.Timeline r1 = r5.A01
            java.lang.Object r0 = r5.A03
            r5.A04(r1, r0)
        L_0x003b:
            return
        L_0x003c:
            if (r0 == r2) goto L_0x0019
            X.8xa r0 = new X.8xa
            r0.<init>()
            goto L_0x001a
        L_0x0044:
            boolean r0 = r5 instanceof X.C1689782t
            if (r0 == 0) goto L_0x0066
            X.82t r5 = (X.C1689782t) r5
            int r0 = r13.A00()
            r5.A00 = r0
            int r1 = r5.A01
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L_0x0060
            X.82C r0 = new X.82C
            r0.<init>(r13, r1)
        L_0x005c:
            r5.A04(r0, r15)
            return
        L_0x0060:
            X.82x r0 = new X.82x
            r0.<init>(r13)
            goto L_0x005c
        L_0x0066:
            X.82v r5 = (X.C1689982v) r5
            X.AUe r4 = (X.C21662AUe) r4
            if (r4 == 0) goto L_0x010f
            X.82y r8 = r4.A03
            com.facebook.android.exoplayer2.Timeline r0 = r8.A00
            if (r0 == r13) goto L_0x003b
            int r3 = r13.A01()
            int r0 = r8.A01()
            int r3 = r3 - r0
            int r2 = r13.A00()
            int r0 = r8.A00()
            int r1 = r2 - r0
            r6 = 0
            r7 = 1
            if (r3 != 0) goto L_0x008b
            if (r1 == 0) goto L_0x0092
        L_0x008b:
            int r0 = r4.A00
            int r0 = r0 + 1
            X.C1689982v.A03(r5, r0, r6, r3, r1)
        L_0x0092:
            java.lang.Object r1 = r8.A00
            if (r1 != 0) goto L_0x00a0
            if (r2 <= 0) goto L_0x00a0
            X.9Wr r0 = X.C1690282y.A01
            X.9Wr r0 = r13.A08(r0, r6, r7)
            java.lang.Object r1 = r0.A04
        L_0x00a0:
            X.82y r0 = new X.82y
            r0.<init>(r13, r1)
            r4.A03 = r0
            boolean r0 = r4.A05
            if (r0 != 0) goto L_0x00fb
            int r0 = r13.A01()
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            if (r0 != 0) goto L_0x00fb
            X.9fY r8 = r5.A05
            r0 = 0
            r13.A09(r8, r6, r0)
            r2 = 0
            long r0 = r8.A02
            long r2 = r2 + r0
        L_0x00c1:
            java.util.List r1 = r4.A04
            int r0 = r1.size()
            if (r6 >= r0) goto L_0x00f9
            java.lang.Object r9 = r1.get(r6)
            X.9zs r9 = (X.C209359zs) r9
            long r0 = r9.A01
            r10 = 0
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x00df
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00df
            r9.A00 = r2
            r9.A01 = r2
        L_0x00df:
            X.B38 r11 = r9.A05
            X.9WT r10 = r9.A04
            X.9Ws r8 = r9.A06
            long r0 = r9.A01
            X.B5S r8 = r11.B4q(r10, r8, r0)
            r9.A03 = r8
            X.7nm r0 = r9.A02
            if (r0 == 0) goto L_0x00f6
            long r0 = r9.A01
            r8.Bm4(r9, r0)
        L_0x00f6:
            int r6 = r6 + 1
            goto L_0x00c1
        L_0x00f9:
            r4.A05 = r7
        L_0x00fb:
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x003b
            X.9mU r0 = r5.A00
            X.9Xx r1 = r0.A06(r5)
            r0 = 5
            r1.A01(r0)
            r1.A00()
            r5.A01 = r7
            return
        L_0x010f:
            java.lang.IllegalArgumentException r0 = X.C165617ti.A0U()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209389zv.Bgs(com.facebook.android.exoplayer2.Timeline, X.B38, java.lang.Object):void");
    }
}
