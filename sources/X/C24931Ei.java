package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.GroupJid;
import java.util.List;

/* renamed from: X.1Ei  reason: invalid class name and case insensitive filesystem */
public final class C24931Ei {
    public final AnonymousClass163 A00;
    public final AnonymousClass176 A01;
    public final AnonymousClass12P A02;

    public C24931Ei(AnonymousClass163 r2, AnonymousClass176 r3, AnonymousClass12P r4) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final void A01(C26911Lz r8, GroupJid groupJid) {
        AnonymousClass00C.A0D(groupJid, 1);
        String[] strArr = {String.valueOf(this.A00.A08(groupJid))};
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", Integer.valueOf(C52192p2.STALE.value));
        ((AnonymousClass1M0) r8).A02.A01(contentValues, "message_event", "chat_row_id = ? AND is_canceled = 0 AND event_state = 0", "message_event.INVALIDATE_EVENT_MESSAGES", strArr);
        r8.B5o(new C35701j7(this, groupJid, 48));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ce, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass2bT r7) {
        /*
            r6 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            X.12P r0 = r6.A02
            X.1M0 r5 = r0.A05()
            long r1 = r7.A1N     // Catch:{ all -> 0x00cb }
            r0 = 12
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x00cb }
            r4.<init>(r0)     // Catch:{ all -> 0x00cb }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "message_row_id"
            r4.put(r0, r1)     // Catch:{ all -> 0x00cb }
            java.lang.String r1 = r7.A05     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "name"
            r4.put(r0, r1)     // Catch:{ all -> 0x00cb }
            java.lang.String r1 = r7.A03     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "description"
            r4.put(r0, r1)     // Catch:{ all -> 0x00cb }
            java.lang.String r1 = r7.A04     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "join_link"
            r4.put(r0, r1)     // Catch:{ all -> 0x00cb }
            long r0 = r7.A00     // Catch:{ all -> 0x00cb }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "start_time"
            r4.put(r0, r1)     // Catch:{ all -> 0x00cb }
            boolean r0 = r7.A06     // Catch:{ all -> 0x00cb }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "is_canceled"
            r4.put(r0, r1)     // Catch:{ all -> 0x00cb }
            X.3J7 r0 = r7.A01     // Catch:{ all -> 0x00cb }
            r2 = 0
            if (r0 == 0) goto L_0x00bd
            X.3IM r0 = r0.A00     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00bd
            double r0 = r0.A00     // Catch:{ all -> 0x00cb }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x00cb }
        L_0x0056:
            java.lang.String r0 = "location_latitude"
            r4.put(r0, r1)     // Catch:{ all -> 0x00cb }
            X.3J7 r0 = r7.A01     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00bb
            X.3IM r0 = r0.A00     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00bb
            double r0 = r0.A01     // Catch:{ all -> 0x00cb }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x00cb }
        L_0x0069:
            java.lang.String r0 = "location_longitude"
            r4.put(r0, r1)     // Catch:{ all -> 0x00cb }
            X.3J7 r0 = r7.A01     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00b9
            java.lang.String r1 = r0.A02     // Catch:{ all -> 0x00cb }
        L_0x0074:
            java.lang.String r0 = "location_name"
            r4.put(r0, r1)     // Catch:{ all -> 0x00cb }
            X.3J7 r0 = r7.A01     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x007f
            java.lang.String r2 = r0.A01     // Catch:{ all -> 0x00cb }
        L_0x007f:
            java.lang.String r0 = "location_address"
            r4.put(r0, r2)     // Catch:{ all -> 0x00cb }
            X.163 r1 = r6.A00     // Catch:{ all -> 0x00cb }
            X.3Qa r0 = r7.A1J     // Catch:{ all -> 0x00cb }
            X.11F r0 = r0.A00     // Catch:{ all -> 0x00cb }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x00cb }
            long r0 = r1.A08(r0)     // Catch:{ all -> 0x00cb }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "chat_row_id"
            r4.put(r0, r1)     // Catch:{ all -> 0x00cb }
            X.2p2 r0 = r7.A02     // Catch:{ all -> 0x00cb }
            int r0 = r0.value     // Catch:{ all -> 0x00cb }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "event_state"
            r4.put(r0, r1)     // Catch:{ all -> 0x00cb }
            X.14e r3 = r5.A02     // Catch:{ all -> 0x00cb }
            java.lang.String r2 = "message_event"
            r1 = 5
            java.lang.String r0 = "EventMessageStore/insertOrUpdateMessageEvent"
            long r3 = r3.A08(r2, r0, r4, r1)     // Catch:{ all -> 0x00cb }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00c3
            goto L_0x00bf
        L_0x00b9:
            r1 = r2
            goto L_0x0074
        L_0x00bb:
            r1 = r2
            goto L_0x0069
        L_0x00bd:
            r1 = r2
            goto L_0x0056
        L_0x00bf:
            r5.close()
            return
        L_0x00c3:
            java.lang.String r1 = "EventMessageStore/insertOrUpdateMessageEvent the row was not updated"
            android.database.SQLException r0 = new android.database.SQLException     // Catch:{ all -> 0x00cb }
            r0.<init>(r1)     // Catch:{ all -> 0x00cb }
            throw r0     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24931Ei.A02(X.2bT):void");
    }

    public static final void A00(Cursor cursor, List list) {
        while (cursor.moveToNext()) {
            list.add(Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow("message_row_id"))));
        }
    }
}
