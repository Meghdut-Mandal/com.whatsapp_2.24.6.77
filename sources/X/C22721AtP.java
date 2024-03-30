package X;

/* renamed from: X.AtP  reason: case insensitive filesystem */
public class C22721AtP extends C21875Ac1 {
    public C22720AtO A00;
    public final Object A01;
    public volatile int A02;
    public volatile boolean A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22721AtP(X.C22606ArY r9, X.C22844Awt r10) {
        /*
            r8 = this;
            r4 = r9
            X.Ary r0 = r9.A03     // Catch:{ Exception -> 0x0059 }
            java.lang.String r3 = X.C202849ml.A01(r0)     // Catch:{ Exception -> 0x0059 }
            X.11z r0 = r0.A00     // Catch:{ Exception -> 0x0048 }
            if (r0 != 0) goto L_0x000d
            r6 = 0
            goto L_0x0011
        L_0x000d:
            byte[] r6 = X.C165597tg.A1V(r0)     // Catch:{ Exception -> 0x0048 }
        L_0x0011:
            X.122 r0 = X.C22634As0.A0K     // Catch:{ Exception -> 0x0041 }
            java.lang.String r2 = r0.A01     // Catch:{ Exception -> 0x0041 }
            X.ArR r0 = r9.A04     // Catch:{ Exception -> 0x0041 }
            X.Ara r1 = r0.A04     // Catch:{ Exception -> 0x0041 }
            if (r1 == 0) goto L_0x0034
            X.122 r0 = X.C165617ti.A0f(r2)     // Catch:{ Exception -> 0x0041 }
            X.As0 r0 = X.C22608Ara.A00(r0, r1)     // Catch:{ Exception -> 0x0041 }
            if (r0 == 0) goto L_0x0034
            X.AsP r0 = r0.A01     // Catch:{ Exception -> 0x0041 }
            if (r0 == 0) goto L_0x0034
            byte[] r0 = r0.A00     // Catch:{ Exception -> 0x0041 }
            if (r0 == 0) goto L_0x0034
            X.Arw r0 = X.C22630Arw.A00(r0)     // Catch:{ Exception -> 0x0041 }
            boolean r7 = r0.A02     // Catch:{ Exception -> 0x0041 }
            goto L_0x0035
        L_0x0034:
            r7 = 0
        L_0x0035:
            r2 = r8
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r0 = X.C36441kJ.A11()
            r8.A01 = r0
            return
        L_0x0041:
            r1 = move-exception
            X.Abo r0 = new X.Abo
            r0.<init>(r1)
            throw r0
        L_0x0048:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CRL contents invalid: "
            java.lang.String r1 = X.AnonymousClass000.A0l(r2, r0, r1)
            java.security.cert.CRLException r0 = new java.security.cert.CRLException
            r0.<init>(r1)
            throw r0
        L_0x0059:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CRL contents invalid: "
            java.lang.String r1 = X.AnonymousClass000.A0l(r2, r0, r1)
            java.security.cert.CRLException r0 = new java.security.cert.CRLException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22721AtP.<init>(X.ArY, X.Awt):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000f, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r7 = getEncoded();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C22720AtO A00() {
        /*
            r9 = this;
            java.lang.Object r1 = r9.A01
            monitor-enter(r1)
            X.AtO r0 = r9.A00     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r1)     // Catch:{ all -> 0x002c }
            return r0
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x002c }
            byte[] r7 = r9.getEncoded()     // Catch:{ CRLException -> 0x000f }
            goto L_0x0010
        L_0x000f:
            r7 = 0
        L_0x0010:
            X.Awt r5 = r9.A02
            X.ArY r4 = r9.A01
            java.lang.String r3 = r9.A00
            byte[] r6 = r9.A04
            boolean r8 = r9.A03
            X.AtO r2 = new X.AtO
            r2.<init>(r3, r4, r5, r6, r7, r8)
            monitor-enter(r1)
            X.AtO r0 = r9.A00     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0027
            r9.A00 = r2     // Catch:{ all -> 0x0029 }
            r0 = r2
        L_0x0027:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return r0
        L_0x0029:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r0
        L_0x002c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22721AtP.A00():X.AtO");
    }

    public int hashCode() {
        if (!this.A03) {
            this.A02 = A00().hashCode();
            this.A03 = true;
        }
        return this.A02;
    }

    public boolean equals(Object obj) {
        C22586ArE arE;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C22721AtP) {
            C22721AtP atP = (C22721AtP) obj;
            if (!this.A03 || !atP.A03) {
                if ((this.A00 == null || atP.A00 == null) && (arE = this.A01.A02) != null && !arE.A0G(atP.A01.A02)) {
                    return false;
                }
            } else if (this.A02 != atP.A02) {
                return false;
            }
        }
        return A00().equals(obj);
    }
}
