package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;

public final class AC7 implements C22939Ayp, C22943Ayt {
    public final C19730wQ A00;
    public final C20810yC A01;
    public final C25181Fh A02;
    public final C20520xh A03;
    public final C201449jc A04;
    public final C25341Fx A05;
    public final C26191Jf A06;
    public final AnonymousClass97Z A07;
    public final AnonymousClass1A1 A08;
    public final C20330xO A09;

    public C187838yc BdE(C196159Xy r28, AnonymousClass3T1 r29) {
        C195729Vs r9;
        C196159Xy r7;
        C20520xh r13 = this.A03;
        AnonymousClass3T1 r6 = r29;
        if (((AnonymousClass9XG) r13.A09.getValue()).A00(r6.A1I) instanceof AC5) {
            AnonymousClass37F A0X = r6.A0X();
            if (r6.A1T(536870912) && r6.A1T(C132986Wc.A0F) && A0X != null) {
                C64933Qa r1 = A0X.A02;
                AnonymousClass00C.A07(r1);
                r9 = new C195729Vs(AnonymousClass90R.EVENT_EDIT, r1);
                r7 = r28;
                if (!r7.A0A || !r7.A05 || r9 == null) {
                    return C187838yc.CONTINUE_SERIALIZATION;
                }
                AnonymousClass8NL A0D = C170918Hz.A0D();
                AnonymousClass00C.A0B(A0D);
                boolean z = r7.A06;
                boolean z2 = r7.A04;
                C80103un r10 = r7.A02;
                byte[] bArr = r7.A0B;
                boolean z3 = r7.A08;
                boolean z4 = r7.A03;
                boolean z5 = r7.A07;
                boolean z6 = r7.A09;
                AnonymousClass00C.A0D(A0D, 0);
                boolean z7 = z;
                byte[] bArr2 = bArr;
                C80103un r17 = r10;
                AnonymousClass8NL r15 = A0D;
                C196159Xy r14 = new C196159Xy(r15, r7.A01, r17, bArr2, z7, false, z2, z3, z4, z5, z6, true);
                r13.A02(r14, r6);
                C64933Qa r132 = r9.A01;
                PhoneUserJid A0n = C36441kJ.A0n(this.A00);
                if (A0n != null) {
                    AnonymousClass3T1 A032 = this.A08.A03(this.A06.A01(r132));
                    if (A032 != null) {
                        boolean A002 = this.A02.A00(A032);
                        byte[] A0N = AnonymousClass8NN.A0N(r14.A00);
                        AnonymousClass90R r2 = r9.A00;
                        C10830fI A033 = this.A04.A03(new C195949Wx(A0n, r132, "Event Edit", A0N, A002));
                        C21674AUx aUx = (C21674AUx) A033.first;
                        C21674AUx aUx2 = (C21674AUx) A033.second;
                        AnonymousClass8SW r8 = (AnonymousClass8SW) A033.third;
                        AnonymousClass8NL r3 = r7.A00;
                        C173118Ql r0 = ((AnonymousClass8SX) r3.A00).secretEncryptedMessage_;
                        if (r0 == null) {
                            r0 = C173118Ql.DEFAULT_INSTANCE;
                        }
                        AnonymousClass8NN A0q = r0.A0q();
                        C173118Ql r12 = (C173118Ql) C90524aI.A0H(A0q);
                        int i = C173118Ql.ENC_IV_FIELD_NUMBER;
                        aUx.getClass();
                        r12.bitField0_ |= 4;
                        r12.encIv_ = aUx;
                        C173118Ql r16 = (C173118Ql) C90524aI.A0H(A0q);
                        aUx2.getClass();
                        r16.bitField0_ |= 2;
                        r16.encPayload_ = aUx2;
                        C173118Ql r18 = (C173118Ql) C90524aI.A0H(A0q);
                        r8.getClass();
                        r18.targetMessageKey_ = r8;
                        r18.bitField0_ |= 1;
                        C173118Ql r19 = (C173118Ql) C90524aI.A0H(A0q);
                        r19.secretEncType_ = r2.value;
                        r19.bitField0_ |= 8;
                        C173118Ql r02 = (C173118Ql) A0q.A0R();
                        AnonymousClass8SX A0F = AnonymousClass8NN.A0F(r3, r02);
                        A0F.secretEncryptedMessage_ = r02;
                        A0F.bitField2_ |= 4;
                        C25341Fx r03 = this.A05;
                        r03.A02(r7, r6);
                        r03.A01(r7, r6);
                        return C187838yc.STOP_AND_RETURN_RESULT;
                    }
                    Log.e("SecretEncryptedMessagePreProcessor/onPreProcessSerialization parent message not found");
                    throw C165567td.A0K(0);
                }
                throw C165567td.A0K(0);
            }
        }
        r9 = null;
        r7 = r28;
        if (!r7.A0A && !r7.A05) {
        }
        return C187838yc.CONTINUE_SERIALIZATION;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00de, code lost:
        if (r2 != 1) goto L_0x00e0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3T1 BdD(X.AnonymousClass9YL r29) {
        /*
            r28 = this;
            java.lang.String r16 = "SecretEncryptedMessagePreProcessor/deserialize/could not get E2E.Message from the decrypted bytes"
            r12 = 0
            r10 = r29
            X.8SX r1 = r10.A0A
            int r0 = r1.bitField2_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0171
            X.3Qa r6 = r10.A0C
            X.11F r11 = r10.A07
            X.8Ql r2 = r1.secretEncryptedMessage_
            if (r2 != 0) goto L_0x0017
            X.8Ql r2 = X.C173118Ql.DEFAULT_INSTANCE
        L_0x0017:
            X.AnonymousClass00C.A08(r2)
            int r1 = r2.bitField0_
            r0 = r1 & 4
            if (r0 == 0) goto L_0x0166
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0166
            r0 = r1 & 8
            if (r0 == 0) goto L_0x0166
            r0 = r1 & 1
            if (r0 == 0) goto L_0x0166
            X.8SW r9 = r2.targetMessageKey_
            if (r9 != 0) goto L_0x0032
            X.8SW r9 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x0032:
            X.AnonymousClass00C.A08(r9)
            X.AUx r15 = r2.encIv_
            X.AnonymousClass00C.A08(r15)
            X.AUx r8 = r2.encPayload_
            X.AnonymousClass00C.A08(r8)
            int r1 = r2.secretEncType_
            if (r1 == 0) goto L_0x0051
            r0 = 1
            if (r1 != r0) goto L_0x0051
            X.90R r13 = X.AnonymousClass90R.EVENT_EDIT
        L_0x0048:
            X.90R r7 = X.AnonymousClass90R.UNKNOWN
            if (r13 != r7) goto L_0x0054
            X.2bK r0 = r10.A02(r12)
            return r0
        L_0x0051:
            X.90R r13 = X.AnonymousClass90R.UNKNOWN
            goto L_0x0048
        L_0x0054:
            X.90R r5 = X.AnonymousClass90R.EVENT_EDIT
            r4 = r28
            if (r13 != r5) goto L_0x006b
            X.0yC r1 = r4.A01
            r0 = 7358(0x1cbe, float:1.0311E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x006b
            r0 = 10001(0x2711, float:1.4014E-41)
            X.2bK r0 = r10.A02(r0)
            return r0
        L_0x006b:
            X.9jc r1 = r4.A04
            X.9Vv r14 = r1.A02(r11, r9, r6)
            com.whatsapp.jid.UserJid r17 = X.C36401kF.A0b(r11)
            X.1Jf r0 = r4.A06
            X.3Qa r3 = r14.A01
            X.AnonymousClass00C.A07(r3)
            X.3Qa r2 = r0.A01(r3)
            X.1A1 r0 = r4.A08
            X.3T1 r2 = r0.A03(r2)
            if (r2 == 0) goto L_0x0132
            boolean r0 = r2 instanceof X.AnonymousClass2bG
            if (r0 != 0) goto L_0x0132
            X.1Fh r0 = r4.A02
            boolean r25 = r0.A00(r2)
            int r2 = r13.ordinal()
            r0 = 1
            if (r2 != r0) goto L_0x012b
            java.lang.String r24 = "Event Edit"
            X.9XK r0 = new X.9XK
            r18 = r15
            r19 = r8
            r20 = r11
            r21 = r17
            r22 = r9
            r23 = r6
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            byte[] r0 = r1.A04(r0)     // Catch:{ 186 -> 0x0123 }
            X.8SX r0 = X.AnonymousClass8SX.A0i(r0)     // Catch:{ 186 -> 0x0123 }
            if (r0 == 0) goto L_0x011b
            X.9YL r1 = r10.A01(r0)
            X.0xh r0 = r4.A03
            X.3T1 r6 = r0.A00(r1)
            X.0xO r0 = r4.A09
            r0.A00(r10, r6)
            X.AnonymousClass3MF.A00(r6)
            X.8SX r1 = r10.A0B
            int r0 = r1.bitField2_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x011a
            X.8Ql r0 = r1.secretEncryptedMessage_
            if (r0 != 0) goto L_0x00d8
            X.8Ql r0 = X.C173118Ql.DEFAULT_INSTANCE
        L_0x00d8:
            int r2 = r0.secretEncType_
            if (r2 == 0) goto L_0x00e0
            r0 = 1
            r1 = r5
            if (r2 == r0) goto L_0x00e1
        L_0x00e0:
            r1 = r7
        L_0x00e1:
            boolean r0 = r6 instanceof X.AnonymousClass2bK
            if (r0 != 0) goto L_0x011a
            if (r1 != r5) goto L_0x011a
            int r1 = r6.A1I
            r0 = 92
            if (r1 != r0) goto L_0x010d
            X.37F r0 = r6.A0X()
            if (r0 == 0) goto L_0x00f7
            X.3Qa r0 = r0.A02
            if (r0 != 0) goto L_0x00f9
        L_0x00f7:
            X.3Qa r0 = r6.A1J
        L_0x00f9:
            X.AnonymousClass00C.A0B(r0)
            boolean r0 = X.AnonymousClass00C.A0J(r0, r3)
            if (r0 != 0) goto L_0x011a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            java.lang.String r0 = "the resulting message key does not match outer key"
            X.1Tb r0 = X.C165617ti.A0S(r1, r0)
            throw r0
        L_0x010d:
            r0 = 76
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "invalid secret encrypted message"
            X.1Tb r0 = X.C165617ti.A0S(r1, r0)
            throw r0
        L_0x011a:
            return r6
        L_0x011b:
            com.whatsapp.util.Log.e((java.lang.String) r16)
            X.1Tb r0 = X.C165567td.A0J(r12)
            throw r0
        L_0x0123:
            com.whatsapp.util.Log.e((java.lang.String) r16)
            X.1Tb r0 = X.C165567td.A0J(r12)
            throw r0
        L_0x012b:
            java.lang.String r0 = "unexpected secret message type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0132:
            java.lang.String r0 = "SecretEncryptedMessagePreProcessor/deserialize/parent message not found or placeholder."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11F r5 = r14.A00
            long r0 = r10.A04
            X.8SX r4 = r10.A0B
            byte[] r22 = r4.A0o()
            r21 = 0
            r25 = 2
            if (r2 != 0) goto L_0x0149
            r25 = 1
        L_0x0149:
            r24 = 5
            r2 = 1
            X.AnonymousClass00C.A0D(r6, r2)
            X.9XS r2 = new X.9XS
            r23 = r21
            r26 = r0
            r18 = r5
            r19 = r6
            r20 = r3
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.8o5 r0 = new X.8o5
            r0.<init>(r2)
            throw r0
        L_0x0166:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            java.lang.String r0 = "Invalid SecretEncryptedMessage"
            X.1Tb r0 = X.C165617ti.A0S(r1, r0)
            throw r0
        L_0x0171:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AC7.BdD(X.9YL):X.3T1");
    }

    public AC7(C19730wQ r2, C20810yC r3, C25181Fh r4, C20520xh r5, C201449jc r6, C25341Fx r7, C26191Jf r8, AnonymousClass97Z r9, AnonymousClass1A1 r10, C20330xO r11) {
        C36321k7.A11(r3, r2, r10);
        C36381kD.A1K(r4, 5, r5);
        C36321k7.A14(r11, r6, r9);
        this.A01 = r3;
        this.A00 = r2;
        this.A08 = r10;
        this.A06 = r8;
        this.A02 = r4;
        this.A05 = r7;
        this.A03 = r5;
        this.A09 = r11;
        this.A04 = r6;
        this.A07 = r9;
    }
}
