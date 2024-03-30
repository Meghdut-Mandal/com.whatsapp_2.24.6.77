package X;

import java.util.ArrayList;

/* renamed from: X.1ZT  reason: invalid class name */
public final class AnonymousClass1ZT {
    public final C19730wQ A00;
    public final C220412q A01;
    public final C26141Ja A02;
    public final AnonymousClass1ZX A03;
    public final AnonymousClass1ZZ A04;
    public final AnonymousClass1GQ A05;
    public final AnonymousClass1ZU A06;
    public final AnonymousClass1SL A07;
    public final AnonymousClass1ZL A08;
    public final AnonymousClass1LX A09;
    public final C19700wN A0A;
    public final C30061Zb A0B;
    public final AnonymousClass1ZJ A0C;
    public final AnonymousClass1ZV A0D;

    public AnonymousClass1ZT(C19700wN r2, C19730wQ r3, C220412q r4, C26141Ja r5, AnonymousClass1ZX r6, AnonymousClass1ZZ r7, AnonymousClass1GQ r8, AnonymousClass1ZU r9, C30061Zb r10, AnonymousClass1ZJ r11, AnonymousClass1ZV r12, AnonymousClass1SL r13, AnonymousClass1ZL r14, AnonymousClass1LX r15) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r5, 5);
        AnonymousClass00C.A0D(r8, 6);
        AnonymousClass00C.A0D(r12, 10);
        AnonymousClass00C.A0D(r13, 11);
        AnonymousClass00C.A0D(r6, 12);
        AnonymousClass00C.A0D(r7, 13);
        AnonymousClass00C.A0D(r10, 14);
        this.A0A = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A09 = r15;
        this.A02 = r5;
        this.A05 = r8;
        this.A0C = r11;
        this.A08 = r14;
        this.A06 = r9;
        this.A0D = r12;
        this.A07 = r13;
        this.A03 = r6;
        this.A04 = r7;
        this.A0B = r10;
    }

    public void A02(C44072La r3) {
        ArrayList A022 = AnonymousClass03T.A02(r3);
        this.A02.A0A(A022);
        this.A08.A0G(A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009c, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C52382pL r6, X.C28981Uw r7, com.whatsapp.jid.PhoneUserJid r8, com.whatsapp.jid.PhoneUserJid r9, X.AnonymousClass1ZT r10, boolean r11) {
        /*
            if (r6 == 0) goto L_0x008f
            X.2pL r0 = X.C52382pL.ADMIN
            if (r6 != r0) goto L_0x008f
        L_0x0006:
            X.0wQ r1 = r10.A00
            boolean r0 = r1.A0M(r8)
            if (r0 == 0) goto L_0x0081
            X.1Zb r4 = r10.A0B
            X.1TX r3 = r4.A01
            r2 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]
            X.12j r0 = r3.A01
            long r0 = r0.A07(r7)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6[r2] = r0
            X.12P r0 = r3.A02
            X.1M0 r3 = r0.get()
            X.14e r2 = r3.A02     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = "SELECT message_row_id FROM message_newsletter_admin_invite WHERE newsletter_jid_row_id = ? AND expiration != 0 "
            java.lang.String r0 = "GET_NEWSLETTER_ADMIN_INVITE_MESSAGES_BY_NEWSLETTER_SQL"
            android.database.Cursor r2 = r2.A09(r1, r0, r6)     // Catch:{ all -> 0x0099 }
        L_0x0037:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = "message_row_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0092 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0092 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0092 }
            r5.add(r0)     // Catch:{ all -> 0x0092 }
            goto L_0x0037
        L_0x004f:
            r2.close()     // Catch:{ all -> 0x0099 }
            r3.close()
            java.util.Iterator r3 = r5.iterator()
        L_0x0059:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0091
            java.lang.Object r0 = r3.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r1 = r0.longValue()
            X.1A1 r0 = r4.A02
            X.175 r0 = r0.A01
            X.3T1 r2 = r0.A01(r1)
            X.2bP r2 = (X.AnonymousClass2bP) r2
            if (r2 == 0) goto L_0x0059
            r0 = 0
            r2.A00 = r0
            X.0xM r1 = r4.A00
            r0 = 21
            r1.A0n(r2, r0)
            goto L_0x0059
        L_0x0081:
            boolean r0 = r1.A0M(r9)
            if (r0 != 0) goto L_0x0089
            if (r11 == 0) goto L_0x0091
        L_0x0089:
            X.1Zb r0 = r10.A0B
            r0.A00(r7, r8)
            return
        L_0x008f:
            if (r11 != 0) goto L_0x0006
        L_0x0091:
            return
        L_0x0092:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0099 }
            throw r0     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009b }
        L_0x009b:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZT.A00(X.2pL, X.1Uw, com.whatsapp.jid.PhoneUserJid, com.whatsapp.jid.PhoneUserJid, X.1ZT, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0081, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C52382pL r13, X.C28981Uw r14, com.whatsapp.jid.PhoneUserJid r15, X.AnonymousClass1ZT r16) {
        /*
            r3 = r16
            X.0wQ r0 = r3.A00
            boolean r0 = r0.A0M(r15)
            if (r0 == 0) goto L_0x0015
            X.1Ja r0 = r3.A02
            r0.A07(r13, r14)
            X.1ZJ r0 = r3.A0C
            r0.A06(r14)
        L_0x0014:
            return
        L_0x0015:
            X.1GQ r0 = r3.A05
            X.0yC r2 = r0.A00
            r1 = 7244(0x1c4c, float:1.0151E-41)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0014
            X.1ZV r2 = r3.A0D
            r10 = 0
            r9 = 1
            r6 = 2
            X.163 r0 = r2.A00
            long r7 = r0.A08(r14)
            X.12O r0 = r2.A03
            X.13w r1 = r0.A09(r15)
            if (r1 == 0) goto L_0x0014
            X.12j r0 = r2.A01
            long r4 = r0.A07(r1)
            android.content.ContentValues r12 = new android.content.ContentValues
            r12.<init>()
            int r0 = r13.value
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "role"
            r12.put(r0, r1)
            java.lang.String r14 = "chat_row_id = ? AND jid_row_id = ?"
            X.12P r0 = r2.A02
            X.1M0 r3 = r0.A05()
            X.71s r2 = r3.B1k()     // Catch:{ all -> 0x0082 }
            X.14e r11 = r3.A02     // Catch:{ all -> 0x007b }
            java.lang.String r13 = "newsletter_subscribers"
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ all -> 0x007b }
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x007b }
            r1[r10] = r0     // Catch:{ all -> 0x007b }
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x007b }
            r1[r9] = r0     // Catch:{ all -> 0x007b }
            java.lang.String r15 = "UPDATE_NEWSLETTER_SUBSCRIBER_MEMBERSHIP"
            r16 = r1
            r11.A01(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x007b }
            r2.A00()     // Catch:{ all -> 0x007b }
            r2.close()     // Catch:{ all -> 0x0082 }
            r3.close()
            return
        L_0x007b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007d }
        L_0x007d:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0082 }
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZT.A01(X.2pL, X.1Uw, com.whatsapp.jid.PhoneUserJid, X.1ZT):void");
    }

    public void A03(C28981Uw r3, boolean z) {
        C51952oe r1;
        this.A02.A09(r3, z);
        this.A08.A0F(r3);
        if (z) {
            r1 = C51952oe.MUTE;
        } else {
            r1 = C51952oe.UNMUTE;
        }
        this.A03.A00(r3, r1);
    }

    public void A04(String str) {
        C19700wN r2 = this.A0A;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("/NewsletterUnexpectedError");
        r2.A0E(sb.toString(), str, true);
    }
}
