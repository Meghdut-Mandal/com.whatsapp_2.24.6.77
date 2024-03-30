package X;

import android.text.TextUtils;

/* renamed from: X.8UH  reason: invalid class name */
public class AnonymousClass8UH extends C21186ABu {
    public final C19730wQ A00;
    public final C220412q A01;
    public final C25181Fh A02;
    public final C201449jc A03;
    public final C26191Jf A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;
    public final AnonymousClass005 A07;
    public final C19700wN A08;
    public final C20810yC A09;
    public final C193709Mn A0A;

    public static C180868mY A00(C173108Qk r4, AnonymousClass8SW r5, C64933Qa r6, long j) {
        C180868mY r3 = new C180868mY(r6, j);
        AnonymousClass11F A0N = C36421kH.A0N(r5.remoteJid_);
        C18740tg.A06(A0N);
        C64933Qa A0R = C165617ti.A0R(A0N, r5.id_, r5.fromMe_);
        AnonymousClass8SW r0 = r4.key_;
        if (r0 == null) {
            r0 = AnonymousClass8SW.DEFAULT_INSTANCE;
        }
        r3.A04 = new C195759Vv(C36431kI.A0l(r0.participant_), A0R);
        String str = r4.text_;
        r3.A01 = str;
        boolean isEmpty = TextUtils.isEmpty(str);
        int i = 0;
        if (isEmpty) {
            i = 7;
        }
        r3.A01 = i;
        r3.A00 = r4.senderTimestampMs_;
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x013c, code lost:
        if (r9 == null) goto L_0x013e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3T1 A02(X.AnonymousClass9YL r25) {
        /*
            r24 = this;
            r1 = r25
            X.8SX r6 = r1.A0A
            X.3Qa r14 = r1.A0C
            int r4 = r1.A01
            int r0 = r6.bitField1_
            r2 = r0 & 16
            r0 = r24
            if (r2 == 0) goto L_0x002b
            X.8Qk r3 = r6.reactionMessage_
            if (r3 != 0) goto L_0x0016
            X.8Qk r3 = X.C173108Qk.DEFAULT_INSTANCE
        L_0x0016:
            if (r4 == 0) goto L_0x00d9
            int r2 = r3.bitField0_
            r2 = r2 & 2
            if (r2 == 0) goto L_0x00d9
            java.lang.String r2 = r3.text_
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00d9
            java.lang.String r2 = "MessageUtils/hasValidReactionMessage edit version and text message are both set"
            com.whatsapp.util.Log.w((java.lang.String) r2)
        L_0x002b:
            X.0yC r5 = r0.A09
            X.0wQ r12 = r0.A00
            int r2 = r6.bitField1_
            r2 = r2 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x02a9
            X.8Py r4 = r6.encReactionMessage_
            if (r4 != 0) goto L_0x003b
            X.8Py r4 = X.C172988Py.DEFAULT_INSTANCE
        L_0x003b:
            int r3 = r4.bitField0_
            r2 = r3 & 2
            if (r2 == 0) goto L_0x02a9
            r2 = r3 & 4
            if (r2 == 0) goto L_0x02a9
            X.8SW r2 = r4.targetMessageKey_
            if (r2 != 0) goto L_0x004b
            X.8SW r2 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x004b:
            boolean r2 = X.C21186ABu.A01(r2)
            if (r2 == 0) goto L_0x02a9
            r2 = 6771(0x1a73, float:9.488E-42)
            boolean r2 = r5.A0E(r2)
            if (r2 == 0) goto L_0x012d
            X.8Py r3 = r6.encReactionMessage_
            if (r3 != 0) goto L_0x005f
            X.8Py r3 = X.C172988Py.DEFAULT_INSTANCE
        L_0x005f:
            X.11F r11 = r1.A07
            X.9jc r4 = r0.A03
            X.8SW r2 = r3.targetMessageKey_
            if (r2 != 0) goto L_0x0069
            X.8SW r2 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x0069:
            X.9Vv r2 = r4.A02(r11, r2, r14)
            X.005 r5 = r0.A05
            java.lang.Object r8 = r5.get()
            X.1A1 r8 = (X.AnonymousClass1A1) r8
            X.1Jf r7 = r0.A04
            X.3Qa r5 = r2.A01
            X.3Qa r5 = r7.A01(r5)
            X.3T1 r7 = r8.A03(r5)
            if (r7 != 0) goto L_0x0091
            long r0 = r1.A04
            byte[] r3 = r6.A0o()
            X.8mY r6 = new X.8mY
            r6.<init>(r14, r3, r0)
        L_0x008e:
            r6.A04 = r2
            return r6
        L_0x0091:
            boolean r5 = r14.A02
            if (r5 == 0) goto L_0x00b5
            X.13w r12 = r12.A09()
        L_0x0099:
            X.AUx r9 = r3.encIv_
            X.AUx r10 = r3.encPayload_
            X.8SW r13 = r3.targetMessageKey_
            if (r13 != 0) goto L_0x00a3
            X.8SW r13 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x00a3:
            X.1Fh r5 = r0.A02
            boolean r16 = r5.A00(r7)
            java.lang.String r15 = "Enc Reaction"
            X.9XK r8 = new X.9XK
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            byte[] r5 = r4.A04(r8)
            goto L_0x00c1
        L_0x00b5:
            boolean r5 = X.AnonymousClass143.A0I(r11)
            if (r5 == 0) goto L_0x00bf
            r12 = r11
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12
            goto L_0x0099
        L_0x00bf:
            r12 = 0
            goto L_0x0099
        L_0x00c1:
            X.8Qk r4 = X.C173108Qk.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0122 }
            X.8Hz r6 = X.C170918Hz.A08(r4, r5)     // Catch:{ 186 -> 0x0122 }
            X.8Qk r6 = (X.C173108Qk) r6     // Catch:{ 186 -> 0x0122 }
            r0.A03(r6)
            long r4 = r1.A04
            X.8SW r0 = r3.targetMessageKey_
            if (r0 != 0) goto L_0x00d4
            X.8SW r0 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x00d4:
            X.8mY r6 = A00(r6, r0, r14, r4)
            goto L_0x008e
        L_0x00d9:
            X.8SW r2 = r3.key_
            if (r2 != 0) goto L_0x00df
            X.8SW r2 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x00df:
            boolean r2 = X.C21186ABu.A01(r2)
            if (r2 == 0) goto L_0x002b
            X.8Qk r5 = r6.reactionMessage_
            if (r5 != 0) goto L_0x00eb
            X.8Qk r5 = X.C173108Qk.DEFAULT_INSTANCE
        L_0x00eb:
            X.11F r4 = r1.A07
            long r2 = r1.A04
            X.8SW r1 = r5.key_
            if (r1 != 0) goto L_0x00f5
            X.8SW r1 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x00f5:
            X.8mY r6 = A00(r5, r1, r14, r2)
            X.0wQ r3 = r0.A00
            boolean r1 = r14.A02
            if (r1 != 0) goto L_0x0120
            if (r4 == 0) goto L_0x0120
        L_0x0101:
            X.8SW r2 = r5.key_
            r1 = r2
            if (r2 != 0) goto L_0x0108
            X.8SW r2 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x0108:
            if (r1 != 0) goto L_0x010c
            X.8SW r1 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x010c:
            java.lang.String r1 = r1.participant_
            com.whatsapp.jid.UserJid r1 = X.C36431kI.A0l(r1)
            boolean r1 = X.C197029b1.A00(r1)
            X.9Vv r1 = X.C183338qd.A00(r3, r4, r2, r14, r1)
            r6.A04 = r1
            r0.A03(r5)
            return r6
        L_0x0120:
            r4 = 0
            goto L_0x0101
        L_0x0122:
            java.lang.String r0 = "FMessageReactionProtobuf/parseEncReaction: failed to parse payload into protobuf"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            X.1Tb r0 = X.C165567td.A0J(r0)
            throw r0
        L_0x012d:
            X.8Py r7 = r6.encReactionMessage_
            if (r7 != 0) goto L_0x0133
            X.8Py r7 = X.C172988Py.DEFAULT_INSTANCE
        L_0x0133:
            X.11F r9 = r1.A07
            boolean r4 = r14.A02
            r16 = 0
            if (r4 != 0) goto L_0x013e
            r3 = r9
            if (r9 != 0) goto L_0x0140
        L_0x013e:
            r3 = r16
        L_0x0140:
            X.8SW r2 = r7.targetMessageKey_
            if (r2 != 0) goto L_0x0146
            X.8SW r2 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x0146:
            r8 = 0
            X.9Vv r5 = X.C183338qd.A00(r12, r3, r2, r14, r8)
            com.whatsapp.jid.UserJid r3 = X.C36401kF.A0b(r9)
            if (r4 == 0) goto L_0x0152
            goto L_0x015b
        L_0x0152:
            boolean r2 = X.AnonymousClass143.A0I(r3)     // Catch:{ 8o4 -> 0x029b }
            if (r2 == 0) goto L_0x015f
            r16 = r3
            goto L_0x015f
        L_0x015b:
            X.13w r16 = r12.A09()     // Catch:{ 8o4 -> 0x029b }
        L_0x015f:
            X.005 r13 = r0.A05     // Catch:{ 8o4 -> 0x029b }
            java.lang.Object r2 = r13.get()     // Catch:{ 8o4 -> 0x029b }
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ 8o4 -> 0x029b }
            if (r2 == 0) goto L_0x0260
            X.005 r10 = r0.A07     // Catch:{ 8o4 -> 0x029b }
            if (r10 == 0) goto L_0x0260
            X.005 r9 = r0.A06     // Catch:{ 8o4 -> 0x029b }
            if (r9 == 0) goto L_0x0260
            X.1Jf r11 = r0.A04     // Catch:{ 8o4 -> 0x029b }
            X.3Qa r2 = r5.A01     // Catch:{ 8o4 -> 0x029b }
            X.3Qa r11 = r11.A01(r2)     // Catch:{ 8o4 -> 0x029b }
            java.lang.Object r2 = r13.get()     // Catch:{ 8o4 -> 0x029b }
            X.1A1 r2 = (X.AnonymousClass1A1) r2     // Catch:{ 8o4 -> 0x029b }
            X.3T1 r11 = r2.A03(r11)     // Catch:{ 8o4 -> 0x029b }
            if (r11 == 0) goto L_0x0290
            X.3Qa r2 = r11.A1J     // Catch:{ 8o4 -> 0x029b }
            X.C18740tg.A06(r2)     // Catch:{ 8o4 -> 0x029b }
            boolean r2 = r2.A02     // Catch:{ 8o4 -> 0x029b }
            if (r2 == 0) goto L_0x0196
            com.whatsapp.jid.PhoneUserJid r15 = X.C36441kJ.A0n(r12)     // Catch:{ 8o4 -> 0x029b }
            goto L_0x019c
        L_0x0196:
            X.11F r15 = r11.A0J()     // Catch:{ 8o4 -> 0x029b }
            com.whatsapp.jid.UserJid r15 = (com.whatsapp.jid.UserJid) r15     // Catch:{ 8o4 -> 0x029b }
        L_0x019c:
            if (r15 == 0) goto L_0x023c
            if (r16 == 0) goto L_0x023c
            java.lang.Object r10 = r10.get()     // Catch:{ 8o4 -> 0x029b }
            X.1Je r10 = (X.C26181Je) r10     // Catch:{ 8o4 -> 0x029b }
            long r2 = r11.A1N     // Catch:{ 8o4 -> 0x029b }
            byte[] r23 = r10.A01(r2)     // Catch:{ 8o4 -> 0x029b }
            X.AUx r2 = r7.encIv_     // Catch:{ 8o4 -> 0x029b }
            byte[] r20 = r2.A06()     // Catch:{ 8o4 -> 0x029b }
            X.AUx r2 = r7.encPayload_     // Catch:{ 8o4 -> 0x029b }
            byte[] r21 = r2.A06()     // Catch:{ 8o4 -> 0x029b }
            java.lang.Object r2 = r9.get()     // Catch:{ 8o4 -> 0x029b }
            X.00b r2 = (X.C000100b) r2     // Catch:{ 8o4 -> 0x029b }
            X.8SW r3 = r7.targetMessageKey_     // Catch:{ 8o4 -> 0x029b }
            if (r3 != 0) goto L_0x01c4
            X.8SW r3 = X.AnonymousClass8SW.DEFAULT_INSTANCE     // Catch:{ 8o4 -> 0x029b }
        L_0x01c4:
            java.lang.String r3 = r3.id_     // Catch:{ 8o4 -> 0x029b }
            r9 = 2
            X.AnonymousClass00C.A0D(r2, r9)     // Catch:{ 8o4 -> 0x029b }
            r22 = 0
            if (r3 == 0) goto L_0x0207
            if (r23 == 0) goto L_0x0207
            java.lang.String r19 = "Enc Reaction"
            r17 = r2
            r18 = r3
            byte[] r3 = X.AnonymousClass9Zd.A01(r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ 8o4 -> 0x029b }
            if (r3 != 0) goto L_0x01e2
            java.lang.String r0 = "MessageAddOnEncReactionUtils/decryptEncReactionMessage: unable to decrypt payload"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 8o4 -> 0x029b }
            goto L_0x0236
        L_0x01e2:
            X.8Qk r2 = X.C173108Qk.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0201 }
            X.8Hz r8 = X.C170918Hz.A08(r2, r3)     // Catch:{ 186 -> 0x0201 }
            X.8Qk r8 = (X.C173108Qk) r8     // Catch:{ 186 -> 0x0201 }
            X.AnonymousClass00C.A0B(r8)     // Catch:{ 186 -> 0x0201 }
            if (r8 == 0) goto L_0x0236
            long r1 = r1.A04
            X.8SW r3 = r7.targetMessageKey_
            if (r3 != 0) goto L_0x01f7
            X.8SW r3 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x01f7:
            X.8mY r6 = A00(r8, r3, r14, r1)
            r6.A04 = r5
            r0.A03(r8)
            return r6
        L_0x0201:
            java.lang.String r0 = "MessageAddOnEncReactionUtils/decryptEncReactionMessage: failed to parse payload into protobuf"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 8o4 -> 0x029b }
            goto L_0x0236
        L_0x0207:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()     // Catch:{ 8o4 -> 0x029b }
            java.lang.String r0 = "MessageAddOnEncReactionUtils/decryptEncReactionMessage: one of the params is null, encIv is null = "
            r7.append(r0)     // Catch:{ 8o4 -> 0x029b }
            r2 = 1
            r7.append(r8)     // Catch:{ 8o4 -> 0x029b }
            java.lang.String r0 = " encPayload is null = "
            r7.append(r0)     // Catch:{ 8o4 -> 0x029b }
            r7.append(r8)     // Catch:{ 8o4 -> 0x029b }
            java.lang.String r0 = " targetMessageId is null = "
            r7.append(r0)     // Catch:{ 8o4 -> 0x029b }
            boolean r0 = X.AnonymousClass000.A1W(r3)
            r7.append(r0)     // Catch:{ 8o4 -> 0x029b }
            java.lang.String r0 = " messageSecret is null = "
            r7.append(r0)     // Catch:{ 8o4 -> 0x029b }
            if (r23 == 0) goto L_0x0230
            r2 = 0
        L_0x0230:
            r7.append(r2)     // Catch:{ 8o4 -> 0x029b }
            X.C90504aG.A1G(r7)     // Catch:{ 8o4 -> 0x029b }
        L_0x0236:
            X.1Tb r0 = new X.1Tb
            r0.<init>(r4)
            throw r0
        L_0x023c:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 8o4 -> 0x029b }
            java.lang.String r0 = "FMessageReactionProtobuf/decryptReactionMessage: one of the params is null, targetSenderUserJid is null = "
            r2.append(r0)     // Catch:{ 8o4 -> 0x029b }
            boolean r0 = X.AnonymousClass000.A1W(r15)
            r2.append(r0)     // Catch:{ 8o4 -> 0x029b }
            java.lang.String r0 = ", senderLid is null = "
            r2.append(r0)     // Catch:{ 8o4 -> 0x029b }
            if (r16 == 0) goto L_0x0254
            r3 = 0
        L_0x0254:
            r2.append(r3)     // Catch:{ 8o4 -> 0x029b }
            X.C90504aG.A1G(r2)     // Catch:{ 8o4 -> 0x029b }
            X.1Tb r0 = new X.1Tb     // Catch:{ 8o4 -> 0x029b }
            r0.<init>(r4)     // Catch:{ 8o4 -> 0x029b }
            goto L_0x029a
        L_0x0260:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()     // Catch:{ 8o4 -> 0x029b }
            java.lang.String r2 = "FMessageReactionProtobuf/decryptReactionMessage: one of the params is null, fMessageDatabase is null = "
            r7.append(r2)     // Catch:{ 8o4 -> 0x029b }
            r7.append(r8)     // Catch:{ 8o4 -> 0x029b }
            java.lang.String r2 = ", messageSecretStore is null = "
            r7.append(r2)     // Catch:{ 8o4 -> 0x029b }
            X.005 r2 = r0.A07     // Catch:{ 8o4 -> 0x029b }
            boolean r2 = X.AnonymousClass000.A1W(r2)
            r7.append(r2)     // Catch:{ 8o4 -> 0x029b }
            java.lang.String r2 = ", jniBridge is null = "
            r7.append(r2)     // Catch:{ 8o4 -> 0x029b }
            X.005 r0 = r0.A06     // Catch:{ 8o4 -> 0x029b }
            if (r0 == 0) goto L_0x0284
            r3 = 0
        L_0x0284:
            r7.append(r3)     // Catch:{ 8o4 -> 0x029b }
            X.C90504aG.A1G(r7)     // Catch:{ 8o4 -> 0x029b }
            X.1Tb r0 = new X.1Tb     // Catch:{ 8o4 -> 0x029b }
            r0.<init>(r4)     // Catch:{ 8o4 -> 0x029b }
            goto L_0x029a
        L_0x0290:
            java.lang.String r0 = "FMessageReactionProtobuf/decryptReactionMessage: targetMessage is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 8o4 -> 0x029b }
            X.8o4 r0 = new X.8o4     // Catch:{ 8o4 -> 0x029b }
            r0.<init>()     // Catch:{ 8o4 -> 0x029b }
        L_0x029a:
            throw r0     // Catch:{ 8o4 -> 0x029b }
        L_0x029b:
            long r0 = r1.A04
            byte[] r2 = r6.A0o()
            X.8mY r6 = new X.8mY
            r6.<init>(r14, r2, r0)
            r6.A04 = r5
            return r6
        L_0x02a9:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8UH.A02(X.9YL):X.3T1");
    }

    public void A03(C173108Qk r5) {
        String str = r5.text_;
        if (str == null || new AnonymousClass1XQ(str).A00.length > 30) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("FMessageReactionProtobuf/validateReactionMessageText/reaction text failed validation key=");
            AnonymousClass8SW r0 = r5.key_;
            if (r0 == null) {
                r0 = AnonymousClass8SW.DEFAULT_INSTANCE;
            }
            C36331k8.A1P(r0, A0u);
            this.A08.A0E("reaction text failed validation", (String) null, false);
            throw C165567td.A0J(68);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0246, code lost:
        if (r0 == true) goto L_0x0248;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01df A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0244  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B24(X.C196159Xy r20, X.AnonymousClass3T1 r21) {
        /*
            r19 = this;
            r3 = r21
            boolean r0 = r3 instanceof X.C180868mY
            if (r0 == 0) goto L_0x028f
            X.8mY r3 = (X.C180868mY) r3
            java.lang.String r1 = r3.A01
            r4 = r19
            r2 = r20
            if (r1 == 0) goto L_0x027c
            X.1XQ r0 = new X.1XQ
            r0.<init>((java.lang.String) r1)
            int[] r0 = r0.A00
            int r1 = r0.length
            r0 = 30
            if (r1 > r0) goto L_0x027c
        L_0x001c:
            X.8NL r1 = r2.A00
            X.8Hz r0 = r1.A00
            X.8SX r0 = (X.AnonymousClass8SX) r0
            X.8Qk r0 = r0.reactionMessage_
            if (r0 != 0) goto L_0x0028
            X.8Qk r0 = X.C173108Qk.DEFAULT_INSTANCE
        L_0x0028:
            X.8NN r6 = r0.A0q()
            X.8Hz r0 = r6.A00
            X.8Qk r0 = (X.C173108Qk) r0
            X.8SW r0 = r0.key_
            if (r0 != 0) goto L_0x0036
            X.8SW r0 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x0036:
            X.8NG r9 = X.C170918Hz.A0Q(r0)
            X.3Qa r8 = r3.A1Z()
            X.9Vv r0 = r3.A04
            if (r0 != 0) goto L_0x0278
            r7 = 0
        L_0x0043:
            X.9Vv r5 = r3.A03
            if (r5 == 0) goto L_0x004e
            X.3Qa r0 = r5.A01
            if (r0 == 0) goto L_0x004e
            r8 = r0
            X.11F r7 = r5.A00
        L_0x004e:
            X.C18740tg.A06(r8)
            boolean r0 = X.C197029b1.A00(r7)
            X.C183338qd.A02(r7, r9, r8, r0)
            X.8Hz r5 = X.C90524aI.A0H(r6)
            X.8Qk r5 = (X.C173108Qk) r5
            X.8SW r0 = X.AnonymousClass8NN.A0G(r9)
            r5.key_ = r0
            int r0 = r5.bitField0_
            r0 = r0 | 1
            r5.bitField0_ = r0
            java.lang.String r0 = r3.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0274
            java.lang.String r7 = r3.A01
        L_0x0074:
            X.8Hz r5 = X.C90524aI.A0H(r6)
            X.8Qk r5 = (X.C173108Qk) r5
            r7.getClass()
            int r0 = r5.bitField0_
            r0 = r0 | 2
            r5.bitField0_ = r0
            r5.text_ = r7
            long r7 = r3.A00
            X.8Hz r5 = X.C90524aI.A0H(r6)
            X.8Qk r5 = (X.C173108Qk) r5
            int r0 = r5.bitField0_
            r0 = r0 | 8
            r5.bitField0_ = r0
            r5.senderTimestampMs_ = r7
            X.3Qa r0 = r3.A1J
            X.11F r5 = r0.A00
            boolean r0 = r5 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x025f
            X.12q r0 = r4.A01
            com.whatsapp.jid.GroupJid r5 = (com.whatsapp.jid.GroupJid) r5
            int r5 = r0.A05(r5)
            r0 = 3
            if (r5 != r0) goto L_0x025f
            X.0yC r5 = r4.A09
            r0 = 6771(0x1a73, float:9.488E-42)
            boolean r0 = r5.A0E(r0)
            if (r0 == 0) goto L_0x0150
            X.8Hz r2 = X.C90524aI.A0H(r6)
            X.8Qk r2 = (X.C173108Qk) r2
            r0 = 0
            r2.key_ = r0
            int r0 = r2.bitField0_
            r0 = r0 & -2
            r2.bitField0_ = r0
            X.0wQ r0 = r4.A00
            X.13w r7 = r0.A09()
            X.005 r0 = r4.A05
            java.lang.Object r5 = r0.get()
            X.1A1 r5 = (X.AnonymousClass1A1) r5
            X.1Jf r2 = r4.A04
            X.3Qa r0 = r3.A1Z()
            X.3Qa r0 = r2.A01(r0)
            X.3T1 r2 = r5.A03(r0)
            byte[] r10 = X.AnonymousClass8NN.A0N(r6)
            X.3Qa r8 = r3.A1Z()
            X.1Fh r0 = r4.A02
            boolean r11 = r0.A00(r2)
            java.lang.String r9 = "Enc Reaction"
            X.9Wx r6 = new X.9Wx
            r6.<init>(r7, r8, r9, r10, r11)
            X.9jc r0 = r4.A03
            X.0fI r5 = r0.A03(r6)
            X.8Py r0 = X.C172988Py.DEFAULT_INSTANCE
            X.8NN r4 = r0.A0p()
            java.lang.Object r3 = r5.first
            X.AUx r3 = (X.C21674AUx) r3
            X.8Hz r2 = X.C90524aI.A0H(r4)
            X.8Py r2 = (X.C172988Py) r2
            r3.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 4
            r2.bitField0_ = r0
            r2.encIv_ = r3
            java.lang.Object r3 = r5.second
            X.AUx r3 = (X.C21674AUx) r3
            X.8Hz r2 = X.C90524aI.A0H(r4)
            X.8Py r2 = (X.C172988Py) r2
            r3.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 2
            r2.bitField0_ = r0
            r2.encPayload_ = r3
            java.lang.Object r0 = r5.third
            X.8SW r0 = (X.AnonymousClass8SW) r0
            X.8Hz r2 = X.C90524aI.A0H(r4)
            X.8Py r2 = (X.C172988Py) r2
            r0.getClass()
            r2.targetMessageKey_ = r0
            int r0 = r2.bitField0_
            r0 = r0 | 1
            r2.bitField0_ = r0
            X.8Hz r0 = r4.A0R()
        L_0x0141:
            X.8Py r0 = (X.C172988Py) r0
            X.8SX r1 = X.AnonymousClass8NN.A0F(r1, r0)
            r1.encReactionMessage_ = r0
            int r0 = r1.bitField1_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
        L_0x014d:
            r1.bitField1_ = r0
            return
        L_0x0150:
            X.9Mn r7 = r4.A0A
            r8 = 1
            X.3Qa r0 = r3.A1Z()
            X.C18740tg.A06(r0)
            X.8Hz r0 = r1.A00
            X.8SX r0 = (X.AnonymousClass8SX) r0
            X.8Py r0 = r0.encReactionMessage_
            if (r0 != 0) goto L_0x0164
            X.8Py r0 = X.C172988Py.DEFAULT_INSTANCE
        L_0x0164:
            X.8NN r10 = r0.A0q()
            X.1Je r0 = r7.A01
            long r4 = r3.A01
            byte[] r16 = r0.A01(r4)
            X.3Qa r5 = r3.A1Z()
            X.1A1 r0 = r7.A02
            X.3T1 r4 = r0.A03(r5)
            if (r5 == 0) goto L_0x0250
            boolean r0 = r5.A02
            if (r0 != r8) goto L_0x0246
            if (r4 == 0) goto L_0x0248
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r0 = r4.A1T(r0)
            if (r0 != r8) goto L_0x0248
            X.0wQ r0 = r7.A00
            X.13w r11 = r0.A08()
        L_0x0190:
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            java.lang.String r0 = "targetSenderUserJid is NULL"
            java.util.Objects.requireNonNull(r11, r0)
            X.0wQ r0 = r7.A00
            X.13w r12 = r0.A08()
            java.lang.String r0 = "reactionSenderUserLid is NULL"
            java.util.Objects.requireNonNull(r12, r0)
            X.8Hz r5 = X.C90524aI.A0H(r10)
            X.8Py r5 = (X.C172988Py) r5
            X.8Hz r4 = r9.A0R()
            X.8SW r4 = (X.AnonymousClass8SW) r4
            int r0 = X.C172988Py.ENC_IV_FIELD_NUMBER
            r4.getClass()
            r5.targetMessageKey_ = r4
            int r0 = r5.bitField0_
            r0 = r0 | 1
            r5.bitField0_ = r0
            X.8Hz r4 = X.C90524aI.A0H(r6)
            X.8Qk r4 = (X.C173108Qk) r4
            r0 = 0
            r4.key_ = r0
            int r0 = r4.bitField0_
            r0 = r0 & -2
            r4.bitField0_ = r0
            X.00b r13 = r7.A03
            X.3Qa r0 = r3.A1Z()
            if (r0 == 0) goto L_0x0244
            java.lang.String r14 = r0.A01
        L_0x01d4:
            X.8Hz r3 = r6.A0R()
            r0 = 3
            X.C36321k7.A17(r11, r12, r3, r0)
            r4 = 1
            if (r14 == 0) goto L_0x021b
            if (r16 == 0) goto L_0x021b
            r17 = 0
            byte[] r18 = r3.A0o()
            java.lang.String r15 = "Enc Reaction"
            X.9IR r4 = X.AnonymousClass9Zd.A00(r11, r12, r13, r14, r15, r16, r17, r18)
            if (r4 == 0) goto L_0x0239
            X.AUx r3 = r4.A00
            X.8Hz r2 = X.C90524aI.A0H(r10)
            X.8Py r2 = (X.C172988Py) r2
            r3.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 4
            r2.bitField0_ = r0
            r2.encIv_ = r3
            X.AUx r3 = r4.A01
            X.8Hz r2 = X.C90524aI.A0H(r10)
            X.8Py r2 = (X.C172988Py) r2
            r3.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 2
            r2.bitField0_ = r0
            r2.encPayload_ = r3
        L_0x0215:
            X.8Hz r0 = r10.A0R()
            goto L_0x0141
        L_0x021b:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MessageAddOnEncReactionUtils/encryptEncReactionMessage: one of the params is null, targetMessageId is null = "
            r3.append(r0)
            boolean r0 = X.AnonymousClass000.A1W(r14)
            r3.append(r0)
            java.lang.String r0 = "messageSecret is null = "
            r3.append(r0)
            if (r16 == 0) goto L_0x0233
            r4 = 0
        L_0x0233:
            r3.append(r4)
            X.C90504aG.A1G(r3)
        L_0x0239:
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0215
            r0 = 67
            X.1Fu r0 = X.C165567td.A0K(r0)
            throw r0
        L_0x0244:
            r14 = 0
            goto L_0x01d4
        L_0x0246:
            if (r0 != r8) goto L_0x0250
        L_0x0248:
            X.0wQ r0 = r7.A00
            com.whatsapp.jid.PhoneUserJid r11 = X.C36441kJ.A0n(r0)
            goto L_0x0190
        L_0x0250:
            X.9Vv r0 = r3.A04
            if (r0 != 0) goto L_0x025c
            r11 = 0
        L_0x0255:
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.AnonymousClass00C.A0E(r11, r0)
            goto L_0x0190
        L_0x025c:
            X.11F r11 = r0.A00
            goto L_0x0255
        L_0x025f:
            X.8SX r1 = X.AnonymousClass8NN.A0E(r1)
            X.8Hz r0 = r6.A0R()
            X.8Qk r0 = (X.C173108Qk) r0
            r0.getClass()
            r1.reactionMessage_ = r0
            int r0 = r1.bitField1_
            r0 = r0 | 16
            goto L_0x014d
        L_0x0274:
            java.lang.String r7 = ""
            goto L_0x0074
        L_0x0278:
            X.11F r7 = r0.A00
            goto L_0x0043
        L_0x027c:
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x001c
            X.0yC r0 = r4.A09
            boolean r0 = X.C165597tg.A1R(r0)
            if (r0 == 0) goto L_0x001c
            r0 = 68
            X.1Fu r0 = X.C165567td.A0K(r0)
            throw r0
        L_0x028f:
            java.lang.String r0 = "FMessageReactionProtobuf/not supported message"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8UH.B24(X.9Xy, X.3T1):void");
    }

    public AnonymousClass8UH(C19700wN r1, C19730wQ r2, C220412q r3, C20810yC r4, C25181Fh r5, C201449jc r6, C26191Jf r7, C193709Mn r8, AnonymousClass005 r9, AnonymousClass005 r10, AnonymousClass005 r11) {
        this.A09 = r4;
        this.A08 = r1;
        this.A00 = r2;
        this.A06 = r9;
        this.A01 = r3;
        this.A05 = r10;
        this.A07 = r11;
        this.A04 = r7;
        this.A02 = r5;
        this.A03 = r6;
        this.A0A = r8;
    }
}
