package X;

/* renamed from: X.1aT  reason: invalid class name and case insensitive filesystem */
public class C30601aT {
    public final AnonymousClass18P A00;
    public final C30611aU A01;
    public final C19980wp A02;

    public C30601aT(C19980wp r3, AnonymousClass18P r4) {
        this.A00 = r4;
        this.A02 = r3;
        this.A01 = new C30611aU(r4, 1);
    }

    public static void A00(AnonymousClass6QI r3, C130576Lp r4) {
        r3.A03();
        r3.A06(1, r4.A08);
        r3.A05(2, (long) r4.A01);
        r3.A05(3, (long) r4.A00);
        byte[] bArr = r4.A0A;
        if (bArr == null) {
            bArr = new byte[0];
        }
        r3.A07(4, bArr);
        String str = r4.A07;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        r3.A06(5, str);
        String str3 = r4.A06;
        if (str3 == null) {
            str3 = str2;
        }
        r3.A06(6, str3);
        String str4 = r4.A04;
        if (str4 != null) {
            str2 = str4;
        }
        r3.A06(8, str2);
        r3.A05(7, r4.A02);
        r3.A04(9);
        r3.A05(10, r4.A03);
        byte[] bArr2 = r4.A09;
        if (bArr2 == null) {
            r3.A04(11);
        } else {
            r3.A07(11, bArr2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r2 != null) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C130576Lp A01() {
        /*
            r10 = this;
            X.C18740tg.A00()
            X.C18740tg.A00()
            X.18P r4 = r10.A00
            X.1M0 r3 = r4.get()
            X.14e r8 = r3.A02     // Catch:{ all -> 0x00b1 }
            java.lang.String r7 = "SELECT message_id, sync_type, chunk_order, media_key, media_hash, media_enc_hash, file_size, direct_path, local_path, start_time, inline_payload FROM history_sync_companion WHERE sync_type IN (?, ?, ?, ?) AND chunk_order = ? ORDER BY sync_type ASC"
            r9 = 5
            java.lang.String[] r6 = new java.lang.String[r9]     // Catch:{ all -> 0x00b1 }
            r0 = 0
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00b1 }
            r6[r0] = r5     // Catch:{ all -> 0x00b1 }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00b1 }
            r6[r1] = r0     // Catch:{ all -> 0x00b1 }
            r1 = 2
            r2 = 4
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00b1 }
            r6[r1] = r0     // Catch:{ all -> 0x00b1 }
            r1 = 3
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00b1 }
            r6[r1] = r0     // Catch:{ all -> 0x00b1 }
            r6[r2] = r5     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = "HistorySyncCompanionStore.SELECT_CHUNKS_BY_SYNC_TYPE_AND_CHUNK_ORDER"
            android.database.Cursor r2 = r8.A09(r7, r0, r6)     // Catch:{ all -> 0x00b1 }
            if (r2 == 0) goto L_0x004f
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x004f
            X.6Lp r0 = X.C130576Lp.A00(r2)     // Catch:{ all -> 0x0045 }
            goto L_0x0052
        L_0x0045:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x004a }
            goto L_0x004e
        L_0x004a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00b1 }
        L_0x004e:
            throw r1     // Catch:{ all -> 0x00b1 }
        L_0x004f:
            r0 = 0
            if (r2 == 0) goto L_0x0055
        L_0x0052:
            r2.close()     // Catch:{ all -> 0x00b1 }
        L_0x0055:
            r3.close()
            if (r0 != 0) goto L_0x00b0
            X.0wp r0 = r10.A02
            org.json.JSONObject r7 = r0.A01()
            r6 = 0
            if (r7 == 0) goto L_0x00af
            X.1M0 r3 = r4.get()
            X.14e r5 = r3.A02     // Catch:{ JSONException -> 0x00a7 }
            java.lang.String r4 = "SELECT message_id, sync_type, chunk_order, media_key, media_hash, media_enc_hash, file_size, direct_path, local_path, start_time, inline_payload FROM history_sync_companion WHERE sync_type=? AND chunk_order=?"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ JSONException -> 0x00a7 }
            r1 = 0
            java.lang.String r0 = "sync_type"
            java.lang.String r0 = r7.getString(r0)     // Catch:{ JSONException -> 0x00a7 }
            r2[r1] = r0     // Catch:{ JSONException -> 0x00a7 }
            r1 = 1
            java.lang.String r0 = "chunk_order"
            java.lang.String r0 = r7.getString(r0)     // Catch:{ JSONException -> 0x00a7 }
            r2[r1] = r0     // Catch:{ JSONException -> 0x00a7 }
            java.lang.String r0 = "HistorySyncCompanionStore.SELECT_CHUNK_BY_SYNC_TYPE_AND_CHUNK_ORDER"
            android.database.Cursor r2 = r5.A09(r4, r0, r2)     // Catch:{ JSONException -> 0x00a7 }
            if (r2 == 0) goto L_0x00ac
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x0092
            r2.close()     // Catch:{ JSONException -> 0x00a7 }
            goto L_0x00ac
        L_0x0092:
            X.6Lp r0 = X.C130576Lp.A00(r2)     // Catch:{ all -> 0x009d }
            r2.close()     // Catch:{ JSONException -> 0x00a7 }
            r3.close()
            return r0
        L_0x009d:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x00a2 }
            goto L_0x00a6
        L_0x00a2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ JSONException -> 0x00a7 }
        L_0x00a6:
            throw r1     // Catch:{ JSONException -> 0x00a7 }
        L_0x00a7:
            java.lang.String r0 = "HistorySyncCompanionStore/ Could not read history sync state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00b1 }
        L_0x00ac:
            r3.close()
        L_0x00af:
            return r6
        L_0x00b0:
            return r0
        L_0x00b1:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x00b6 }
            throw r1
        L_0x00b6:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30601aT.A01():X.6Lp");
    }

    public void A02(String str) {
        C18740tg.A00();
        AnonymousClass1M0 A04 = this.A00.A04();
        try {
            A04.A02.A0E("DELETE FROM history_sync_companion WHERE message_id=?", "HistorySyncCompanionStore.DELETE_CHUNK_BY_ID", new String[]{str});
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
