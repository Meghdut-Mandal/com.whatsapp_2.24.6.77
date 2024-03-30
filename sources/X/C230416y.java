package X;

/* renamed from: X.16y  reason: invalid class name and case insensitive filesystem */
public final class C230416y {
    public final C230316x A00;
    public final C19750wS A01;
    public final C219712j A02;

    public C230416y(C19750wS r2, C230316x r3, C219712j r4) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r2, 3);
        this.A02 = r4;
        this.A00 = r3;
        this.A01 = r2;
    }

    public String A00(C223213v r6) {
        Boolean bool;
        AnonymousClass00C.A0D(r6, 0);
        long A07 = this.A02.A07(r6);
        C230316x r0 = this.A00;
        C64863Ps A002 = C230316x.A00(r0, A07);
        if (A002 == null) {
            return null;
        }
        if (C20800yB.A01(C21000yV.A02, r0.A01, 4746)) {
            String str = A002.A01;
            if (str != null) {
                bool = Boolean.valueOf(!AnonymousClass098.A06(str));
            } else {
                bool = null;
            }
            if (AnonymousClass00C.A0J(bool, true)) {
                StringBuilder sb = new StringBuilder();
                sb.append('@');
                sb.append(str);
                return sb.toString();
            }
        }
        return A002.A00;
    }

    public String A01(C223213v r6) {
        C64863Ps A002;
        AnonymousClass00C.A0D(r6, 0);
        long A07 = this.A02.A07(r6);
        if (A07 < 0 || (A002 = C230316x.A00(this.A00, A07)) == null) {
            return null;
        }
        return A002.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(X.C223213v r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            r0 = 1
            X.AnonymousClass00C.A0D(r7, r0)
            X.12j r0 = r5.A02
            long r0 = r0.A07(r6)
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0024
            X.16x r2 = r5.A00
            X.12P r3 = r2.A00
            r3.A06()
            boolean r2 = r3.A08
            if (r2 != 0) goto L_0x0026
            java.lang.String r0 = "AliasedDisplayNameStore/upsertDisplayNameForLid db not ready"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0024:
            r0 = 0
            return r0
        L_0x0026:
            X.1M0 r3 = r3.A05()
            X.71s r2 = r3.B1k()     // Catch:{ all -> 0x0043 }
            X.C230316x.A01(r3, r7, r0)     // Catch:{ all -> 0x003c }
            r2.A00()     // Catch:{ all -> 0x003c }
            r2.close()     // Catch:{ all -> 0x0043 }
            r3.close()
            r0 = 1
            return r0
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C230416y.A03(X.13v, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ac, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00af, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.C223213v r18, java.lang.String r19) {
        /*
            r17 = this;
            r0 = 0
            r4 = r18
            X.AnonymousClass00C.A0D(r4, r0)
            r7 = r17
            java.lang.String r2 = r7.A01(r4)
            if (r2 != 0) goto L_0x0010
            java.lang.String r2 = ""
        L_0x0010:
            r3 = r19
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto L_0x0035
            X.12j r0 = r7.A02
            long r9 = r0.A07(r4)
            r5 = 0
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0035
            X.16x r0 = r7.A00
            r8 = 1
            X.12P r1 = r0.A00
            r1.A06()
            boolean r0 = r1.A08
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "AliasedDisplayNameStore/upsertUsernameForLid db not ready"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0035:
            r5 = 0
        L_0x0036:
            return r5
        L_0x0037:
            X.1M0 r5 = r1.A05()
            X.71s r6 = r5.B1k()     // Catch:{ all -> 0x00a9 }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x00a2 }
            r12.<init>()     // Catch:{ all -> 0x00a2 }
            java.lang.Long r1 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = "lid_row_id"
            r12.put(r0, r1)     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = "username"
            r12.put(r0, r3)     // Catch:{ all -> 0x00a2 }
            X.14e r11 = r5.A02     // Catch:{ all -> 0x00a2 }
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00a2 }
            r0 = 0
            r8[r0] = r1     // Catch:{ all -> 0x00a2 }
            java.lang.String r13 = "lid_display_name"
            java.lang.String r14 = "lid_row_id = ?"
            java.lang.String r15 = "LidDisplayNameStore/INSERT_USERNAME"
            r16 = r8
            int r0 = r11.A01(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00a2 }
            long r0 = (long) r0     // Catch:{ all -> 0x00a2 }
            r9 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 > 0) goto L_0x007b
            java.lang.String r1 = "display_name"
            java.lang.String r0 = ""
            r12.put(r1, r0)     // Catch:{ all -> 0x00a2 }
            r0 = 5
            r11.A08(r13, r15, r12, r0)     // Catch:{ all -> 0x00a2 }
        L_0x007b:
            r6.A00()     // Catch:{ all -> 0x00a2 }
            r6.close()     // Catch:{ all -> 0x00a9 }
            r5.close()
            r5 = 1
            X.0wS r0 = r7.A01
            java.lang.Iterable r0 = r0.getObservers()
            X.AnonymousClass00C.A08(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0092:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r1.next()
            X.194 r0 = (X.AnonymousClass194) r0
            r0.BkB(r4, r2, r3)
            goto L_0x0092
        L_0x00a2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x00a9 }
            throw r0     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C230416y.A04(X.13v, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00be, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c6, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c9, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A02(java.util.Map r9) {
        /*
            r8 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Set r0 = r9.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x000d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r3 = r4.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            X.12j r1 = r8.A02
            java.lang.Object r0 = r3.getKey()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            long r0 = r1.A07(r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.Object r1 = r3.getValue()
            X.011 r0 = new X.011
            r0.<init>(r2, r1)
            r5.add(r0)
            goto L_0x000d
        L_0x0036:
            java.util.Map r7 = X.C000400e.A09(r5)
            X.16x r0 = r8.A00
            X.12P r1 = r0.A00
            r1.A06()
            boolean r0 = r1.A08
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "AliasedDisplayNameStore/upsertDisplayNameForLidBulk db not ready"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.09w r0 = X.C023409w.A00
        L_0x004c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x0055:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r0 = r3.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r1 = r0.longValue()
            X.12j r0 = r8.A02
            com.whatsapp.jid.Jid r1 = r0.A09(r1)
            boolean r0 = r1 instanceof X.C223313w
            if (r0 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x0055
            r4.add(r1)
            goto L_0x0055
        L_0x0075:
            X.1M0 r6 = r1.A05()
            X.71s r5 = r6.B1k()     // Catch:{ all -> 0x00c3 }
            java.util.Set r0 = r7.entrySet()     // Catch:{ all -> 0x00bc }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x00bc }
        L_0x0085:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x00a5
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x00bc }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00bc }
            java.lang.Object r0 = r3.getKey()     // Catch:{ all -> 0x00bc }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x00bc }
            long r1 = r0.longValue()     // Catch:{ all -> 0x00bc }
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00bc }
            X.C230316x.A01(r6, r0, r1)     // Catch:{ all -> 0x00bc }
            goto L_0x0085
        L_0x00a5:
            r5.A00()     // Catch:{ all -> 0x00bc }
            r5.close()     // Catch:{ all -> 0x00c3 }
            r6.close()
            java.util.Set r0 = r7.keySet()
            java.util.List r0 = X.C007103b.A0Y(r0)
            goto L_0x004c
        L_0x00b7:
            java.util.List r0 = X.C007103b.A0Y(r4)
            return r0
        L_0x00bc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00be }
        L_0x00be:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x00c3 }
            throw r0     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C230416y.A02(java.util.Map):java.util.List");
    }
}
