package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.17S  reason: invalid class name */
public class AnonymousClass17S {
    public static final int[] A0D = {0, 1, 3, 2, 20, 9, 66, 23};
    public final AnonymousClass16D A00;
    public final AnonymousClass163 A01;
    public final C220412q A02;
    public final AnonymousClass17X A03;
    public final AnonymousClass12P A04;
    public final AnonymousClass17T A05;
    public final AnonymousClass17W A06;
    public final C235518x A07;
    public final AnonymousClass184 A08;
    public final AnonymousClass183 A09;
    public final C20810yC A0A;
    public final C21010yW A0B;
    public final AnonymousClass17V A0C;

    public void A09(String str, long j, int i) {
        C1495671s B1k;
        AnonymousClass1M0 A052 = this.A04.A05();
        try {
            B1k = A052.B1k();
            ContentValues contentValues = new ContentValues();
            contentValues.put("chat_jid", str);
            long j2 = j;
            contentValues.put("last_sync_response_sent_timestamp", Long.valueOf(j2));
            int i2 = i;
            contentValues.put("no_of_retries_sent_already", Integer.valueOf(i2));
            A052.A02.A08("message_ephemeral_sync_response", "UPDATE_EPHEMERAL_SYNC_RESPONSE_FOR_CHAT_JID_SQL", contentValues, 5);
            B1k.A00();
            A052.B5o(new AVi(this, str, i2, j2));
            B1k.close();
            A052.close();
            return;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    private ContentValues A01(AnonymousClass3T1 r5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("duration", Integer.valueOf(r5.A05));
        Long l = r5.A0g;
        C18740tg.A06(l);
        contentValues.put("expire_timestamp", l);
        if (C20800yB.A01(C21000yV.A02, this.A0A, 5309)) {
            contentValues.put("ephemeral_trigger", Integer.valueOf(r5.A04));
            Boolean bool = r5.A0d;
            if (bool != null) {
                contentValues.put("ephemeral_initiated_by_me", bool);
            }
        }
        return contentValues;
    }

    public static C199699fo A02(AnonymousClass17S r7, String str) {
        Cursor A092;
        C199699fo r5 = new C199699fo(0, 0);
        AnonymousClass1M0 A042 = r7.A04.get();
        try {
            A092 = A042.A02.A09("SELECT no_of_retries_sent_already, last_sync_response_sent_timestamp FROM message_ephemeral_sync_response WHERE chat_jid = ?", "GET_SYNC_RESPONSE_INFO_FOR_CHAT_JID", new String[]{str});
            if (A092.moveToNext()) {
                int columnIndexOrThrow = A092.getColumnIndexOrThrow("last_sync_response_sent_timestamp");
                int columnIndexOrThrow2 = A092.getColumnIndexOrThrow("no_of_retries_sent_already");
                r5.A01 = A092.getLong(columnIndexOrThrow);
                r5.A00 = A092.getInt(columnIndexOrThrow2);
            }
            A092.close();
            A042.close();
            return r5;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public int A03(String str) {
        int i;
        AnonymousClass183 r1 = this.A09;
        AnonymousClass00C.A0D(str, 0);
        C199699fo r0 = (C199699fo) r1.A00.get(str);
        if (r0 != null && (i = r0.A00) != -1) {
            return i;
        }
        C199699fo A022 = A02(this, str);
        A05(A022, str);
        return A022.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cd, code lost:
        if (r0 != null) goto L_0x00cf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C80103un A04(X.AnonymousClass3T1 r12, long r13) {
        /*
            r11 = this;
            X.3Qa r3 = r12.A1J
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0043
            boolean r0 = r12 instanceof X.AnonymousClass2bY
            if (r0 == 0) goto L_0x0019
            r0 = r12
            X.2bY r0 = (X.AnonymousClass2bY) r0
            int r4 = r0.A00
            long r2 = r0.A01
        L_0x0011:
            int r1 = r12.A00
            X.3un r0 = new X.3un
            r0.<init>(r4, r2, r1)
            return r0
        L_0x0019:
            boolean r0 = r12.A1G()
            if (r0 == 0) goto L_0x006f
            X.184 r1 = r11.A08
            int r0 = r12.A05
            boolean r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x006f
            X.12q r2 = r11.A02
            X.16D r1 = r11.A00
            X.11F r0 = r3.A00
            X.C18740tg.A06(r0)
            int r0 = X.AnonymousClass3TD.A00(r1, r2, r0)
            r12.A0m(r0)
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r12.A15(r0)
            goto L_0x006f
        L_0x0043:
            boolean r0 = r12.A1P()
            if (r0 == 0) goto L_0x006f
            boolean r0 = r12.A1Y
            if (r0 != 0) goto L_0x006f
            boolean r0 = r12 instanceof X.AnonymousClass2bH
            if (r0 != 0) goto L_0x006f
            boolean r0 = r12 instanceof X.AnonymousClass2bY
            if (r0 != 0) goto L_0x006f
            r7 = 1
            X.11F r8 = r3.A00
            boolean r0 = X.AnonymousClass143.A0G(r8)
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0094
            X.16D r0 = r11.A00
            X.141 r0 = r0.A08(r8)
            if (r0 == 0) goto L_0x006f
            int r0 = r0.A02
            if (r0 <= 0) goto L_0x006f
            r12.A0m(r0)
        L_0x006f:
            boolean r0 = r12.A1G()
            if (r0 == 0) goto L_0x0082
            int r0 = r12.A05
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            long r13 = r13 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r12.A0g = r0
        L_0x0082:
            java.lang.Long r0 = r12.A0f
            if (r0 != 0) goto L_0x008c
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x008c:
            int r4 = r12.A05
            long r2 = r0.longValue()
            goto L_0x0011
        L_0x0094:
            boolean r0 = r8 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x006f
            X.12q r0 = r11.A02
            X.3Qp r0 = r0.A09(r8, r6)
            if (r0 == 0) goto L_0x00da
            X.3un r5 = r0.A0b
            X.3Id r4 = r0.A0a
            r3 = 2
            if (r5 == 0) goto L_0x006f
            int r10 = r5.expiration
            if (r10 > 0) goto L_0x00b3
            long r1 = r5.ephemeralSettingTimestamp
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x006f
        L_0x00b3:
            r12.A0m(r10)
            long r0 = r5.ephemeralSettingTimestamp
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r12.A15(r0)
            int r0 = r5.disappearingMessagesInitiator
            if (r0 != r3) goto L_0x00d2
            r12.A00 = r3
        L_0x00c5:
            if (r4 == 0) goto L_0x006f
            int r0 = r4.A00
            r12.A04 = r0
            java.lang.Boolean r0 = r4.A01
            if (r0 == 0) goto L_0x006f
        L_0x00cf:
            r12.A0d = r0
            goto L_0x006f
        L_0x00d2:
            if (r0 != r7) goto L_0x00d7
            r12.A00 = r7
            goto L_0x00c5
        L_0x00d7:
            r12.A00 = r6
            goto L_0x00c5
        L_0x00da:
            X.18x r1 = r11.A07
            com.whatsapp.jid.UserJid r0 = r1.A02(r8)
            if (r0 == 0) goto L_0x006f
            int r4 = r1.A00(r0)
            long r2 = r1.A01(r0)
            boolean r0 = r0.equals(r8)
            r1 = r0 ^ 1
            if (r1 != 0) goto L_0x00f3
            r5 = 2
        L_0x00f3:
            r12.A0m(r4)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r12.A15(r0)
            r12.A00 = r5
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            goto L_0x00cf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17S.A04(X.3T1, long):X.3un");
    }

    public void A05(C199699fo r4, String str) {
        AnonymousClass1M0 A042 = this.A04.get();
        try {
            if (A042.A02.A00.inTransaction()) {
                A042.B5o(new C35491im(this, r4, str, 2));
            } else {
                AnonymousClass183 r1 = this.A09;
                AnonymousClass00C.A0D(r4, 1);
                r1.A00.put(str, r4);
            }
            A042.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A06(AnonymousClass11F r6, int i) {
        ContentValues contentValues;
        C65073Qp A092 = this.A02.A09(r6, false);
        if (A092 != null) {
            A092.A01 = i;
            AnonymousClass163 r3 = this.A01;
            synchronized (A092) {
                contentValues = new ContentValues();
                contentValues.put("ephemeral_displayed_exemptions", Integer.valueOf(A092.A01));
            }
            r3.A05(contentValues, A092);
        }
    }

    public void A07(AnonymousClass3T1 r6) {
        AnonymousClass1M0 A052 = this.A04.A05();
        try {
            ContentValues A012 = A01(r6);
            A012.put("message_row_id", Long.valueOf(r6.A1N));
            A052.A02.A04("message_ephemeral", "INSERT_EPHEMERAL_MESSAGE_FOR_ROW_ID_SQL", A012);
            A052.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public AnonymousClass17S(AnonymousClass16D r1, AnonymousClass163 r2, C220412q r3, AnonymousClass17X r4, AnonymousClass12P r5, AnonymousClass17T r6, AnonymousClass17W r7, C235518x r8, AnonymousClass184 r9, AnonymousClass183 r10, C20810yC r11, C21010yW r12, AnonymousClass17V r13) {
        this.A0A = r11;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r6;
        this.A0B = r12;
        this.A00 = r1;
        this.A0C = r13;
        this.A04 = r5;
        this.A06 = r7;
        this.A03 = r4;
        this.A09 = r10;
        this.A08 = r9;
        this.A07 = r8;
    }

    public static int A00(AnonymousClass17S r6, C26911Lz r7, AnonymousClass3T1 r8) {
        return ((AnonymousClass1M0) r7).A02.A01(r6.A01(r8), "message_ephemeral", "message_row_id = ?", "updateEphemeralMessage/UPDATE_EPHEMERAL_MESSAGE_FOR_ROW_ID_SQL", new String[]{String.valueOf(r8.A1N)});
    }

    public void A08(AnonymousClass3T1 r8) {
        C18740tg.A0C(r8.A1G());
        AnonymousClass1M0 A052 = this.A04.A05();
        try {
            A052.A02.A0E("UPDATE message_ephemeral SET keep_in_chat=?  WHERE message_row_id =? ", "KEEP_IN_CHAT_EPHEMERAL_MESSAGE_FOR_ROW_ID_SQL", new Object[]{Integer.valueOf(r8.A0E()), Long.valueOf(r8.A1N)});
            A052.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
