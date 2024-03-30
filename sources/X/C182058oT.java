package X;

import java.util.Map;

/* renamed from: X.8oT  reason: invalid class name and case insensitive filesystem */
public class C182058oT extends C195969Wz {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: X.3ur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX WARNING: type inference failed for: r9v2, types: [X.9uj] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0263  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C203399nx r25) {
        /*
            r24 = this;
            X.9YT r2 = new X.9YT
            r2.<init>()
            java.lang.Class<com.whatsapp.jid.Jid> r1 = com.whatsapp.jid.Jid.class
            java.lang.String r0 = "from"
            r4 = r25
            com.whatsapp.jid.Jid r0 = r4.A0X(r1, r0)
            r2.A02 = r0
            java.lang.String r22 = "participant"
            r0 = r22
            com.whatsapp.jid.Jid r0 = r4.A0X(r1, r0)
            r2.A01 = r0
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "recipient"
            com.whatsapp.jid.Jid r0 = r4.A0X(r1, r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            r2.A03 = r0
            java.lang.String r0 = "id"
            java.lang.String r0 = r4.A0h(r0)
            r2.A07 = r0
            java.lang.String r0 = "class"
            java.lang.String r0 = X.C36391kE.A0x(r4, r0)
            r2.A05 = r0
            java.lang.String r0 = "type"
            java.lang.String r0 = X.C36391kE.A0x(r4, r0)
            r2.A08 = r0
            java.lang.String r21 = "edit"
            r0 = r21
            java.lang.String r0 = X.C36391kE.A0x(r4, r0)
            r2.A06 = r0
            X.9uj r0 = r2.A01()
            java.lang.String r3 = r0.A05
            java.lang.String r1 = "message"
            boolean r2 = r1.equals(r3)
            r1 = r24
            if (r2 == 0) goto L_0x01df
            com.whatsapp.jid.UserJid r5 = r0.A03
            if (r5 != 0) goto L_0x0063
            com.whatsapp.jid.Jid r2 = r0.A02
            X.11F r5 = X.AnonymousClass143.A00(r2)
        L_0x0063:
            r3 = 1
            java.lang.String r2 = r0.A07
            X.C18740tg.A06(r2)
            X.3Qa r8 = X.C165617ti.A0R(r5, r2, r3)
            java.lang.String r2 = "error"
            r9 = 0
            java.lang.String r12 = r4.A0i(r2, r9)
            java.lang.String r20 = "phash"
            r2 = r20
            java.lang.String r7 = r4.A0i(r2, r9)
            java.lang.String r19 = "count"
            r2 = r19
            java.lang.String r2 = r4.A0i(r2, r9)
            r10 = 0
            int r18 = X.AnonymousClass6R8.A00(r2, r10)
            java.lang.String r2 = "t"
            long r2 = X.C203399nx.A02(r4, r2)
            r5 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r2
            java.lang.String r2 = "server_id"
            java.lang.String r11 = r4.A0i(r2, r9)
            r2 = -1
            long r2 = X.AnonymousClass6R8.A01(r11, r2)
            java.lang.String r11 = "addressing_mode"
            java.lang.String r13 = r4.A0i(r11, r9)
            java.lang.String r17 = X.C54102sP.A00(r13)
            java.lang.String r13 = "rcat"
            X.9nx r4 = r4.A0c(r13)
            if (r4 == 0) goto L_0x00b8
            byte[] r9 = r4.A01
            r4 = 10
            java.lang.String r9 = android.util.Base64.encodeToString(r9, r4)
        L_0x00b8:
            if (r12 != 0) goto L_0x019c
            X.9fp r4 = r1.A04
            r16 = r4
            com.whatsapp.jid.Jid r4 = r0.A01
            com.whatsapp.jid.DeviceJid r14 = com.whatsapp.jid.DeviceJid.of(r4)
            com.whatsapp.jid.Jid r4 = r0.A02
            com.whatsapp.jid.DeviceJid r13 = com.whatsapp.jid.DeviceJid.of(r4)
            java.lang.String r12 = r0.A06
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "ConnectionThreadRequestsImpl/message-received-by-server; key="
            X.C165587tf.A1J(r8, r4, r15)
            r15.append(r14)
            java.lang.String r4 = "; remoteJid="
            r15.append(r4)
            r15.append(r13)
            java.lang.String r4 = "; serverParticipantHash="
            r15.append(r4)
            r15.append(r7)
            java.lang.String r4 = "; recipientCount="
            r15.append(r4)
            r4 = r18
            r15.append(r4)
            java.lang.String r4 = "; edit="
            r15.append(r4)
            r15.append(r12)
            java.lang.String r4 = "; timestamp="
            r15.append(r4)
            r15.append(r5)
            java.lang.String r4 = "; smId="
            X.C36321k7.A1V(r4, r15, r2)
            r4 = r16
            X.Ayz r4 = r4.A00
            r23 = r4
            r15 = 0
            r4 = 19
            android.os.Message r16 = android.os.Message.obtain(r15, r10, r4, r10)
            android.os.Bundle r15 = r16.getData()
            java.lang.String r10 = r8.A01
            java.lang.String r4 = "msgid"
            r15.putString(r4, r10)
            android.os.Bundle r10 = r16.getData()
            X.11F r4 = r8.A00
            java.lang.String r8 = X.AnonymousClass143.A03(r4)
            java.lang.String r4 = "remote_chat_jid"
            r10.putString(r4, r8)
            android.os.Bundle r8 = r16.getData()
            r4 = r22
            X.C1900296p.A00(r8, r14, r4)
            android.os.Bundle r8 = r16.getData()
            java.lang.String r4 = "remoteJid"
            X.C1900296p.A00(r8, r13, r4)
            android.os.Bundle r8 = r16.getData()
            r4 = r20
            r8.putString(r4, r7)
            android.os.Bundle r8 = r16.getData()
            r7 = r19
            r4 = r18
            r8.putInt(r7, r4)
            android.os.Bundle r7 = r16.getData()
            java.lang.String r4 = "timestamp"
            r7.putLong(r4, r5)
            android.os.Bundle r5 = r16.getData()
            java.lang.String r4 = "smid"
            r5.putLong(r4, r2)
            android.os.Bundle r3 = r16.getData()
            r2 = r21
            r3.putString(r2, r12)
            android.os.Bundle r3 = r16.getData()
            java.lang.String r2 = "counter_abuse_token"
            r3.putString(r2, r9)
            android.os.Bundle r3 = r16.getData()
            r2 = r17
            r3.putString(r11, r2)
            r3 = r23
            r2 = r16
            r3.Bkm(r2)
        L_0x0188:
            X.9fp r3 = r1.A04
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "ConnectionThreadRequestsImpl/onAckReceived; stanzaKey="
            X.C36321k7.A1K(r0, r1, r2)
            X.Ayz r2 = r3.A00
            android.os.Handler r2 = (android.os.Handler) r2
            r1 = 5
            X.C165577te.A0w(r2, r0, r1)
            return
        L_0x019c:
            int r4 = X.AnonymousClass6R8.A00(r12, r10)
            X.9fp r5 = r1.A04
            com.whatsapp.jid.Jid r2 = r0.A01
            com.whatsapp.jid.DeviceJid r10 = com.whatsapp.jid.DeviceJid.of(r2)
            com.whatsapp.jid.Jid r2 = r0.A02
            com.whatsapp.jid.DeviceJid r11 = com.whatsapp.jid.DeviceJid.of(r2)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "ConnectionThreadRequestsImpl/message-error; key="
            X.C165587tf.A1J(r8, r2, r3)
            r3.append(r10)
            java.lang.String r2 = "; remoteJid="
            r3.append(r2)
            r3.append(r11)
            java.lang.String r2 = "; code="
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = "; phash="
            X.C36321k7.A1Q(r2, r7, r3)
            X.Ayz r3 = r5.A00
            X.9Ma r9 = new X.9Ma
            r12 = r8
            r13 = r7
            r14 = r4
            r9.<init>(r10, r11, r12, r13, r14)
            r2 = 16
            X.C165577te.A18(r3, r9, r2)
            goto L_0x0188
        L_0x01df:
            java.lang.String r2 = "receipt"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02c7
            java.lang.String r8 = r0.A08
            java.lang.String r2 = "played"
            boolean r11 = r2.equals(r8)
            java.lang.String r10 = "played-self"
            java.lang.String r5 = "read"
            java.lang.String r9 = "server-error"
            if (r11 != 0) goto L_0x0211
            boolean r2 = r9.equals(r8)
            if (r2 != 0) goto L_0x0211
            boolean r2 = r5.equals(r8)
            if (r2 != 0) goto L_0x0211
            boolean r2 = r10.equals(r8)
            if (r2 != 0) goto L_0x0211
            java.lang.String r2 = "read-self"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0188
        L_0x0211:
            com.whatsapp.jid.Jid r3 = r0.A02
            X.11F r2 = X.AnonymousClass143.A00(r3)
            boolean r2 = r2 instanceof X.C177538dx
            r6 = 0
            if (r2 == 0) goto L_0x02c1
            com.whatsapp.jid.UserJid r3 = r0.A00()
        L_0x0220:
            java.lang.String r2 = r0.A07
            X.C18740tg.A06(r2)
            X.3Qa r7 = X.C165617ti.A0R(r3, r2, r6)
            if (r11 != 0) goto L_0x02a9
            boolean r2 = r10.equals(r8)
            if (r2 != 0) goto L_0x02a9
            boolean r2 = r9.equals(r8)
            if (r2 == 0) goto L_0x026c
            X.9fp r5 = r1.A04
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "ConnectionThreadRequestsImpl/server-error-received-by-server "
            X.C36321k7.A1K(r7, r2, r3)
            X.Ayz r3 = r5.A00
            r2 = 1
            X.3Qa[] r10 = new X.C64933Qa[r2]
            r10[r6] = r7
            X.11F r7 = r7.A00
            r6 = 0
            r11 = 12
        L_0x024e:
            r12 = 0
            r9 = r6
            X.ADd r5 = new X.ADd
            r8 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.C165577te.A18(r3, r5, r2)
        L_0x025a:
            java.lang.String r2 = "readreceipts"
            r5 = 0
            java.lang.String r2 = r4.A0i(r2, r5)
            if (r2 == 0) goto L_0x0188
            X.9fp r3 = r1.A04
            r2 = 227(0xe3, float:3.18E-43)
            r3.A01(r4, r5, r2)
            goto L_0x0188
        L_0x026c:
            boolean r2 = r5.equals(r8)
            if (r2 == 0) goto L_0x025a
            X.9fp r6 = r1.A04
            com.whatsapp.jid.Jid r2 = r0.A01
            com.whatsapp.jid.DeviceJid r5 = com.whatsapp.jid.DeviceJid.of(r2)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "ConnectionThreadRequestsImpl/read-receipt-received-by-server "
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = " "
            X.C36321k7.A1K(r5, r2, r3)
            X.Ayz r6 = r6.A00
            android.os.Bundle r5 = X.AnonymousClass001.A07()
            java.lang.String r3 = r7.A01
            java.lang.String r2 = "msgid"
            r5.putString(r2, r3)
            X.11F r2 = r7.A00
            java.lang.String r3 = X.AnonymousClass143.A03(r2)
            java.lang.String r2 = "remote_jid"
            r5.putString(r2, r3)
            r2 = 86
            X.C165577te.A18(r6, r5, r2)
            goto L_0x025a
        L_0x02a9:
            X.9fp r5 = r1.A04
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "ConnectionThreadRequestsImpl/playback-received-by-server "
            X.C36321k7.A1K(r7, r2, r3)
            X.Ayz r3 = r5.A00
            r2 = 1
            X.3Qa[] r10 = new X.C64933Qa[r2]
            r10[r6] = r7
            X.11F r7 = r7.A00
            r6 = 0
            r11 = 10
            goto L_0x024e
        L_0x02c1:
            X.11F r3 = X.AnonymousClass143.A00(r3)
            goto L_0x0220
        L_0x02c7:
            java.lang.String r2 = "call"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            com.whatsapp.jid.Jid r8 = r0.A02
            X.C18740tg.A06(r8)
            X.9nx[] r7 = r4.A02
            r6 = 0
            if (r7 == 0) goto L_0x02ea
            int r5 = r7.length
            com.whatsapp.protocol.VoipStanzaChildNode[] r11 = new com.whatsapp.protocol.VoipStanzaChildNode[r5]
            r3 = 0
        L_0x02dd:
            if (r3 >= r5) goto L_0x02eb
            r2 = r7[r3]
            com.whatsapp.protocol.VoipStanzaChildNode r2 = com.whatsapp.protocol.VoipStanzaChildNode.fromProtocolTreeNode(r2)
            r11[r3] = r2
            int r3 = r3 + 1
            goto L_0x02dd
        L_0x02ea:
            r11 = 0
        L_0x02eb:
            java.lang.String r10 = r0.A08
            java.lang.String r2 = "error"
            int r12 = r4.A0S(r2, r6)
            java.lang.String r9 = r0.A07     // Catch:{ IllegalArgumentException -> 0x033d }
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalArgumentException -> 0x033d }
            if (r2 != 0) goto L_0x0336
            boolean r2 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IllegalArgumentException -> 0x033d }
            if (r2 != 0) goto L_0x032f
            X.9fp r4 = r1.A04     // Catch:{ IllegalArgumentException -> 0x033d }
            X.C18740tg.A06(r9)     // Catch:{ IllegalArgumentException -> 0x033d }
            X.C18740tg.A06(r10)     // Catch:{ IllegalArgumentException -> 0x033d }
            X.5wY r7 = new X.5wY     // Catch:{ IllegalArgumentException -> 0x033d }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ IllegalArgumentException -> 0x033d }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ IllegalArgumentException -> 0x033d }
            java.lang.String r2 = "ConnectionThreadRequestsImpl/on-call-incoming-ack type="
            r3.append(r2)     // Catch:{ IllegalArgumentException -> 0x033d }
            java.lang.String r2 = r7.A03     // Catch:{ IllegalArgumentException -> 0x033d }
            r3.append(r2)     // Catch:{ IllegalArgumentException -> 0x033d }
            java.lang.String r2 = " from="
            r3.append(r2)     // Catch:{ IllegalArgumentException -> 0x033d }
            com.whatsapp.jid.Jid r2 = r7.A01     // Catch:{ IllegalArgumentException -> 0x033d }
            X.C36321k7.A1N(r2, r3)     // Catch:{ IllegalArgumentException -> 0x033d }
            X.Ayz r3 = r4.A00     // Catch:{ IllegalArgumentException -> 0x033d }
            r2 = 193(0xc1, float:2.7E-43)
            X.C165577te.A18(r3, r7, r2)     // Catch:{ IllegalArgumentException -> 0x033d }
            goto L_0x0188
        L_0x032f:
            java.lang.String r0 = "bad call incoming ack, missing type"
            X.19b r0 = X.C165617ti.A0Q(r0)     // Catch:{ IllegalArgumentException -> 0x033d }
            goto L_0x033c
        L_0x0336:
            java.lang.String r0 = "bad call incoming ack, missing id"
            X.19b r0 = X.C165617ti.A0Q(r0)     // Catch:{ IllegalArgumentException -> 0x033d }
        L_0x033c:
            throw r0     // Catch:{ IllegalArgumentException -> 0x033d }
        L_0x033d:
            r1 = move-exception
            java.lang.String r0 = "bad call incoming ack"
            X.19b r0 = X.C165617ti.A0Q(r0)
            r0.initCause(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C182058oT.A01(X.9nx):void");
    }

    public C182058oT(C19700wN r1, C20810yC r2, C21010yW r3, C199709fp r4, Map map) {
        super(r1, r2, r3, r4, map);
    }
}
