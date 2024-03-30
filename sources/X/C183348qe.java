package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8qe  reason: invalid class name and case insensitive filesystem */
public abstract class C183348qe extends C203359nq {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        if ((r1 & 128) != 0) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        if ((r0.bitField0_ & 65536) != 0) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0057, code lost:
        if ((1048576 & r1) != 0) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if ((r1 & com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009b, code lost:
        if ((r0.bitField0_ & 64) != 0) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if ((131072 & r3) != 0) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(X.C19700wN r10, X.C202319lY r11, X.AnonymousClass8SX r12, X.AnonymousClass3T1 r13, java.lang.String r14, int r15, int r16) {
        /*
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            int r1 = r12.bitField1_
            r0 = r1 & 16
            if (r0 != 0) goto L_0x000f
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            r9 = 0
            if (r0 == 0) goto L_0x0010
        L_0x000f:
            r9 = 1
        L_0x0010:
            int r3 = r12.bitField0_
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r3
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r2 = 0
            r8 = 1
            if (r0 != 0) goto L_0x0024
            r0 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r3
            r7 = 0
            if (r0 == 0) goto L_0x0025
        L_0x0024:
            r7 = 1
        L_0x0025:
            r0 = r1 & 64
            if (r0 != 0) goto L_0x0039
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0039
            r0 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0039
            r0 = r1 & 128(0x80, float:1.794E-43)
            r6 = 0
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            r6 = 1
        L_0x003a:
            boolean r0 = r12.A0y()
            if (r0 == 0) goto L_0x008d
            X.8SQ r0 = r12.protocolMessage_
            if (r0 != 0) goto L_0x0046
            X.8SQ r0 = X.AnonymousClass8SQ.DEFAULT_INSTANCE
        L_0x0046:
            int r4 = r0.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r4 = r4 & r0
            if (r4 == 0) goto L_0x008d
        L_0x004d:
            r5 = 1
        L_0x004e:
            r0 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0059
            r0 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r1
            r4 = 0
            if (r0 == 0) goto L_0x005a
        L_0x0059:
            r4 = 1
        L_0x005a:
            boolean r0 = r12.A0v()
            if (r0 != 0) goto L_0x009f
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 != 0) goto L_0x009f
            r1 = 0
            boolean r0 = r13 instanceof X.AnonymousClass2bT
            if (r0 != 0) goto L_0x006e
            boolean r0 = r13 instanceof X.C46762bd
            if (r0 == 0) goto L_0x00a0
        L_0x006e:
            java.util.ArrayList r0 = X.C202839mk.A01(r12)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.util.Iterator r1 = r0.iterator()
        L_0x007a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r0 = r1.next()
            r3.append(r0)
            java.lang.String r0 = ","
            r3.append(r0)
            goto L_0x007a
        L_0x008d:
            r0 = r3 & 64
            if (r0 == 0) goto L_0x009d
            X.8SC r0 = r12.documentMessage_
            if (r0 != 0) goto L_0x0097
            X.8SC r0 = X.AnonymousClass8SC.DEFAULT_INSTANCE
        L_0x0097:
            int r0 = r0.bitField0_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x004d
        L_0x009d:
            r5 = 0
            goto L_0x004e
        L_0x009f:
            r1 = 1
        L_0x00a0:
            r8 = r1
            goto L_0x00ab
        L_0x00a2:
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "event-message-type-mismatch"
            r10.A0E(r0, r1, r2)
        L_0x00ab:
            int r0 = r12.bitField2_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x00d5
            X.8Ql r0 = r12.secretEncryptedMessage_
            r1 = r0
            if (r0 != 0) goto L_0x00b8
            X.8Ql r0 = X.C173118Ql.DEFAULT_INSTANCE
        L_0x00b8:
            int r0 = r0.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x00d5
            if (r1 != 0) goto L_0x00c2
            X.8Ql r1 = X.C173118Ql.DEFAULT_INSTANCE
        L_0x00c2:
            int r1 = r1.secretEncType_
            if (r1 == 0) goto L_0x00d2
            r0 = 1
            if (r1 != r0) goto L_0x00d2
            X.90R r1 = X.AnonymousClass90R.EVENT_EDIT
        L_0x00cb:
            X.90R r0 = X.AnonymousClass90R.EVENT_EDIT
            if (r1 != r0) goto L_0x00d5
        L_0x00cf:
            java.lang.String r0 = "event"
            return r0
        L_0x00d2:
            X.90R r1 = X.AnonymousClass90R.UNKNOWN
            goto L_0x00cb
        L_0x00d5:
            if (r7 == 0) goto L_0x00d9
            if (r16 > 0) goto L_0x00fd
        L_0x00d9:
            if (r11 != 0) goto L_0x00fd
            r0 = r15 & 8192(0x2000, float:1.14794E-41)
            if (r0 != 0) goto L_0x00fd
            if (r9 == 0) goto L_0x00e4
            java.lang.String r0 = "reaction"
            return r0
        L_0x00e4:
            if (r6 == 0) goto L_0x00e9
            java.lang.String r0 = "poll"
            return r0
        L_0x00e9:
            if (r5 == 0) goto L_0x00ee
            java.lang.String r0 = "medianotify"
            return r0
        L_0x00ee:
            if (r4 == 0) goto L_0x00f3
            java.lang.String r0 = "scheduled-call"
            return r0
        L_0x00f3:
            if (r8 != 0) goto L_0x00cf
            if (r14 == 0) goto L_0x00fa
            java.lang.String r0 = "media"
            return r0
        L_0x00fa:
            java.lang.String r0 = "text"
            return r0
        L_0x00fd:
            java.lang.String r0 = "pay"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183348qe.A02(X.0wN, X.9lY, X.8SX, X.3T1, java.lang.String, int, int):java.lang.String");
    }

    public static AnonymousClass3T1 A00(AnonymousClass17E r4, AnonymousClass3T1 r5) {
        C64933Qa r3 = r5.A0Y;
        C18740tg.A06(r3);
        return r4.A00(r3, r5.A1I, r5.A0I);
    }

    public static AnonymousClass2bK A01(C20810yC r15, C64933Qa r16, C21337AHp aHp, byte[] bArr, int i) {
        AnonymousClass9VY r0;
        C21337AHp aHp2 = aHp;
        AnonymousClass2bK r8 = new AnonymousClass2bK(r16, bArr, i, aHp2.A01, aHp2.A18);
        AnonymousClass8NN A0p = C172838Pj.DEFAULT_INSTANCE.A0p();
        AnonymousClass9X8 r6 = aHp2.A0A;
        boolean z = false;
        if (r6 != null) {
            z = true;
            AnonymousClass8R0 r02 = ((C172838Pj) A0p.A00).botInfo_;
            if (r02 == null) {
                r02 = AnonymousClass8R0.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r02.A0q();
            String str = r6.A04;
            if (!AnonymousClass14B.A0F(str)) {
                AnonymousClass8R0 r1 = (AnonymousClass8R0) C90524aI.A0H(A0q);
                int i2 = AnonymousClass8R0.EDIT_TARGET_ID_FIELD_NUMBER;
                r1.bitField0_ |= 1;
                r1.targetId_ = str;
            }
            String str2 = r6.A03;
            if (!AnonymousClass14B.A0F(str2)) {
                AnonymousClass8R0 r12 = (AnonymousClass8R0) C90524aI.A0H(A0q);
                int i3 = AnonymousClass8R0.EDIT_TARGET_ID_FIELD_NUMBER;
                str2.getClass();
                r12.bitField0_ |= 2;
                r12.editTargetId_ = str2;
            }
            AnonymousClass11F r03 = r6.A00;
            if (r03 != null) {
                String A0K = AnonymousClass8NN.A0K(A0q, r03);
                AnonymousClass8R0 r13 = (AnonymousClass8R0) A0q.A00;
                int i4 = AnonymousClass8R0.EDIT_TARGET_ID_FIELD_NUMBER;
                A0K.getClass();
                r13.bitField0_ |= 4;
                r13.targetChatJid_ = A0K;
            }
            UserJid userJid = r6.A01;
            if (userJid != null) {
                String A0K2 = AnonymousClass8NN.A0K(A0q, userJid);
                AnonymousClass8R0 r14 = (AnonymousClass8R0) A0q.A00;
                int i5 = AnonymousClass8R0.EDIT_TARGET_ID_FIELD_NUMBER;
                A0K2.getClass();
                r14.bitField0_ |= 8;
                r14.targetSenderJid_ = A0K2;
            }
            AnonymousClass8R0 r04 = (AnonymousClass8R0) A0q.A0R();
            C172838Pj r17 = (C172838Pj) C90524aI.A0H(A0p);
            r04.getClass();
            r17.botInfo_ = r04;
            r17.bitField0_ |= 1;
        }
        if (r15.A0E(5718) && (r0 = aHp2.A08) != null) {
            r8.A0y(new AnonymousClass9WK((Integer) null, r0.A00, (byte[]) null));
        }
        if (z) {
            r8.A02 = AnonymousClass8NN.A0N(A0p);
        }
        aHp2.A02(r8);
        return r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c7, code lost:
        if (r0 != 0) goto L_0x00c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C193829Na r14, X.AnonymousClass8NL r15) {
        /*
            if (r14 == 0) goto L_0x010d
            X.8Ri r0 = r15.A0U()
            X.8NN r3 = r0.A0q()
            X.8N8 r3 = (X.AnonymousClass8N8) r3
            X.8Hz r0 = r3.A00
            X.8Ri r0 = (X.C173348Ri) r0
            X.8Rq r0 = r0.deviceListMetadata_
            if (r0 != 0) goto L_0x0016
            X.8Rq r0 = X.C173428Rq.DEFAULT_INSTANCE
        L_0x0016:
            X.8NN r13 = r0.A0q()
            X.AUx r9 = r14.A03
            if (r9 == 0) goto L_0x002e
            X.8Hz r1 = X.C90524aI.A0H(r13)
            X.8Rq r1 = (X.C173428Rq) r1
            int r0 = X.C173428Rq.RECEIVER_ACCOUNT_TYPE_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.senderKeyHash_ = r9
        L_0x002e:
            X.2q9 r2 = r14.A05
            X.2q9 r0 = X.C52772q9.HOSTED
            if (r2 != r0) goto L_0x0046
            X.8Hz r1 = X.C90524aI.A0H(r13)
            X.8Rq r1 = (X.C173428Rq) r1
            int r0 = X.C173428Rq.RECEIVER_ACCOUNT_TYPE_FIELD_NUMBER
            int r0 = r2.value
            r1.senderAccountType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
        L_0x0046:
            X.AUx r8 = r14.A02
            if (r8 == 0) goto L_0x005a
            X.8Hz r1 = X.C90524aI.A0H(r13)
            X.8Rq r1 = (X.C173428Rq) r1
            int r0 = X.C173428Rq.RECEIVER_ACCOUNT_TYPE_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.recipientKeyHash_ = r8
        L_0x005a:
            long r4 = r14.A01
            r11 = 0
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0072
            X.8Hz r1 = X.C90524aI.A0H(r13)
            X.8Rq r1 = (X.C173428Rq) r1
            int r0 = X.C173428Rq.RECEIVER_ACCOUNT_TYPE_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.senderTimestamp_ = r4
        L_0x0072:
            long r1 = r14.A00
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0088
            X.8Hz r6 = X.C90524aI.A0H(r13)
            X.8Rq r6 = (X.C173428Rq) r6
            int r0 = X.C173428Rq.RECEIVER_ACCOUNT_TYPE_FIELD_NUMBER
            int r0 = r6.bitField0_
            r0 = r0 | 32
            r6.bitField0_ = r0
            r6.recipientTimestamp_ = r1
        L_0x0088:
            java.util.Set r10 = r14.A06
            if (r10 == 0) goto L_0x00a6
            X.8Hz r7 = X.C90524aI.A0H(r13)
            X.8Rq r7 = (X.C173428Rq) r7
            int r0 = X.C173428Rq.RECEIVER_ACCOUNT_TYPE_FIELD_NUMBER
            X.B62 r6 = r7.recipientKeyIndexes_
            r0 = r6
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00a3
            X.8I0 r6 = X.C170918Hz.A09(r6)
            r7.recipientKeyIndexes_ = r6
        L_0x00a3:
            X.C21071A7i.A0O(r10, r6)
        L_0x00a6:
            X.2q9 r7 = r14.A04
            if (r7 == 0) goto L_0x00bc
            X.8Hz r6 = X.C90524aI.A0H(r13)
            X.8Rq r6 = (X.C173428Rq) r6
            int r0 = X.C173428Rq.RECEIVER_ACCOUNT_TYPE_FIELD_NUMBER
            int r0 = r7.value
            r6.receiverAccountType_ = r0
            int r0 = r6.bitField0_
            r0 = r0 | 8
            r6.bitField0_ = r0
        L_0x00bc:
            if (r9 != 0) goto L_0x00c9
            if (r8 != 0) goto L_0x00c9
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x00c9
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x00ca
        L_0x00c9:
            r1 = 1
        L_0x00ca:
            java.lang.String r0 = "Invalid adv device metadata"
            X.C18740tg.A0F(r1, r0)
            X.8Hz r1 = X.C90524aI.A0H(r3)
            X.8Ri r1 = (X.C173348Ri) r1
            X.8Hz r0 = r13.A0R()
            X.8Rq r0 = (X.C173428Rq) r0
            r0.getClass()
            r1.deviceListMetadata_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            X.8Hz r2 = X.C90524aI.A0H(r3)
            X.8Ri r2 = (X.C173348Ri) r2
            r1 = 2
            int r0 = r2.bitField0_
            r0 = r0 | 2
            r2.bitField0_ = r0
            r2.deviceListMetadataVersion_ = r1
            X.8SX r2 = X.AnonymousClass8NN.A0E(r15)
            X.8Hz r1 = r3.A0R()
            X.8Ri r1 = (X.C173348Ri) r1
            int r0 = X.AnonymousClass8SX.AUDIO_MESSAGE_FIELD_NUMBER
            r1.getClass()
            r2.messageContextInfo_ = r1
            int r1 = r2.bitField0_
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 | r0
            r2.bitField0_ = r1
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183348qe.A03(X.9Na, X.8NL):void");
    }

    public static boolean A04(AnonymousClass3T1 r0) {
        return AnonymousClass000.A1V(r0.A0Y);
    }
}
