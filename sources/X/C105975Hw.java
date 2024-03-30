package X;

/* renamed from: X.5Hw  reason: invalid class name and case insensitive filesystem */
public final class C105975Hw extends C108685Um {
    public final Throwable throwable;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C105975Hw) && AnonymousClass00C.A0J(this.throwable, ((C105975Hw) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C105975Hw(java.lang.Throwable r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Exception caught ("
            r1.append(r0)
            java.lang.String r0 = r3.getMessage()
            java.lang.String r0 = X.C36321k7.A0E(r0, r1)
            r2.<init>(r0)
            r2.throwable = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105975Hw.<init>(java.lang.Throwable):void");
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Error(throwable=");
        return AnonymousClass000.A0m(this.throwable, A0u);
    }
}
