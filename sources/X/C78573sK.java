package X;

/* renamed from: X.3sK  reason: invalid class name and case insensitive filesystem */
public final class C78573sK implements C17810s4 {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BmI(X.AnonymousClass3T1 r8, X.C52942qQ r9) {
        /*
            r7 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r8, r0)
            boolean r0 = r8 instanceof X.AnonymousClass2bI
            if (r0 != 0) goto L_0x0097
            int r1 = r8.A1I
            r0 = 10
            if (r1 == r0) goto L_0x0097
            r0 = 90
            if (r1 == r0) goto L_0x0097
            X.3Qa r2 = r8.A1J
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0065
            X.005 r0 = r7.A00
            java.lang.Object r1 = r0.get()
            X.17X r1 = (X.AnonymousClass17X) r1
            X.11F r0 = r2.A00
            boolean r1 = r1.A0B(r0)
            com.whatsapp.jid.DeviceJid r0 = r8.A1T
            if (r0 != 0) goto L_0x0065
            X.005 r0 = r7.A02
            java.lang.Object r0 = r0.get()
            X.0wQ r0 = (X.C19730wQ) r0
            if (r1 == 0) goto L_0x005f
            X.8du r1 = r0.A07()
        L_0x0038:
            if (r1 == 0) goto L_0x0097
            X.005 r0 = r7.A01
            java.lang.Object r0 = r0.get()
            X.12j r0 = (X.C219712j) r0
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            long r1 = r0.A07(r1)
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0097
            X.005 r0 = r7.A03
            java.lang.Object r0 = r0.get()
            X.1FE r0 = (X.AnonymousClass1FE) r0
            long r3 = r8.A1N
            X.12P r0 = r0.A01
            X.1M0 r6 = r0.A05()
            goto L_0x0068
        L_0x005f:
            r0.A0G()
            X.13x r1 = r0.A02
            goto L_0x0038
        L_0x0065:
            com.whatsapp.jid.DeviceJid r1 = r8.A1T
            goto L_0x0038
        L_0x0068:
            r0 = 2
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x008d }
            r5.<init>(r0)     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "message_row_id"
            X.C36341k9.A0p(r5, r0, r3)     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "author_device_jid"
            X.C36341k9.A0p(r5, r0, r1)     // Catch:{ all -> 0x008d }
            X.14e r2 = r6.A02     // Catch:{ all -> 0x008d }
            java.lang.String r1 = "message_details"
            java.lang.String r0 = "MessageDetailsStore/insertMessageDetails"
            r2.A04(r1, r0, r5)     // Catch:{ all -> 0x008d }
            r6.close()
            if (r9 == 0) goto L_0x0097
            java.lang.Class<X.3sK> r0 = X.C78573sK.class
            java.lang.NullPointerException r0 = X.C36321k7.A04(r0)
            throw r0
        L_0x008d:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0092 }
            throw r1
        L_0x0092:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78573sK.BmI(X.3T1, X.2qQ):void");
    }

    public C78573sK(AnonymousClass005 r1, AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4) {
        C36321k7.A18(r1, r2, r3, r4);
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = r4;
    }
}
