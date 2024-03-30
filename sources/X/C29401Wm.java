package X;

/* renamed from: X.1Wm  reason: invalid class name and case insensitive filesystem */
public class C29401Wm implements C236319f {
    public AnonymousClass1PW A00;
    public C29381Wk A01;
    public C20810yC A02;
    public final C20720y3 A03;

    public int[] BCF() {
        return new int[]{150, 192, 193, 197};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fb, code lost:
        if (X.C20800yB.A01(r3, r12.A06, 4800) != false) goto L_0x00fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BJl(android.os.Message r20, int r21) {
        /*
            r19 = this;
            r0 = 150(0x96, float:2.1E-43)
            r5 = 1
            r4 = r19
            r6 = r20
            r1 = r21
            if (r1 == r0) goto L_0x0090
            r0 = 197(0xc5, float:2.76E-43)
            if (r1 == r0) goto L_0x0090
            r0 = 192(0xc0, float:2.69E-43)
            if (r1 == r0) goto L_0x0019
            r0 = 193(0xc1, float:2.7E-43)
            if (r1 == r0) goto L_0x0090
            r0 = 0
            return r0
        L_0x0019:
            java.lang.Object r7 = r6.obj
            X.5Iw r7 = (X.C106235Iw) r7
            com.whatsapp.protocol.VoipStanzaChildNode r0 = r7.A01
            java.lang.String r1 = r0.tag
            java.lang.String r0 = "terminate"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0039
            X.0y3 r0 = r4.A03
            X.1MV r0 = r0.A0d
            r2 = 4
            android.os.Handler r1 = r0.A02
            java.lang.String r0 = "com.whatsapp.MessageHandler.LOGOUT_ACTION"
            android.os.Message r0 = r1.obtainMessage(r2, r0)
            r1.sendMessage(r0)
        L_0x0039:
            com.whatsapp.protocol.VoipStanzaChildNode r11 = r7.A01
            java.lang.String r0 = r11.tag
            java.lang.String r8 = "offer"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0090
            X.0yC r1 = r4.A02
            r0 = 7515(0x1d5b, float:1.0531E-41)
            X.0yV r3 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r3, r1, r0)
            if (r0 == 0) goto L_0x0090
            X.1Wk r2 = r4.A01
            java.lang.String r0 = r11.tag
            boolean r0 = android.text.TextUtils.equals(r0, r8)
            if (r0 == 0) goto L_0x0090
            com.whatsapp.jid.Jid r1 = r7.A00
            boolean r0 = r1 instanceof com.whatsapp.jid.DeviceJid
            if (r0 == 0) goto L_0x0169
            r10 = r1
            com.whatsapp.jid.DeviceJid r10 = (com.whatsapp.jid.DeviceJid) r10
            if (r10 == 0) goto L_0x0169
            com.whatsapp.voipcalling.CallOfferInfo[] r9 = new com.whatsapp.voipcalling.CallOfferInfo[r5]
            java.lang.String r12 = r7.A07
            java.lang.String r13 = r7.A05
            long r14 = r7.A01
            long r0 = r7.A00
            boolean r7 = r7.A08
            r18 = r7
            r16 = r0
            int r1 = com.whatsapp.voipcalling.Voip.nativeParseXmppOffer(r9, r10, r11, r12, r13, r14, r16, r18)
            if (r1 == 0) goto L_0x00a5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "voip/service/parseIncomingOfferStanza: Voip.nativeParseXmppOffer failed: "
            r2.append(r0)
            r2.append(r1)
        L_0x0089:
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0090:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            android.os.Message r3 = android.os.Message.obtain(r6)
            X.1PW r2 = r4.A00
            java.lang.String r1 = "receive_message"
            X.6Up r0 = new X.6Up
            r0.<init>((android.os.Message) r3, (java.lang.String) r1)
            r2.A00(r0)
            return r5
        L_0x00a5:
            r0 = 0
            r11 = r9[r0]
            X.C18740tg.A06(r11)
            if (r11 == 0) goto L_0x0090
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            boolean r0 = r11.isJoinableGroupCall()
            if (r0 == 0) goto L_0x00d8
            com.whatsapp.voipcalling.CallGroupInfo r0 = r11.callGroupInfo
            X.C18740tg.A06(r0)
            com.whatsapp.voipcalling.CallParticipant[] r9 = r0.participants
            X.AnonymousClass00C.A07(r9)
            int r8 = r9.length
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r8)
            r1 = 0
        L_0x00c9:
            if (r1 >= r8) goto L_0x00d5
            r0 = r9[r1]
            com.whatsapp.jid.UserJid r0 = r0.jid
            r7.add(r0)
            int r1 = r1 + 1
            goto L_0x00c9
        L_0x00d5:
            r13.addAll(r7)
        L_0x00d8:
            X.005 r10 = r2.A00
            java.lang.Object r12 = r10.get()
            X.6X4 r12 = (X.AnonymousClass6X4) r12
            java.lang.String r9 = r11.callId
            X.AnonymousClass00C.A07(r9)
            com.whatsapp.jid.UserJid r8 = r11.fromJid
            com.whatsapp.jid.GroupJid r1 = r11.groupJid
            r7 = 0
            int r0 = r13.size()
            int r0 = r0 - r5
            if (r0 > r5) goto L_0x013d
            if (r1 != 0) goto L_0x0159
            X.0yC r1 = r12.A06
            r0 = 4800(0x12c0, float:6.726E-42)
            boolean r0 = X.C20800yB.A01(r3, r1, r0)
            if (r0 == 0) goto L_0x0090
        L_0x00fd:
            X.3Qa r12 = new X.3Qa
            r12.<init>(r8, r9, r7)
        L_0x0102:
            java.util.HashSet r8 = r2.A01
            boolean r0 = r8.contains(r12)
            if (r0 != 0) goto L_0x0090
            java.lang.Object r7 = r10.get()
            X.6X4 r7 = (X.AnonymousClass6X4) r7
            com.whatsapp.jid.UserJid r2 = r11.fromJid
            X.0yC r1 = r7.A06
            boolean r0 = X.C34681hT.A0K(r1)
            if (r0 == 0) goto L_0x0138
            r0 = 7515(0x1d5b, float:1.0531E-41)
            boolean r0 = X.C20800yB.A01(r3, r1, r0)
            if (r0 == 0) goto L_0x0138
            X.9cw r7 = r7.A07
            X.2c3 r3 = new X.2c3
            r3.<init>(r12, r14)
            r3.A0q(r2)
            X.1aJ r2 = r7.A04
            r1 = 11
            X.736 r0 = new X.736
            r0.<init>(r7, r3, r12, r1)
            r2.A00(r0)
        L_0x0138:
            r8.add(r12)
            goto L_0x0090
        L_0x013d:
            if (r1 != 0) goto L_0x0159
            X.0yC r1 = r12.A06
            r0 = 4896(0x1320, float:6.861E-42)
            boolean r0 = X.C20800yB.A01(r3, r1, r0)
            if (r0 == 0) goto L_0x0090
            X.1Pa r1 = r12.A01
            com.whatsapp.jid.UserJid r0 = r1.A02(r9)
            if (r0 != 0) goto L_0x0157
            if (r8 == 0) goto L_0x00fd
            r1.A04(r8, r9)
            goto L_0x00fd
        L_0x0157:
            r8 = r0
            goto L_0x00fd
        L_0x0159:
            X.0yC r8 = r12.A06
            r0 = 4895(0x131f, float:6.86E-42)
            boolean r0 = X.C20800yB.A01(r3, r8, r0)
            if (r0 == 0) goto L_0x0090
            X.3Qa r12 = new X.3Qa
            r12.<init>(r1, r9, r7)
            goto L_0x0102
        L_0x0169:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "voip/receive_message/call-offer dropping stanza: invalid fromJid: "
            r2.append(r0)
            r2.append(r1)
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29401Wm.BJl(android.os.Message, int):boolean");
    }

    public C29401Wm(C29381Wk r1, AnonymousClass1PW r2, C20810yC r3, C20720y3 r4) {
        this.A03 = r4;
        this.A00 = r2;
        this.A01 = r1;
        this.A02 = r3;
    }
}
