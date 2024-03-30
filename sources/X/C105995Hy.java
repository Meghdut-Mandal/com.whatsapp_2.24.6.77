package X;

/* renamed from: X.5Hy  reason: invalid class name and case insensitive filesystem */
public final class C105995Hy extends C108685Um {
    public final int code;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C105995Hy) && this.code == ((C105995Hy) obj).code);
    }

    public int hashCode() {
        return this.code;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C105995Hy(int r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown error code ("
            r1.append(r0)
            java.lang.String r0 = X.C36321k7.A0G(r1, r3)
            r2.<init>(r0)
            r2.code = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105995Hy.<init>(int):void");
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UnknownErrorCode(code=");
        return C36321k7.A0G(A0u, this.code);
    }
}
