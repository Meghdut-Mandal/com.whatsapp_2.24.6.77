package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.6VF  reason: invalid class name */
public final class AnonymousClass6VF {
    public final AnonymousClass12P A00;
    public final AnonymousClass005 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cd, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap A04(java.util.List r22) {
        /*
            r21 = this;
            r7 = 0
            r8 = r22
            X.AnonymousClass00C.A0D(r8, r7)
            java.util.HashMap r6 = X.AnonymousClass001.A0J()
            r0 = r21
            X.12P r0 = r0.A00
            X.1M0 r5 = r0.get()
            X.14e r4 = r5.A02     // Catch:{ all -> 0x00ca }
            int r1 = r8.size()     // Catch:{ all -> 0x00ca }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "SELECT * FROM status_crossposting_v3 WHERE status_message_row_id IN ("
            r2.append(r0)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "?"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x00ca }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = ","
            java.lang.String r0 = X.C36381kD.A0x(r0, r1)     // Catch:{ all -> 0x00ca }
            java.lang.String r3 = X.C36321k7.A0E(r0, r2)     // Catch:{ all -> 0x00ca }
            java.util.ArrayList r2 = X.C36321k7.A0J(r8)     // Catch:{ all -> 0x00ca }
            java.util.Iterator r1 = r8.iterator()     // Catch:{ all -> 0x00ca }
        L_0x003c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x0046
            X.C90464aC.A1V(r2, r1)     // Catch:{ all -> 0x00ca }
            goto L_0x003c
        L_0x0046:
            java.lang.String[] r1 = X.C36371kC.A1b(r2, r7)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "[WAFFLE] WaffleStatusCrosspostingStore/GET_CROSSPOSTING_DATA_BY_MESSAGE_ROW_IDS"
            android.database.Cursor r4 = r4.A09(r3, r0, r1)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "status_message_row_id"
            int r9 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "crossposting_session_id"
            int r8 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "crossposting_status_unique_id"
            int r7 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "state"
            int r3 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "direct_url_path"
            int r2 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "media_file_path"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "destination"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c3 }
        L_0x007a:
            boolean r10 = r4.moveToNext()     // Catch:{ all -> 0x00c3 }
            if (r10 == 0) goto L_0x00bc
            long r19 = r4.getLong(r9)     // Catch:{ all -> 0x00c3 }
            java.lang.String r14 = r4.getString(r8)     // Catch:{ all -> 0x00c3 }
            java.lang.String r15 = r4.getString(r7)     // Catch:{ all -> 0x00c3 }
            java.lang.String r16 = r4.getString(r1)     // Catch:{ all -> 0x00c3 }
            java.lang.String r17 = r4.getString(r2)     // Catch:{ all -> 0x00c3 }
            int r18 = r4.getInt(r3)     // Catch:{ all -> 0x00c3 }
            int r10 = r4.getInt(r0)     // Catch:{ all -> 0x00c3 }
            X.5Tq r13 = X.C110595av.A00(r10)     // Catch:{ all -> 0x00c3 }
            X.6DX r12 = new X.6DX     // Catch:{ all -> 0x00c3 }
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x00c3 }
            long r10 = r12.A01     // Catch:{ all -> 0x00c3 }
            java.lang.Long r11 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00c3 }
            java.util.List r10 = X.C90524aI.A0n(r11, r6)     // Catch:{ all -> 0x00c3 }
            if (r10 != 0) goto L_0x00b8
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x00c3 }
            r6.put(r11, r10)     // Catch:{ all -> 0x00c3 }
        L_0x00b8:
            r10.add(r12)     // Catch:{ all -> 0x00c3 }
            goto L_0x007a
        L_0x00bc:
            r4.close()     // Catch:{ all -> 0x00ca }
            r5.close()
            return r6
        L_0x00c3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x00ca }
            throw r0     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VF.A04(java.util.List):java.util.HashMap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(java.util.List r10, long r11) {
        /*
            r9 = this;
            r8 = 0
            java.util.Iterator r7 = r10.iterator()
        L_0x0005:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r6 = r7.next()
            X.5Tq r6 = (X.C108475Tq) r6
            java.lang.String r3 = "destination"
            r5 = 4
            X.AnonymousClass00C.A0D(r6, r5)
            android.content.ContentValues r4 = X.C36441kJ.A0E()
            int r0 = (int) r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "status_message_row_id"
            r4.put(r0, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.lang.String r0 = "state"
            r4.put(r0, r2)
            int r0 = r6.databaseValue
            X.C36341k9.A0o(r4, r3, r0)
            X.6Un r0 = r9.A03()
            X.C132616Un.A02(r0)
            android.util.LongSparseArray r1 = r0.A00
            monitor-enter(r1)
            X.C132616Un.A01(r6, r0, r2, r11)     // Catch:{ all -> 0x005b }
            monitor-exit(r1)
            X.12P r0 = r9.A00
            X.1M0 r3 = r0.A05()
            X.14e r2 = r3.A02     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = "status_crossposting_v3"
            java.lang.String r0 = "[WAFFLE] WaffleStatusCrosspostingStore/INSERT_CROSSPOSTING_RECORDS"
            r2.A08(r1, r0, r4, r5)     // Catch:{ all -> 0x0054 }
            r3.close()
            goto L_0x0005
        L_0x0054:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        L_0x005b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VF.A05(java.util.List, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008f, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.util.List r11, java.util.List r12) {
        /*
            r10 = this;
            r7 = 0
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.ArrayList r2 = X.C36351kA.A0z(r11)
            java.util.Iterator r1 = r11.iterator()
        L_0x000d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0017
            X.C90464aC.A1V(r2, r1)
            goto L_0x000d
        L_0x0017:
            r6.addAll(r2)
            java.util.ArrayList r2 = X.C36351kA.A0z(r12)
            java.util.Iterator r1 = r12.iterator()
        L_0x0022:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = r1.next()
            X.5Tq r0 = (X.C108475Tq) r0
            int r0 = r0.databaseValue
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.add(r0)
            goto L_0x0022
        L_0x0038:
            r6.addAll(r2)
            X.6Un r9 = r10.A03()
            X.C132616Un.A02(r9)
            android.util.LongSparseArray r8 = r9.A00
            monitor-enter(r8)
            java.util.Iterator r5 = r11.iterator()     // Catch:{ all -> 0x0093 }
        L_0x0049:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0068
            long r2 = X.C36391kE.A0D(r5)     // Catch:{ all -> 0x0093 }
            java.util.Iterator r4 = r12.iterator()     // Catch:{ all -> 0x0093 }
        L_0x0057:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0049
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x0093 }
            X.5Tq r1 = (X.C108475Tq) r1     // Catch:{ all -> 0x0093 }
            r0 = 0
            X.C132616Un.A01(r1, r9, r0, r2)     // Catch:{ all -> 0x0093 }
            goto L_0x0057
        L_0x0068:
            monitor-exit(r8)
            X.12P r0 = r10.A00
            X.1M0 r5 = r0.A05()
            X.14e r4 = r5.A02     // Catch:{ all -> 0x008c }
            java.lang.String r3 = "status_crossposting_v3"
            int r1 = r11.size()     // Catch:{ all -> 0x008c }
            int r0 = r12.size()     // Catch:{ all -> 0x008c }
            java.lang.String r2 = A00(r1, r0)     // Catch:{ all -> 0x008c }
            java.lang.String[] r1 = X.C36371kC.A1b(r6, r7)     // Catch:{ all -> 0x008c }
            java.lang.String r0 = "[WAFFLE] WaffleStatusCrosspostingStore/DELETE_CROSSPOSTING_COLUMN_BY_MESSAGE_AND_DESTINATION_IDS"
            r4.A03(r3, r2, r0, r1)     // Catch:{ all -> 0x008c }
            r5.close()
            return
        L_0x008c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008e }
        L_0x008e:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        L_0x0093:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VF.A06(java.util.List, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009f, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(java.util.List r14, java.util.List r15, int r16) {
        /*
            r13 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r14, r0)
            android.content.ContentValues r8 = X.C36441kJ.A0E()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)
            java.lang.String r0 = "state"
            r8.put(r0, r7)
            X.6Un r6 = r13.A03()
            X.C132616Un.A02(r6)
            android.util.LongSparseArray r5 = r6.A00
            monitor-enter(r5)
            java.util.Iterator r4 = r14.iterator()     // Catch:{ all -> 0x00a3 }
        L_0x001f:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x003d
            long r1 = X.C36391kE.A0D(r4)     // Catch:{ all -> 0x00a3 }
            java.util.Iterator r3 = r15.iterator()     // Catch:{ all -> 0x00a3 }
        L_0x002d:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x00a3 }
            X.5Tq r0 = (X.C108475Tq) r0     // Catch:{ all -> 0x00a3 }
            X.C132616Un.A01(r0, r6, r7, r1)     // Catch:{ all -> 0x00a3 }
            goto L_0x002d
        L_0x003d:
            monitor-exit(r5)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.ArrayList r2 = X.C36351kA.A0z(r14)
            java.util.Iterator r1 = r14.iterator()
        L_0x004a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0054
            X.C90464aC.A1V(r2, r1)
            goto L_0x004a
        L_0x0054:
            r3.addAll(r2)
            java.util.ArrayList r2 = X.C36351kA.A0z(r15)
            java.util.Iterator r1 = r15.iterator()
        L_0x005f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0075
            java.lang.Object r0 = r1.next()
            X.5Tq r0 = (X.C108475Tq) r0
            int r0 = r0.databaseValue
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.add(r0)
            goto L_0x005f
        L_0x0075:
            r3.addAll(r2)
            X.12P r0 = r13.A00
            X.1M0 r2 = r0.A05()
            X.14e r7 = r2.A02     // Catch:{ all -> 0x009c }
            java.lang.String r9 = "status_crossposting_v3"
            int r1 = r14.size()     // Catch:{ all -> 0x009c }
            int r0 = r15.size()     // Catch:{ all -> 0x009c }
            java.lang.String r10 = A00(r1, r0)     // Catch:{ all -> 0x009c }
            r0 = 0
            java.lang.String[] r12 = X.C36371kC.A1b(r3, r0)     // Catch:{ all -> 0x009c }
            java.lang.String r11 = "[WAFFLE] WaffleStatusCrosspostingStore/UPDATE_CROSSPOSTING_COLUMN_BY_MESSAGE_ROW_IDS"
            r7.A01(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x009c }
            r2.close()
            return
        L_0x009c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009e }
        L_0x009e:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        L_0x00a3:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VF.A07(java.util.List, java.util.List, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006a, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.ContentValues r11, X.C108475Tq r12, X.AnonymousClass6VF r13, java.util.List r14) {
        /*
            X.12P r0 = r13.A00
            X.1M0 r4 = r0.A05()
            X.14e r5 = r4.A02     // Catch:{ all -> 0x0067 }
            java.lang.String r7 = "status_crossposting_v3"
            int r1 = r14.size()     // Catch:{ all -> 0x0067 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = "status_message_row_id IN  ("
            r2.append(r0)     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = "?"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x0067 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = ","
            java.lang.String r0 = X.C36381kD.A0x(r0, r1)     // Catch:{ all -> 0x0067 }
            r2.append(r0)     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = ") AND destination = ?"
            java.lang.String r8 = X.AnonymousClass000.A0q(r0, r2)     // Catch:{ all -> 0x0067 }
            java.util.ArrayList r2 = X.C36321k7.A0J(r14)     // Catch:{ all -> 0x0067 }
            java.util.Iterator r1 = r14.iterator()     // Catch:{ all -> 0x0067 }
        L_0x0037:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0041
            X.C90464aC.A1V(r2, r1)     // Catch:{ all -> 0x0067 }
            goto L_0x0037
        L_0x0041:
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0067 }
            java.lang.Object[] r3 = r2.toArray(r0)     // Catch:{ all -> 0x0067 }
            int r0 = r12.databaseValue     // Catch:{ all -> 0x0067 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0067 }
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)     // Catch:{ all -> 0x0067 }
            int r1 = r3.length     // Catch:{ all -> 0x0067 }
            int r0 = r1 + 1
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r3, r0)     // Catch:{ all -> 0x0067 }
            r10[r1] = r2     // Catch:{ all -> 0x0067 }
            java.lang.String[] r10 = (java.lang.String[]) r10     // Catch:{ all -> 0x0067 }
            java.lang.String r9 = "[WAFFLE] WaffleStatusCrosspostingStore/UPDATE_CROSSPOSTING_COLUMN_BY_MESSAGE_ROW_IDS"
            r6 = r11
            r5.A01(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0067 }
            r4.close()
            return
        L_0x0067:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VF.A01(android.content.ContentValues, X.5Tq, X.6VF, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.content.ContentValues r10, X.AnonymousClass6VF r11, java.util.List r12) {
        /*
            X.12P r0 = r11.A00
            X.1M0 r3 = r0.A05()
            X.14e r4 = r3.A02     // Catch:{ all -> 0x004b }
            java.lang.String r6 = "status_crossposting_v3"
            int r1 = r12.size()     // Catch:{ all -> 0x004b }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "status_message_row_id IN  ("
            r2.append(r0)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "?"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x004b }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = ","
            java.lang.String r0 = X.C36381kD.A0x(r0, r1)     // Catch:{ all -> 0x004b }
            java.lang.String r7 = X.C36321k7.A0E(r0, r2)     // Catch:{ all -> 0x004b }
            java.util.ArrayList r2 = X.C36321k7.A0J(r12)     // Catch:{ all -> 0x004b }
            java.util.Iterator r1 = r12.iterator()     // Catch:{ all -> 0x004b }
        L_0x0032:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x003c
            X.C90464aC.A1V(r2, r1)     // Catch:{ all -> 0x004b }
            goto L_0x0032
        L_0x003c:
            r0 = 0
            java.lang.String[] r9 = X.C36371kC.A1b(r2, r0)     // Catch:{ all -> 0x004b }
            java.lang.String r8 = "[WAFFLE] WaffleStatusCrosspostingStore/UPDATE_CROSSPOSTING_COLUMN_BY_MESSAGE_ROW_IDS"
            r5 = r10
            r4.A01(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x004b }
            r3.close()
            return
        L_0x004b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VF.A02(android.content.ContentValues, X.6VF, java.util.List):void");
    }

    public final C132616Un A03() {
        AnonymousClass005 r1 = this.A01;
        C132616Un.A02((C132616Un) r1.get());
        return (C132616Un) C36411kG.A0v(r1);
    }

    public AnonymousClass6VF(AnonymousClass12P r1, AnonymousClass005 r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public static final String A00(int i, int i2) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("status_message_row_id IN  (");
        List nCopies = Collections.nCopies(i, "?");
        AnonymousClass00C.A08(nCopies);
        A0u.append(C007103b.A0Q(",", "", "", nCopies, (C006302t) null));
        A0u.append(") AND destination IN (");
        List nCopies2 = Collections.nCopies(i2, "?");
        AnonymousClass00C.A08(nCopies2);
        return C36321k7.A0E(C007103b.A0Q(",", "", "", nCopies2, (C006302t) null), A0u);
    }
}
