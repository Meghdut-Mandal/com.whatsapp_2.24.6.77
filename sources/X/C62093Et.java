package X;

/* renamed from: X.3Et  reason: invalid class name and case insensitive filesystem */
public class C62093Et {
    public final AnonymousClass31P A00;
    public final C220412q A01;
    public final AnonymousClass17X A02;
    public final AnonymousClass17U A03;
    public final AnonymousClass1NO A04;
    public final AnonymousClass174 A05;
    public final AnonymousClass1CR A06;

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass141 r10) {
        /*
            r9 = this;
            X.174 r0 = r9.A05
            X.3qF r2 = new X.3qF
            r2.<init>(r9, r10)
            X.0zf r5 = r0.A01
            X.0ze r1 = r5.A05
            X.0zg r0 = r5.A04
            int r0 = r0.A06
            r1.BPD(r2, r0)
            X.11F r7 = X.C36351kA.A0j(r10)
            if (r7 == 0) goto L_0x00c6
            X.1CR r0 = r9.A06
            X.3LI r0 = r0.A0S(r7)
            if (r0 == 0) goto L_0x0028
            boolean r2 = r0.A0I
            java.lang.String r1 = "is_pinned_chat"
            r0 = 0
            r5.A0B(r1, r2, r0)
        L_0x0028:
            X.31P r3 = r9.A00
            monitor-enter(r3)
            java.util.Set r2 = r3.A00     // Catch:{ all -> 0x00c3 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x0037
            r2.add(r7)     // Catch:{ all -> 0x00c3 }
            goto L_0x0052
        L_0x0037:
            r1 = 100
            int r0 = r2.size()     // Catch:{ all -> 0x00c3 }
            r6 = 3
            if (r1 != r0) goto L_0x0047
            boolean r0 = r2.contains(r7)     // Catch:{ all -> 0x00c3 }
            if (r0 != 0) goto L_0x0050
            goto L_0x004f
        L_0x0047:
            boolean r0 = r2.add(r7)     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x0050
            r6 = 1
            goto L_0x0050
        L_0x004f:
            r6 = 4
        L_0x0050:
            monitor-exit(r3)
            goto L_0x0054
        L_0x0052:
            monitor-exit(r3)
            r6 = 2
        L_0x0054:
            java.lang.String r4 = "is_first_chat_open_after_start"
            java.lang.String r3 = "is_first_chat_open"
            r1 = 1
            r2 = 0
            if (r6 == r1) goto L_0x00bf
            r0 = 2
            if (r6 == r0) goto L_0x00b8
            r0 = 3
            if (r6 != r0) goto L_0x0068
            r5.A0B(r3, r2, r2)
        L_0x0065:
            r5.A0B(r4, r2, r2)
        L_0x0068:
            X.12q r1 = r9.A01
            int r0 = r1.A02(r7)
            if (r0 <= 0) goto L_0x0071
            r2 = 1
        L_0x0071:
            java.lang.String r0 = "has_unread_messages"
            r6 = 0
            r5.A0B(r0, r2, r6)
            long r1 = r1.A08(r7)
            long r3 = X.C36441kJ.A0A(r1)
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x009a
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x009a
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r0.toMinutes(r3)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x009b
            java.lang.String r1 = "less_1_minute"
        L_0x0095:
            java.lang.String r0 = "time_of_last_message"
            r5.A0A(r0, r1, r6)
        L_0x009a:
            return
        L_0x009b:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r0.toHours(r3)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x00a8
            java.lang.String r1 = "less_1_hour"
            goto L_0x0095
        L_0x00a8:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r0.toDays(r3)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x00b5
            java.lang.String r1 = "less_1_day"
            goto L_0x0095
        L_0x00b5:
            java.lang.String r1 = "more_1_day"
            goto L_0x0095
        L_0x00b8:
            r5.A0B(r3, r1, r2)
            r5.A0B(r4, r1, r2)
            goto L_0x0068
        L_0x00bf:
            r5.A0B(r3, r1, r2)
            goto L_0x0065
        L_0x00c3:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00c6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62093Et.A00(X.141):void");
    }

    public C62093Et(AnonymousClass31P r1, C220412q r2, AnonymousClass17X r3, AnonymousClass17U r4, AnonymousClass1NO r5, AnonymousClass174 r6, AnonymousClass1CR r7) {
        this.A01 = r2;
        this.A03 = r4;
        this.A06 = r7;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = r3;
        this.A00 = r1;
    }
}
