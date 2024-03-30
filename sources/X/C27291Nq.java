package X;

/* renamed from: X.1Nq  reason: invalid class name and case insensitive filesystem */
public class C27291Nq {
    public final C229716r A00;
    public final AnonymousClass12O A01;
    public final C27281Np A02;

    public C27291Nq(AnonymousClass12O r2, C27281Np r3, C229716r r4) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r3, 3);
        this.A00 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass147 r8) {
        /*
            r7 = this;
            r6 = 0
            X.AnonymousClass00C.A0D(r8, r6)
            X.16r r0 = r7.A00
            X.1M0 r5 = r0.A04()
            X.14e r4 = r5.A02     // Catch:{ all -> 0x0022 }
            java.lang.String r3 = "non_admin_group_membership_approval_requests"
            java.lang.String r2 = "group_jid =?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0022 }
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x0022 }
            r1[r6] = r0     // Catch:{ all -> 0x0022 }
            java.lang.String r0 = "delete_non_admin_gjr_by_group_jid"
            r4.A03(r3, r2, r0, r1)     // Catch:{ all -> 0x0022 }
            r5.close()
            return
        L_0x0022:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27291Nq.A00(X.147):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ac, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.util.List r12) {
        /*
            r11 = this;
            r7 = 0
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x00b8
            X.16r r0 = r11.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b4 }
            X.1M0 r4 = r0.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b4 }
            X.AnonymousClass00C.A0B(r4)     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r12.get(r7)     // Catch:{ all -> 0x00ad }
            X.3JV r0 = (X.AnonymousClass3JV) r0     // Catch:{ all -> 0x00ad }
            X.147 r8 = r0.A01     // Catch:{ all -> 0x00ad }
            X.71s r6 = r4.B1k()     // Catch:{ all -> 0x00ad }
            java.util.Iterator r10 = r12.iterator()     // Catch:{ all -> 0x00a6 }
        L_0x0020:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x008f
            java.lang.Object r3 = r10.next()     // Catch:{ all -> 0x00a6 }
            X.3JV r3 = (X.AnonymousClass3JV) r3     // Catch:{ all -> 0x00a6 }
            X.147 r5 = r3.A01     // Catch:{ all -> 0x00a6 }
            boolean r2 = X.AnonymousClass00C.A0J(r8, r5)     // Catch:{ all -> 0x00a6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r1.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "Not all requests given to bulkInsertRequests belong to the same group. Mismatched GroupJid1 : "
            r1.append(r0)     // Catch:{ all -> 0x00a6 }
            r1.append(r8)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = ",  GroupJid2: "
            r1.append(r0)     // Catch:{ all -> 0x00a6 }
            r1.append(r5)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00a6 }
            X.C18740tg.A0D(r2, r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r9 = r5.getRawString()     // Catch:{ all -> 0x00a6 }
            com.whatsapp.jid.UserJid r0 = r3.A03     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = r0.getRawString()     // Catch:{ all -> 0x00a6 }
            com.whatsapp.jid.UserJid r0 = r3.A02     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x0062
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x00a6 }
            if (r1 != 0) goto L_0x0064
        L_0x0062:
            java.lang.String r1 = ""
        L_0x0064:
            r0 = 4
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x00a6 }
            r5.<init>(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "group_jid"
            r5.put(r0, r9)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "requested_for_jid"
            r5.put(r0, r2)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "requested_by_jid"
            r5.put(r0, r1)     // Catch:{ all -> 0x00a6 }
            long r0 = r3.A00     // Catch:{ all -> 0x00a6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "request_creation_time"
            r5.put(r0, r1)     // Catch:{ all -> 0x00a6 }
            X.14e r3 = r4.A02     // Catch:{ all -> 0x00a6 }
            r2 = 5
            java.lang.String r1 = "non_admin_group_membership_approval_requests"
            java.lang.String r0 = "insert_non_admin_gjr"
            r3.A08(r1, r0, r5, r2)     // Catch:{ all -> 0x00a6 }
            goto L_0x0020
        L_0x008f:
            r6.A00()     // Catch:{ all -> 0x00a6 }
            r6.close()     // Catch:{ all -> 0x00ad }
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b4 }
            X.1Np r1 = r11.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b4 }
            java.lang.Object r0 = r12.get(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b4 }
            X.3JV r0 = (X.AnonymousClass3JV) r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b4 }
            X.147 r0 = r0.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b4 }
            r1.A00(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b4 }
            return
        L_0x00a6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x00ad }
            throw r0     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00af }
        L_0x00af:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b4 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b4 }
        L_0x00b4:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27291Nq.A02(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0061, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass147 r12, com.whatsapp.jid.UserJid r13) {
        /*
            r11 = this;
            java.lang.String r8 = "delete_non_admin_gjr"
            java.lang.String r7 = "requested_for_jid =? AND group_jid =?"
            java.lang.String r6 = "non_admin_group_membership_approval_requests"
            r9 = 0
            X.AnonymousClass00C.A0D(r12, r9)
            r5 = 1
            X.AnonymousClass00C.A0D(r13, r5)
            X.16r r0 = r11.A00
            X.1M0 r3 = r0.A04()
            X.71s r4 = r3.B1k()     // Catch:{ all -> 0x005e }
            X.14e r2 = r3.A02     // Catch:{ all -> 0x0057 }
            r1 = 2
            java.lang.String[] r10 = new java.lang.String[r1]     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = r13.getRawString()     // Catch:{ all -> 0x0057 }
            r10[r9] = r0     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = r12.getRawString()     // Catch:{ all -> 0x0057 }
            r10[r5] = r0     // Catch:{ all -> 0x0057 }
            int r0 = r2.A03(r6, r7, r8, r10)     // Catch:{ all -> 0x0057 }
            if (r0 != 0) goto L_0x0048
            X.12O r0 = r11.A01     // Catch:{ all -> 0x0057 }
            com.whatsapp.jid.UserJid r0 = r0.A0B(r13)     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0048
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x0057 }
            r1[r9] = r0     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = r12.getRawString()     // Catch:{ all -> 0x0057 }
            r1[r5] = r0     // Catch:{ all -> 0x0057 }
            r2.A03(r6, r7, r8, r1)     // Catch:{ all -> 0x0057 }
        L_0x0048:
            r4.A00()     // Catch:{ all -> 0x0057 }
            X.1Np r0 = r11.A02     // Catch:{ all -> 0x0057 }
            r0.A00(r12)     // Catch:{ all -> 0x0057 }
            r4.close()     // Catch:{ all -> 0x005e }
            r3.close()
            return
        L_0x0057:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x005e }
            throw r0     // Catch:{ all -> 0x005e }
        L_0x005e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27291Nq.A01(X.147, com.whatsapp.jid.UserJid):void");
    }
}
