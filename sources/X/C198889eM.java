package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9eM  reason: invalid class name and case insensitive filesystem */
public final class C198889eM {
    public final C19730wQ A00;
    public final AnonymousClass16T A01;
    public final C20810yC A02;
    public final AnonymousClass005 A03;

    public C198889eM(C19730wQ r1, AnonymousClass16T r2, C20810yC r3, AnonymousClass005 r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r1.A0E(811) == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass3T1 A00(X.AnonymousClass9YL r2, X.C198889eM r3, X.AnonymousClass8SX r4) {
        /*
            X.9YL r2 = r2.A01(r4)
            boolean r0 = r4.A0z()
            if (r0 == 0) goto L_0x0029
            X.0yC r1 = r3.A02
            r0 = 812(0x32c, float:1.138E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x001c
            r0 = 811(0x32b, float:1.136E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0029
        L_0x001c:
            X.005 r0 = r3.A03
            java.lang.Object r0 = r0.get()
            X.0xh r0 = (X.C20520xh) r0
            X.3T1 r0 = r0.A00(r2)
            return r0
        L_0x0029:
            int r0 = r4.bitField0_
            r0 = r0 & 32
            if (r0 != 0) goto L_0x001c
            r0 = 0
            X.2bK r0 = r2.A02(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198889eM.A00(X.9YL, X.9eM, X.8SX):X.3T1");
    }

    public void A01(C202319lY r14, C196159Xy r15, C22970AzM azM, AnonymousClass3T1 r17) {
        AnonymousClass8SX A0E;
        int i;
        int i2;
        C207119ua r8;
        long A09;
        int i3;
        C22970AzM azM2 = azM;
        AnonymousClass3T1 r4 = r17;
        if (r14.A0K()) {
            AnonymousClass16X r0 = r14.A08;
            C18740tg.A06(r0);
            long longValue = r0.A00.scaleByPowerOfTen(3).longValue();
            String str = r14.A0I;
            C175708av r2 = r14.A0A;
            if (r2 == null) {
                r8 = null;
                A09 = 0;
            } else {
                r8 = r2.A01;
                A09 = r2.A09();
            }
            UserJid userJid = r14.A0E;
            C135106c9 A05 = r14.A05();
            AnonymousClass8NL r6 = r15.A00;
            C173268Ra r3 = ((AnonymousClass8SX) r6.A00).requestPaymentMessage_;
            if (r3 == null) {
                r3 = C173268Ra.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r3.A0q();
            AnonymousClass8NL B4N = azM2.B4N(r15, r4);
            if (B4N != null) {
                C173268Ra r9 = (C173268Ra) C90524aI.A0H(A0q);
                AnonymousClass8SX A0D = AnonymousClass8NN.A0D(B4N);
                int i4 = C173268Ra.AMOUNT_1000_FIELD_NUMBER;
                A0D.getClass();
                r9.noteMessage_ = A0D;
                r9.bitField0_ |= 1;
            }
            C173268Ra r5 = (C173268Ra) C90524aI.A0H(A0q);
            int i5 = C173268Ra.AMOUNT_1000_FIELD_NUMBER;
            r5.bitField0_ |= 4;
            r5.amount1000_ = longValue;
            C173268Ra r52 = (C173268Ra) C90524aI.A0H(A0q);
            str.getClass();
            r52.bitField0_ |= 2;
            r52.currencyCodeIso4217_ = str;
            AnonymousClass8QC r42 = ((C173268Ra) A0q.A00).amount_;
            if (r42 == null) {
                r42 = AnonymousClass8QC.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q2 = r42.A0q();
            if (r8 != null) {
                longValue = (long) r8.A01();
            }
            AnonymousClass8QC r53 = (AnonymousClass8QC) C90524aI.A0H(A0q2);
            int i6 = AnonymousClass8QC.CURRENCY_CODE_FIELD_NUMBER;
            r53.bitField0_ |= 1;
            r53.value_ = longValue;
            if (r8 != null) {
                i3 = r8.A00;
            } else {
                i3 = 1000;
            }
            AnonymousClass8QC r1 = (AnonymousClass8QC) C90524aI.A0H(A0q2);
            r1.bitField0_ |= 2;
            r1.offset_ = i3;
            if (r8 != null) {
                str = ((AnonymousClass16V) r8.A01).A02;
            }
            AnonymousClass8QC r12 = (AnonymousClass8QC) C90524aI.A0H(A0q2);
            str.getClass();
            r12.bitField0_ |= 4;
            r12.currencyCode_ = str;
            AnonymousClass8QC r02 = (AnonymousClass8QC) A0q2.A0R();
            C173268Ra r13 = (C173268Ra) C90524aI.A0H(A0q);
            r02.getClass();
            r13.amount_ = r02;
            r13.bitField0_ |= 32;
            long A0B = C36391kE.A0B(A09);
            C173268Ra r16 = (C173268Ra) C90524aI.A0H(A0q);
            r16.bitField0_ |= 16;
            r16.expiryTimestamp_ = A0B;
            if (userJid != null) {
                String A0K = AnonymousClass8NN.A0K(A0q, userJid);
                C173268Ra r18 = (C173268Ra) A0q.A00;
                A0K.getClass();
                r18.bitField0_ |= 8;
                r18.requestFrom_ = A0K;
            }
            if (A05 != null) {
                C100044uN A012 = A05.A01();
                C173268Ra r19 = (C173268Ra) C90524aI.A0H(A0q);
                A012.getClass();
                r19.background_ = A012;
                r19.bitField0_ |= 64;
            }
            A0E = AnonymousClass8NN.A0E(r6);
            C173268Ra r03 = (C173268Ra) A0q.A0R();
            r03.getClass();
            A0E.requestPaymentMessage_ = r03;
            i = A0E.bitField0_;
            i2 = C132986Wc.A0F;
        } else {
            String str2 = r14.A0M;
            UserJid userJid2 = r14.A0D;
            C135106c9 A052 = r14.A05();
            AnonymousClass8NL r32 = r15.A00;
            AnonymousClass8QB r04 = ((AnonymousClass8SX) r32.A00).sendPaymentMessage_;
            if (r04 == null) {
                r04 = AnonymousClass8QB.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q3 = r04.A0q();
            if (str2 != null) {
                AnonymousClass8NG A0i = AnonymousClass8SW.A0i();
                A0i.A0V(str2);
                A0i.A0Y(false);
                AnonymousClass11F r110 = r4.A1J.A00;
                if (AnonymousClass143.A0G(r110)) {
                    C165607th.A1C(userJid2, A0i);
                }
                A0i.A0X(AnonymousClass143.A03(r110));
                AnonymousClass8SW r22 = (AnonymousClass8SW) A0i.A0R();
                AnonymousClass8QB r111 = (AnonymousClass8QB) C90524aI.A0H(A0q3);
                int i7 = AnonymousClass8QB.BACKGROUND_FIELD_NUMBER;
                r22.getClass();
                r111.requestMessageKey_ = r22;
                r111.bitField0_ |= 2;
            }
            if (A052 != null) {
                C100044uN A013 = A052.A01();
                AnonymousClass8QB r112 = (AnonymousClass8QB) C90524aI.A0H(A0q3);
                int i8 = AnonymousClass8QB.BACKGROUND_FIELD_NUMBER;
                A013.getClass();
                r112.background_ = A013;
                r112.bitField0_ |= 4;
            }
            AnonymousClass8NL B4N2 = azM2.B4N(r15, r4);
            if (B4N2 != null) {
                AnonymousClass8QB r23 = (AnonymousClass8QB) C90524aI.A0H(A0q3);
                AnonymousClass8SX A0D2 = AnonymousClass8NN.A0D(B4N2);
                int i9 = AnonymousClass8QB.BACKGROUND_FIELD_NUMBER;
                A0D2.getClass();
                r23.noteMessage_ = A0D2;
                r23.bitField0_ |= 1;
            }
            A0E = AnonymousClass8NN.A0E(r32);
            AnonymousClass8QB r05 = (AnonymousClass8QB) A0q3.A0R();
            r05.getClass();
            A0E.sendPaymentMessage_ = r05;
            i = A0E.bitField0_;
            i2 = 32768;
        }
        A0E.bitField0_ = i | i2;
    }
}
