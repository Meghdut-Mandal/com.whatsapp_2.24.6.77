package X;

/* renamed from: X.6lX  reason: invalid class name and case insensitive filesystem */
public class C140406lX implements C161007lx {
    public final C161007lx A00;
    public final boolean A01;
    public final float[] A02;

    public C161007lx B9b(int i) {
        return this.A00.B9b(i);
    }

    public int B9g() {
        return this.A00.B9g();
    }

    public Object BDT() {
        return this.A00.BDT();
    }

    public int BEu() {
        return this.A00.BEu();
    }

    public int BEw() {
        return this.A00.BEw();
    }

    public int BEx() {
        return this.A00.BEx();
    }

    public int BEz() {
        return this.A00.BEz();
    }

    public C132456Tu BGf() {
        return this.A00.BGf();
    }

    public int BJL(int i) {
        return this.A00.BJL(i);
    }

    public int BJM(int i) {
        return this.A00.BJM(i);
    }

    public int getHeight() {
        int height = this.A00.getHeight();
        float[] fArr = this.A02;
        return height + Math.round(C90484aE.A03(fArr, 0)) + Math.round(C90484aE.A03(fArr, 3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (java.lang.Float.isNaN(r1) == false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (java.lang.Float.isNaN(r1) == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getWidth() {
        /*
            r5 = this;
            X.7lx r0 = r5.A00
            int r4 = r0.getWidth()
            float[] r3 = r5.A02
            boolean r2 = r5.A01
            if (r2 != 0) goto L_0x0031
            r0 = 5
            r1 = r3[r0]
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x0031
        L_0x0015:
            int r0 = java.lang.Math.round(r1)
            int r4 = r4 + r0
            if (r2 == 0) goto L_0x002b
            r0 = 5
            r1 = r3[r0]
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x002b
        L_0x0025:
            int r0 = java.lang.Math.round(r1)
            int r4 = r4 + r0
            return r4
        L_0x002b:
            r0 = 2
            float r1 = X.C90484aE.A03(r3, r0)
            goto L_0x0025
        L_0x0031:
            r0 = 1
            float r1 = X.C90484aE.A03(r3, r0)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140406lX.getWidth():int");
    }

    public C140406lX(C161007lx r1, float[] fArr, boolean z) {
        this.A00 = r1;
        this.A02 = fArr;
        this.A01 = z;
    }
}
