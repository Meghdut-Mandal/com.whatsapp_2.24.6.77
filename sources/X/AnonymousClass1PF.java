package X;

/* renamed from: X.1PF  reason: invalid class name */
public class AnonymousClass1PF {
    public final C229716r A00;
    public final C27281Np A01;

    public AnonymousClass1PF(C27281Np r2, C229716r r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A00 = r3;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(X.AnonymousClass147 r7) {
        /*
            r6 = this;
            r1 = 0
            X.AnonymousClass00C.A0D(r7, r1)
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]
            java.lang.String r0 = r7.getRawString()
            r4 = 0
            r5[r1] = r0
            X.16r r0 = r6.A00
            X.1M0 r3 = r0.get()
            X.14e r2 = r3.A02     // Catch:{ all -> 0x003c }
            java.lang.String r1 = "SELECT COUNT(*) as count FROM group_membership_approval_requests WHERE group_jid = ?"
            java.lang.String r0 = "GET_GROUP_MEMBERSHIP_APPROVAL_REQUESTS_COUNT_WITH_JID_SQL"
            android.database.Cursor r2 = r2.A09(r1, r0, r5)     // Catch:{ all -> 0x003c }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "count"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0035 }
            int r4 = r2.getInt(r0)     // Catch:{ all -> 0x0035 }
        L_0x002e:
            r2.close()     // Catch:{ all -> 0x003c }
            r3.close()
            return r4
        L_0x0035:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1PF.A00(X.147):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass147 r8) {
        /*
            r7 = this;
            r6 = 0
            X.AnonymousClass00C.A0D(r8, r6)
            X.16r r0 = r7.A00
            X.1M0 r5 = r0.A04()
            X.14e r4 = r5.A02     // Catch:{ all -> 0x002a }
            java.lang.String r3 = "group_membership_approval_requests"
            java.lang.String r2 = "group_jid =?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x002a }
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x002a }
            r1[r6] = r0     // Catch:{ all -> 0x002a }
            java.lang.String r0 = "delete_membership_approval_requests_by_group_jid"
            int r0 = r4.A03(r3, r2, r0, r1)     // Catch:{ all -> 0x002a }
            r5.close()
            if (r0 <= 0) goto L_0x0029
            X.1Np r0 = r7.A01
            r0.A00(r8)
        L_0x0029:
            return
        L_0x002a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002c }
        L_0x002c:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1PF.A01(X.147):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass147 r10, com.whatsapp.jid.UserJid r11) {
        /*
            r9 = this;
            r8 = 0
            X.AnonymousClass00C.A0D(r10, r8)
            r7 = 1
            X.AnonymousClass00C.A0D(r11, r7)
            X.16r r0 = r9.A00
            X.1M0 r4 = r0.A04()
            X.14e r6 = r4.A02     // Catch:{ all -> 0x003d }
            java.lang.String r5 = "group_membership_approval_requests"
            java.lang.String r3 = "requester_jid =? AND group_jid =?"
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x003d }
            java.lang.String r0 = r11.getRawString()     // Catch:{ all -> 0x003d }
            r2 = 0
            r1[r8] = r0     // Catch:{ all -> 0x003d }
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x003d }
            r1[r7] = r0     // Catch:{ all -> 0x003d }
            java.lang.String r0 = "delete_membership_approval_request"
            int r1 = r6.A03(r5, r3, r0, r1)     // Catch:{ all -> 0x003d }
            if (r1 > r7) goto L_0x002d
            r2 = 1
        L_0x002d:
            java.lang.String r0 = "There should not be more than 1 membership approval request entries with same requester_jid + group_jid"
            X.C18740tg.A0D(r2, r0)     // Catch:{ all -> 0x003d }
            if (r1 <= 0) goto L_0x0039
            X.1Np r0 = r9.A01     // Catch:{ all -> 0x003d }
            r0.A00(r10)     // Catch:{ all -> 0x003d }
        L_0x0039:
            r4.close()
            return
        L_0x003d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1PF.A02(X.147, com.whatsapp.jid.UserJid):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d5, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.util.List r11) {
        /*
            r10 = this;
            r7 = 0
            X.AnonymousClass00C.A0D(r11, r7)
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x00da
            X.16r r0 = r10.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6 }
            X.1M0 r4 = r0.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6 }
            X.AnonymousClass00C.A0B(r4)     // Catch:{ all -> 0x00cf }
            boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x00cf }
            if (r0 != 0) goto L_0x00be
            java.lang.Object r0 = r11.get(r7)     // Catch:{ all -> 0x00cf }
            X.3K1 r0 = (X.AnonymousClass3K1) r0     // Catch:{ all -> 0x00cf }
            X.147 r8 = r0.A01     // Catch:{ all -> 0x00cf }
            X.71s r6 = r4.B1k()     // Catch:{ all -> 0x00cf }
            java.util.Iterator r9 = r11.iterator()     // Catch:{ all -> 0x00b7 }
        L_0x0029:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00b7 }
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r2 = r9.next()     // Catch:{ all -> 0x00b7 }
            X.3K1 r2 = (X.AnonymousClass3K1) r2     // Catch:{ all -> 0x00b7 }
            X.147 r5 = r2.A01     // Catch:{ all -> 0x00b7 }
            boolean r3 = X.AnonymousClass00C.A0J(r8, r5)     // Catch:{ all -> 0x00b7 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b7 }
            r1.<init>()     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = "Not all requests given to bulkInsertGroupMembershipApprovalRequests belong to the same group. Mismatched GroupJid1 : "
            r1.append(r0)     // Catch:{ all -> 0x00b7 }
            r1.append(r8)     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = ",  GroupJid2: "
            r1.append(r0)     // Catch:{ all -> 0x00b7 }
            r1.append(r5)     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00b7 }
            X.C18740tg.A0D(r3, r0)     // Catch:{ all -> 0x00b7 }
            java.lang.String r3 = r5.getRawString()     // Catch:{ all -> 0x00b7 }
            com.whatsapp.jid.UserJid r0 = r2.A04     // Catch:{ all -> 0x00b7 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x00b7 }
            r0 = 6
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x00b7 }
            r5.<init>(r0)     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = "group_jid"
            r5.put(r0, r3)     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = "requester_jid"
            r5.put(r0, r1)     // Catch:{ all -> 0x00b7 }
            java.lang.String r1 = r2.A05     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = "request_method"
            r5.put(r0, r1)     // Catch:{ all -> 0x00b7 }
            long r0 = r2.A00     // Catch:{ all -> 0x00b7 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = "request_creation_time"
            r5.put(r0, r1)     // Catch:{ all -> 0x00b7 }
            X.147 r0 = r2.A02     // Catch:{ all -> 0x00b7 }
            java.lang.String r1 = "parent_group_jid"
            if (r0 == 0) goto L_0x00ac
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x00b7 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00b7 }
        L_0x0090:
            com.whatsapp.jid.UserJid r0 = r2.A03     // Catch:{ all -> 0x00b7 }
            java.lang.String r1 = "requested_by_jid"
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x00b7 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00b7 }
        L_0x009d:
            X.14e r3 = r4.A02     // Catch:{ all -> 0x00b7 }
            r2 = 5
            java.lang.String r1 = "group_membership_approval_requests"
            java.lang.String r0 = "group_membership_approval_requests.insertGroupMembershipApprovalRequest"
            r3.A08(r1, r0, r5, r2)     // Catch:{ all -> 0x00b7 }
            goto L_0x0029
        L_0x00a8:
            r5.putNull(r1)     // Catch:{ all -> 0x00b7 }
            goto L_0x009d
        L_0x00ac:
            r5.putNull(r1)     // Catch:{ all -> 0x00b7 }
            goto L_0x0090
        L_0x00b0:
            r6.A00()     // Catch:{ all -> 0x00b7 }
            r6.close()     // Catch:{ all -> 0x00cf }
            goto L_0x00be
        L_0x00b7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x00cf }
            throw r0     // Catch:{ all -> 0x00cf }
        L_0x00be:
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6 }
            X.1Np r1 = r10.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6 }
            java.lang.Object r0 = r11.get(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6 }
            X.3K1 r0 = (X.AnonymousClass3K1) r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6 }
            X.147 r0 = r0.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6 }
            r1.A00(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6 }
            return
        L_0x00cf:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d6 }
        L_0x00d6:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1PF.A03(java.util.List):void");
    }
}
