package X;

/* renamed from: X.9UQ  reason: invalid class name */
public final class AnonymousClass9UQ {
    public final int A00;
    public final int A01;
    public final C207099uY A02;
    public final C207099uY A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass9UQ r5 = (AnonymousClass9UQ) obj;
            if (this.A01 != r5.A01 || this.A00 != r5.A00 || !this.A04.equals(r5.A04) || !this.A03.equals(r5.A03) || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, C36351kA.A05(this.A03, C36381kD.A08(this.A04, (C165617ti.A01(this.A01) + this.A00) * 31)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r6 == 0) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9UQ(X.C207099uY r2, X.C207099uY r3, java.lang.String r4, int r5, int r6) {
        /*
            r1 = this;
            r1.<init>()
            if (r5 == 0) goto L_0x0008
            r0 = 0
            if (r6 != 0) goto L_0x0009
        L_0x0008:
            r0 = 1
        L_0x0009:
            X.C200319h9.A01(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0023
            r1.A04 = r4
            java.util.Objects.requireNonNull(r2)
            r1.A03 = r2
            java.util.Objects.requireNonNull(r3)
            r1.A02 = r3
            r1.A01 = r5
            r1.A00 = r6
            return
        L_0x0023:
            java.lang.IllegalArgumentException r0 = X.C165617ti.A0U()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9UQ.<init>(X.9uY, X.9uY, java.lang.String, int, int):void");
    }
}
