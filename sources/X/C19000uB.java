package X;

import java.util.Arrays;

/* renamed from: X.0uB  reason: invalid class name and case insensitive filesystem */
public final class C19000uB {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, this.A03, this.A04, this.A01, this.A06, this.A05});
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C19000uB)) {
            return false;
        }
        C19000uB r4 = (C19000uB) obj;
        if (!AnonymousClass0QM.A00(this.A00, r4.A00) || !AnonymousClass0QM.A00(this.A02, r4.A02) || !AnonymousClass0QM.A00(this.A03, r4.A03) || !AnonymousClass0QM.A00(this.A04, r4.A04) || !AnonymousClass0QM.A00(this.A01, r4.A01) || !AnonymousClass0QM.A00(this.A06, r4.A06) || !AnonymousClass0QM.A00(this.A05, r4.A05)) {
            return false;
        }
        return true;
    }

    public String toString() {
        AnonymousClass0UM r2 = new AnonymousClass0UM(this);
        r2.A00(this.A00, "applicationId");
        r2.A00(this.A02, "apiKey");
        r2.A00(this.A03, "databaseUrl");
        r2.A00(this.A01, "gcmSenderId");
        r2.A00(this.A06, "storageBucket");
        r2.A00(this.A05, "projectId");
        return r2.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r3.trim().isEmpty() != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C19000uB(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L_0x0010
            java.lang.String r0 = r3.trim()
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            r1 = r0 ^ 1
            java.lang.String r0 = "ApplicationId must be set."
            X.AnonymousClass006.A08(r1, r0)
            r2.A00 = r3
            r2.A02 = r4
            r2.A03 = r5
            r2.A04 = r6
            r2.A01 = r7
            r2.A06 = r8
            r2.A05 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19000uB.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
