package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.69b  reason: invalid class name and case insensitive filesystem */
public final class C1276369b {
    public final UserJid A00;
    public final String A01;

    public C1276369b(UserJid userJid, String str) {
        AnonymousClass00C.A0D(str, 1);
        this.A01 = str;
        this.A00 = userJid;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r0 = r4.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r2 = 1
            if (r3 == r4) goto L_0x0022
            boolean r1 = r4 instanceof X.C1276369b
            r0 = 0
            if (r1 == 0) goto L_0x0025
            java.lang.String r1 = r3.A01
            X.69b r4 = (X.C1276369b) r4
            java.lang.String r0 = r4.A01
            boolean r0 = X.C1901797e.A00(r1, r0)
            if (r0 == 0) goto L_0x0023
            com.whatsapp.jid.UserJid r1 = r3.A00
            if (r1 == 0) goto L_0x0022
            com.whatsapp.jid.UserJid r0 = r4.A00
            if (r0 == 0) goto L_0x0022
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0023
        L_0x0022:
            return r2
        L_0x0023:
            r2 = 0
            return r2
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1276369b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return C36421kH.A04(this.A01) + AnonymousClass000.A0J(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProductCacheKey(productId=");
        A0u.append(this.A01);
        A0u.append(", businessJid=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
