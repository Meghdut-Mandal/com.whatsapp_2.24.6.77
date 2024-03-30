package X;

/* renamed from: X.1Nl  reason: invalid class name and case insensitive filesystem */
public final class C27241Nl extends C229416o {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27241Nl(C229716r r2) {
        super(r2);
        AnonymousClass00C.A0D(r2, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(com.whatsapp.jid.UserJid r7, boolean r8) {
        /*
            r6 = this;
            java.lang.String r2 = "jid"
            r5 = 0
            X.AnonymousClass00C.A0D(r7, r5)
            X.16r r0 = r6.A00     // Catch:{ IllegalArgumentException -> 0x0039 }
            X.1M0 r4 = r0.A04()     // Catch:{ IllegalArgumentException -> 0x0039 }
            java.lang.String r3 = "wa_block_list_interop"
            r0 = 1
            if (r8 == 0) goto L_0x0021
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x0032 }
            r1.<init>(r0)     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x0032 }
            r1.put(r2, r0)     // Catch:{ all -> 0x0032 }
            X.C229416o.A05(r1, r4, r3)     // Catch:{ all -> 0x0032 }
            goto L_0x002e
        L_0x0021:
            java.lang.String r2 = "jid = ?"
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x0032 }
            r1[r5] = r0     // Catch:{ all -> 0x0032 }
            X.C229416o.A02(r4, r3, r2, r1)     // Catch:{ all -> 0x0032 }
        L_0x002e:
            r4.close()     // Catch:{ IllegalArgumentException -> 0x0039 }
            return
        L_0x0032:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ IllegalArgumentException -> 0x0039 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0039 }
        L_0x0039:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "contact-mgr-db/unable to update blocked state  "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            X.C18740tg.A08(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27241Nl.A00(com.whatsapp.jid.UserJid, boolean):void");
    }
}
