package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.1NZ  reason: invalid class name */
public final class AnonymousClass1NZ {
    public static final long A02 = TimeUnit.DAYS.toSeconds(7);
    public final C229716r A00;
    public final C19970wo A01;

    public AnonymousClass1NZ(C19970wo r2, C229716r r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A00 = r3;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(com.whatsapp.jid.UserJid r9) {
        /*
            r8 = this;
            r7 = 0
            if (r9 == 0) goto L_0x0048
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = r9.getRawString()
            r3[r7] = r0
            X.16r r0 = r8.A00
            X.1M0 r6 = r0.get()
            X.14e r2 = r6.A02     // Catch:{ all -> 0x003e }
            java.lang.String r1 = "SELECT EXISTS ( SELECT 1 FROM recently_accepted_deeplink_invites WHERE user_jid = ?) AS user_exists"
            java.lang.String r0 = "invite_accepted_exists"
            android.database.Cursor r5 = r2.A09(r1, r0, r3)     // Catch:{ all -> 0x003e }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = "user_exists"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0037 }
            long r3 = r5.getLong(r0)     // Catch:{ all -> 0x0037 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0033
            r7 = 1
        L_0x0033:
            r5.close()     // Catch:{ all -> 0x003e }
            goto L_0x0045
        L_0x0037:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)
            throw r0
        L_0x0045:
            r6.close()
        L_0x0048:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NZ.A01(com.whatsapp.jid.UserJid):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A00() {
        /*
            r8 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = java.lang.System.currentTimeMillis()
            long r6 = r2.toSeconds(r0)
            long r0 = A02
            long r6 = r6 - r0
            r0 = 3
            java.lang.String[] r3 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r0 = "clicked_invite_link"
            r3[r1] = r0
            java.lang.String r1 = java.lang.String.valueOf(r6)
            r0 = 1
            r3[r0] = r1
            r1 = 2
            java.lang.String r0 = "5"
            r3[r1] = r0
            X.16r r0 = r8.A00
            X.1M0 r4 = r0.get()
            X.14e r2 = r4.A02     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = "SELECT user_jid FROM recently_accepted_deeplink_invites WHERE invite_receiver_reason = ? AND invite_accepted_time>? ORDER BY invite_accepted_time DESC LIMIT ?;"
            java.lang.String r0 = "GET_RECENTLY_ACCEPTED_INVITES_CLICKED_LINK"
            android.database.Cursor r3 = r2.A09(r1, r0, r3)     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = "user_jid"
            int r2 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x005e }
        L_0x003c:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0057
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ 0wR -> 0x0050 }
            java.lang.String r0 = r3.getString(r2)     // Catch:{ 0wR -> 0x0050 }
            com.whatsapp.jid.UserJid r0 = X.C222813r.A01(r0)     // Catch:{ 0wR -> 0x0050 }
            r5.add(r0)     // Catch:{ 0wR -> 0x0050 }
            goto L_0x003c
        L_0x0050:
            r1 = move-exception
            java.lang.String r0 = "RecentlyAcceptedInvitesStore/invalid user jid"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x005e }
            goto L_0x003c
        L_0x0057:
            r3.close()     // Catch:{ all -> 0x0065 }
            r4.close()
            return r5
        L_0x005e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x0065 }
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NZ.A00():java.util.ArrayList");
    }
}
