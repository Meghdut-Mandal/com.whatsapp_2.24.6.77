package X;

/* renamed from: X.9kv  reason: invalid class name and case insensitive filesystem */
public class C202029kv {
    public final C19730wQ A00;
    public final C19970wo A01;
    public final C20810yC A02;
    public final AnonymousClass005 A03;

    public static void A01(C20810yC r2, C196159Xy r3, int i) {
        C173348Ri r1 = (C173348Ri) C90524aI.A0H(r3.A01);
        int i2 = C173348Ri.BOT_MESSAGE_SECRET_FIELD_NUMBER;
        r1.bitField0_ |= 128;
        r1.reportingTokenVersion_ = i;
        if (!C20800yB.A01(C21000yV.A01, r2, 7772)) {
            AnonymousClass8NL r32 = r3.A00;
            C173348Ri A0U = r32.A0U();
            AnonymousClass8NN A0p = C173348Ri.DEFAULT_INSTANCE.A0p();
            A0p.A0T(A0U);
            C173348Ri r12 = (C173348Ri) C90524aI.A0H(A0p);
            r12.bitField0_ |= 128;
            r12.reportingTokenVersion_ = i;
            r32.A0j((C173348Ri) A0p.A0R());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r6.equals(r3) == false) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass8SG A03(X.C80103un r10, X.AnonymousClass3T1 r11, byte[] r12, boolean r13) {
        /*
            r9 = this;
            X.8SG r0 = X.AnonymousClass8SG.DEFAULT_INSTANCE
            X.8NN r2 = r0.A0p()
            X.4tX r2 = (X.C99524tX) r2
            X.3T1 r5 = r11.A0S()
            if (r5 == 0) goto L_0x00aa
            X.3Qa r0 = r11.A1J
            X.11F r6 = r0.A00
            if (r6 == 0) goto L_0x001e
            X.3Qa r4 = r5.A1J
            X.11F r3 = r4.A00
            boolean r0 = r6.equals(r3)
            if (r0 != 0) goto L_0x0035
        L_0x001e:
            X.3Qa r4 = r5.A1J
            X.11F r3 = r4.A00
            java.lang.String r7 = X.AnonymousClass143.A03(r3)
            X.8SG r1 = X.AnonymousClass8NN.A04(r2)
            r7.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.remoteJid_ = r7
        L_0x0035:
            boolean r0 = r5 instanceof X.AnonymousClass2c5
            if (r0 != 0) goto L_0x0123
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0112
            X.0wQ r0 = r9.A00
            com.whatsapp.jid.PhoneUserJid r1 = X.C36441kJ.A0n(r0)
        L_0x0043:
            boolean r0 = r6 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x010a
            boolean r0 = r3 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x055b
            java.lang.String r3 = r3.getRawString()
        L_0x004f:
            X.8SG r1 = X.AnonymousClass8NN.A04(r2)
            r3.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.participant_ = r3
        L_0x005e:
            java.lang.String r3 = r4.A01
            X.8SG r1 = X.AnonymousClass8NN.A04(r2)
            r3.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.stanzaId_ = r3
            X.8Hz r0 = r2.A00
            X.8SG r0 = (X.AnonymousClass8SG) r0
            X.8SX r0 = r0.quotedMessage_
            if (r0 != 0) goto L_0x0079
            X.8SX r0 = X.AnonymousClass8SX.DEFAULT_INSTANCE
        L_0x0079:
            X.8NN r3 = r0.A0q()
            X.8NL r3 = (X.AnonymousClass8NL) r3
            X.9Si r1 = X.C1899396e.A00(r3)
            r0 = 1
            r1.A04 = r0
            r1.A02 = r13
            X.9Xy r1 = r1.A00()
            X.005 r0 = r9.A03
            java.lang.Object r0 = r0.get()
            X.0xh r0 = (X.C20520xh) r0
            r0.A02(r1, r5)
            X.8SG r1 = X.AnonymousClass8NN.A04(r2)
            X.8SX r0 = X.AnonymousClass8NN.A0D(r3)
            r0.getClass()
            r1.quotedMessage_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
        L_0x00aa:
            boolean r0 = r11.A1H()
            if (r0 == 0) goto L_0x0182
            java.util.List r0 = r11.A0w
            X.C18740tg.A06(r0)
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r8 = r0.iterator()
        L_0x00c1:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0149
            java.lang.Object r3 = r8.next()
            X.3ux r3 = (X.C80163ux) r3
            X.11F r1 = r3.A00
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x00d7
            r4.add(r1)
            goto L_0x00c1
        L_0x00d7:
            java.lang.String r7 = r1.getRawString()
            java.lang.String r6 = r3.A01
            X.8Os r0 = X.C172668Os.DEFAULT_INSTANCE
            X.8NN r3 = X.C170918Hz.A01(r0)
            X.8Hz r1 = r3.A00
            X.8Os r1 = (X.C172668Os) r1
            r7.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.groupJid_ = r7
            if (r6 == 0) goto L_0x0102
            X.8Hz r1 = X.C90524aI.A0H(r3)
            X.8Os r1 = (X.C172668Os) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.groupSubject_ = r6
        L_0x0102:
            X.8Hz r0 = r3.A0R()
            r5.add(r0)
            goto L_0x00c1
        L_0x010a:
            if (r1 == 0) goto L_0x005e
            java.lang.String r3 = r1.getRawString()
            goto L_0x004f
        L_0x0112:
            X.11F r1 = r5.A0J()
            if (r1 == 0) goto L_0x011c
            boolean r0 = r1 instanceof X.C177618e5
            if (r0 == 0) goto L_0x011d
        L_0x011c:
            r1 = r3
        L_0x011d:
            com.whatsapp.jid.UserJid r1 = X.C36401kF.A0b(r1)
            goto L_0x0043
        L_0x0123:
            X.2c5 r5 = (X.AnonymousClass2c5) r5
            java.lang.String r4 = r5.A00
            if (r4 == 0) goto L_0x0136
            X.8SG r3 = X.AnonymousClass8NN.A04(r2)
            int r1 = r3.bitField0_
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r0
            r3.bitField0_ = r1
            r3.groupSubject_ = r4
        L_0x0136:
            java.lang.String r4 = r5.A01
            if (r4 == 0) goto L_0x00aa
            X.8SG r3 = X.AnonymousClass8NN.A04(r2)
            int r1 = r3.bitField0_
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r0
            r3.bitField0_ = r1
            r3.parentGroupJid_ = r4
            goto L_0x00aa
        L_0x0149:
            X.C18740tg.A06(r4)
            java.util.ArrayList r4 = X.AnonymousClass143.A07(r4)
            X.8SG r3 = X.AnonymousClass8NN.A04(r2)
            X.B6c r1 = r3.mentionedJid_
            r0 = r1
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0163
            X.B6c r1 = X.C170918Hz.A0A(r1)
            r3.mentionedJid_ = r1
        L_0x0163:
            X.C21071A7i.A0O(r4, r1)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0182
            X.8SG r3 = X.AnonymousClass8NN.A04(r2)
            X.B6c r1 = r3.groupMentions_
            r0 = r1
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x017f
            X.B6c r1 = X.C170918Hz.A0A(r1)
            r3.groupMentions_ = r1
        L_0x017f:
            X.C21071A7i.A0O(r5, r1)
        L_0x0182:
            r3 = 1
            boolean r0 = r11.A1T(r3)
            if (r0 == 0) goto L_0x0283
            X.8SG r1 = X.AnonymousClass8NN.A04(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.isForwarded_ = r3
            int r4 = r11.A06
            X.8SG r1 = X.AnonymousClass8NN.A04(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.forwardingScore_ = r4
            X.3Jw r4 = r11.A0W()
            if (r4 == 0) goto L_0x0238
            X.8Hz r0 = r2.A00
            X.8SG r0 = (X.AnonymousClass8SG) r0
            X.8RA r0 = r0.forwardedNewsletterMessageInfo_
            if (r0 != 0) goto L_0x01b3
            X.8RA r0 = X.AnonymousClass8RA.DEFAULT_INSTANCE
        L_0x01b3:
            X.8NN r5 = r0.A0q()
            X.1Uw r0 = r4.A01
            java.lang.String r6 = X.AnonymousClass8NN.A0K(r5, r0)
            X.8Hz r1 = r5.A00
            X.8RA r1 = (X.AnonymousClass8RA) r1
            int r0 = X.AnonymousClass8RA.ACCESSIBILITY_TEXT_FIELD_NUMBER
            r6.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.newsletterJid_ = r6
            int r6 = r4.A00
            X.8Hz r1 = X.C90524aI.A0H(r5)
            X.8RA r1 = (X.AnonymousClass8RA) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.serverMessageId_ = r6
            java.lang.String r6 = r4.A04
            X.8Hz r1 = X.C90524aI.A0H(r5)
            X.8RA r1 = (X.AnonymousClass8RA) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.newsletterName_ = r6
            X.2pG r0 = r4.A02
            if (r0 == 0) goto L_0x0210
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x02c4
            if (r1 == r3) goto L_0x02c0
            r0 = 2
            if (r1 != r0) goto L_0x0556
            X.2q4 r0 = X.C52722q4.LINK_CARD
        L_0x0200:
            X.8Hz r1 = X.C90524aI.A0H(r5)
            X.8RA r1 = (X.AnonymousClass8RA) r1
            int r0 = r0.value
            r1.contentType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
        L_0x0210:
            java.lang.String r4 = r4.A03
            if (r4 == 0) goto L_0x0222
            X.8Hz r1 = X.C90524aI.A0H(r5)
            X.8RA r1 = (X.AnonymousClass8RA) r1
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.accessibilityText_ = r4
        L_0x0222:
            X.8Hz r0 = r5.A0R()
            X.8RA r0 = (X.AnonymousClass8RA) r0
            X.8SG r4 = X.AnonymousClass8NN.A04(r2)
            r0.getClass()
            r4.forwardedNewsletterMessageInfo_ = r0
            int r1 = r4.bitField0_
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 | r0
            r4.bitField0_ = r1
        L_0x0238:
            X.0yC r1 = r9.A02
            r0 = 4513(0x11a1, float:6.324E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0283
            X.3Ky r1 = r11.A0O()
            if (r1 == 0) goto L_0x0283
            X.8Hz r0 = r2.A00
            X.8SG r0 = (X.AnonymousClass8SG) r0
            X.8Ne r0 = r0.businessMessageForwardInfo_
            if (r0 != 0) goto L_0x0252
            X.8Ne r0 = X.C172268Ne.DEFAULT_INSTANCE
        L_0x0252:
            X.8NN r5 = r0.A0q()
            com.whatsapp.jid.UserJid r0 = r1.A01
            java.lang.String r4 = X.AnonymousClass8NN.A0K(r5, r0)
            X.8Hz r1 = r5.A00
            X.8Ne r1 = (X.C172268Ne) r1
            int r0 = X.C172268Ne.BUSINESS_OWNER_JID_FIELD_NUMBER
            r4.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.businessOwnerJid_ = r4
            X.8Hz r0 = r5.A0R()
            X.8Ne r0 = (X.C172268Ne) r0
            X.8SG r4 = X.AnonymousClass8NN.A04(r2)
            r0.getClass()
            r4.businessMessageForwardInfo_ = r0
            int r1 = r4.bitField0_
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 | r0
            r4.bitField0_ = r1
        L_0x0283:
            r0 = 262144(0x40000, float:3.67342E-40)
            boolean r0 = r11.A1T(r0)
            if (r0 == 0) goto L_0x0298
            X.8SG r4 = X.AnonymousClass8NN.A04(r2)
            int r1 = r4.bitField0_
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 | r0
            r4.bitField0_ = r1
            r4.isSampled_ = r3
        L_0x0298:
            boolean r0 = r11.A0z
            if (r0 != 0) goto L_0x02a4
            r0 = 1073741824(0x40000000, float:2.0)
            boolean r0 = r11.A1T(r0)
            if (r0 == 0) goto L_0x02b1
        L_0x02a4:
            X.8SG r4 = X.AnonymousClass8NN.A04(r2)
            int r1 = r4.bitField0_
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 | r0
            r4.bitField0_ = r1
            r4.alwaysShowAdAttribution_ = r3
        L_0x02b1:
            r0 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02d9
            r0 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02d9
            goto L_0x02c8
        L_0x02c0:
            X.2q4 r0 = X.C52722q4.UPDATE_CARD
            goto L_0x0200
        L_0x02c4:
            X.2q4 r0 = X.C52722q4.UPDATE
            goto L_0x0200
        L_0x02c8:
            java.nio.charset.Charset r0 = X.C19430v1.A0D     // Catch:{ UnsupportedEncodingException -> 0x02d3 }
            X.AyA r0 = X.C21674AUx.A01     // Catch:{ UnsupportedEncodingException -> 0x02d3 }
            java.lang.String r0 = "getBytes"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)     // Catch:{ UnsupportedEncodingException -> 0x02d3 }
            throw r0     // Catch:{ UnsupportedEncodingException -> 0x02d3 }
        L_0x02d3:
            r1 = move-exception
            java.lang.String r0 = "FMessageProtocolSerializers/buildOutgoingMessageContextInfo/error Failed to parse conversion data, exception="
            com.whatsapp.util.Log.e(r0, r1)
        L_0x02d9:
            X.9TX r4 = r11.A0K
            if (r4 == 0) goto L_0x02ed
            boolean r0 = r4.A01()
            if (r0 == 0) goto L_0x02ed
            X.C18740tg.A06(r4)
            long r0 = java.lang.System.currentTimeMillis()
            r4.A00(r2, r0)
        L_0x02ed:
            java.lang.String r0 = r11.A0q
            boolean r0 = X.C36421kH.A1a(r0)
            if (r0 == 0) goto L_0x0339
            java.lang.String r0 = r11.A0q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0310
            java.lang.String r5 = r11.A0q
            X.8SG r4 = X.AnonymousClass8NN.A04(r2)
            r5.getClass()
            int r1 = r4.bitField0_
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r0
            r4.bitField0_ = r1
            r4.entryPointConversionSource_ = r5
        L_0x0310:
            java.lang.String r0 = r11.A0p
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x032a
            java.lang.String r5 = r11.A0p
            X.8SG r4 = X.AnonymousClass8NN.A04(r2)
            r5.getClass()
            int r1 = r4.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r0
            r4.bitField0_ = r1
            r4.entryPointConversionApp_ = r5
        L_0x032a:
            int r5 = r11.A03
            X.8SG r4 = X.AnonymousClass8NN.A04(r2)
            int r1 = r4.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r0
            r4.bitField0_ = r1
            r4.entryPointConversionDelaySeconds_ = r5
        L_0x0339:
            if (r10 == 0) goto L_0x03c7
            X.3Qa r0 = r11.A1J
            X.11F r1 = r0.A00
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 != 0) goto L_0x0356
            boolean r0 = X.AnonymousClass143.A0G(r1)
            if (r0 != 0) goto L_0x0356
            boolean r0 = r1 instanceof X.C177538dx
            if (r0 == 0) goto L_0x03c7
            int r1 = r11.A0D
            r0 = 4
            boolean r0 = X.AnonymousClass3TJ.A02(r1, r0)
            if (r0 == 0) goto L_0x03c7
        L_0x0356:
            X.C18740tg.A06(r10)
            int r4 = r10.expiration
            X.8SG r1 = X.AnonymousClass8NN.A04(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.bitField0_ = r0
            r1.expiration_ = r4
            long r0 = r10.ephemeralSettingTimestamp
            r5 = 0
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x037f
            long r0 = X.C36391kE.A0B(r0)
            X.8SG r5 = X.AnonymousClass8NN.A04(r2)
            int r4 = r5.bitField0_
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            r5.bitField0_ = r4
            r5.ephemeralSettingTimestamp_ = r0
        L_0x037f:
            r5 = 0
            int r1 = r10.disappearingMessagesInitiator
            if (r1 != 0) goto L_0x0549
            X.90o r5 = X.C1887490o.CHANGED_IN_CHAT
        L_0x0386:
            X.8SK r0 = X.AnonymousClass8SK.DEFAULT_INSTANCE
            X.8NN r4 = r0.A0p()
            X.8NB r4 = (X.AnonymousClass8NB) r4
            if (r5 == 0) goto L_0x0393
            r4.A0U(r5)
        L_0x0393:
            X.0yC r1 = r9.A02
            r0 = 5309(0x14bd, float:7.44E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x03b1
            int r0 = r11.A04
            X.919 r0 = X.AnonymousClass9Zc.A01(r0)
            r4.A0V(r0)
            java.lang.Boolean r0 = r11.A0d
            if (r0 == 0) goto L_0x03b1
            boolean r0 = r0.booleanValue()
            r4.A0W(r0)
        L_0x03b1:
            X.8Hz r0 = r4.A0R()
            X.8SK r0 = (X.AnonymousClass8SK) r0
            X.8SG r4 = X.AnonymousClass8NN.A04(r2)
            r0.getClass()
            r4.disappearingMode_ = r0
            int r1 = r4.bitField0_
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r0
            r4.bitField0_ = r1
        L_0x03c7:
            if (r12 == 0) goto L_0x03e4
            X.3Qa r0 = r11.A1J
            X.11F r0 = r0.A00
            boolean r0 = r0 instanceof X.C177538dx
            if (r0 == 0) goto L_0x03e4
            X.C18740tg.A06(r12)
            X.8I5 r4 = X.C90474aD.A0O(r2, r12)
            X.8Hz r1 = r2.A00
            X.8SG r1 = (X.AnonymousClass8SG) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0
            r1.ephemeralSharedSecret_ = r4
        L_0x03e4:
            X.3BG r5 = r11.A0V
            if (r5 == 0) goto L_0x053b
            X.8Hz r0 = r2.A00
            X.8SG r0 = (X.AnonymousClass8SG) r0
            X.8S4 r0 = r0.externalAdReply_
            if (r0 != 0) goto L_0x03f2
            X.8S4 r0 = X.AnonymousClass8S4.DEFAULT_INSTANCE
        L_0x03f2:
            X.8NN r4 = r0.A0q()
            java.lang.String r6 = r5.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0411
            X.8Hz r1 = X.C90524aI.A0H(r4)
            X.8S4 r1 = (X.AnonymousClass8S4) r1
            int r0 = X.AnonymousClass8S4.BODY_FIELD_NUMBER
            r6.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.title_ = r6
        L_0x0411:
            java.lang.String r6 = r5.A02
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x042c
            X.8Hz r1 = X.C90524aI.A0H(r4)
            X.8S4 r1 = (X.AnonymousClass8S4) r1
            int r0 = X.AnonymousClass8S4.BODY_FIELD_NUMBER
            r6.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.body_ = r6
        L_0x042c:
            X.90W r6 = X.AnonymousClass90W.NONE
            int r1 = r5.A01
            if (r1 != r3) goto L_0x0542
            X.90W r6 = X.AnonymousClass90W.IMAGE
        L_0x0434:
            X.8Hz r1 = X.C90524aI.A0H(r4)
            X.8S4 r1 = (X.AnonymousClass8S4) r1
            int r0 = X.AnonymousClass8S4.BODY_FIELD_NUMBER
            int r0 = r6.value
            r1.mediaType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            java.lang.String r3 = r5.A09
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x045a
            X.8S4 r1 = A00(r4, r3)
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.thumbnailUrl_ = r3
        L_0x045a:
            java.lang.String r3 = r5.A04
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x046e
            X.8S4 r1 = A00(r4, r3)
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.mediaUrl_ = r3
        L_0x046e:
            byte[] r0 = r5.A0F
            if (r0 == 0) goto L_0x0482
            X.8I5 r3 = X.C90474aD.A0O(r4, r0)
            X.8Hz r1 = r4.A00
            X.8S4 r1 = (X.AnonymousClass8S4) r1
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.thumbnail_ = r3
        L_0x0482:
            java.lang.String r3 = r5.A06
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0496
            X.8S4 r1 = A00(r4, r3)
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.sourceId_ = r3
        L_0x0496:
            java.lang.String r3 = r5.A07
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x04aa
            X.8S4 r1 = A00(r4, r3)
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.sourceType_ = r3
        L_0x04aa:
            java.lang.String r3 = r5.A08
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x04be
            X.8S4 r1 = A00(r4, r3)
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.sourceUrl_ = r3
        L_0x04be:
            java.lang.String r3 = r5.A03
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x04d2
            X.8S4 r1 = A00(r4, r3)
            int r0 = r1.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.bitField0_ = r0
            r1.ctwaClid_ = r3
        L_0x04d2:
            java.lang.String r3 = r5.A05
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x04e6
            X.8S4 r1 = A00(r4, r3)
            int r0 = r1.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0
            r1.ref_ = r3
        L_0x04e6:
            boolean r3 = r5.A0D
            X.8Hz r1 = X.C90524aI.A0H(r4)
            X.8S4 r1 = (X.AnonymousClass8S4) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.bitField0_ = r0
            r1.renderLargerThumbnail_ = r3
            boolean r3 = r5.A0E
            X.8Hz r1 = X.C90524aI.A0H(r4)
            X.8S4 r1 = (X.AnonymousClass8S4) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.bitField0_ = r0
            r1.showAdAttribution_ = r3
            boolean r3 = r5.A0B
            X.8Hz r1 = X.C90524aI.A0H(r4)
            X.8S4 r1 = (X.AnonymousClass8S4) r1
            int r0 = r1.bitField0_
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r1.bitField0_ = r0
            r1.clickToWhatsappCall_ = r3
            boolean r3 = r5.A0C
            X.8Hz r1 = X.C90524aI.A0H(r4)
            X.8S4 r1 = (X.AnonymousClass8S4) r1
            int r0 = r1.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.bitField0_ = r0
            r1.containsAutoReply_ = r3
            X.8Hz r0 = r4.A0R()
            X.8S4 r0 = (X.AnonymousClass8S4) r0
            X.8SG r1 = X.AnonymousClass8NN.A04(r2)
            r0.getClass()
            r1.externalAdReply_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r1.bitField0_ = r0
        L_0x053b:
            X.8Hz r0 = r2.A0R()
            X.8SG r0 = (X.AnonymousClass8SG) r0
            return r0
        L_0x0542:
            r0 = 2
            if (r1 != r0) goto L_0x0434
            X.90W r6 = X.AnonymousClass90W.VIDEO
            goto L_0x0434
        L_0x0549:
            if (r1 != r3) goto L_0x054f
            X.90o r5 = X.C1887490o.INITIATED_BY_ME
            goto L_0x0386
        L_0x054f:
            r0 = 2
            if (r1 != r0) goto L_0x0386
            X.90o r5 = X.C1887490o.INITIATED_BY_OTHER
            goto L_0x0386
        L_0x0556:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x055b:
            r0 = 0
            X.1Fu r0 = X.C165567td.A0K(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202029kv.A03(X.3un, X.3T1, byte[], boolean):X.8SG");
    }

    public C202029kv(C19730wQ r1, C19970wo r2, C20810yC r3, AnonymousClass005 r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
    }

    public static AnonymousClass8S4 A00(AnonymousClass8NN r0, Object obj) {
        r0.A0S();
        AnonymousClass8S4 r02 = (AnonymousClass8S4) r0.A00;
        obj.getClass();
        return r02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        if (X.AnonymousClass3TJ.A02(r4.A0D, 4) == false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(X.C80103un r3, X.AnonymousClass3T1 r4, byte[] r5) {
        /*
            X.3T1 r0 = r4.A0S()
            r2 = 1
            if (r0 != 0) goto L_0x002b
            r0 = 1024(0x400, float:1.435E-42)
            boolean r0 = r4.A1T(r0)
            if (r0 != 0) goto L_0x002b
            boolean r0 = r4.A1T(r2)
            if (r0 != 0) goto L_0x002b
            r0 = 262144(0x40000, float:3.67342E-40)
            boolean r0 = r4.A1T(r0)
            if (r0 != 0) goto L_0x002b
            r0 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002c
            r0 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002c
        L_0x002b:
            return r2
        L_0x002c:
            java.lang.String r0 = r4.A0q
            boolean r0 = X.C36421kH.A1a(r0)
            if (r0 != 0) goto L_0x002b
            boolean r0 = r4.A1H()
            if (r0 != 0) goto L_0x002b
            if (r3 == 0) goto L_0x0057
            X.3Qa r0 = r4.A1J
            X.11F r1 = r0.A00
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 != 0) goto L_0x002b
            boolean r0 = X.AnonymousClass143.A0G(r1)
            if (r0 != 0) goto L_0x002b
            boolean r0 = r1 instanceof X.C177538dx
            if (r0 == 0) goto L_0x0057
            int r1 = r4.A0D
            r0 = 4
            boolean r0 = X.AnonymousClass3TJ.A02(r1, r0)
            if (r0 != 0) goto L_0x002b
        L_0x0057:
            if (r5 == 0) goto L_0x0062
            X.3Qa r0 = r4.A1J
            X.11F r0 = r0.A00
            boolean r0 = r0 instanceof X.C177538dx
            if (r0 == 0) goto L_0x0062
            return r2
        L_0x0062:
            X.9TX r0 = r4.A0K
            if (r0 == 0) goto L_0x006d
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x006d
            return r2
        L_0x006d:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202029kv.A02(X.3un, X.3T1, byte[]):boolean");
    }
}
