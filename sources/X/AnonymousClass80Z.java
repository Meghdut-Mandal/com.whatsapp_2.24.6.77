package X;

/* renamed from: X.80Z  reason: invalid class name */
public abstract class AnonymousClass80Z extends C53012qZ {
    public final int A00;
    public final int A01;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (java.lang.Math.min(r5.width(), r5.height()) >= r2) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r5.width() >= r1) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(android.view.WindowMetrics r7) {
        /*
            r6 = this;
            r2 = 0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 > r0) goto L_0x0008
            return r2
        L_0x0008:
            android.graphics.Rect r5 = X.AnonymousClass93S.A00(r7)
            X.AnonymousClass00C.A0D(r5, r2)
            int r1 = r6.A01
            r4 = 0
            if (r1 == 0) goto L_0x001b
            int r0 = r5.width()
            r3 = 0
            if (r0 < r1) goto L_0x001c
        L_0x001b:
            r3 = 1
        L_0x001c:
            int r2 = r6.A00
            if (r2 == 0) goto L_0x002f
            int r1 = r5.width()
            int r0 = r5.height()
            int r1 = java.lang.Math.min(r1, r0)
            r0 = 0
            if (r1 < r2) goto L_0x0030
        L_0x002f:
            r0 = 1
        L_0x0030:
            if (r3 == 0) goto L_0x0035
            if (r0 == 0) goto L_0x0035
            r4 = 1
        L_0x0035:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass80Z.A00(android.view.WindowMetrics):boolean");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass80Z) {
                AnonymousClass80Z r5 = (AnonymousClass80Z) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90474aD.A02(((this.A01 * 31) + this.A00) * 31, 0.4f) + 3;
    }

    public AnonymousClass80Z(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
