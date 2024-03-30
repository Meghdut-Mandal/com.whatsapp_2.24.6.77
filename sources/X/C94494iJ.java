package X;

/* renamed from: X.4iJ  reason: invalid class name and case insensitive filesystem */
public final class C94494iJ extends C114365h6 {
    public final int A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C94494iJ) {
                long j = this.A01;
                C94494iJ r9 = (C94494iJ) obj;
                long j2 = r9.A01;
                long j3 = C133336Xx.A01;
                if (!(j == j2 && this.A00 == r9.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C94494iJ(long r4, int r6) {
        /*
            r3 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0012
            android.graphics.BlendModeColorFilter r2 = X.C109035Wa.A00(r6, r4)
        L_0x000a:
            r3.<init>(r2)
            r3.A01 = r4
            r3.A00 = r6
            return
        L_0x0012:
            X.4iQ r0 = X.C114185go.A0G
            long r0 = X.C133336Xx.A06(r0, r4)
            int r1 = X.C90514aH.A0D(r0)
            android.graphics.PorterDuff$Mode r0 = X.AnonymousClass6G6.A01(r6)
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            r2.<init>(r1, r0)
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94494iJ.<init>(long, int):void");
    }

    public int hashCode() {
        long j = this.A01;
        long j2 = C133336Xx.A01;
        return C90464aC.A08(j) + this.A00;
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BlendModeColorFilter(color=");
        C90484aE.A1J(A0u, this.A01);
        A0u.append(", blendMode=");
        int i = this.A00;
        if (i == 0) {
            str = "Clear";
        } else if (i == 1) {
            str = "Src";
        } else if (i == 2) {
            str = "Dst";
        } else if (i == 3) {
            str = "SrcOver";
        } else if (i == 4) {
            str = "DstOver";
        } else if (i == 5) {
            str = "SrcIn";
        } else if (i == 6) {
            str = "DstIn";
        } else if (i == 7) {
            str = "SrcOut";
        } else if (i == 8) {
            str = "DstOut";
        } else if (i == 9) {
            str = "SrcAtop";
        } else if (i == 10) {
            str = "DstAtop";
        } else if (i == 11) {
            str = "Xor";
        } else if (i == 12) {
            str = "Plus";
        } else if (i == 13) {
            str = "Modulate";
        } else {
            str = "Screen";
        }
        return AnonymousClass000.A0m(str, A0u);
    }
}
