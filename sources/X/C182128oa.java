package X;

import java.util.Map;

/* renamed from: X.8oa  reason: invalid class name and case insensitive filesystem */
public abstract class C182128oa extends C195969Wz {
    public final AnonymousClass1W9 A00;
    public final AnonymousClass19A A01;

    public C182128oa(C19700wN r7, C20810yC r8, C21010yW r9, C199709fp r10, AnonymousClass1W9 r11, AnonymousClass19A r12, Map map) {
        super(r7, r8, r9, r10, map);
        this.A01 = r12;
        this.A00 = r11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02da, code lost:
        if (r3 != -1) goto L_0x02c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x030b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C203399nx r44, java.lang.Integer r45, java.util.Map r46) {
        /*
            r43 = this;
            r1 = r43
            boolean r2 = r1 instanceof X.C182038oR
            r0 = r44
            r27 = r45
            if (r2 == 0) goto L_0x003c
            X.8oR r1 = (X.C182038oR) r1
            long r32 = android.os.SystemClock.uptimeMillis()
            X.C18740tg.A06(r0)
            java.lang.Class<com.whatsapp.jid.Jid> r3 = com.whatsapp.jid.Jid.class
            java.lang.String r2 = "from"
            com.whatsapp.jid.Jid r13 = r0.A0X(r3, r2)
            java.lang.String r2 = "id"
            java.lang.String r8 = r0.A0h(r2)
            java.lang.String r2 = "participant"
            com.whatsapp.jid.Jid r7 = r0.A0X(r3, r2)
            java.lang.String r2 = "type"
            r6 = 0
            java.lang.String r5 = r0.A0i(r2, r6)
            java.lang.String r2 = "offline"
            java.lang.String r9 = r0.A0i(r2, r6)
            if (r9 == 0) goto L_0x01de
            java.lang.Integer r26 = java.lang.Integer.valueOf(r9)     // Catch:{ NumberFormatException -> 0x01d4 }
            goto L_0x01e0
        L_0x003c:
            X.8oQ r1 = (X.C182028oQ) r1
            long r41 = android.os.SystemClock.uptimeMillis()
            java.lang.String r2 = "offline"
            r6 = 0
            java.lang.String r2 = r0.A0i(r2, r6)
            r4 = 0
            r10 = 0
            if (r2 == 0) goto L_0x0061
            r10 = 1
            java.lang.Integer r35 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x0053 }
            goto L_0x0063
        L_0x0053:
            r5 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "connection/handleNotification: got bad offline="
            java.lang.String r2 = X.C36371kC.A0z(r2, r3, r10)
            com.whatsapp.util.Log.e(r2, r5)
        L_0x0061:
            r35 = 0
        L_0x0063:
            java.lang.String r2 = "e"
            java.lang.String r2 = r0.A0i(r2, r6)
            if (r2 == 0) goto L_0x00d3
            int r5 = java.lang.Integer.parseInt(r2)
        L_0x006f:
            java.lang.String r2 = "t"
            java.lang.String r2 = r0.A0i(r2, r6)
            r16 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x00d0
            long r25 = java.lang.Long.parseLong(r2)
            long r25 = r25 * r16
        L_0x007f:
            java.lang.Class<com.whatsapp.jid.Jid> r3 = com.whatsapp.jid.Jid.class
            java.lang.String r2 = "from"
            com.whatsapp.jid.Jid r3 = r0.A0Y(r3, r2)
            boolean r2 = X.AnonymousClass143.A0F(r3)
            if (r2 == 0) goto L_0x030b
            boolean r2 = r3 instanceof com.whatsapp.jid.UserJid
            if (r2 == 0) goto L_0x0097
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            com.whatsapp.jid.DeviceJid r3 = r3.getPrimaryDevice()
        L_0x0097:
            java.lang.String r2 = "id"
            java.lang.String r15 = r0.A0h(r2)
            java.lang.String r2 = "platform"
            java.lang.String r22 = r0.A0i(r2, r6)
            java.lang.String r2 = "version"
            java.lang.String r23 = r0.A0i(r2, r6)
            X.9nx r4 = r0.A0b(r4)
            if (r4 == 0) goto L_0x0304
            java.lang.String r2 = r4.A00
            java.lang.String r6 = "reminder"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L_0x00d5
            java.lang.String r6 = "bcall_"
            boolean r6 = r2.startsWith(r6)
            if (r6 != 0) goto L_0x00d5
            java.lang.String r6 = "call-id"
            java.lang.String r21 = X.C36391kE.A0x(r4, r6)
            if (r21 != 0) goto L_0x00d7
            java.lang.String r0 = "no call-id in the payload of incoming <call> node"
            X.19b r0 = X.C165617ti.A0Q(r0)
            throw r0
        L_0x00d0:
            r25 = 0
            goto L_0x007f
        L_0x00d3:
            r5 = 0
            goto L_0x006f
        L_0x00d5:
            java.lang.String r21 = ""
        L_0x00d7:
            java.lang.String r6 = "notify"
            java.lang.String r24 = X.C36391kE.A0x(r0, r6)
            X.1Vj r0 = r1.A00
            java.util.concurrent.atomic.AtomicLong r6 = r0.A06
            long r39 = r6.getAndIncrement()
            X.0wo r12 = r0.A01
            X.0yC r11 = r0.A03
            X.0wN r9 = r0.A00
            X.0yW r8 = r0.A04
            X.19L r6 = r0.A05
            X.11g r7 = r0.A02
            X.8eR r0 = new X.8eR
            r28 = r0
            r29 = r9
            r30 = r12
            r31 = r7
            r32 = r11
            r33 = r8
            r34 = r6
            r36 = r27
            r37 = r15
            r38 = r2
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41)
            r6.A05(r0)
            long r11 = r0.A03
            X.9YT r7 = X.AnonymousClass9YT.A00(r3)
            java.lang.String r6 = "call"
            r7.A05 = r6
            r7.A07 = r15
            r7.A08 = r2
            r7.A00 = r11
            X.9uj r14 = r7.A01()
            com.whatsapp.protocol.VoipStanzaChildNode r13 = com.whatsapp.protocol.VoipStanzaChildNode.fromProtocolTreeNode(r4)
            java.lang.Class<com.whatsapp.jid.DeviceJid> r8 = com.whatsapp.jid.DeviceJid.class
            java.lang.String r6 = "call-creator"
            com.whatsapp.jid.Jid r7 = r4.A0X(r8, r6)
            com.whatsapp.jid.DeviceJid r7 = (com.whatsapp.jid.DeviceJid) r7
            java.lang.String r9 = r13.tag
            java.lang.String r6 = "offer"
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x01d1
            boolean r6 = X.AnonymousClass143.A0I(r7)
            if (r6 == 0) goto L_0x01d1
            java.lang.String r6 = "caller_pn"
            com.whatsapp.jid.Jid r8 = r4.A0X(r8, r6)
            com.whatsapp.jid.DeviceJid r8 = (com.whatsapp.jid.DeviceJid) r8
        L_0x0147:
            long r4 = (long) r5
            long r4 = r4 * r16
            X.5Iw r6 = new X.5Iw
            r27 = r4
            r29 = r11
            r31 = r10
            r18 = r3
            r19 = r13
            r20 = r15
            r15 = r6
            r16 = r7
            r17 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r31)
            r3 = 2
            r0.A04(r3)
            X.9fp r5 = r1.A04
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-call-incoming-stanza tag="
            r3.append(r0)
            com.whatsapp.protocol.VoipStanzaChildNode r4 = r6.A01
            java.lang.String r0 = r4.tag
            r3.append(r0)
            java.lang.String r0 = " from="
            r3.append(r0)
            com.whatsapp.jid.Jid r0 = r6.A00
            r3.append(r0)
            java.lang.String r0 = " callId="
            r3.append(r0)
            java.lang.String r0 = r6.A02
            X.C36321k7.A1a(r3, r0)
            X.Ayz r3 = r5.A00
            r38 = 0
            r0 = 192(0xc0, float:2.69E-43)
            X.C165577te.A18(r3, r6, r0)
            boolean r0 = X.C106235Iw.A00(r2)
            if (r0 != 0) goto L_0x01ce
            java.util.Map r3 = X.C177828eR.A01
            boolean r0 = r3.containsKey(r2)
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r0 = r3.get(r2)
            X.C18740tg.A06(r0)
            int r0 = X.AnonymousClass000.A0I(r0)
        L_0x01ac:
            java.lang.Integer r37 = java.lang.Integer.valueOf(r0)
        L_0x01b0:
            java.lang.Integer r36 = X.C36371kC.A0n()
            r39 = r38
            r40 = r38
            r34 = r1
            r34.A02(r35, r36, r37, r38, r39, r40)
            java.lang.String r0 = r4.tag
            boolean r0 = X.C106235Iw.A00(r0)
            if (r0 == 0) goto L_0x02ac
            X.19A r0 = r1.A01
            r0.A0H(r14)
            return
        L_0x01cb:
            r0 = 18
            goto L_0x01ac
        L_0x01ce:
            r37 = 0
            goto L_0x01b0
        L_0x01d1:
            r8 = 0
            goto L_0x0147
        L_0x01d4:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "connection/handleNotification: got bad offline="
            X.C90464aC.A1L(r2, r9, r3, r4)
        L_0x01de:
            r26 = 0
        L_0x01e0:
            java.lang.Integer r16 = X.C36371kC.A0o()
            r18 = r6
            r20 = r6
            r14 = r1
            r15 = r26
            r17 = r6
            r19 = r5
            r14.A02(r15, r16, r17, r18, r19, r20)
            X.1Vj r2 = r1.A01
            if (r5 != 0) goto L_0x02af
            java.lang.String r29 = ""
        L_0x01f8:
            java.util.concurrent.atomic.AtomicLong r3 = r2.A06
            long r30 = r3.getAndIncrement()
            X.0wo r12 = r2.A01
            X.0yC r11 = r2.A03
            X.0wN r10 = r2.A00
            X.0yW r9 = r2.A04
            X.19L r3 = r2.A05
            X.11g r2 = r2.A02
            X.8eO r4 = new X.8eO
            r24 = r9
            r25 = r3
            r28 = r8
            r19 = r4
            r20 = r10
            r21 = r12
            r22 = r2
            r23 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32)
            r3.A05(r4)
            long r2 = r4.A03
            X.9YT r10 = X.AnonymousClass9YT.A00(r13)
            java.lang.String r9 = "notification"
            r10.A05 = r9
            r10.A07 = r8
            r10.A08 = r5
            r10.A01 = r7
            r10.A00 = r2
            X.9uj r7 = r10.A01()
            r2 = 2
            r4.A04(r2)
            java.lang.String r15 = "pay"
            boolean r2 = r15.equals(r5)
            if (r2 == 0) goto L_0x02b3
            X.9fp r14 = r1.A00
            X.9nx[] r13 = r0.A02
            r12 = 0
            if (r13 == 0) goto L_0x02b3
            int r11 = r13.length
            if (r11 <= 0) goto L_0x02b3
            r4 = 0
        L_0x024f:
            r3 = r13[r12]
            java.lang.String r2 = r3.A00
            boolean r2 = r2.equals(r15)
            if (r2 == 0) goto L_0x02a6
            java.lang.String r2 = "hash"
            java.lang.String r4 = r3.A0i(r2, r6)
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            r3 = 0
            if (r2 != 0) goto L_0x02ad
            byte[] r2 = r4.getBytes()
            byte[] r10 = android.util.Base64.decode(r2, r3)
            java.util.Arrays.toString(r10)
            X.6NS r4 = X.AnonymousClass6NS.A0L
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "ConnectionThreadRequestsImpl/sync-notify-add; stanzaKey="
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = "; jidHash="
            r3.append(r2)
            java.lang.String r2 = java.util.Arrays.toString(r10)
            X.C36321k7.A1a(r3, r2)
            X.Ayz r8 = r14.A00
            r3 = 0
            r2 = 24
            android.os.Message r4 = android.os.Message.obtain(r6, r3, r2, r3, r4)
            android.os.Bundle r3 = r4.getData()
            java.lang.String r2 = "stanzaKey"
            r3.putParcelable(r2, r7)
            java.lang.String r2 = "jidHash"
            r3.putByteArray(r2, r10)
            r8.Bkm(r4)
            r4 = 1
        L_0x02a6:
            int r12 = r12 + 1
            if (r12 < r11) goto L_0x024f
            if (r4 == 0) goto L_0x02b3
        L_0x02ac:
            return
        L_0x02ad:
            r4 = 0
            goto L_0x02a6
        L_0x02af:
            r29 = r5
            goto L_0x01f8
        L_0x02b3:
            if (r5 == 0) goto L_0x02dd
            java.lang.String r2 = "devices"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x02cd
            java.lang.String r2 = "update"
            X.9nx r2 = r0.A0c(r2)
            if (r2 == 0) goto L_0x02cd
            r3 = 261(0x105, float:3.66E-43)
        L_0x02c7:
            X.9fp r1 = r1.A00
            r1.A01(r0, r7, r3)
            return
        L_0x02cd:
            java.util.Map r2 = r1.A02
            java.lang.Number r2 = X.C90524aI.A0b(r5, r2)
            if (r2 == 0) goto L_0x02dd
            int r3 = r2.intValue()
            r2 = -1
            if (r3 == r2) goto L_0x02dd
            goto L_0x02c7
        L_0x02dd:
            X.9YT r3 = r7.A02()
            r0 = 490(0x1ea, float:6.87E-43)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "error"
            r3.A08(r0, r2)
            X.9uj r2 = r3.A01()
            X.19A r0 = r1.A01
            r0.A0H(r2)
            X.8bs r2 = new X.8bs
            r2.<init>()
            r2.A00 = r9
            r2.A01 = r5
            X.0yW r0 = r1.A03
            r0.Bly(r2)
            return
        L_0x0304:
            java.lang.String r0 = "no payload of incoming <call> node"
            X.19b r0 = X.C165617ti.A0Q(r0)
            throw r0
        L_0x030b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CallStanza from invalid jid "
            java.lang.String r0 = X.AnonymousClass000.A0l(r3, r0, r1)
            X.19b r0 = X.C165617ti.A0Q(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C182128oa.A04(X.9nx, java.lang.Integer, java.util.Map):void");
    }
}
