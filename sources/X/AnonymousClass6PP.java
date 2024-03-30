package X;

/* renamed from: X.6PP  reason: invalid class name */
public final class AnonymousClass6PP {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6PP) {
                AnonymousClass6PP r5 = (AnonymousClass6PP) obj;
                if (!(this.A03 == r5.A03 && this.A02 == r5.A02 && Float.compare(this.A01, r5.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90514aH.A0C(((this.A03 * 31) + this.A02) * 31, this.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (r5 <= 0.0f) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6PP(int r3, int r4, float r5) {
        /*
            r2 = this;
            r2.<init>()
            r2.A03 = r3
            r2.A02 = r4
            r2.A01 = r5
            if (r3 <= 0) goto L_0x0013
            if (r4 <= 0) goto L_0x0013
            r0 = 0
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r2.A04 = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x001e
            float r1 = (float) r3
            float r1 = r1 * r5
            float r0 = (float) r4
            float r1 = r1 / r0
        L_0x001e:
            r2.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6PP.<init>(int, int, float):void");
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VideoSizeInfo(width=");
        A0u.append(this.A03);
        A0u.append(", height=");
        A0u.append(this.A02);
        A0u.append(", pixelWidthHeightRatio=");
        return C90464aC.A0g(A0u, this.A01);
    }

    public AnonymousClass6PP() {
        this(0, 0, 0.0f);
    }
}
