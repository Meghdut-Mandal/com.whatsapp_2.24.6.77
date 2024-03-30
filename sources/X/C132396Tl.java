package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.List;

/* renamed from: X.6Tl  reason: invalid class name and case insensitive filesystem */
public final class C132396Tl {
    public final AnonymousClass12P A00;
    public final C35071i6 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap A02(java.util.List r9) {
        /*
            r8 = this;
            r7 = 0
            X.AnonymousClass00C.A0D(r9, r7)
            java.util.HashMap r5 = X.AnonymousClass001.A0J()
            X.12P r0 = r8.A00
            X.1M0 r4 = r0.get()
            X.14e r6 = r4.A02     // Catch:{ all -> 0x006e }
            int r1 = r9.size()     // Catch:{ all -> 0x006e }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "SELECT * FROM status_crossposting WHERE status_message_row_id IN ("
            r2.append(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "?"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r1)     // Catch:{ all -> 0x006e }
            r2.append(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r3 = X.C90474aD.A0f(r2)     // Catch:{ all -> 0x006e }
            java.util.ArrayList r2 = X.C36321k7.A0J(r9)     // Catch:{ all -> 0x006e }
            java.util.Iterator r1 = r9.iterator()     // Catch:{ all -> 0x006e }
        L_0x0038:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0042
            X.C90464aC.A1V(r2, r1)     // Catch:{ all -> 0x006e }
            goto L_0x0038
        L_0x0042:
            java.lang.String[] r1 = X.C36371kC.A1b(r2, r7)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "XFamilyStatusCrosspostingStore/GET_CROSSPOSTING_DATA_BY_MESSAGE_ROW_IDS"
            android.database.Cursor r3 = r6.A09(r3, r0, r1)     // Catch:{ all -> 0x006e }
        L_0x004c:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0060
            X.6Cs r2 = A00(r3)     // Catch:{ all -> 0x0067 }
            long r0 = r2.A01     // Catch:{ all -> 0x0067 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0067 }
            r5.put(r0, r2)     // Catch:{ all -> 0x0067 }
            goto L_0x004c
        L_0x0060:
            r3.close()     // Catch:{ all -> 0x006e }
            r4.close()
            return r5
        L_0x0067:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132396Tl.A02(java.util.List):java.util.HashMap");
    }

    public final void A03(long j, String str) {
        AnonymousClass00C.A0D(str, 1);
        ContentValues A0E = C36441kJ.A0E();
        A0E.put("media_path", str);
        A01(A0E, this, C36371kC.A11(Long.valueOf(j)));
    }

    public final void A05(String str, List list) {
        AnonymousClass00C.A0D(list, 0);
        ContentValues A0E = C36441kJ.A0E();
        A0E.put("state", 1);
        A0E.put("crossposting_session_id", str);
        C35071i6 r0 = this.A01;
        C35071i6.A00(r0);
        r0.A02(list, 1);
        A01(A0E, this, list);
    }

    public final void A06(List list, int i) {
        AnonymousClass00C.A0D(list, 0);
        ContentValues A0E = C36441kJ.A0E();
        A0E.put("state", Integer.valueOf(i));
        C35071i6 r0 = this.A01;
        C35071i6.A00(r0);
        r0.A02(list, i);
        A01(A0E, this, list);
    }

    public static final C128556Cs A00(Cursor cursor) {
        C134876bk r2;
        String A0f = C36341k9.A0f(cursor, "crossposting_status_unique_id");
        if (A0f == null || A0f.length() == 0) {
            r2 = null;
        } else {
            r2 = new C134876bk(new C135086c7(C146356vT.A00(), String.class, A0f, "XfamilyStatusUniqueId"), 2);
        }
        long A07 = C36351kA.A07(cursor, "status_message_row_id");
        return new C128556Cs(r2, C36341k9.A0f(cursor, "crossposting_session_id"), C36341k9.A0f(cursor, "media_path"), C36351kA.A03(cursor, "state"), A07);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.ContentValues r10, X.C132396Tl r11, java.util.List r12) {
        /*
            java.lang.String r0 = "("
            java.lang.StringBuilder r3 = X.C90524aI.A0i(r0)
            int r2 = r12.size()
            r1 = 0
        L_0x000b:
            if (r1 >= r2) goto L_0x001c
            if (r1 <= 0) goto L_0x0014
            java.lang.String r0 = ","
            r3.append(r0)
        L_0x0014:
            java.lang.String r0 = "?"
            r3.append(r0)
            int r1 = r1 + 1
            goto L_0x000b
        L_0x001c:
            java.lang.String r2 = X.C90474aD.A0f(r3)
            X.AnonymousClass00C.A08(r2)
            X.12P r0 = r11.A00
            X.1M0 r3 = r0.A05()
            X.14e r4 = r3.A02     // Catch:{ all -> 0x0058 }
            java.lang.String r6 = "status_crossposting"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = "status_message_row_id IN "
            java.lang.String r7 = X.AnonymousClass000.A0p(r0, r2, r1)     // Catch:{ all -> 0x0058 }
            java.util.ArrayList r2 = X.C36321k7.A0J(r12)     // Catch:{ all -> 0x0058 }
            java.util.Iterator r1 = r12.iterator()     // Catch:{ all -> 0x0058 }
        L_0x003f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0049
            X.C90464aC.A1V(r2, r1)     // Catch:{ all -> 0x0058 }
            goto L_0x003f
        L_0x0049:
            r0 = 0
            java.lang.String[] r9 = X.C36371kC.A1b(r2, r0)     // Catch:{ all -> 0x0058 }
            java.lang.String r8 = "XFamilyStatusCrosspostingStore/UPDATE_CROSSPOSTING_COLUMN_BY_MESSAGE_ROW_IDS"
            r5 = r10
            r4.A01(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0058 }
            r3.close()
            return
        L_0x0058:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005a }
        L_0x005a:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132396Tl.A01(android.content.ContentValues, X.6Tl, java.util.List):void");
    }

    public C132396Tl(AnonymousClass12P r1, C35071i6 r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.lang.String r7, int r8, long r9) {
        /*
            r6 = this;
            android.content.ContentValues r5 = X.C36441kJ.A0E()
            int r0 = (int) r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "status_message_row_id"
            r5.put(r0, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.lang.String r0 = "state"
            r5.put(r0, r2)
            if (r7 == 0) goto L_0x0024
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x0024
            java.lang.String r0 = "crossposting_session_id"
            r5.put(r0, r7)
        L_0x0024:
            X.1i6 r0 = r6.A01
            X.C35071i6.A00(r0)
            X.C35071i6.A00(r0)
            X.00i r1 = r0.A00
            monitor-enter(r1)
            r1.A0A(r9, r2)     // Catch:{ all -> 0x004e }
            monitor-exit(r1)
            X.12P r0 = r6.A00
            X.1M0 r4 = r0.A05()
            X.14e r3 = r4.A02     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = "status_crossposting"
            r1 = 4
            java.lang.String r0 = "XFamilyStatusCrosspostingStore/INSERT_CROSSPOSTING_RECORDS"
            r3.A08(r2, r0, r5, r1)     // Catch:{ all -> 0x0047 }
            r4.close()
            return
        L_0x0047:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        L_0x004e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132396Tl.A04(java.lang.String, int, long):void");
    }
}
