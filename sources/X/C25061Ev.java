package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteConstraintException;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1Ev  reason: invalid class name and case insensitive filesystem */
public class C25061Ev {
    public final C219712j A00;
    public final AnonymousClass12P A01;

    /* JADX WARNING: Can't wrap try/catch for region: R(9:9|(2:11|12)|17|(1:19)|20|21|22|23|24) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C25061Ev r8, X.C46952bw r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            long r0 = r9.A1N
            r3 = 1
            r7 = 0
            r5 = 0
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r2 = 0
            if (r4 <= 0) goto L_0x000c
            r2 = 1
        L_0x000c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "OrderMessageStore/fillOrderDataIfAvailable/message must have row_id set; key="
            r1.append(r0)
            X.3Qa r0 = r9.A1J
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C18740tg.A0E(r2, r0)
            java.lang.String[] r4 = new java.lang.String[r3]
            long r0 = r9.A1N
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4[r7] = r0
            X.12P r0 = r8.A01
            X.1M0 r2 = r0.get()
            X.14e r0 = r2.A02     // Catch:{ all -> 0x0106 }
            android.database.Cursor r4 = r0.A09(r10, r11, r4)     // Catch:{ all -> 0x0106 }
            boolean r0 = r4.moveToLast()     // Catch:{ all -> 0x00fa }
            if (r0 == 0) goto L_0x00f3
            X.12j r6 = r8.A00     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = "order_id"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x00fa }
            r9.A07 = r0     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = "order_title"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x00fa }
            r9.A08 = r0     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = "item_count"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00fa }
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x00fa }
            r9.A00 = r0     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = "message"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x00fa }
            r9.A06 = r0     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = "status"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00fa }
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x00fa }
            r9.A02 = r0     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = "surface"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00fa }
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x00fa }
            r9.A03 = r0     // Catch:{ all -> 0x00fa }
            java.lang.Class<com.whatsapp.jid.UserJid> r5 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "seller_jid"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00fa }
            long r0 = r4.getLong(r0)     // Catch:{ all -> 0x00fa }
            com.whatsapp.jid.Jid r0 = r6.A0C(r5, r0)     // Catch:{ all -> 0x00fa }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x00fa }
            r9.A04 = r0     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = "token"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x00fa }
            r9.A09 = r0     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = "currency_code"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x00fa }
            r9.A05 = r0     // Catch:{ all -> 0x00fa }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00fa }
            if (r0 != 0) goto L_0x00d5
            java.lang.String r0 = r9.A05     // Catch:{ IllegalArgumentException -> 0x00d2 }
            X.6Tk r5 = new X.6Tk     // Catch:{ IllegalArgumentException -> 0x00d2 }
            r5.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x00d2 }
            java.lang.String r0 = "total_amount_1000"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ IllegalArgumentException -> 0x00d2 }
            long r0 = r4.getLong(r0)     // Catch:{ IllegalArgumentException -> 0x00d2 }
            java.math.BigDecimal r0 = X.C129676Ia.A00(r5, r0)     // Catch:{ IllegalArgumentException -> 0x00d2 }
            r9.A0A = r0     // Catch:{ IllegalArgumentException -> 0x00d2 }
            goto L_0x00d5
        L_0x00d2:
            r0 = 0
            r9.A05 = r0     // Catch:{ all -> 0x00fa }
        L_0x00d5:
            java.lang.String r0 = "thumbnail"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00fa }
            byte[] r0 = r4.getBlob(r0)     // Catch:{ all -> 0x00fa }
            if (r0 == 0) goto L_0x00e4
            r9.A1j(r0, r12)     // Catch:{ all -> 0x00fa }
        L_0x00e4:
            java.lang.String r0 = "message_version"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ IllegalArgumentException -> 0x00f1 }
            int r0 = r4.getInt(r0)     // Catch:{ IllegalArgumentException -> 0x00f1 }
            r9.A01 = r0     // Catch:{ IllegalArgumentException -> 0x00f1 }
            goto L_0x00f3
        L_0x00f1:
            r9.A01 = r3     // Catch:{ all -> 0x00fa }
        L_0x00f3:
            r4.close()     // Catch:{ all -> 0x0106 }
            r2.close()
            return
        L_0x00fa:
            r1 = move-exception
            if (r4 == 0) goto L_0x0105
            r4.close()     // Catch:{ all -> 0x0101 }
            goto L_0x0105
        L_0x0101:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0106 }
        L_0x0105:
            throw r1     // Catch:{ all -> 0x0106 }
        L_0x0106:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x010b }
            throw r1
        L_0x010b:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25061Ev.A00(X.1Ev, X.2bw, java.lang.String, java.lang.String, boolean):void");
    }

    public void A01(C46952bw r7) {
        AnonymousClass1M0 A05;
        try {
            A05 = this.A01.A05();
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_row_id", Long.valueOf(r7.A1N));
            AnonymousClass3SW.A01(contentValues, "order_id", r7.A07);
            AnonymousClass3SW.A01(contentValues, "order_title", r7.A08);
            contentValues.put("item_count", Integer.valueOf(r7.A00));
            contentValues.put("message_version", Integer.valueOf(r7.A01));
            contentValues.put("status", Integer.valueOf(r7.A02));
            contentValues.put("surface", Integer.valueOf(r7.A03));
            AnonymousClass3SW.A01(contentValues, "message", r7.A06);
            UserJid userJid = r7.A04;
            if (userJid != null) {
                contentValues.put("seller_jid", Long.valueOf(this.A00.A07(userJid)));
            }
            AnonymousClass3SW.A01(contentValues, "token", r7.A09);
            if (r7.A0V() != null) {
                AnonymousClass3SW.A03(contentValues, "thumbnail", r7.A0V().A02());
            }
            String str = r7.A05;
            if (!(str == null || r7.A0A == null)) {
                contentValues.put("currency_code", str);
                contentValues.put("total_amount_1000", Long.valueOf(r7.A0A.multiply(C129676Ia.A00).longValue()));
            }
            boolean z = false;
            if (A05.A02.A08("message_order", "INSERT_MESSAGE_ORDER_SQL", contentValues, 5) == r7.A1N) {
                z = true;
            }
            C18740tg.A0F(z, "OrderMessageStore/insertOrUpdateOrderMessage/inserted row should have same row_id");
            A05.close();
            return;
        } catch (SQLiteConstraintException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("OrderMessageStore/insertOrUpdateOrderMessage/fail to insert. Error message is: ");
            sb.append(e);
            Log.e(sb.toString());
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public C25061Ev(C219712j r1, AnonymousClass12P r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
