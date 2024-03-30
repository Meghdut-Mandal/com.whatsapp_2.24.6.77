package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6Nb  reason: invalid class name and case insensitive filesystem */
public final class C130946Nb {
    public static final C223313w A00(String str) {
        C223313w r1;
        AnonymousClass00C.A0D(str, 0);
        UserJid A04 = UserJid.JID_FACTORY.A04(str, "lid");
        AnonymousClass00C.A08(A04);
        if ((A04 instanceof C223313w) && (r1 = (C223313w) A04) != null) {
            return r1;
        }
        throw new C19740wR(AnonymousClass000.A0p("invalid lid: ", str, AnonymousClass000.A0u()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r4.length() == 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C223313w A01(java.lang.String r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0009
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            r2 = 0
            if (r0 != 0) goto L_0x001e
            X.13w r1 = A00(r4)     // Catch:{ all -> 0x0012 }
            goto L_0x0017
        L_0x0012:
            r0 = move-exception
            X.03N r1 = X.C90524aI.A0t(r0)
        L_0x0017:
            boolean r0 = r1 instanceof X.AnonymousClass03N
            if (r0 != 0) goto L_0x001c
            r2 = r1
        L_0x001c:
            X.13w r2 = (X.C223313w) r2
        L_0x001e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130946Nb.A01(java.lang.String):X.13w");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r4.length() == 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C223313w A02(java.lang.String r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0009
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            r2 = 0
            if (r0 != 0) goto L_0x0038
            X.13o r0 = com.whatsapp.jid.Jid.Companion     // Catch:{ all -> 0x002c }
            com.whatsapp.jid.Jid r1 = X.C222513o.A00(r4)     // Catch:{ all -> 0x002c }
            boolean r0 = r1 instanceof X.C223313w     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x001c
            X.13w r1 = (X.C223313w) r1     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x001c
            goto L_0x0031
        L_0x001c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x002c }
            java.lang.String r0 = "invalid lid: "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r4, r1)     // Catch:{ all -> 0x002c }
            X.0wR r0 = new X.0wR     // Catch:{ all -> 0x002c }
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x002c }
            throw r0     // Catch:{ all -> 0x002c }
        L_0x002c:
            r0 = move-exception
            X.03N r1 = X.C90524aI.A0t(r0)
        L_0x0031:
            boolean r0 = r1 instanceof X.AnonymousClass03N
            if (r0 != 0) goto L_0x0036
            r2 = r1
        L_0x0036:
            X.13w r2 = (X.C223313w) r2
        L_0x0038:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130946Nb.A02(java.lang.String):X.13w");
    }
}
