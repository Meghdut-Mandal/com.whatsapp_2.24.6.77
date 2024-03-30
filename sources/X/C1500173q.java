package X;

import java.util.List;

/* renamed from: X.73q  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1500173q implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass6YM A01;
    public final /* synthetic */ C107265Nh A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ C1500173q(AnonymousClass6YM r1, C107265Nh r2, String str, String str2, List list, int i, boolean z) {
        this.A01 = r1;
        this.A02 = r2;
        this.A05 = list;
        this.A06 = z;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e5, code lost:
        if (X.C34681hT.A0A(r6, r3.A2t) == false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0105, code lost:
        if (android.text.TextUtils.isEmpty(r0.A01) != false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0149, code lost:
        if (r0 != null) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0150, code lost:
        if (r0.intValue() == 0) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0152, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0153, code lost:
        X.C18740tg.A0D(r1, "Bug in loading call lobby entry point");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0158, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r31 = this;
            r1 = r31
            X.6YM r3 = r1.A01
            X.5Nh r2 = r1.A02
            java.util.List r7 = r1.A05
            boolean r0 = r1.A06
            r17 = r0
            java.lang.String r0 = r1.A03
            r30 = r0
            java.lang.String r0 = r1.A04
            r28 = r0
            int r0 = r1.A00
            r29 = r0
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            X.6by r5 = r2.A04
            com.whatsapp.jid.UserJid r11 = r5.A01
            boolean r13 = X.AnonymousClass143.A0I(r11)
            X.1Pb r8 = r3.A2X
            X.0wQ r6 = r3.A29
            r10 = 0
            r4 = 0
            r0 = 1
            if (r13 == 0) goto L_0x00ad
            X.13w r12 = r6.A08()
        L_0x0031:
            com.whatsapp.jid.DeviceJid[] r9 = new com.whatsapp.jid.DeviceJid[r0]
            if (r13 == 0) goto L_0x00a0
            X.8du r0 = r6.A07()
            r9[r4] = r0
            com.whatsapp.jid.PhoneUserJid r4 = X.C36441kJ.A0n(r6)
            com.whatsapp.voipcalling.CallParticipantJid r0 = new com.whatsapp.voipcalling.CallParticipantJid
            r0.<init>(r12, r10, r9, r4)
        L_0x0044:
            r1.add(r0)
            X.3Ir r0 = r2.A0C
            java.lang.String r14 = "voip/actionStartFromCallLog"
            if (r0 == 0) goto L_0x0053
            int r0 = r7.size()
            if (r0 == 0) goto L_0x0060
        L_0x0053:
            boolean r0 = X.C34681hT.A0E(r6, r11)
            if (r0 != 0) goto L_0x0060
            com.whatsapp.voipcalling.CallParticipantJid r0 = r8.A00(r11, r14)
            r1.add(r0)
        L_0x0060:
            com.whatsapp.jid.DeviceJid r9 = r2.A02
            r12 = 0
            if (r9 == 0) goto L_0x009e
            com.whatsapp.jid.UserJid r4 = r9.userJid
        L_0x0067:
            java.util.Iterator r16 = r7.iterator()
        L_0x006b:
            boolean r0 = r16.hasNext()
            r13 = 2
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r15 = r16.next()
            X.5Nf r15 = (X.C107255Nf) r15
            com.whatsapp.jid.UserJid r7 = r15.A00
            boolean r0 = r7.equals(r11)
            if (r0 != 0) goto L_0x006b
            boolean r0 = X.C34681hT.A0E(r6, r7)
            if (r0 != 0) goto L_0x006b
            int r0 = r2.A08
            if (r0 != r13) goto L_0x0096
            int r13 = r15.A01
            r0 = 5
            if (r13 == r0) goto L_0x0096
            boolean r0 = r7.equals(r4)
            if (r0 != 0) goto L_0x0096
            goto L_0x006b
        L_0x0096:
            com.whatsapp.voipcalling.CallParticipantJid r0 = r8.A00(r7, r14)
            r1.add(r0)
            goto L_0x006b
        L_0x009e:
            r4 = r10
            goto L_0x0067
        L_0x00a0:
            r6.A0G()
            X.13x r0 = r6.A02
            r9[r4] = r0
            com.whatsapp.voipcalling.CallParticipantJid r0 = new com.whatsapp.voipcalling.CallParticipantJid
            r0.<init>(r12, r9, r10)
            goto L_0x0044
        L_0x00ad:
            com.whatsapp.jid.PhoneUserJid r12 = X.C36441kJ.A0n(r6)
            goto L_0x0031
        L_0x00b2:
            X.0ww r4 = r3.A2A
            boolean r0 = r5.A03
            r4.A07(r0)
            boolean r0 = r2.A0K
            if (r0 == 0) goto L_0x00c0
            X.C90464aC.A14(r3)
        L_0x00c0:
            r7 = 1000(0x3e8, double:4.94E-321)
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r3.A17 = r0
            r8 = 0
            r3.A1G = r8
            boolean r4 = X.AnonymousClass000.A1V(r9)
            java.lang.String r0 = "voip/actionStartFromCallLog call log call creator is null"
            X.C18740tg.A0D(r4, r0)
            r7 = 70004(0x11174, float:9.8096E-41)
            if (r9 == 0) goto L_0x015f
            int r0 = r2.A08
            if (r0 != r13) goto L_0x00e7
            X.0yC r0 = r3.A2t
            boolean r0 = X.C34681hT.A0A(r6, r0)
            r26 = 1
            if (r0 != 0) goto L_0x00e9
        L_0x00e7:
            r26 = 0
        L_0x00e9:
            int r6 = r5.A00
            if (r17 == 0) goto L_0x0159
            r0 = r30
            r3.A19 = r0
        L_0x00f1:
            X.16D r0 = r3.A2b
            X.141 r0 = r0.A08(r11)
            if (r0 == 0) goto L_0x0107
            X.3IL r0 = r0.A0F
            if (r0 == 0) goto L_0x0107
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r19 = 0
            if (r0 == 0) goto L_0x0109
        L_0x0107:
            r19 = 1
        L_0x0109:
            com.whatsapp.voipcalling.CallParticipantJid[] r0 = new com.whatsapp.voipcalling.CallParticipantJid[r8]
            java.lang.Object[] r5 = r1.toArray(r0)
            com.whatsapp.voipcalling.CallParticipantJid[] r5 = (com.whatsapp.voipcalling.CallParticipantJid[]) r5
            boolean r4 = r2.A0K
            com.whatsapp.jid.GroupJid r1 = r2.A0D
            X.3Ir r0 = r2.A0C
            if (r0 == 0) goto L_0x011d
            X.3Ir r0 = r2.A0C
            java.lang.String r10 = r0.A02
        L_0x011d:
            X.661 r0 = r2.A0G
            if (r0 == 0) goto L_0x0125
            X.661 r0 = r2.A0G
            java.lang.String r12 = r0.A00
        L_0x0125:
            r18 = r9
            r20 = r5
            r21 = r4
            r22 = r1
            r23 = r6
            r24 = r10
            r25 = r12
            r27 = r17
            r16 = r30
            r17 = r11
            int r0 = com.whatsapp.voipcalling.Voip.joinOngoingCall(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            if (r0 == r7) goto L_0x015f
            java.lang.Integer r0 = r3.A15
            if (r0 != 0) goto L_0x014b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r29)
            r3.A15 = r0
            if (r0 == 0) goto L_0x0152
        L_0x014b:
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != 0) goto L_0x0153
        L_0x0152:
            r1 = 0
        L_0x0153:
            java.lang.String r0 = "Bug in loading call lobby entry point"
            X.C18740tg.A0D(r1, r0)
            return
        L_0x0159:
            if (r26 == 0) goto L_0x015c
            r6 = 0
        L_0x015c:
            r3.A19 = r10
            goto L_0x00f1
        L_0x015f:
            java.lang.String r0 = "voip/actionStartFromCallLog join ongoing call failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.6Ts r0 = r3.A2L
            r0.A07(r2, r8)
            X.1HJ r0 = r3.A2o
            r0.A09(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1500173q.run():void");
    }
}
