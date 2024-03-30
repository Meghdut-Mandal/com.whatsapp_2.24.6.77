package X;

/* renamed from: X.6W3  reason: invalid class name */
public final class AnonymousClass6W3 {
    public static final AnonymousClass6W3 A00 = new AnonymousClass6W3();

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b5, code lost:
        if (r0 == null) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C107265Nh A04(X.C100074uQ r40) {
        /*
            r39 = this;
            r6 = 0
            r7 = r40
            X.AnonymousClass00C.A0D(r7, r6)
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r7.callCreatorJid_
            com.whatsapp.jid.UserJid r9 = r1.A02(r0)
            r15 = 0
            if (r9 == 0) goto L_0x012d
            boolean r0 = r7.isIncoming_
            r3 = r0 ^ 1
            java.lang.String r0 = r7.callId_
            java.lang.String r2 = X.C34681hT.A09(r0)
            if (r2 == 0) goto L_0x012d
            boolean r0 = r7.isCallLink_
            if (r0 == 0) goto L_0x0032
            java.lang.String r4 = r7.callLinkToken_
            if (r4 == 0) goto L_0x0032
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0032
            r0 = -1
            X.3Ir r15 = new X.3Ir
            r15.<init>(r9, r4, r0)
        L_0x0032:
            r4 = r9
            X.B6c r0 = r7.participants_
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00a5
            r0 = r9
        L_0x003c:
            r4 = r0
        L_0x003d:
            r0 = -1
            X.6by r5 = new X.6by
            r5.<init>(r0, r4, r2, r3)
            long r2 = r7.startTime_
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            boolean r13 = r7.isVideo_
            long r0 = r7.duration_
            int r12 = (int) r0
            int r0 = r7.callResult_
            X.5UI r0 = X.AnonymousClass5UI.A00(r0)
            if (r0 != 0) goto L_0x0057
            X.5UI r0 = X.AnonymousClass5UI.Connected
        L_0x0057:
            int r26 = A00(r0)
            boolean r0 = r7.isDndMode_
            if (r0 == 0) goto L_0x00a2
            X.5Tz r20 = X.C108555Tz.A05
        L_0x0061:
            X.6SZ r1 = com.whatsapp.jid.GroupJid.Companion
            java.lang.String r0 = r7.groupJid_
            com.whatsapp.jid.GroupJid r17 = r1.A02(r0)
            X.B6c r0 = r7.participants_
            java.util.ArrayList r4 = X.C36411kG.A13(r0)
            java.util.Iterator r14 = r0.iterator()
        L_0x0073:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r1 = r14.next()
            X.4u7 r1 = (X.C99884u7) r1
            X.13r r8 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r1.userJid_
            com.whatsapp.jid.UserJid r11 = r8.A02(r0)
            if (r11 == 0) goto L_0x0073
            int r0 = r1.callResult_
            X.5UI r0 = X.AnonymousClass5UI.A00(r0)
            if (r0 != 0) goto L_0x0093
            X.5UI r0 = X.AnonymousClass5UI.Connected
        L_0x0093:
            int r10 = A00(r0)
            r0 = -1
            X.5Nf r8 = new X.5Nf
            r8.<init>(r11, r10, r0)
            r4.add(r8)
            goto L_0x0073
        L_0x00a2:
            X.5Tz r20 = X.C108555Tz.NONE
            goto L_0x0061
        L_0x00a5:
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            X.B6c r0 = r7.participants_
            java.lang.Object r0 = r0.get(r6)
            X.4u7 r0 = (X.C99884u7) r0
            java.lang.String r0 = r0.userJid_
            com.whatsapp.jid.UserJid r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x003c
            goto L_0x003d
        L_0x00b8:
            X.13u r0 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r16 = r0.A01(r9, r6)
            r18 = 0
            int r1 = r7.silenceReason_
            if (r1 == 0) goto L_0x012a
            r0 = 1
            if (r1 == r0) goto L_0x0127
            r0 = 2
            if (r1 == r0) goto L_0x0124
            r0 = 3
            if (r1 != r0) goto L_0x012a
            X.5UE r0 = X.AnonymousClass5UE.Lightweight
        L_0x00cf:
            int r8 = r0.ordinal()
            r27 = 0
            r1 = 2
            r0 = 1
            if (r8 == r6) goto L_0x00e1
            if (r8 == r0) goto L_0x0121
            r27 = 2
            if (r8 == r1) goto L_0x00e1
            r27 = 3
        L_0x00e1:
            int r1 = r7.callType_
            if (r1 == 0) goto L_0x011e
            if (r1 == r0) goto L_0x011b
            r0 = 2
            if (r1 != r0) goto L_0x011e
            X.5UD r0 = X.AnonymousClass5UD.VOICE_CHAT
        L_0x00ec:
            int r1 = r0.ordinal()
            r28 = 0
            r0 = 1
            if (r1 == r6) goto L_0x00fb
            r28 = 1
            if (r1 == r0) goto L_0x00fb
            r28 = 2
        L_0x00fb:
            r29 = -1
            r33 = 0
            X.5Nh r14 = new X.5Nh
            r22 = r18
            r23 = r18
            r36 = 0
            r37 = 0
            r38 = 0
            r21 = r18
            r24 = r4
            r25 = r12
            r31 = r2
            r35 = r13
            r19 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33, r35, r36, r37, r38)
            return r14
        L_0x011b:
            X.5UD r0 = X.AnonymousClass5UD.SCHEDULED_CALL
            goto L_0x00ec
        L_0x011e:
            X.5UD r0 = X.AnonymousClass5UD.REGULAR
            goto L_0x00ec
        L_0x0121:
            r27 = 1
            goto L_0x00e1
        L_0x0124:
            X.5UE r0 = X.AnonymousClass5UE.Privacy
            goto L_0x00cf
        L_0x0127:
            X.5UE r0 = X.AnonymousClass5UE.Scheduled
            goto L_0x00cf
        L_0x012a:
            X.5UE r0 = X.AnonymousClass5UE.None
            goto L_0x00cf
        L_0x012d:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6W3.A04(X.4uQ):X.5Nh");
    }

    public static final int A00(AnonymousClass5UI r1) {
        switch (r1.ordinal()) {
            case 0:
                return 5;
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
                return 6;
            case 4:
                return 2;
            case 6:
                return 3;
            default:
                return 0;
        }
    }

    public static final AnonymousClass5UI A01(int i) {
        switch (i) {
            case 1:
                return AnonymousClass5UI.Cancelled;
            case 2:
                return AnonymousClass5UI.Missed;
            case 3:
                return AnonymousClass5UI.Unavailable;
            case 4:
                return AnonymousClass5UI.Rejected;
            case 5:
                return AnonymousClass5UI.Connected;
            case 6:
                return AnonymousClass5UI.AcceptedElsewhere;
            default:
                return AnonymousClass5UI.Invalid;
        }
    }

    public static C100074uQ A02(AnonymousClass8NN r0) {
        r0.A0S();
        return (C100074uQ) r0.A00;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x017a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C100074uQ A03(X.C19730wQ r9, X.C107265Nh r10) {
        /*
            boolean r3 = X.C36331k8.A1a(r10, r9)
            X.4uQ r0 = X.C100074uQ.DEFAULT_INSTANCE
            X.8NN r8 = r0.A0p()
            int r0 = r10.A07
            X.5UI r0 = A01(r0)
            X.4uQ r1 = A02(r8)
            int r0 = r0.value
            r1.callResult_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            X.5Tz r1 = r10.A0B()
            X.5Tz r0 = X.C108555Tz.A05
            boolean r2 = X.C36361kB.A1a(r1, r0)
            X.4uQ r1 = A02(r8)
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.isDndMode_ = r2
            X.C107265Nh.A01(r10)
            int r1 = r10.A0A
            if (r1 == 0) goto L_0x0270
            if (r1 == r3) goto L_0x026c
            r0 = 2
            if (r1 == r0) goto L_0x0268
            r0 = 3
            if (r1 != r0) goto L_0x0270
            X.5UE r0 = X.AnonymousClass5UE.Lightweight
        L_0x0045:
            X.4uQ r1 = A02(r8)
            int r0 = r0.value
            r1.silenceReason_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            int r0 = r10.A09
            long r1 = (long) r0
            X.4uQ r4 = A02(r8)
            int r0 = r4.bitField0_
            r0 = r0 | 8
            r4.bitField0_ = r0
            r4.duration_ = r1
            long r0 = r10.A01
            long r1 = X.C36391kE.A0B(r0)
            X.4uQ r4 = A02(r8)
            int r0 = r4.bitField0_
            r0 = r0 | 16
            r4.bitField0_ = r0
            r4.startTime_ = r1
            X.6by r5 = r10.A04
            boolean r0 = r5.A03
            r2 = r0 ^ 1
            X.4uQ r1 = A02(r8)
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.isIncoming_ = r2
            boolean r2 = r10.A0K
            X.4uQ r1 = A02(r8)
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.isVideo_ = r2
            java.lang.String r0 = r5.A02
            java.lang.String r2 = X.C34681hT.A08(r0)
            X.4uQ r1 = A02(r8)
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.bitField0_ = r0
            r1.callId_ = r2
            com.whatsapp.jid.DeviceJid r0 = r10.A02
            if (r0 == 0) goto L_0x00c2
            com.whatsapp.jid.UserJid r0 = r0.userJid
            java.lang.String r2 = r0.getRawString()
            X.4uQ r1 = A02(r8)
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.bitField0_ = r0
            r1.callCreatorJid_ = r2
        L_0x00c2:
            com.whatsapp.jid.GroupJid r0 = r10.A0D
            if (r0 == 0) goto L_0x00d9
            java.lang.String r2 = r0.getRawString()
            X.4uQ r1 = A02(r8)
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.bitField0_ = r0
            r1.groupJid_ = r2
        L_0x00d9:
            java.util.ArrayList r0 = r10.A0C()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x017a
            X.4u7 r0 = X.C99884u7.DEFAULT_INSTANCE
            X.8NN r4 = r0.A0p()
            com.whatsapp.jid.UserJid r0 = r5.A01
            java.lang.String r2 = r0.getRawString()
            X.8Hz r1 = X.C90524aI.A0H(r4)
            X.4u7 r1 = (X.C99884u7) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.userJid_ = r2
            int r0 = r10.A07
            X.5UI r0 = A01(r0)
            X.8Hz r1 = X.C90524aI.A0H(r4)
            X.4u7 r1 = (X.C99884u7) r1
            int r0 = r0.value
            r1.callResult_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            X.8Hz r4 = r4.A0R()
            X.4uQ r2 = A02(r8)
            r4.getClass()
            X.B6c r1 = r2.participants_
            r0 = r1
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0130
            X.B6c r1 = X.C170918Hz.A0A(r1)
            r2.participants_ = r1
        L_0x0130:
            r1.add(r4)
        L_0x0133:
            X.3Ir r2 = r10.A0C
            if (r2 == 0) goto L_0x0154
            X.4uQ r1 = A02(r8)
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.isCallLink_ = r3
            java.lang.String r2 = r2.A02
            X.4uQ r1 = A02(r8)
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.callLinkToken_ = r2
        L_0x0154:
            int r1 = r10.A08
            if (r1 == 0) goto L_0x0177
            if (r1 == r3) goto L_0x0174
            r0 = 2
            if (r1 != r0) goto L_0x0177
            X.5UD r0 = X.AnonymousClass5UD.VOICE_CHAT
        L_0x015f:
            X.4uQ r1 = A02(r8)
            int r0 = r0.value
            r1.callType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0
            X.8Hz r0 = r8.A0R()
            X.4uQ r0 = (X.C100074uQ) r0
            return r0
        L_0x0174:
            X.5UD r0 = X.AnonymousClass5UD.SCHEDULED_CALL
            goto L_0x015f
        L_0x0177:
            X.5UD r0 = X.AnonymousClass5UD.REGULAR
            goto L_0x015f
        L_0x017a:
            java.util.ArrayList r7 = r10.A0C()
            com.whatsapp.jid.UserJid r6 = r5.A01
            X.AnonymousClass00C.A07(r6)
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r7.iterator()
        L_0x018b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01a4
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.5Nf r0 = (X.C107255Nf) r0
            com.whatsapp.jid.UserJid r0 = r0.A00
            boolean r0 = X.AnonymousClass00C.A0J(r0, r6)
            if (r0 == 0) goto L_0x018b
            r5.add(r1)
            goto L_0x018b
        L_0x01a4:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x01af
            java.lang.String r0 = "CallLogSyncMutation/getSortedParticipants peer jid not found in the participant list"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x01af:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r7.iterator()
        L_0x01b7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01ce
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.5Nf r0 = (X.C107255Nf) r0
            com.whatsapp.jid.UserJid r0 = r0.A00
            boolean r0 = X.AnonymousClass00C.A0J(r0, r6)
            X.C36391kE.A1V(r1, r4, r0)
            goto L_0x01b7
        L_0x01ce:
            java.util.ArrayList r0 = X.C007103b.A0S(r4, r5)
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r4 = r0.iterator()
        L_0x01da:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0201
            java.lang.Object r2 = r4.next()
            r0 = r2
            X.5Nf r0 = (X.C107255Nf) r0
            com.whatsapp.jid.UserJid r1 = r0.A00
            com.whatsapp.jid.PhoneUserJid r0 = X.C36441kJ.A0n(r9)
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 != 0) goto L_0x01da
            X.13w r0 = r9.A08()
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 != 0) goto L_0x01da
            r5.add(r2)
            goto L_0x01da
        L_0x0201:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r7 = r5.iterator()
        L_0x0209:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0250
            java.lang.Object r6 = r7.next()
            X.5Nf r6 = (X.C107255Nf) r6
            X.4u7 r0 = X.C99884u7.DEFAULT_INSTANCE
            X.8NN r5 = r0.A0p()
            com.whatsapp.jid.UserJid r0 = r6.A00
            java.lang.String r2 = r0.getRawString()
            X.8Hz r1 = X.C90524aI.A0H(r5)
            X.4u7 r1 = (X.C99884u7) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.userJid_ = r2
            int r0 = r6.A01
            X.5UI r0 = A01(r0)
            X.8Hz r1 = X.C90524aI.A0H(r5)
            X.4u7 r1 = (X.C99884u7) r1
            int r0 = r0.value
            r1.callResult_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            X.8Hz r0 = r5.A0R()
            r4.add(r0)
            goto L_0x0209
        L_0x0250:
            X.4uQ r2 = A02(r8)
            X.B6c r1 = r2.participants_
            r0 = r1
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0263
            X.B6c r1 = X.C170918Hz.A0A(r1)
            r2.participants_ = r1
        L_0x0263:
            X.C21071A7i.A0O(r4, r1)
            goto L_0x0133
        L_0x0268:
            X.5UE r0 = X.AnonymousClass5UE.Privacy
            goto L_0x0045
        L_0x026c:
            X.5UE r0 = X.AnonymousClass5UE.Scheduled
            goto L_0x0045
        L_0x0270:
            X.5UE r0 = X.AnonymousClass5UE.None
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6W3.A03(X.0wQ, X.5Nh):X.4uQ");
    }
}
