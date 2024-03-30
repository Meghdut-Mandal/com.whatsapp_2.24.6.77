package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1HM  reason: invalid class name */
public class AnonymousClass1HM {
    public final AnonymousClass1HL A00;
    public final C219712j A01;
    public final AnonymousClass12P A02;

    public synchronized long A00(UserJid userJid, String str) {
        C1495671s B1k;
        long j;
        long A05;
        C18740tg.A00();
        AnonymousClass1M0 A052 = this.A02.A05();
        try {
            B1k = A052.B1k();
            ContentValues contentValues = new ContentValues();
            contentValues.put("token", str);
            if (userJid != null) {
                j = this.A01.A07(userJid);
            } else {
                j = 0;
            }
            contentValues.put("creator_jid_row_id", Long.valueOf(j));
            A05 = A052.A02.A05("call_link", "call_link_store/insert", contentValues);
            this.A00.put(str, new C63083Ir(userJid, str, A05));
            B1k.A00();
            B1k.close();
            A052.close();
        } catch (Throwable th) {
            try {
                A052.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        return A05;
        throw th;
    }

    public synchronized C63083Ir A01(Cursor cursor) {
        C63083Ir r5;
        int i;
        int columnIndex = cursor.getColumnIndex("call_link_id");
        r5 = null;
        if (!(columnIndex == -1 || (i = cursor.getInt(columnIndex)) == 0)) {
            String string = cursor.getString(cursor.getColumnIndexOrThrow("token"));
            Jid A09 = this.A01.A09((long) cursor.getInt(cursor.getColumnIndexOrThrow("creator_jid_row_id")));
            C222813r r0 = UserJid.Companion;
            r5 = new C63083Ir(C222813r.A00(A09), string, (long) i);
        }
        return r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.C63083Ir A02(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            X.1HL r7 = r8.A00     // Catch:{ all -> 0x007f }
            boolean r0 = r7.containsKey(r9)     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r7.get(r9)     // Catch:{ all -> 0x007f }
            X.3Ir r0 = (X.C63083Ir) r0     // Catch:{ all -> 0x007f }
            goto L_0x005f
        L_0x0010:
            X.12P r0 = r8.A02     // Catch:{ all -> 0x007f }
            X.1M0 r5 = r0.get()     // Catch:{ all -> 0x007f }
            X.14e r3 = r5.A02     // Catch:{ all -> 0x0075 }
            java.lang.String r2 = "SELECT _id, token, creator_jid_row_id FROM call_link WHERE token = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0075 }
            r0 = 0
            r1[r0] = r9     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "get_call_link_by_token"
            android.database.Cursor r6 = r3.A09(r2, r0, r1)     // Catch:{ all -> 0x0075 }
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0069 }
            r1 = 0
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = "_id"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0069 }
            int r0 = r6.getInt(r0)     // Catch:{ all -> 0x0069 }
            long r2 = (long) r0     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = "creator_jid_row_id"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0069 }
            int r0 = r6.getInt(r0)     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0051
            X.12j r4 = r8.A01     // Catch:{ all -> 0x0069 }
            long r0 = (long) r0     // Catch:{ all -> 0x0069 }
            com.whatsapp.jid.Jid r1 = r4.A09(r0)     // Catch:{ all -> 0x0069 }
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x0069 }
            com.whatsapp.jid.UserJid r1 = X.C222813r.A00(r1)     // Catch:{ all -> 0x0069 }
        L_0x0051:
            X.3Ir r0 = new X.3Ir     // Catch:{ all -> 0x0069 }
            r0.<init>(r1, r9, r2)     // Catch:{ all -> 0x0069 }
            r7.put(r9, r0)     // Catch:{ all -> 0x0069 }
            r6.close()     // Catch:{ all -> 0x0075 }
            r5.close()     // Catch:{ all -> 0x007f }
        L_0x005f:
            monitor-exit(r8)
            return r0
        L_0x0061:
            r6.close()     // Catch:{ all -> 0x0075 }
            r5.close()     // Catch:{ all -> 0x007f }
            monitor-exit(r8)
            return r1
        L_0x0069:
            r1 = move-exception
            if (r6 == 0) goto L_0x0074
            r6.close()     // Catch:{ all -> 0x0070 }
            goto L_0x0074
        L_0x0070:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0075 }
        L_0x0074:
            throw r1     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x007a }
            goto L_0x007e
        L_0x007a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x007f }
        L_0x007e:
            throw r1     // Catch:{ all -> 0x007f }
        L_0x007f:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HM.A02(java.lang.String):X.3Ir");
    }

    public AnonymousClass1HM(AnonymousClass1HL r1, C219712j r2, AnonymousClass12P r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
