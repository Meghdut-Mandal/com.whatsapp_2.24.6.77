package X;

/* renamed from: X.1aG  reason: invalid class name and case insensitive filesystem */
public final class C30471aG extends C29421Wo {
    public final C19630wG A00;
    public final C19770wU A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;
    public final AnonymousClass005 A07;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C30471aG(X.C19700wN r17, X.C19630wG r18, X.AnonymousClass19A r19, X.AnonymousClass19L r20, X.C19770wU r21, X.AnonymousClass005 r22, X.AnonymousClass005 r23, X.AnonymousClass005 r24, X.AnonymousClass005 r25, X.AnonymousClass005 r26, X.AnonymousClass005 r27) {
        /*
            r16 = this;
            r15 = 1
            r10 = r17
            X.AnonymousClass00C.A0D(r10, r15)
            r0 = 2
            r8 = r18
            X.AnonymousClass00C.A0D(r8, r0)
            r0 = 3
            r13 = r21
            X.AnonymousClass00C.A0D(r13, r0)
            r0 = 4
            r11 = r19
            X.AnonymousClass00C.A0D(r11, r0)
            r0 = 5
            r12 = r20
            X.AnonymousClass00C.A0D(r12, r0)
            r0 = 6
            r7 = r22
            X.AnonymousClass00C.A0D(r7, r0)
            r0 = 7
            r6 = r23
            X.AnonymousClass00C.A0D(r6, r0)
            r0 = 8
            r5 = r24
            X.AnonymousClass00C.A0D(r5, r0)
            r0 = 9
            r4 = r25
            X.AnonymousClass00C.A0D(r4, r0)
            r0 = 10
            r3 = r26
            X.AnonymousClass00C.A0D(r3, r0)
            r0 = 11
            r2 = r27
            X.AnonymousClass00C.A0D(r2, r0)
            int[] r14 = new int[r15]
            r1 = 0
            r0 = 246(0xf6, float:3.45E-43)
            r14[r1] = r0
            r9 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r9.A00 = r8
            r9.A01 = r13
            r9.A04 = r7
            r9.A03 = r6
            r9.A06 = r5
            r9.A05 = r4
            r9.A02 = r3
            r9.A07 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30471aG.<init>(X.0wN, X.0wG, X.19A, X.19L, X.0wU, X.005, X.005, X.005, X.005, X.005, X.005):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a8, code lost:
        if (r2 >= r7) goto L_0x0104;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C203399nx r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            X.AnonymousClass00C.A0D(r10, r0)
            X.9nx r4 = r10.A0a()
            X.AnonymousClass00C.A08(r4)
            java.lang.String r2 = r4.A00
            java.lang.String r0 = "notification_metadata"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01de
            java.lang.String r5 = "event"
            int r2 = r4.A0R(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "AccountLinkingNotificationHandler/received event:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r3 = "show_user_notif"
            switch(r2) {
                case 1: goto L_0x018c;
                case 2: goto L_0x00ae;
                case 3: goto L_0x0057;
                case 4: goto L_0x0180;
                case 5: goto L_0x0129;
                case 6: goto L_0x0077;
                case 7: goto L_0x004f;
                default: goto L_0x0034;
            }
        L_0x0034:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "unexpected value for event: "
            r1.append(r0)
            int r0 = r4.A0R(r5)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.19b r0 = new X.19b
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x004f:
            java.lang.String r1 = "Failure notification handling is not supported"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0057:
            X.005 r0 = r9.A03
            java.lang.Object r1 = r0.get()
            X.1UA r1 = (X.AnonymousClass1UA) r1
            X.6P0 r0 = X.C113435fX.A00
            X.6OQ r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "AccountLinkingNotificationHandler/handleChangeSettings/null user"
            goto L_0x01da
        L_0x006b:
            X.005 r0 = r9.A04
            java.lang.Object r0 = r0.get()
            X.1UC r0 = (X.AnonymousClass1UC) r0
            r0.A09()
            return
        L_0x0077:
            java.lang.String r0 = "sync_delay"
            long r7 = r4.A0U(r0)
            X.005 r0 = r9.A04
            java.lang.Object r6 = r0.get()
            X.1UC r6 = (X.AnonymousClass1UC) r6
            android.content.SharedPreferences r3 = r6.A06()
            java.lang.String r0 = "last_cache_update_time"
            r1 = 0
            long r4 = r3.getLong(r0, r1)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00aa
            X.0wo r0 = r6.A02
            long r2 = X.C19970wo.A00(r0)
            long r2 = r2 - r4
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r2 = r2 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            if (r0 == 0) goto L_0x00aa
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0104
        L_0x00aa:
            java.lang.String r0 = "AccountLinkingNotificationHandler/handleResyncState/not valid for cache sync"
            goto L_0x01da
        L_0x00ae:
            r1 = -1
            java.lang.String r0 = "type"
            int r2 = r4.A0S(r0, r1)
            java.lang.String r0 = r4.A0h(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.AnonymousClass00C.A08(r0)
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "client_resync"
            java.lang.String r0 = r4.A0h(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.AnonymousClass00C.A08(r0)
            boolean r4 = r0.booleanValue()
            if (r2 != 0) goto L_0x00e2
            X.005 r0 = r9.A06
            java.lang.Object r0 = r0.get()
            X.6Md r0 = (X.C130716Md) r0
            r0.A01()
        L_0x00e2:
            if (r1 == 0) goto L_0x0102
            X.0wG r0 = r9.A00
            android.content.Context r0 = r0.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131897195(0x7f122b6b, float:1.9429273E38)
            java.lang.String r3 = r1.getString(r0)
            X.AnonymousClass00C.A08(r3)
            r2 = 44
            X.0wU r1 = r9.A01
            X.3vE r0 = new X.3vE
            r0.<init>(r9, r3, r2)
            r1.Boy(r0)
        L_0x0102:
            if (r4 == 0) goto L_0x01dd
        L_0x0104:
            X.005 r2 = r9.A03
            java.lang.Object r1 = r2.get()
            X.1UA r1 = (X.AnonymousClass1UA) r1
            X.6P0 r0 = X.C113435fX.A00
            X.6OQ r3 = r1.A00(r0)
            if (r3 != 0) goto L_0x0118
            java.lang.String r0 = "AccountLinkingNotificationHandler/syncState/null user"
            goto L_0x01da
        L_0x0118:
            java.lang.Object r2 = r2.get()
            X.1UA r2 = (X.AnonymousClass1UA) r2
            r0 = 0
            X.7rD r1 = new X.7rD
            r1.<init>(r9, r0)
            r0 = 0
            r2.A02(r3, r1, r0)
            return
        L_0x0129:
            java.lang.String r0 = "ndc"
            java.lang.String r0 = r4.A0h(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.AnonymousClass00C.A08(r0)
            boolean r3 = r0.booleanValue()
            java.lang.String r0 = "npr"
            java.lang.String r0 = r4.A0h(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.AnonymousClass00C.A08(r0)
            boolean r2 = r0.booleanValue()
            X.005 r0 = r9.A05
            java.lang.Object r1 = r0.get()
            X.1UC r1 = (X.AnonymousClass1UC) r1
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A0A(r0)
            if (r3 != 0) goto L_0x01bc
            if (r2 != 0) goto L_0x01bc
            X.005 r0 = r9.A03
            java.lang.Object r1 = r0.get()
            X.1UA r1 = (X.AnonymousClass1UA) r1
            X.6P0 r0 = X.C113435fX.A00
            X.6OQ r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x01bc
            X.005 r0 = r9.A02
            java.lang.Object r1 = r0.get()
            X.61L r1 = (X.AnonymousClass61L) r1
            X.6tx r0 = new X.6tx
            r0.<init>()
            r1.A00(r0)
            return
        L_0x0180:
            X.005 r0 = r9.A06
            java.lang.Object r0 = r0.get()
            X.6Md r0 = (X.C130716Md) r0
            r0.A01()
            return
        L_0x018c:
            java.lang.String r0 = r4.A0h(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.AnonymousClass00C.A08(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01dd
            X.0wG r0 = r9.A00
            android.content.Context r0 = r0.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131897194(0x7f122b6a, float:1.942927E38)
            java.lang.String r3 = r1.getString(r0)
            X.AnonymousClass00C.A08(r3)
            r2 = 43
            X.0wU r1 = r9.A01
            X.3vE r0 = new X.3vE
            r0.<init>(r9, r3, r2)
            r1.Boy(r0)
            return
        L_0x01bc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "AccountLinkingNotificationHandler/handleSuspendState/needs disclosure ("
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ") or needs password reset ("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ") or null user"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x01da:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x01dd:
            return
        L_0x01de:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "unexpected tag: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            X.19b r0 = new X.19b
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30471aG.A07(X.9nx, int):void");
    }
}
