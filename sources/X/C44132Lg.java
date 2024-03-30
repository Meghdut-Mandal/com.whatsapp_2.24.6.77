package X;

/* renamed from: X.2Lg  reason: invalid class name and case insensitive filesystem */
public class C44132Lg extends AnonymousClass3SB {
    public boolean A00;

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return super.equals(obj) && this.A00 == ((C44132Lg) obj).A00;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C44132Lg(X.AnonymousClass3SB r16) {
        /*
            r15 = this;
            r0 = r16
            com.whatsapp.jid.DeviceJid r2 = r0.A07
            X.2qA r3 = r0.A08
            java.lang.String r4 = r0.A09
            long r8 = r0.A00
            long r10 = r0.A05
            long r12 = r0.A01
            int r7 = r0.A04
            boolean r14 = r0.A0A
            java.lang.String r5 = r0.A03
            java.lang.String r6 = r0.A02
            X.9eT r1 = r0.A06
            r0 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44132Lg.<init>(X.3SB):void");
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, super.hashCode());
        return AnonymousClass000.A0L(Boolean.valueOf(this.A00), A0M);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(super.toString());
        A0u.append(", isSyncing: ");
        return C36421kH.A0d(A0u, this.A00);
    }
}
