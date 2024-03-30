package X;

/* renamed from: X.3gs  reason: invalid class name and case insensitive filesystem */
public final class C71503gs implements C159417jK {
    public final C19730wQ A00;
    public final C19970wo A01;
    public final C29471Wt A02;
    public final C20810yC A03;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BV1() {
        /*
            r7 = this;
            X.0wQ r0 = r7.A00
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x003c
            X.0yC r1 = r7.A03
            r0 = 7388(0x1cdc, float:1.0353E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x003c
            X.1Wt r2 = r7.A02
            X.0wo r0 = r7.A01
            long r5 = X.C19970wo.A00(r0)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r5 = r5 - r0
            X.18P r0 = r2.A00
            X.1M0 r4 = r0.A04()
            X.14e r3 = r4.A02     // Catch:{ all -> 0x0035 }
            java.lang.String r2 = "DELETE FROM placeholder_retry_message WHERE peer_message_row_id IN (SELECT peer_message_row_id FROM placeholder_retry_message LEFT JOIN peer_messages ON placeholder_retry_message.peer_message_row_id = peer_messages._id WHERE placeholder_retry_message.timestamp < ? AND peer_messages._id IS NULL)"
            java.lang.String[] r1 = X.C36341k9.A1b(r5)     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "PlaceholderRetryMessageStore/getPlaceholderPeerRequestsBeforeTimestamp"
            r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x0035 }
            r4.close()
            return
        L_0x0035:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71503gs.BV1():void");
    }

    public C71503gs(C19730wQ r1, C19970wo r2, C29471Wt r3, C20810yC r4) {
        C36321k7.A18(r2, r4, r1, r3);
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
    }
}
