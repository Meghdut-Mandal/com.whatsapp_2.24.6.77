package X;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.6so  reason: invalid class name and case insensitive filesystem */
public final class C144786so implements C159417jK {
    public final AnonymousClass18M A00;
    public final C21010yW A01;
    public final C219712j A02;
    public final C20810yC A03;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
        r1 = X.C36441kJ.A1R();
        X.C36431kI.A1O(r1, r6, 0);
        r4 = r2.A09(r4, "GET_PHONE_NUMBERS_AXOLOTL", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r5 = r4.getColumnIndexOrThrow(r20);
        r2 = r4.getColumnIndexOrThrow("_id");
        r11 = X.AnonymousClass001.A0I();
        r6 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008b, code lost:
        if (r4.moveToNext() == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008d, code lost:
        r11.add(X.AnonymousClass000.A0q("@s.whatsapp.net", X.AnonymousClass000.A0v(r4.getString(r5))));
        r6 = r4.getInt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a3, code lost:
        r1 = r9.A02;
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ab, code lost:
        if (r11.isEmpty() != false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ad, code lost:
        r5 = r1.A01.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r10 = r5.A02;
        r1 = r11.size();
        r12 = X.AnonymousClass000.A0u();
        X.C36351kA.A1O("SELECT COUNT(*) AS count FROM jid LEFT JOIN jid_map ON _id == jid_row_id WHERE raw_string IN ", r12, r1);
        r12.append(" AND ");
        r12.append(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        r12.append(" = ");
        r12.append(0);
        r12.append(" AND ");
        r12.append("jid_row_id");
        r2 = r10.A09(X.AnonymousClass000.A0q(" IS NULL", r12), "GET_PN_WITH_LID_MISSING_COUNT", X.C36371kC.A1b(r11, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f1, code lost:
        if (r2.moveToNext() == false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f3, code lost:
        r13 = X.C36351kA.A07(r2, "count");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0100, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0101, code lost:
        if (r2 != null) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0107, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0111, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0115, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0116, code lost:
        r15 = r15 + r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0122, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        X.C05600Qi.A00(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x012a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x012b, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x012e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x012f, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0134, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        r2 = X.AnonymousClass000.A0u();
        r2.append("Unrecognized table: ");
        r1 = X.AnonymousClass000.A0c(r1, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long A00(java.lang.Long r18, java.lang.String r19, java.lang.String r20) {
        /*
            r17 = this;
            java.lang.String r8 = "_id"
            r3 = 0
            if (r18 == 0) goto L_0x000f
            long r1 = r18.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x000f
            return r3
        L_0x000f:
            r9 = r17
            X.18M r0 = r9.A00
            X.1M0 r3 = r0.get()
            r7 = -1
            r15 = 0
            r6 = -1
        L_0x001b:
            X.14e r2 = r3.A02     // Catch:{ IllegalArgumentException -> 0x012f, all -> 0x0128 }
            r1 = r19
            int r0 = r1.hashCode()     // Catch:{ IllegalArgumentException -> 0x012f, all -> 0x0128 }
            switch(r0) {
                case -1618015780: goto L_0x0060;
                case -331002583: goto L_0x0055;
                case 870180286: goto L_0x004a;
                case 925837205: goto L_0x003f;
                case 1405079709: goto L_0x0034;
                default: goto L_0x0026;
            }     // Catch:{ IllegalArgumentException -> 0x012f, all -> 0x0128 }
        L_0x0026:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ IllegalArgumentException -> 0x012f, all -> 0x0128 }
            java.lang.String r0 = "Unrecognized table: "
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x012f, all -> 0x0128 }
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0c(r1, r2)     // Catch:{ IllegalArgumentException -> 0x012f, all -> 0x0128 }
        L_0x0033:
            throw r1     // Catch:{ IllegalArgumentException -> 0x012f, all -> 0x0128 }
        L_0x0034:
            java.lang.String r0 = "sessions"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x012f, all -> 0x0128 }
            if (r0 == 0) goto L_0x0026
            java.lang.String r4 = "SELECT DISTINCT(recipient_id), _id  FROM sessions WHERE _id > ? AND recipient_type == 0 ORDER BY _id ASC LIMIT 975"
            goto L_0x006a
        L_0x003f:
            java.lang.String r0 = "fast_ratchet_sender_keys"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x012f, all -> 0x0128 }
            if (r0 == 0) goto L_0x0026
            java.lang.String r4 = "SELECT DISTINCT(sender_id), _id FROM fast_ratchet_sender_keys WHERE _id > ? AND sender_type == 0 ORDER BY _id ASC LIMIT 975"
            goto L_0x006a
        L_0x004a:
            java.lang.String r0 = "sender_keys"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x012f, all -> 0x0128 }
            if (r0 == 0) goto L_0x0026
            java.lang.String r4 = "SELECT DISTINCT(sender_id), _id FROM sender_keys WHERE _id > ? AND sender_type == 0 ORDER BY _id ASC LIMIT 975"
            goto L_0x006a
        L_0x0055:
            java.lang.String r0 = "message_base_key"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x012f, all -> 0x0128 }
            if (r0 == 0) goto L_0x0026
            java.lang.String r4 = "SELECT DISTINCT(recipient_id), _id FROM message_base_key WHERE _id > ? AND recipient_type == 0 ORDER BY _id ASC LIMIT 975"
            goto L_0x006a
        L_0x0060:
            java.lang.String r0 = "identities"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x012f, all -> 0x0128 }
            if (r0 == 0) goto L_0x0026
            java.lang.String r4 = "SELECT DISTINCT(recipient_id), _id FROM identities WHERE _id > ? AND recipient_type == 0 ORDER BY _id ASC LIMIT 975"
        L_0x006a:
            java.lang.String[] r1 = X.C36441kJ.A1R()     // Catch:{ IllegalArgumentException -> 0x012f, all -> 0x0128 }
            r0 = 0
            X.C36431kI.A1O(r1, r6, r0)     // Catch:{ IllegalArgumentException -> 0x012f, all -> 0x0128 }
            java.lang.String r0 = "GET_PHONE_NUMBERS_AXOLOTL"
            android.database.Cursor r4 = r2.A09(r4, r0, r1)     // Catch:{ IllegalArgumentException -> 0x012f, all -> 0x0128 }
            r0 = r20
            int r5 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0120 }
            int r2 = r4.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x0120 }
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0120 }
            r6 = -1
        L_0x0087:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0120 }
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = r4.getString(r5)     // Catch:{ all -> 0x0120 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r0)     // Catch:{ all -> 0x0120 }
            java.lang.String r0 = "@s.whatsapp.net"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x0120 }
            r11.add(r0)     // Catch:{ all -> 0x0120 }
            int r6 = r4.getInt(r2)     // Catch:{ all -> 0x0120 }
            goto L_0x0087
        L_0x00a3:
            X.12j r1 = r9.A02     // Catch:{ all -> 0x0120 }
            boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x0120 }
            r13 = 0
            if (r0 != 0) goto L_0x0116
            X.12P r0 = r1.A01     // Catch:{ all -> 0x0120 }
            X.1M0 r5 = r0.get()     // Catch:{ all -> 0x0120 }
            X.14e r10 = r5.A02     // Catch:{ all -> 0x010c }
            int r1 = r11.size()     // Catch:{ all -> 0x010c }
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x010c }
            java.lang.String r0 = "SELECT COUNT(*) AS count FROM jid LEFT JOIN jid_map ON _id == jid_row_id WHERE raw_string IN "
            X.C36351kA.A1O(r0, r12, r1)     // Catch:{ all -> 0x010c }
            java.lang.String r2 = " AND "
            r12.append(r2)     // Catch:{ all -> 0x010c }
            java.lang.String r0 = "type"
            r12.append(r0)     // Catch:{ all -> 0x010c }
            java.lang.String r0 = " = "
            r12.append(r0)     // Catch:{ all -> 0x010c }
            r1 = 0
            r12.append(r1)     // Catch:{ all -> 0x010c }
            r12.append(r2)     // Catch:{ all -> 0x010c }
            java.lang.String r0 = "jid_row_id"
            r12.append(r0)     // Catch:{ all -> 0x010c }
            java.lang.String r0 = " IS NULL"
            java.lang.String r2 = X.AnonymousClass000.A0q(r0, r12)     // Catch:{ all -> 0x010c }
            java.lang.String[] r1 = X.C36371kC.A1b(r11, r1)     // Catch:{ all -> 0x010c }
            java.lang.String r0 = "GET_PN_WITH_LID_MISSING_COUNT"
            android.database.Cursor r2 = r10.A09(r2, r0, r1)     // Catch:{ all -> 0x010c }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0100 }
            if (r0 == 0) goto L_0x00f9
            java.lang.String r0 = "count"
            long r13 = X.C36351kA.A07(r2, r0)     // Catch:{ all -> 0x0100 }
        L_0x00f9:
            r2.close()     // Catch:{ all -> 0x010c }
            r5.close()     // Catch:{ all -> 0x0120 }
            goto L_0x0116
        L_0x0100:
            r1 = move-exception
            if (r2 == 0) goto L_0x010b
            r2.close()     // Catch:{ all -> 0x0107 }
            goto L_0x010b
        L_0x0107:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x010c }
        L_0x010b:
            throw r1     // Catch:{ all -> 0x010c }
        L_0x010c:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0111 }
            goto L_0x0115
        L_0x0111:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0120 }
        L_0x0115:
            throw r1     // Catch:{ all -> 0x0120 }
        L_0x0116:
            long r15 = r15 + r13
            r4.close()     // Catch:{ IllegalArgumentException -> 0x012f, all -> 0x0128 }
            if (r6 != r7) goto L_0x001b
            r3.close()
            return r15
        L_0x0120:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0122 }
        L_0x0122:
            r1 = move-exception
            X.C05600Qi.A00(r4, r0)     // Catch:{ IllegalArgumentException -> 0x012f, all -> 0x0128 }
            goto L_0x0033
        L_0x0128:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x012a }
        L_0x012a:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        L_0x012f:
            r3.close()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144786so.A00(java.lang.Long, java.lang.String, java.lang.String):long");
    }

    public void BV1() {
        if (this.A03.A0E(5842)) {
            C224114e BJK = this.A00.BJK();
            AnonymousClass00C.A08(BJK);
            AnonymousClass582 r6 = new AnonymousClass582();
            SQLiteDatabase sQLiteDatabase = BJK.A00;
            r6.A00 = Long.valueOf(DatabaseUtils.queryNumEntries(sQLiteDatabase, "fast_ratchet_sender_keys"));
            r6.A04 = Long.valueOf(DatabaseUtils.queryNumEntries(sQLiteDatabase, "sessions"));
            r6.A03 = Long.valueOf(DatabaseUtils.queryNumEntries(sQLiteDatabase, "sender_keys"));
            r6.A01 = Long.valueOf(DatabaseUtils.queryNumEntries(sQLiteDatabase, "identities"));
            r6.A02 = Long.valueOf(DatabaseUtils.queryNumEntries(sQLiteDatabase, "message_base_key"));
            C21010yW r3 = this.A01;
            r3.Bly(r6);
            AnonymousClass583 r2 = new AnonymousClass583();
            r2.A00 = Long.valueOf(A00(r6.A00, "fast_ratchet_sender_keys", "sender_id"));
            r2.A04 = Long.valueOf(A00(r6.A04, "sessions", "recipient_id"));
            r2.A03 = Long.valueOf(A00(r6.A03, "sender_keys", "sender_id"));
            r2.A01 = Long.valueOf(A00(r6.A01, "identities", "recipient_id"));
            r2.A02 = Long.valueOf(A00(r6.A02, "message_base_key", "recipient_id"));
            r3.Bly(r2);
        }
    }

    public C144786so(C219712j r1, AnonymousClass18M r2, C20810yC r3, C21010yW r4) {
        C36321k7.A18(r3, r1, r4, r2);
        this.A03 = r3;
        this.A02 = r1;
        this.A01 = r4;
        this.A00 = r2;
    }
}
