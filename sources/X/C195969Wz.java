package X;

import java.util.Map;

/* renamed from: X.9Wz  reason: invalid class name and case insensitive filesystem */
public abstract class C195969Wz {
    public Map A00;
    public final C19700wN A01;
    public final C20810yC A02;
    public final C21010yW A03;
    public final C199709fp A04;

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0453, code lost:
        if (X.C20800yB.A01(X.C21000yV.A01, r8, 4923) == false) goto L_0x0455;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04bd, code lost:
        if (r8.A0E(7918) != false) goto L_0x0474;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C203399nx r17) {
        /*
            r16 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C182088oW
            r4 = r17
            if (r0 == 0) goto L_0x00e8
            X.8oW r3 = (X.C182088oW) r3
            java.lang.Class<com.whatsapp.jid.Jid> r1 = com.whatsapp.jid.Jid.class
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r1 = r4.A0X(r1, r0)
            boolean r0 = r1 instanceof com.whatsapp.jid.DeviceJid
            if (r0 == 0) goto L_0x0030
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            X.0wQ r0 = r3.A00
            boolean r0 = r0.A0N(r1)
            if (r0 == 0) goto L_0x002f
            X.9fp r0 = r3.A04
            X.Ayz r3 = r0.A00
            r2 = 0
            r1 = 0
            r0 = 213(0xd5, float:2.98E-43)
            android.os.Message r0 = android.os.Message.obtain(r2, r1, r0, r1, r4)
        L_0x002c:
            r3.Bkm(r0)
        L_0x002f:
            return
        L_0x0030:
            X.11F r7 = X.AnonymousClass143.A00(r1)
            if (r7 == 0) goto L_0x002f
            java.lang.String r0 = "type"
            r5 = 0
            java.lang.String r1 = r4.A0i(r0, r5)
            java.lang.String r0 = "name"
            java.lang.String r6 = r4.A0i(r0, r5)
            java.lang.String r9 = "presence"
            java.lang.String r8 = r4.A0i(r9, r5)
            java.lang.String r0 = "unavailable"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008f
            X.9fp r5 = r3.A04
            long r1 = X.AnonymousClass9Ze.A00(r4)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/presence/unavailable "
            r3.append(r0)
            r3.append(r7)
            java.lang.String r0 = " "
            r3.append(r0)
            r3.append(r1)
            X.C36321k7.A1Q(r0, r8, r3)
            X.Ayz r3 = r5.A00
            android.os.Bundle r4 = X.AnonymousClass001.A07()
            java.lang.String r0 = "jid"
            X.C1900296p.A00(r4, r7, r0)
            java.lang.String r0 = "pushName"
            r4.putString(r0, r6)
            java.lang.String r0 = "lastSeen"
            r4.putLong(r0, r1)
            r4.putString(r9, r8)
            r2 = 0
            r1 = 0
            r0 = 64
            android.os.Message r0 = android.os.Message.obtain(r2, r1, r0, r1, r4)
            goto L_0x002c
        L_0x008f:
            java.lang.String r0 = "unsubscribe"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00bb
            X.9fp r2 = r3.A04
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/presence/unsubscribe "
            X.C36321k7.A1K(r7, r0, r1)
            X.Ayz r3 = r2.A00
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r0 = "jid"
            X.C1900296p.A00(r2, r7, r0)
            java.lang.String r0 = "pushName"
            r2.putString(r0, r6)
            r1 = 0
            r0 = 88
            android.os.Message r0 = android.os.Message.obtain(r5, r1, r0, r1, r2)
            goto L_0x002c
        L_0x00bb:
            if (r1 == 0) goto L_0x00c5
            java.lang.String r0 = "available"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002f
        L_0x00c5:
            X.9fp r2 = r3.A04
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/presence/available "
            X.C36321k7.A1K(r7, r0, r1)
            X.Ayz r3 = r2.A00
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r0 = "jid"
            X.C1900296p.A00(r2, r7, r0)
            java.lang.String r0 = "pushName"
            r2.putString(r0, r6)
            r1 = 0
            r0 = 5
            android.os.Message r0 = android.os.Message.obtain(r5, r1, r0, r1, r2)
            goto L_0x002c
        L_0x00e8:
            boolean r0 = r3 instanceof X.C182078oV
            if (r0 == 0) goto L_0x01ed
            java.lang.String r0 = "type"
            r6 = 0
            java.lang.String r2 = r4.A0i(r0, r6)
            java.lang.String r0 = "id"
            java.lang.String r5 = r4.A0i(r0, r6)
            java.lang.String r0 = "xmlns"
            java.lang.String r1 = r4.A0i(r0, r6)
            if (r2 == 0) goto L_0x02c9
            java.lang.String r0 = "result"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0139
            if (r5 == 0) goto L_0x02a8
            java.util.Map r0 = r3.A00
            java.lang.Object r0 = r0.remove(r5)
            X.9Xg r0 = (X.C196019Xg) r0
            if (r0 == 0) goto L_0x0118
            r0.A03(r4)
        L_0x0118:
            X.9fp r2 = r3.A04
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-iq-response; id="
            X.C36321k7.A1Q(r0, r5, r1)
            X.Ayz r1 = r2.A00
            android.os.Handler r1 = (android.os.Handler) r1
            r0 = 4
            android.os.Message r2 = r1.obtainMessage(r0, r4)
            android.os.Bundle r1 = r2.getData()
            java.lang.String r0 = "iqId"
            r1.putString(r0, r5)
            r2.sendToTarget()
            return
        L_0x0139:
            java.lang.String r0 = "error"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0151
            java.util.Map r0 = r3.A00
            java.lang.Object r0 = r0.remove(r5)
            X.9Xg r0 = (X.C196019Xg) r0
            if (r0 == 0) goto L_0x014e
            r0.A02(r4)
        L_0x014e:
            if (r5 == 0) goto L_0x002f
            goto L_0x0118
        L_0x0151:
            java.lang.String r0 = "get"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01a8
            r7 = 0
            X.9nx r2 = r4.A0b(r7)
            java.lang.String r0 = "urn:xmpp:ping"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0188
            java.lang.String r0 = "t"
            long r1 = X.C203399nx.A02(r4, r0)
            X.9fp r6 = r3.A04
            java.lang.String r0 = "ConnectionThreadRequestsImpl/onServerPingReceived"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.Ayz r8 = r6.A00
            r6 = 0
            r0 = 4
            android.os.Message r7 = android.os.Message.obtain(r6, r7, r0, r7)
            android.os.Bundle r6 = r7.getData()
            java.lang.String r0 = "timestamp"
            r6.putLong(r0, r1)
            r8.Bkm(r7)
            goto L_0x014e
        L_0x0188:
            java.lang.String r0 = "relay"
            boolean r0 = X.C203399nx.A0I(r2, r0)
            if (r0 == 0) goto L_0x014e
            java.lang.String r0 = "pin"
            java.lang.String r1 = r2.A0i(r0, r6)
            java.lang.String r0 = "ip"
            r2.A0i(r0, r6)
            java.lang.String r0 = "timeout"
            r2.A0S(r0, r7)
            if (r1 == 0) goto L_0x014e
            java.lang.String r0 = "onRelayRequest"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x014e
        L_0x01a8:
            java.lang.String r0 = "set"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02be
            java.lang.String r0 = "location"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c0
            X.9fp r1 = r3.A04
            r0 = 206(0xce, float:2.89E-43)
            r1.A01(r4, r6, r0)
            goto L_0x014e
        L_0x01c0:
            java.lang.String r0 = "md"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x014e
            r0 = 0
            X.9nx r2 = r4.A0b(r0)
            if (r2 == 0) goto L_0x014e
            java.lang.String r0 = "pair-device"
            boolean r0 = X.C203399nx.A0I(r2, r0)
            if (r0 == 0) goto L_0x01e0
            X.9fp r1 = r3.A04
            r0 = 242(0xf2, float:3.39E-43)
        L_0x01db:
            r1.A01(r4, r6, r0)
            goto L_0x014e
        L_0x01e0:
            java.lang.String r0 = "pair-success"
            boolean r0 = X.C203399nx.A0I(r2, r0)
            if (r0 == 0) goto L_0x02ae
            X.9fp r1 = r3.A04
            r0 = 243(0xf3, float:3.4E-43)
            goto L_0x01db
        L_0x01ed:
            boolean r0 = r3 instanceof X.C182068oU
            if (r0 == 0) goto L_0x02d0
            r0 = 0
            X.9nx r2 = r4.A0b(r0)
            java.lang.Class<com.whatsapp.jid.Jid> r1 = com.whatsapp.jid.Jid.class
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r0 = r4.A0X(r1, r0)
            X.11F r5 = X.AnonymousClass143.A00(r0)
            java.lang.String r0 = "participant"
            com.whatsapp.jid.Jid r0 = r4.A0X(r1, r0)
            X.11F r6 = X.AnonymousClass143.A00(r0)
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r1 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r0 = "participant_pn"
            com.whatsapp.jid.Jid r4 = r4.A0X(r1, r0)
            java.lang.String r0 = "composing"
            boolean r0 = X.C203399nx.A0I(r2, r0)
            if (r0 == 0) goto L_0x0269
            java.lang.String r7 = "media"
            java.lang.String r8 = X.C36391kE.A0x(r2, r7)
            X.9fp r2 = r3.A04
            com.whatsapp.jid.UserJid r6 = X.C36401kF.A0b(r6)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/compose/composing "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            r1.append(r0)
            r1.append(r4)
            X.C36321k7.A1Q(r0, r8, r1)
            X.Ayz r3 = r2.A00
            java.lang.String r0 = "audio"
            boolean r2 = r0.equals(r8)
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "jid"
            X.C1900296p.A00(r1, r5, r0)
            java.lang.String r0 = "author"
            X.C1900296p.A00(r1, r6, r0)
            java.lang.String r0 = "author_pn"
            X.C1900296p.A00(r1, r4, r0)
            r1.putInt(r7, r2)
            r0 = 20
        L_0x0265:
            X.C165577te.A18(r3, r1, r0)
            return
        L_0x0269:
            java.lang.String r0 = "paused"
            boolean r0 = X.C203399nx.A0I(r2, r0)
            if (r0 == 0) goto L_0x002f
            X.9fp r3 = r3.A04
            com.whatsapp.jid.UserJid r2 = X.C36401kF.A0b(r6)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/compose/paused jid="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " author="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " pn="
            X.C36321k7.A1K(r4, r0, r1)
            X.Ayz r3 = r3.A00
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "jid"
            X.C1900296p.A00(r1, r5, r0)
            java.lang.String r0 = "author"
            X.C1900296p.A00(r1, r2, r0)
            java.lang.String r0 = "author_pn"
            X.C1900296p.A00(r1, r4, r0)
            r0 = 21
            goto L_0x0265
        L_0x02a8:
            X.Aay r0 = new X.Aay
            r0.<init>()
            throw r0
        L_0x02ae:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "unknown tag in multidevice IQ: "
            r1.append(r0)
            java.lang.String r0 = r2.A00
            X.19b r0 = X.C165577te.A0X(r0, r1)
            throw r0
        L_0x02be:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "unknown iq type attribute: "
            X.19b r0 = X.C165567td.A0G(r0, r2, r1)
            throw r0
        L_0x02c9:
            java.lang.String r0 = "missing 'type' attribute in iq stanza"
            X.19b r0 = X.C165617ti.A0Q(r0)
            throw r0
        L_0x02d0:
            boolean r0 = r3 instanceof X.C182108oY
            if (r0 == 0) goto L_0x03f5
            X.8oY r3 = (X.C182108oY) r3
            java.lang.String r0 = "id"
            java.lang.String r12 = r4.A0h(r0)
            java.lang.Class<com.whatsapp.jid.Jid> r8 = com.whatsapp.jid.Jid.class
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r2 = r4.A0X(r8, r0)
            X.C18740tg.A06(r2)
            java.lang.String r0 = "category"
            java.lang.String r13 = X.C36391kE.A0x(r4, r0)
            java.lang.String r0 = "t"
            java.lang.String r7 = r4.A0h(r0)
            X.0wo r0 = r3.A00
            long r0 = X.C19970wo.A00(r0)
            r5 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r5
            long r14 = X.AnonymousClass6R8.A01(r7, r0)
            long r14 = r14 * r5
            boolean r6 = r2 instanceof X.C177538dx
            java.lang.String r0 = "participant"
            com.whatsapp.jid.Jid r0 = r4.A0X(r8, r0)
            if (r6 == 0) goto L_0x0324
            X.C18740tg.A06(r0)
            r10 = r0
        L_0x030f:
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "recipient"
            com.whatsapp.jid.Jid r11 = r4.A0X(r1, r0)
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            if (r11 == 0) goto L_0x0327
            if (r2 == 0) goto L_0x0327
            java.lang.String r0 = "Appdata cannot have both a recipient and a participant attribute"
            X.19b r0 = X.C165617ti.A0Q(r0)
            throw r0
        L_0x0324:
            r10 = r2
            r2 = r0
            goto L_0x030f
        L_0x0327:
            r5 = 0
            r0 = 0
            X.AHo r9 = new X.AHo
            r9.<init>(r10, r11, r12, r13, r14)
            if (r2 == 0) goto L_0x0332
            r9.A00 = r2
        L_0x0332:
            r9.A03 = r6
            X.9nx[] r8 = r4.A02
            if (r8 != 0) goto L_0x033a
            X.9nx[] r8 = new X.C203399nx[r0]
        L_0x033a:
            int r7 = r8.length
            r6 = 0
        L_0x033c:
            if (r6 >= r7) goto L_0x037b
            r1 = r8[r6]
            java.lang.String r0 = "enc"
            boolean r0 = X.C203399nx.A0I(r1, r0)
            if (r0 == 0) goto L_0x0375
            X.630 r2 = X.C111475cL.A00(r1)
            byte[] r0 = r2.A02
            if (r0 != 0) goto L_0x036e
            X.0yC r1 = r3.A02
            r0 = 2187(0x88b, float:3.065E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x036e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "missing ciphertext "
            r1.append(r0)
            int r0 = r2.A01
            java.lang.String r0 = X.C36381kD.A10(r1, r0)
            X.19b r0 = X.C165617ti.A0Q(r0)
            throw r0
        L_0x036e:
            int r1 = r2.A00
            r0 = 2
            if (r1 != r0) goto L_0x0378
            r9.A02 = r2
        L_0x0375:
            int r6 = r6 + 1
            goto L_0x033c
        L_0x0378:
            r9.A01 = r2
            goto L_0x0375
        L_0x037b:
            X.9fp r6 = r3.A01
            X.1AL[] r8 = r4.A0k()
            java.util.HashMap r4 = X.AnonymousClass001.A0J()
            if (r8 == 0) goto L_0x03a1
            int r7 = r8.length
            r3 = 0
        L_0x0389:
            if (r3 >= r7) goto L_0x03a1
            r2 = r8[r3]
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "offline"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x039e
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r2.A03
            r4.put(r1, r0)
        L_0x039e:
            int r3 = r3 + 1
            goto L_0x0389
        L_0x03a1:
            long r1 = java.lang.System.currentTimeMillis()
            long r7 = r9.A06
            long r1 = r1 - r7
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/appdata remote="
            r7.append(r0)
            com.whatsapp.jid.Jid r0 = r9.A07
            X.11F r0 = X.AnonymousClass143.A00(r0)
            r7.append(r0)
            java.lang.String r0 = " id="
            r7.append(r0)
            java.lang.String r0 = r9.A09
            r7.append(r0)
            java.lang.String r0 = " participant="
            r7.append(r0)
            com.whatsapp.jid.Jid r3 = r9.A00
            X.11F r0 = X.AnonymousClass143.A00(r3)
            if (r0 != 0) goto L_0x03f0
            java.lang.String r0 = "none"
        L_0x03d3:
            r7.append(r0)
            java.lang.String r0 = " delay="
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = " offline="
            X.C36321k7.A1K(r5, r0, r7)
            X.Ayz r2 = r6.A00
            X.9Hr r1 = new X.9Hr
            r1.<init>(r9, r4)
            r0 = 255(0xff, float:3.57E-43)
            X.C165577te.A18(r2, r1, r0)
            return
        L_0x03f0:
            X.11F r0 = X.AnonymousClass143.A00(r3)
            goto L_0x03d3
        L_0x03f5:
            X.8oa r3 = (X.C182128oa) r3
            java.lang.String r11 = "offline"
            r5 = 0
            java.lang.String r0 = r4.A0i(r11, r5)
            r7 = 0
            int r2 = X.AnonymousClass6R8.A00(r0, r7)
            java.lang.String r0 = "type"
            java.lang.String r6 = r4.A0i(r0, r5)
            boolean r0 = r3 instanceof X.C182048oS
            if (r0 == 0) goto L_0x04c0
            java.lang.String r1 = "receipt"
        L_0x040f:
            java.lang.String r9 = "message"
            r0 = 11
            if (r2 != r0) goto L_0x0442
            java.lang.StringBuilder r8 = X.C90524aI.A0i(r1)
            java.lang.String r2 = "-"
            if (r6 == 0) goto L_0x0423
            r8.append(r2)
            r8.append(r6)
        L_0x0423:
            boolean r0 = r1.equals(r9)
            if (r0 == 0) goto L_0x0437
            r8.append(r2)
            java.lang.String r2 = "edit"
            java.lang.String r0 = "none"
            java.lang.String r0 = r4.A0i(r2, r0)
            r8.append(r0)
        L_0x0437:
            X.0wN r6 = r3.A01
            java.lang.String r2 = r8.toString()
            java.lang.String r0 = "offline-count-11"
            r6.A0E(r0, r2, r7)
        L_0x0442:
            X.0yC r8 = r3.A02
            boolean r0 = r9.equals(r1)
            if (r0 == 0) goto L_0x0455
            X.0yV r2 = X.C21000yV.A01
            r0 = 4923(0x133b, float:6.899E-42)
            boolean r0 = X.C20800yB.A01(r2, r8, r0)
            r13 = 1
            if (r0 != 0) goto L_0x0456
        L_0x0455:
            r13 = 0
        L_0x0456:
            boolean r0 = r1.equals(r9)
            if (r0 == 0) goto L_0x046d
            r0 = 6363(0x18db, float:8.916E-42)
            boolean r0 = r8.A0E(r0)
            if (r0 != 0) goto L_0x046c
            X.1W9 r0 = r3.A00
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x046d
        L_0x046c:
            r7 = 1
        L_0x046d:
            r6 = 0
            if (r13 != 0) goto L_0x0478
            if (r7 != 0) goto L_0x0478
            r2 = r5
        L_0x0473:
            r6 = r5
        L_0x0474:
            r3.A04(r4, r2, r6)
            return
        L_0x0478:
            X.1AL[] r12 = r4.A0k()
            java.util.HashMap r5 = X.AnonymousClass001.A0J()
            java.lang.String r0 = "stanza-type"
            r5.put(r0, r1)
            if (r12 == 0) goto L_0x049f
            int r10 = r12.length
            r9 = 0
        L_0x0489:
            if (r9 >= r10) goto L_0x049f
            r2 = r12[r9]
            java.lang.String r0 = r2.A02
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x049c
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r2.A03
            r5.put(r1, r0)
        L_0x049c:
            int r9 = r9 + 1
            goto L_0x0489
        L_0x049f:
            java.lang.Integer r2 = X.C165607th.A0j(r5)
            if (r13 == 0) goto L_0x04b5
            X.1W9 r0 = r3.A00
            java.util.HashSet r1 = r0.A01
            monitor-enter(r1)
            boolean r0 = r1.contains(r2)     // Catch:{ all -> 0x04df }
            if (r0 == 0) goto L_0x04b1
            goto L_0x04d4
        L_0x04b1:
            r1.add(r2)     // Catch:{ all -> 0x04df }
            monitor-exit(r1)
        L_0x04b5:
            if (r7 == 0) goto L_0x0473
            r0 = 7918(0x1eee, float:1.1095E-41)
            boolean r0 = r8.A0E(r0)
            if (r0 == 0) goto L_0x0473
            goto L_0x0474
        L_0x04c0:
            boolean r0 = r3 instanceof X.C182038oR
            if (r0 == 0) goto L_0x04c8
            java.lang.String r1 = "notification"
            goto L_0x040f
        L_0x04c8:
            boolean r0 = r3 instanceof X.C182018oP
            if (r0 == 0) goto L_0x04d0
            java.lang.String r1 = "message"
            goto L_0x040f
        L_0x04d0:
            java.lang.String r1 = "call"
            goto L_0x040f
        L_0x04d4:
            monitor-exit(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "connection/handleMessage/ignoring duplicate stanza: "
            X.C36321k7.A1L(r5, r0, r1)
            return
        L_0x04df:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195969Wz.A01(X.9nx):void");
    }

    public void A02(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2) {
        if (num != null && num.intValue() > 10) {
            C176438c7 r1 = new C176438c7();
            r1.A03 = C90514aH.A0m(num);
            r1.A02 = num2;
            r1.A00 = num3;
            r1.A04 = str;
            r1.A05 = str2;
            r1.A01 = num4;
            this.A03.Bly(r1);
        }
    }

    public String[] A03() {
        String str;
        if (this instanceof C182088oW) {
            str = "presence";
        } else if (this instanceof C182078oV) {
            str = "iq";
        } else if (this instanceof C182098oX) {
            str = "ib";
        } else if (this instanceof C182118oZ) {
            return new String[]{"stream:error", "error"};
        } else {
            if (this instanceof C182068oU) {
                str = "chatstate";
            } else if (this instanceof C182048oS) {
                str = "receipt";
            } else if (this instanceof C182038oR) {
                str = "notification";
            } else if (this instanceof C182018oP) {
                str = "message";
            } else if (this instanceof C182028oQ) {
                str = "call";
            } else if (this instanceof C182108oY) {
                str = "appdata";
            } else {
                str = "ack";
            }
        }
        return new String[]{str};
    }

    public C195969Wz(C19700wN r1, C20810yC r2, C21010yW r3, C199709fp r4, Map map) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A04 = r4;
        this.A00 = map;
    }
}
