package X;

/* renamed from: X.1PL  reason: invalid class name */
public final class AnonymousClass1PL {
    public final C229716r A00;

    public AnonymousClass1PL(C229716r r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ba, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A00(X.AnonymousClass147 r25) {
        /*
            r24 = this;
            r5 = 0
            r0 = r24
            X.16r r0 = r0.A00
            X.1M0 r4 = r0.get()
            X.14e r3 = r4.A02     // Catch:{ all -> 0x00b4 }
            java.lang.String r2 = "SELECT group_jid, parent_group_jid, subject, description, creator_jid, request_creation_time, participant_count, is_existing_group FROM member_suggested_groups_v2 WHERE parent_group_jid = ? ORDER BY request_creation_time DESC "
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = r25.getRawString()     // Catch:{ all -> 0x00b4 }
            r1[r5] = r0     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = "GET_GROUP_SUGGESTIONS_BY_PARENT_GROUP_JID"
            android.database.Cursor r3 = r3.A09(r2, r0, r1)     // Catch:{ all -> 0x00b4 }
            X.AnonymousClass00C.A0B(r3)     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = "group_jid"
            int r12 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = "parent_group_jid"
            int r11 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = "subject"
            int r10 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = "description"
            int r9 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = "creator_jid"
            int r8 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = "request_creation_time"
            int r7 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = "participant_count"
            int r6 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = "is_existing_group"
            int r2 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ad }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x00a4
            int r0 = r3.getCount()     // Catch:{ all -> 0x00ad }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00ad }
            r1.<init>(r0)     // Catch:{ all -> 0x00ad }
        L_0x005e:
            android.os.Parcelable$Creator r0 = X.AnonymousClass147.CREATOR     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = r3.getString(r11)     // Catch:{ all -> 0x00ad }
            X.147 r14 = X.C65533Sl.A04(r0)     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = r3.getString(r12)     // Catch:{ all -> 0x00ad }
            X.147 r15 = X.C65533Sl.A04(r0)     // Catch:{ all -> 0x00ad }
            java.lang.String r17 = r3.getString(r10)     // Catch:{ all -> 0x00ad }
            java.lang.String r18 = r3.getString(r9)     // Catch:{ all -> 0x00ad }
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = r3.getString(r8)     // Catch:{ all -> 0x00ad }
            com.whatsapp.jid.UserJid r16 = X.C222813r.A01(r0)     // Catch:{ all -> 0x00ad }
            long r19 = r3.getLong(r7)     // Catch:{ all -> 0x00ad }
            long r21 = r3.getLong(r6)     // Catch:{ all -> 0x00ad }
            int r5 = r3.getInt(r2)     // Catch:{ all -> 0x00ad }
            r0 = 1
            r23 = 0
            if (r5 != r0) goto L_0x0095
            r23 = 1
        L_0x0095:
            X.3KN r13 = new X.3KN     // Catch:{ all -> 0x00ad }
            r13.<init>(r14, r15, r16, r17, r18, r19, r21, r23)     // Catch:{ all -> 0x00ad }
            r1.add(r13)     // Catch:{ all -> 0x00ad }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x005e
            goto L_0x00a6
        L_0x00a4:
            X.09w r1 = X.C023409w.A00     // Catch:{ all -> 0x00ad }
        L_0x00a6:
            r3.close()     // Catch:{ all -> 0x00b4 }
            r4.close()
            return r1
        L_0x00ad:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00af }
        L_0x00af:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x00b4 }
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1PL.A00(X.147):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0075, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass147 r13, java.lang.Iterable r14) {
        /*
            r12 = this;
            r11 = 0
            r0 = 1
            X.AnonymousClass00C.A0D(r14, r0)
            X.16r r0 = r12.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x007a }
            X.1M0 r3 = r0.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x007a }
            X.71s r4 = r3.B1k()     // Catch:{ all -> 0x0073 }
            java.util.Iterator r10 = r14.iterator()     // Catch:{ all -> 0x006c }
        L_0x0013:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = r10.next()     // Catch:{ all -> 0x006c }
            X.3Iv r0 = (X.C63123Iv) r0     // Catch:{ all -> 0x006c }
            X.147 r9 = r0.A00     // Catch:{ all -> 0x006c }
            com.whatsapp.jid.UserJid r8 = r0.A01     // Catch:{ all -> 0x006c }
            r7 = 1
            r1 = 2
            java.lang.String r6 = "member_suggested_groups_v2"
            if (r8 == 0) goto L_0x0048
            X.14e r5 = r3.A02     // Catch:{ all -> 0x006c }
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x006c }
            java.lang.String r0 = r13.getRawString()     // Catch:{ all -> 0x006c }
            r2[r11] = r0     // Catch:{ all -> 0x006c }
            java.lang.String r0 = r9.getRawString()     // Catch:{ all -> 0x006c }
            r2[r7] = r0     // Catch:{ all -> 0x006c }
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x006c }
            r2[r1] = r0     // Catch:{ all -> 0x006c }
            java.lang.String r1 = "parent_group_jid = ?  AND group_jid = ?  AND creator_jid = ?"
            java.lang.String r0 = "DELETE_GROUP_SUGGESTIONS_BY_PARENT_AND_GROUP_JID_AND_CREATOR"
        L_0x0044:
            r5.A03(r6, r1, r0, r2)     // Catch:{ all -> 0x006c }
            goto L_0x0013
        L_0x0048:
            java.lang.String r0 = "deleteSubgroupSuggestionHelper/Deprecated sql DELETE_GROUP_SUGGESTIONS_BY_PARENT_AND_GROUP_JID is used, possibly revoke with no creator"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x006c }
            X.14e r5 = r3.A02     // Catch:{ all -> 0x006c }
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x006c }
            java.lang.String r0 = r13.getRawString()     // Catch:{ all -> 0x006c }
            r2[r11] = r0     // Catch:{ all -> 0x006c }
            java.lang.String r0 = r9.getRawString()     // Catch:{ all -> 0x006c }
            r2[r7] = r0     // Catch:{ all -> 0x006c }
            java.lang.String r1 = "parent_group_jid = ?  AND group_jid = ?"
            java.lang.String r0 = "DELETE_GROUP_SUGGESTIONS_BY_PARENT_AND_GROUP_JID"
            goto L_0x0044
        L_0x0062:
            r4.A00()     // Catch:{ all -> 0x006c }
            r4.close()     // Catch:{ all -> 0x0073 }
            r3.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x007a }
            return
        L_0x006c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x0073 }
            throw r0     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x007a }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x007a }
        L_0x007a:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1PL.A01(X.147, java.lang.Iterable):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0090, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0094, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.Iterable r11) {
        /*
            r10 = this;
            X.16r r0 = r10.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x009c }
            X.1M0 r4 = r0.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x009c }
            X.71s r5 = r4.B1k()     // Catch:{ all -> 0x0095 }
            java.util.Iterator r9 = r11.iterator()     // Catch:{ all -> 0x008e }
        L_0x000e:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0084
            java.lang.Object r3 = r9.next()     // Catch:{ all -> 0x008e }
            X.3KN r3 = (X.AnonymousClass3KN) r3     // Catch:{ all -> 0x008e }
            r0 = 8
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x008e }
            r6.<init>(r0)     // Catch:{ all -> 0x008e }
            X.147 r0 = r3.A02     // Catch:{ all -> 0x008e }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "group_jid"
            r6.put(r0, r1)     // Catch:{ all -> 0x008e }
            X.147 r0 = r3.A03     // Catch:{ all -> 0x008e }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "parent_group_jid"
            r6.put(r0, r1)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = r3.A06     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "subject"
            r6.put(r0, r1)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = r3.A05     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "description"
            r6.put(r0, r1)     // Catch:{ all -> 0x008e }
            com.whatsapp.jid.UserJid r0 = r3.A04     // Catch:{ all -> 0x008e }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "creator_jid"
            r6.put(r0, r1)     // Catch:{ all -> 0x008e }
            long r0 = r3.A00     // Catch:{ all -> 0x008e }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "request_creation_time"
            r6.put(r0, r1)     // Catch:{ all -> 0x008e }
            long r1 = r3.A01     // Catch:{ all -> 0x008e }
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x006c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "participant_count"
            r6.put(r0, r1)     // Catch:{ all -> 0x008e }
        L_0x006c:
            boolean r0 = r3.A07     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0079
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "is_existing_group"
            r6.put(r0, r1)     // Catch:{ all -> 0x008e }
        L_0x0079:
            X.14e r3 = r4.A02     // Catch:{ all -> 0x008e }
            r2 = 5
            java.lang.String r1 = "member_suggested_groups_v2"
            java.lang.String r0 = "member_suggested_groups_v2.insert"
            r3.A08(r1, r0, r6, r2)     // Catch:{ all -> 0x008e }
            goto L_0x000e
        L_0x0084:
            r5.A00()     // Catch:{ all -> 0x008e }
            r5.close()     // Catch:{ all -> 0x0095 }
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x009c }
            return
        L_0x008e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x0095 }
            throw r0     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x009c }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x009c }
        L_0x009c:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1PL.A02(java.lang.Iterable):void");
    }
}
