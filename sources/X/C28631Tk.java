package X;

import android.database.Cursor;
import java.util.List;

/* renamed from: X.1Tk  reason: invalid class name and case insensitive filesystem */
public final class C28631Tk {
    public final AnonymousClass163 A00;
    public final AnonymousClass12P A01;

    public C28631Tk(AnonymousClass163 r2, AnonymousClass12P r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cf, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00eb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ec, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ef, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C28981Uw r10, java.lang.Long r11, java.lang.Long r12, java.lang.String r13, java.util.List r14, long r15) {
        /*
            r9 = this;
            r5 = 0
            r0 = 2
            java.lang.String[] r8 = new java.lang.String[r0]
            X.163 r6 = r9.A00
            long r0 = r6.A08(r10)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8[r5] = r0
            java.lang.String r1 = java.lang.String.valueOf(r15)
            r0 = 1
            r8[r0] = r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.12P r7 = r9.A01
            X.1M0 r3 = r7.get()
            X.14e r2 = r3.A02     // Catch:{ all -> 0x00e9 }
            java.lang.String r1 = "SELECT _id, chat_row_id, server_message_id, reaction_from_me, reactions_from_me_ts, votes_from_me, votes_from_me_ts FROM newsletter_my_reaction_orphan_message WHERE chat_row_id = ? AND server_message_id = ?"
            java.lang.String r0 = "SELECT_ORPHAN_MY_ADD_ONS_FOR_MESSAGE"
            android.database.Cursor r2 = r2.A09(r1, r0, r8)     // Catch:{ all -> 0x00e9 }
            X.AnonymousClass00C.A0B(r2)     // Catch:{ all -> 0x00e2 }
            A00(r2, r9, r4)     // Catch:{ all -> 0x00e2 }
            if (r2 == 0) goto L_0x0037
            r2.close()     // Catch:{ all -> 0x00e9 }
        L_0x0037:
            r3.close()
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0076
            java.lang.Object r5 = r4.get(r5)
            X.3KI r5 = (X.AnonymousClass3KI) r5
            if (r13 == 0) goto L_0x005a
            java.lang.Long r0 = r5.A03
            if (r0 == 0) goto L_0x005e
            if (r11 == 0) goto L_0x005a
            long r3 = r0.longValue()
            long r1 = r11.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x005e
        L_0x005a:
            java.lang.String r13 = r5.A05
            java.lang.Long r11 = r5.A03
        L_0x005e:
            if (r14 == 0) goto L_0x0072
            java.lang.Long r0 = r5.A04
            if (r0 == 0) goto L_0x0076
            if (r12 == 0) goto L_0x0072
            long r3 = r0.longValue()
            long r1 = r12.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0076
        L_0x0072:
            java.util.List r14 = r5.A06
            java.lang.Long r12 = r5.A04
        L_0x0076:
            X.1M0 r4 = r7.A05()     // Catch:{ all -> 0x00d0 }
            r3 = 0
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x00c9 }
            r5.<init>()     // Catch:{ all -> 0x00c9 }
            java.lang.String r2 = "chat_row_id"
            long r0 = r6.A08(r10)     // Catch:{ all -> 0x00c9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00c9 }
            r5.put(r2, r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r1 = "server_message_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x00c9 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "reaction_from_me"
            r5.put(r0, r13)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "reactions_from_me_ts"
            r5.put(r0, r11)     // Catch:{ all -> 0x00c9 }
            java.lang.String r2 = "votes_from_me"
            if (r14 != 0) goto L_0x00a6
            r0 = 0
            goto L_0x00ae
        L_0x00a6:
            java.lang.String r1 = ","
            java.lang.String r0 = ""
            java.lang.String r0 = X.C007103b.A0Q(r1, r0, r0, r14, r3)     // Catch:{ all -> 0x00c9 }
        L_0x00ae:
            r5.put(r2, r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "votes_from_me_ts"
            r5.put(r0, r12)     // Catch:{ all -> 0x00c9 }
            X.14e r3 = r4.A02     // Catch:{ all -> 0x00c9 }
            java.lang.String r2 = "newsletter_my_reaction_orphan_message"
            r1 = 5
            java.lang.String r0 = "NewsletterMyAddOnMessageOrphanStore/insertOrReplaceNewsletterOrphanMyAddOns"
            long r0 = r3.A08(r2, r0, r5, r1)     // Catch:{ all -> 0x00c9 }
            r4.close()     // Catch:{ all -> 0x00d0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00d0 }
            goto L_0x00d6
        L_0x00c9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x00d0 }
            throw r0     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r0 = move-exception
            X.03N r1 = new X.03N
            r1.<init>(r0)
        L_0x00d6:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r1)
            if (r1 == 0) goto L_0x00e1
            java.lang.String r0 = "NewsletterMyAddOnMessageOrphanStore/failed to insert the message"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00e1:
            return
        L_0x00e2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e4 }
        L_0x00e4:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x00e9 }
            throw r0     // Catch:{ all -> 0x00e9 }
        L_0x00e9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28631Tk.A01(X.1Uw, java.lang.Long, java.lang.Long, java.lang.String, java.util.List, long):void");
    }

    public static final void A00(Cursor cursor, C28631Tk r23, List list) {
        String string;
        Long valueOf;
        List list2;
        C28981Uw r14;
        String string2;
        Cursor cursor2 = cursor;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("chat_row_id");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("server_message_id");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("reaction_from_me");
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("reactions_from_me_ts");
        int columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow("votes_from_me");
        int columnIndexOrThrow7 = cursor2.getColumnIndexOrThrow("votes_from_me_ts");
        while (cursor2.moveToNext()) {
            long j = cursor2.getLong(columnIndexOrThrow);
            long j2 = cursor2.getLong(columnIndexOrThrow2);
            long j3 = cursor2.getLong(columnIndexOrThrow3);
            Long l = null;
            if (cursor2.isNull(columnIndexOrThrow4)) {
                string = null;
            } else {
                string = cursor2.getString(columnIndexOrThrow4);
            }
            if (cursor2.isNull(columnIndexOrThrow5)) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(cursor2.getLong(columnIndexOrThrow5));
            }
            if (cursor2.isNull(columnIndexOrThrow6) || (string2 = cursor2.getString(columnIndexOrThrow6)) == null || AnonymousClass098.A06(string2)) {
                list2 = C023409w.A00;
            } else {
                list2 = AnonymousClass099.A0L(string2, new String[]{","}, 0);
            }
            if (!cursor2.isNull(columnIndexOrThrow7)) {
                l = Long.valueOf(cursor2.getLong(columnIndexOrThrow7));
            }
            AnonymousClass11F A0A = r23.A00.A0A(j2);
            if ((A0A instanceof C28981Uw) && (r14 = (C28981Uw) A0A) != null) {
                list.add(new AnonymousClass3KI(r14, valueOf, l, string, list2, j, j3));
            }
        }
    }
}
