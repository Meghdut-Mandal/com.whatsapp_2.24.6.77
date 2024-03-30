package X;

/* renamed from: X.61x  reason: invalid class name and case insensitive filesystem */
public class C1259361x {
    public final C219712j A00;
    public final AnonymousClass12P A01;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A00(X.AnonymousClass5J5 r21) {
        /*
            r20 = this;
            r5 = r21
            long r1 = r5.A1N
            r18 = -1
            int r0 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x0166
            r4 = 0
            r6 = r20
            X.12P r8 = r6.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x015f, Error | RuntimeException -> 0x015a }
            X.1M0 r3 = r8.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x015f, Error | RuntimeException -> 0x015a }
            java.util.List r0 = r5.A00     // Catch:{ all -> 0x0150 }
            r0.isEmpty()     // Catch:{ all -> 0x0150 }
            java.util.Iterator r17 = X.C90474aD.A0r(r0)     // Catch:{ all -> 0x0150 }
        L_0x001c:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0150 }
            if (r0 == 0) goto L_0x014c
            java.lang.Object r16 = r17.next()     // Catch:{ all -> 0x0150 }
            r2 = r16
            X.5Nh r2 = (X.C107265Nh) r2     // Catch:{ all -> 0x0150 }
            monitor-enter(r16)     // Catch:{ all -> 0x0150 }
            boolean r0 = r2.A05()     // Catch:{ all -> 0x0144 }
            int r7 = r2.A01     // Catch:{ all -> 0x0144 }
            monitor-exit(r16)     // Catch:{ all -> 0x0150 }
            if (r0 == 0) goto L_0x001c
            android.content.ContentValues r9 = X.C36441kJ.A0E()     // Catch:{ all -> 0x0150 }
            long r10 = r2.A02()     // Catch:{ all -> 0x0150 }
            int r0 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x0049
            java.lang.String r10 = "_id"
            long r0 = r2.A02()     // Catch:{ all -> 0x0150 }
            X.C36341k9.A0p(r9, r10, r0)     // Catch:{ all -> 0x0150 }
        L_0x0049:
            java.lang.String r10 = "message_row_id"
            long r0 = r5.A1N     // Catch:{ all -> 0x0150 }
            X.C36341k9.A0p(r9, r10, r0)     // Catch:{ all -> 0x0150 }
            java.lang.String r10 = "timestamp"
            long r0 = r2.A01     // Catch:{ all -> 0x0150 }
            X.C36341k9.A0p(r9, r10, r0)     // Catch:{ all -> 0x0150 }
            java.lang.String r1 = "video_call"
            boolean r0 = r2.A0K     // Catch:{ all -> 0x0150 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0150 }
            r9.put(r1, r0)     // Catch:{ all -> 0x0150 }
            java.lang.String r10 = "group_jid_row_id"
            com.whatsapp.jid.GroupJid r0 = r2.A0D     // Catch:{ all -> 0x0150 }
            if (r0 == 0) goto L_0x00a2
            X.12j r1 = r6.A00     // Catch:{ all -> 0x0150 }
            com.whatsapp.jid.GroupJid r0 = r2.A0D     // Catch:{ all -> 0x0150 }
            long r0 = r1.A07(r0)     // Catch:{ all -> 0x0150 }
        L_0x0070:
            X.C36341k9.A0p(r9, r10, r0)     // Catch:{ all -> 0x0150 }
            java.lang.String r1 = "is_joinable_group_call"
            boolean r0 = r2.A0J     // Catch:{ all -> 0x0150 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0150 }
            r9.put(r1, r0)     // Catch:{ all -> 0x0150 }
            java.lang.String r1 = "is_dnd_mode_on"
            X.5Tz r0 = r2.A0B()     // Catch:{ all -> 0x0150 }
            int r0 = r0.databaseValue     // Catch:{ all -> 0x0150 }
            X.C36341k9.A0o(r9, r1, r0)     // Catch:{ all -> 0x0150 }
            java.lang.String r1 = "offer_silence_reason"
            X.C107265Nh.A01(r2)     // Catch:{ all -> 0x0150 }
            int r0 = r2.A0A     // Catch:{ all -> 0x0150 }
            X.C36341k9.A0o(r9, r1, r0)     // Catch:{ all -> 0x0150 }
            X.14e r10 = r3.A02     // Catch:{ all -> 0x0150 }
            java.lang.String r1 = "missed_call_logs"
            java.lang.String r0 = "insertOrUpdateCallLog/REPLACE_MISSED_CALL_LOGS"
            long r0 = r10.A06(r1, r0, r9)     // Catch:{ all -> 0x0150 }
            r2.A04(r0)     // Catch:{ all -> 0x0150 }
            monitor-enter(r16)     // Catch:{ all -> 0x0150 }
            goto L_0x00a5
        L_0x00a2:
            r0 = 0
            goto L_0x0070
        L_0x00a5:
            int r0 = r2.A01     // Catch:{ all -> 0x0144 }
            if (r7 != r0) goto L_0x00af
            r2.A02 = r4     // Catch:{ all -> 0x0144 }
            int r0 = r0 + 1
            r2.A01 = r0     // Catch:{ all -> 0x0144 }
        L_0x00af:
            monitor-exit(r16)     // Catch:{ all -> 0x0150 }
            long r9 = r2.A02()     // Catch:{ all -> 0x0150 }
            int r0 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x013d
            X.1M0 r7 = r8.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0135, Error | RuntimeException -> 0x0147 }
            java.util.Iterator r15 = X.C107265Nh.A00(r2)     // Catch:{ all -> 0x012b }
        L_0x00c0:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x0124
            java.lang.Object r14 = r15.next()     // Catch:{ all -> 0x012b }
            r9 = r14
            X.5Nf r9 = (X.C107255Nf) r9     // Catch:{ all -> 0x012b }
            monitor-enter(r14)     // Catch:{ all -> 0x012b }
            boolean r0 = r9.A05()     // Catch:{ all -> 0x0121 }
            int r10 = r9.A01     // Catch:{ all -> 0x0121 }
            monitor-exit(r14)     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x00c0
            android.content.ContentValues r11 = X.C36441kJ.A0E()     // Catch:{ all -> 0x012b }
            java.lang.String r12 = "call_logs_row_id"
            long r0 = r2.A02()     // Catch:{ all -> 0x012b }
            X.C36341k9.A0p(r11, r12, r0)     // Catch:{ all -> 0x012b }
            long r12 = r9.A02()     // Catch:{ all -> 0x012b }
            int r0 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x00f5
            java.lang.String r12 = "_id"
            long r0 = r9.A02()     // Catch:{ all -> 0x012b }
            X.C36341k9.A0p(r11, r12, r0)     // Catch:{ all -> 0x012b }
        L_0x00f5:
            java.lang.String r1 = "jid"
            com.whatsapp.jid.UserJid r0 = r9.A00     // Catch:{ all -> 0x012b }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x012b }
            r11.put(r1, r0)     // Catch:{ all -> 0x012b }
            java.lang.String r1 = "call_result"
            int r0 = r9.A01     // Catch:{ all -> 0x012b }
            X.C36341k9.A0o(r11, r1, r0)     // Catch:{ all -> 0x012b }
            X.14e r12 = r7.A02     // Catch:{ all -> 0x012b }
            java.lang.String r1 = "missed_call_log_participant"
            java.lang.String r0 = "insertOrUpdateCallLogParticipants/REPLACE_MISSED_CALL_LOG_PARTICIPANTS"
            long r0 = r12.A06(r1, r0, r11)     // Catch:{ all -> 0x012b }
            r9.A04(r0)     // Catch:{ all -> 0x012b }
            monitor-enter(r14)     // Catch:{ all -> 0x012b }
            int r0 = r9.A01     // Catch:{ all -> 0x0121 }
            if (r10 != r0) goto L_0x011f
            r9.A02 = r4     // Catch:{ all -> 0x0121 }
            int r0 = r0 + 1
            r9.A01 = r0     // Catch:{ all -> 0x0121 }
        L_0x011f:
            monitor-exit(r14)     // Catch:{ all -> 0x012b }
            goto L_0x00c0
        L_0x0121:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x012b }
            throw r0     // Catch:{ all -> 0x012b }
        L_0x0124:
            monitor-enter(r16)     // Catch:{ all -> 0x012b }
            monitor-exit(r16)     // Catch:{ all -> 0x012b }
            r7.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0135, Error | RuntimeException -> 0x0147 }
            goto L_0x001c
        L_0x012b:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0130 }
            goto L_0x0134
        L_0x0130:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0135, Error | RuntimeException -> 0x0147 }
        L_0x0134:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0135, Error | RuntimeException -> 0x0147 }
        L_0x0135:
            r1 = move-exception
            java.lang.String r0 = "MissedCallLogStore/insertOfUpdateCallLogParticipants"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0150 }
            goto L_0x001c
        L_0x013d:
            java.lang.String r0 = "CallLog row_id is not set"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ all -> 0x0150 }
            goto L_0x014b
        L_0x0144:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x0150 }
            goto L_0x014b
        L_0x0147:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0150 }
        L_0x014b:
            throw r0     // Catch:{ all -> 0x0150 }
        L_0x014c:
            r3.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x015f, Error | RuntimeException -> 0x015a }
            return
        L_0x0150:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0155 }
            goto L_0x0159
        L_0x0155:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x015f, Error | RuntimeException -> 0x015a }
        L_0x0159:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x015f, Error | RuntimeException -> 0x015a }
        L_0x015a:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x015f:
            r1 = move-exception
            java.lang.String r0 = "MissedCallLogStore/insertOfUpdateCallLogs"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0166:
            java.lang.String r0 = "message.row_id is not set"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1259361x.A00(X.5J5):void");
    }

    public C1259361x(C219712j r1, AnonymousClass12P r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
