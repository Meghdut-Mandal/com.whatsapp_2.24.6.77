package X;

import android.text.TextUtils;

/* renamed from: X.1CF  reason: invalid class name */
public class AnonymousClass1CF {
    public String[] A00;
    public String[] A01;
    public final C20810yC A02;
    public final AnonymousClass16D A03;
    public final C18820ts A04;

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008c, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A02(com.whatsapp.jid.Jid r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r8 instanceof X.AnonymousClass11F     // Catch:{ all -> 0x008d }
            r6 = 0
            if (r0 == 0) goto L_0x008b
            X.11F r8 = (X.AnonymousClass11F) r8     // Catch:{ all -> 0x008d }
            boolean r0 = X.AnonymousClass143.A0G(r8)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0018
            X.16D r0 = r7.A03     // Catch:{ all -> 0x008d }
            X.141 r0 = r0.A0D(r8)     // Catch:{ all -> 0x008d }
            boolean r0 = r0.A0i     // Catch:{ all -> 0x008d }
            monitor-exit(r7)
            return r0
        L_0x0018:
            boolean r0 = r8 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x008b
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8     // Catch:{ all -> 0x008d }
            java.lang.String[] r5 = r7.A01     // Catch:{ all -> 0x008d }
            if (r5 != 0) goto L_0x0034
            X.0yC r1 = r7.A02     // Catch:{ all -> 0x008d }
            r0 = 1031(0x407, float:1.445E-42)
            java.lang.String r1 = r1.A09(r0)     // Catch:{ all -> 0x008d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0039
            java.lang.String[] r5 = new java.lang.String[r6]     // Catch:{ all -> 0x008d }
        L_0x0032:
            r7.A01 = r5     // Catch:{ all -> 0x008d }
        L_0x0034:
            java.lang.String r4 = r8.user     // Catch:{ all -> 0x008d }
            int r3 = r5.length     // Catch:{ all -> 0x008d }
            r2 = 0
            goto L_0x0040
        L_0x0039:
            java.lang.String r0 = ","
            java.lang.String[] r5 = r1.split(r0)     // Catch:{ all -> 0x008d }
            goto L_0x0032
        L_0x0040:
            if (r2 >= r3) goto L_0x0054
            r1 = r5[r2]     // Catch:{ all -> 0x008d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x0051
            boolean r0 = r4.startsWith(r1)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0051
            goto L_0x008a
        L_0x0051:
            int r2 = r2 + 1
            goto L_0x0040
        L_0x0054:
            java.lang.String[] r5 = r7.A00     // Catch:{ all -> 0x008d }
            if (r5 != 0) goto L_0x006a
            X.0yC r1 = r7.A02     // Catch:{ all -> 0x008d }
            r0 = 4799(0x12bf, float:6.725E-42)
            java.lang.String r1 = r1.A09(r0)     // Catch:{ all -> 0x008d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x006f
            java.lang.String[] r5 = new java.lang.String[r6]     // Catch:{ all -> 0x008d }
        L_0x0068:
            r7.A00 = r5     // Catch:{ all -> 0x008d }
        L_0x006a:
            java.lang.String r4 = r8.user     // Catch:{ all -> 0x008d }
            int r3 = r5.length     // Catch:{ all -> 0x008d }
            r2 = 0
            goto L_0x0076
        L_0x006f:
            java.lang.String r0 = ","
            java.lang.String[] r5 = r1.split(r0)     // Catch:{ all -> 0x008d }
            goto L_0x0068
        L_0x0076:
            if (r2 >= r3) goto L_0x008b
            r1 = r5[r2]     // Catch:{ all -> 0x008d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x0087
            boolean r0 = r4.startsWith(r1)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0087
            goto L_0x008a
        L_0x0087:
            int r2 = r2 + 1
            goto L_0x0076
        L_0x008a:
            r6 = 1
        L_0x008b:
            monitor-exit(r7)
            return r6
        L_0x008d:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CF.A02(com.whatsapp.jid.Jid):boolean");
    }

    public boolean A00() {
        C20810yC r2 = this.A02;
        if (C20800yB.A01(C21000yV.A02, r2, 233)) {
            String A09 = r2.A09(379);
            if (!TextUtils.isEmpty(A09)) {
                String A06 = this.A04.A06();
                String[] split = A09.split(",");
                int length = split.length;
                int i = 0;
                while (i < length) {
                    if (!split[i].equals(A06)) {
                        i++;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean A01(AnonymousClass11F r4) {
        if (!C20800yB.A01(C21000yV.A02, this.A02, 3003) || !A00() || !A02(r4)) {
            return true;
        }
        return false;
    }

    public AnonymousClass1CF(AnonymousClass16D r1, C18820ts r2, C20810yC r3) {
        this.A02 = r3;
        this.A04 = r2;
        this.A03 = r1;
    }
}
