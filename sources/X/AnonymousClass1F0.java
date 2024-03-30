package X;

import android.database.Cursor;

/* renamed from: X.1F0  reason: invalid class name */
public class AnonymousClass1F0 {
    public final AnonymousClass163 A00;
    public final AnonymousClass12P A01;
    public final C19730wQ A02;

    public void A00(AnonymousClass2bL r8) {
        Cursor A09;
        boolean z = false;
        if (r8.A1N > 0) {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("LocationMessageStore/fillLocationInfo/message must have row_id set; key=");
        sb.append(r8.A1J);
        C18740tg.A0E(z, sb.toString());
        String[] strArr = {Long.toString(r8.A1N)};
        AnonymousClass1M0 A04 = this.A01.get();
        try {
            A09 = A04.A02.A09("SELECT latitude, longitude, place_name, place_address, url, live_location_share_duration, live_location_sequence_number, live_location_final_latitude, live_location_final_longitude, live_location_final_timestamp, map_download_status FROM message_location WHERE message_row_id = ?", "GET_LOCATION_MESSAGE_BY_ROW_ID_SQL", strArr);
            if (A09.moveToNext()) {
                r8.A1Y(A09, this.A02);
            }
            A09.close();
            A04.close();
            return;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00bb A[Catch:{ SQLiteConstraintException -> 0x0120, all -> 0x0145 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0119 A[Catch:{ SQLiteConstraintException -> 0x0120, all -> 0x0145 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass2bL r21) {
        /*
            r20 = this;
            r6 = r21
            long r3 = r6.A1N
            r13 = 0
            r5 = 1
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 0
            if (r0 <= 0) goto L_0x000e
            r2 = 1
        L_0x000e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationMessageStore/insertOrUpdateLocationMessage/message must have row_id set; key="
            r1.append(r0)
            X.3Qa r3 = r6.A1J
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            X.C18740tg.A0E(r2, r0)
            int r0 = r6.A0H()
            r2 = 0
            if (r0 != r5) goto L_0x002c
            r2 = 1
        L_0x002c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationMessageStore/insertOrUpdateLocationMessage/message in main storage; key="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            X.C18740tg.A0E(r2, r0)
            r2 = r20
            X.12P r0 = r2.A01
            X.1M0 r4 = r0.A05()
            android.content.ContentValues r15 = new android.content.ContentValues     // Catch:{ all -> 0x0145 }
            r15.<init>()     // Catch:{ all -> 0x0145 }
            long r0 = r6.A1N     // Catch:{ SQLiteConstraintException -> 0x0120 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            java.lang.String r0 = "message_row_id"
            r15.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            X.163 r1 = r2.A00     // Catch:{ SQLiteConstraintException -> 0x0120 }
            X.11F r0 = r3.A00     // Catch:{ SQLiteConstraintException -> 0x0120 }
            X.C18740tg.A06(r0)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            long r0 = r1.A08(r0)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            java.lang.String r0 = "chat_row_id"
            r15.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            double r0 = r6.A00     // Catch:{ SQLiteConstraintException -> 0x0120 }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            java.lang.String r0 = "latitude"
            r15.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            double r0 = r6.A01     // Catch:{ SQLiteConstraintException -> 0x0120 }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            java.lang.String r0 = "longitude"
            r15.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            boolean r0 = r6 instanceof X.C46912bs     // Catch:{ SQLiteConstraintException -> 0x0120 }
            java.lang.String r9 = "live_location_sequence_number"
            java.lang.String r1 = "live_location_share_duration"
            java.lang.String r11 = "url"
            java.lang.String r12 = "place_address"
            java.lang.String r10 = "place_name"
            java.lang.String r3 = "live_location_final_timestamp"
            java.lang.String r7 = "live_location_final_longitude"
            java.lang.String r8 = "live_location_final_latitude"
            if (r0 == 0) goto L_0x00bc
            r2 = r6
            X.2bs r2 = (X.C46912bs) r2     // Catch:{ SQLiteConstraintException -> 0x0120 }
            java.lang.String r0 = r2.A01     // Catch:{ SQLiteConstraintException -> 0x0120 }
            X.AnonymousClass3SW.A01(r15, r10, r0)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            java.lang.String r0 = r2.A00     // Catch:{ SQLiteConstraintException -> 0x0120 }
            X.AnonymousClass3SW.A01(r15, r12, r0)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            java.lang.String r0 = r2.A02     // Catch:{ SQLiteConstraintException -> 0x0120 }
            X.AnonymousClass3SW.A01(r15, r11, r0)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            r15.putNull(r1)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            r15.putNull(r9)     // Catch:{ SQLiteConstraintException -> 0x0120 }
        L_0x00ae:
            r15.putNull(r8)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            r15.putNull(r7)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            r15.putNull(r3)     // Catch:{ SQLiteConstraintException -> 0x0120 }
        L_0x00b7:
            int r0 = r6.A02     // Catch:{ SQLiteConstraintException -> 0x0120 }
            if (r0 != r5) goto L_0x00ff
            goto L_0x00fe
        L_0x00bc:
            boolean r0 = r6 instanceof X.C46902br     // Catch:{ SQLiteConstraintException -> 0x0120 }
            if (r0 == 0) goto L_0x00b7
            r15.putNull(r10)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            r15.putNull(r12)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            r15.putNull(r11)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            r2 = r6
            X.2br r2 = (X.C46902br) r2     // Catch:{ SQLiteConstraintException -> 0x0120 }
            int r0 = r2.A00     // Catch:{ SQLiteConstraintException -> 0x0120 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            r15.put(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            long r0 = r2.A01     // Catch:{ SQLiteConstraintException -> 0x0120 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            r15.put(r9, r0)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            X.3Kq r2 = r2.A02     // Catch:{ SQLiteConstraintException -> 0x0120 }
            if (r2 == 0) goto L_0x00ae
            double r0 = r2.A00     // Catch:{ SQLiteConstraintException -> 0x0120 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            r15.put(r8, r0)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            double r0 = r2.A01     // Catch:{ SQLiteConstraintException -> 0x0120 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            r15.put(r7, r0)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            long r0 = r2.A05     // Catch:{ SQLiteConstraintException -> 0x0120 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            r15.put(r3, r0)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            goto L_0x00b7
        L_0x00fe:
            r0 = 0
        L_0x00ff:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            java.lang.String r0 = "map_download_status"
            r15.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            X.14e r2 = r4.A02     // Catch:{ SQLiteConstraintException -> 0x0120 }
            java.lang.String r1 = "message_location"
            java.lang.String r0 = "INSERT_MESSAGE_LOCATION_SQL"
            long r7 = r2.A05(r1, r0, r15)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            long r1 = r6.A1N     // Catch:{ SQLiteConstraintException -> 0x0120 }
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L_0x011a
            r1 = 1
        L_0x011a:
            java.lang.String r0 = "LocationMessageStore/insertOrUpdateLocationMessage/inserted row should have same row_id"
            X.C18740tg.A0F(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x0120 }
            goto L_0x0141
        L_0x0120:
            r3 = move-exception
            java.lang.String r0 = "message_row_id"
            r15.remove(r0)     // Catch:{ all -> 0x0145 }
            X.14e r14 = r4.A02     // Catch:{ all -> 0x0145 }
            java.lang.String r16 = "message_location"
            java.lang.String r17 = "message_row_id = ?"
            java.lang.String[] r2 = new java.lang.String[r5]     // Catch:{ all -> 0x0145 }
            long r0 = r6.A1N     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0145 }
            r2[r13] = r0     // Catch:{ all -> 0x0145 }
            java.lang.String r18 = "UPDATE_MESSAGE_LOCATION_SQL"
            r19 = r2
            int r0 = r14.A01(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0145 }
            if (r0 == r5) goto L_0x0141
            throw r3     // Catch:{ all -> 0x0145 }
        L_0x0141:
            r4.close()
            return
        L_0x0145:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x014a }
            throw r1
        L_0x014a:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1F0.A01(X.2bL):void");
    }

    public AnonymousClass1F0(C19730wQ r1, AnonymousClass163 r2, AnonymousClass12P r3) {
        this.A00 = r2;
        this.A02 = r1;
        this.A01 = r3;
    }
}
