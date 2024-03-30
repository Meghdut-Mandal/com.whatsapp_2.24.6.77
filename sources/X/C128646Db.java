package X;

/* renamed from: X.6Db  reason: invalid class name and case insensitive filesystem */
public final class C128646Db {
    public final int A00;
    public final int A01;
    public final AnonymousClass5HN A02;
    public final AnonymousClass5HO A03;
    public final AnonymousClass5HO A04;
    public final AnonymousClass6CS A05;
    public final String A06;

    public C128646Db(AnonymousClass5HN r2, AnonymousClass5HO r3, AnonymousClass5HO r4, AnonymousClass6CS r5, String str, int i, int i2) {
        AnonymousClass00C.A0D(str, 7);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r2;
        this.A04 = r3;
        this.A03 = r4;
        this.A05 = r5;
        this.A06 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r1 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        r1 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        r1 = r3.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        r1 = r3.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r2 = 1
            if (r3 == r4) goto L_0x0062
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r0 = X.C90474aD.A0W(r4)
            boolean r1 = X.AnonymousClass00C.A0J(r1, r0)
            r0 = 0
            if (r1 != 0) goto L_0x0013
            return r0
        L_0x0013:
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.privacy.usernotice.UserNoticeContent"
            X.AnonymousClass00C.A0E(r4, r0)
            X.6Db r4 = (X.C128646Db) r4
            int r1 = r3.A00
            int r0 = r4.A00
            if (r1 != r0) goto L_0x0061
            int r1 = r3.A01
            int r0 = r4.A01
            if (r1 != r0) goto L_0x0061
            X.5HN r1 = r3.A02
            if (r1 == 0) goto L_0x0032
            X.5HN r0 = r4.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0061
        L_0x0032:
            X.5HO r1 = r3.A04
            if (r1 == 0) goto L_0x003e
            X.5HO r0 = r4.A04
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0061
        L_0x003e:
            X.5HO r1 = r3.A03
            if (r1 == 0) goto L_0x004a
            X.5HO r0 = r4.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0061
        L_0x004a:
            X.6CS r1 = r3.A05
            if (r1 == 0) goto L_0x0056
            X.6CS r0 = r4.A05
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0061
        L_0x0056:
            java.lang.String r1 = r3.A06
            java.lang.String r0 = r4.A06
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0061
            return r2
        L_0x0061:
            r2 = 0
        L_0x0062:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128646Db.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int A0J = ((((((((this.A00 * 31) + this.A01) * 31) + AnonymousClass000.A0J(this.A02)) * 31) + AnonymousClass000.A0J(this.A04)) * 31) + AnonymousClass000.A0J(this.A03)) * 31;
        AnonymousClass6CS r0 = this.A05;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return C90504aG.A0B(this.A06, (A0J + i) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UserNoticeContent{policyVersion=");
        A0u.append(this.A01);
        A0u.append(", banner=");
        A0u.append(this.A02);
        A0u.append(", modal=");
        A0u.append(this.A04);
        A0u.append(", blockingModal=");
        A0u.append(this.A03);
        A0u.append(", badged=");
        return C90464aC.A0X(this.A05, A0u);
    }
}
