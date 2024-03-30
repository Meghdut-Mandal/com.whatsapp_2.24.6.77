package com.whatsapp.calling.callgrid.viewmodel;

import X.AnonymousClass1G5;
import X.C116965lU;

public final class VoiceChatGridViewModel extends CallGridViewModel {
    public C116965lU A00;
    public final AnonymousClass1G5 A01;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C108275Sw A0S(X.AnonymousClass6OZ r7) {
        /*
            r6 = this;
            com.whatsapp.voipcalling.CallState r3 = r7.A09
            X.AnonymousClass00C.A07(r3)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r3 != r0) goto L_0x0034
            X.0yC r5 = r6.A0d
            X.0wy r0 = r7.A04
            int r4 = r0.size()
            boolean r2 = r7.A0L
            r0 = 6359(0x18d7, float:8.911E-42)
            boolean r1 = r5.A0E(r0)
            r0 = 5241(0x1479, float:7.344E-42)
            int r0 = r5.A07(r0)
            if (r4 > r0) goto L_0x0034
            if (r2 == 0) goto L_0x0025
            if (r1 == 0) goto L_0x0034
        L_0x0025:
            r2 = 1
        L_0x0026:
            X.7Jz r0 = new X.7Jz
            r0.<init>(r6)
            X.00U r1 = X.C36431kI.A1I(r0)
            if (r2 == 0) goto L_0x0036
            X.5Sw r0 = X.C108275Sw.NO_ONE_HERE
            return r0
        L_0x0034:
            r2 = 0
            goto L_0x0026
        L_0x0036:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r3 != r0) goto L_0x003d
            X.5Sw r0 = X.C108275Sw.GO_TO_CHAT_WITHOUT_PARTICIPANT_LIST
            return r0
        L_0x003d:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r3 == r0) goto L_0x0045
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r3 != r0) goto L_0x0052
        L_0x0045:
            java.lang.Object r0 = r1.getValue()
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x0052
            X.5Sw r0 = X.C108275Sw.NONE
            return r0
        L_0x0052:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r3 == r0) goto L_0x005d
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r3 == r0) goto L_0x005d
            X.5Sw r0 = X.C108275Sw.CONNECTING
            return r0
        L_0x005d:
            X.5Sw r0 = super.A0S(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel.A0S(X.6OZ):X.5Sw");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VoiceChatGridViewModel(X.C24801Dv r46, X.C19730wQ r47, X.C61693Db r48, X.C105545Fb r49, X.C145156tR r50, X.AnonymousClass6ND r51, X.AnonymousClass1PZ r52, X.C131176Oa r53, X.AnonymousClass798 r54, X.AnonymousClass53T r55, X.AnonymousClass711 r56, X.AnonymousClass16D r57, X.AnonymousClass185 r58, X.AnonymousClass171 r59, X.AnonymousClass1G5 r60, X.C19630wG r61, X.C18820ts r62, X.AnonymousClass17X r63, X.C25841Hw r64, X.C20810yC r65, X.C20350xQ r66, X.AnonymousClass1C6 r67, X.AnonymousClass13J r68, X.C19770wU r69, com.whatsapp.voipcalling.camera.VoipCameraManager r70, X.AnonymousClass004 r71, X.AnonymousClass004 r72, X.AnonymousClass004 r73) {
        /*
            r45 = this;
            r43 = r47
            r2 = r69
            r3 = r67
            r4 = r65
            r5 = r61
            r0 = r43
            X.C36321k7.A1B(r4, r0, r5, r2, r3)
            r1 = 7
            r44 = r46
            r0 = r44
            X.AnonymousClass00C.A0D(r0, r1)
            r20 = r50
            r19 = r49
            r7 = r68
            r1 = r19
            r0 = r20
            X.C36321k7.A14(r1, r0, r7)
            r1 = 11
            r17 = r57
            r0 = r17
            X.AnonymousClass00C.A0D(r0, r1)
            r26 = r56
            r25 = r55
            r10 = r59
            r8 = r66
            r9 = r62
            r1 = r25
            r0 = r26
            X.C36321k7.A1D(r10, r9, r1, r8, r0)
            r16 = r58
            r12 = r70
            r0 = r16
            X.C36361kB.A1M(r12, r0)
            r23 = r53
            r22 = r52
            r11 = r71
            r13 = r63
            r1 = r22
            r0 = r23
            X.C90464aC.A1B(r1, r13, r0, r11)
            r0 = 24
            r6 = r72
            X.AnonymousClass00C.A0D(r6, r0)
            r0 = 25
            r1 = r73
            X.AnonymousClass00C.A0D(r1, r0)
            r0 = 26
            r15 = r54
            X.AnonymousClass00C.A0D(r15, r0)
            r0 = 28
            r14 = r60
            X.AnonymousClass00C.A0D(r14, r0)
            r0 = r45
            r21 = r51
            r18 = r48
            r33 = r64
            r31 = r9
            r32 = r13
            r34 = r4
            r35 = r8
            r36 = r3
            r37 = r7
            r38 = r2
            r39 = r12
            r40 = r11
            r41 = r6
            r42 = r1
            r24 = r15
            r27 = r17
            r28 = r16
            r29 = r10
            r30 = r5
            r15 = r0
            r16 = r44
            r17 = r43
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r0.A01 = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel.<init>(X.1Dv, X.0wQ, X.3Db, X.5Fb, X.6tR, X.6ND, X.1PZ, X.6Oa, X.798, X.53T, X.711, X.16D, X.185, X.171, X.1G5, X.0wG, X.0ts, X.17X, X.1Hw, X.0yC, X.0xQ, X.1C6, X.13J, X.0wU, com.whatsapp.voipcalling.camera.VoipCameraManager, X.004, X.004, X.004):void");
    }
}
