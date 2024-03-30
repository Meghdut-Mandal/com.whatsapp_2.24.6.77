package X;

public final class ABF implements C22938Ayo, C22942Ays, C17740rx {
    public void B24(C196159Xy r8, AnonymousClass3T1 r9) {
        String str;
        C36321k7.A0w(r9, r8);
        if (r9 instanceof C180828mU) {
            AnonymousClass8NL r3 = r8.A00;
            AnonymousClass8NE A0J = C170918Hz.A0J(r3);
            A0J.A0U(AnonymousClass91G.BOT_FEEDBACK_MESSAGE);
            AnonymousClass8SQ r0 = ((AnonymousClass8SX) r3.A00).protocolMessage_;
            if (r0 == null) {
                r0 = AnonymousClass8SQ.DEFAULT_INSTANCE;
            }
            AnonymousClass8RB r02 = r0.botFeedbackMessage_;
            if (r02 == null) {
                r02 = AnonymousClass8RB.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r02.A0q();
            C180828mU r92 = (C180828mU) r9;
            AnonymousClass91F r4 = r92.A02;
            AnonymousClass8RB r1 = (AnonymousClass8RB) C90524aI.A0H(A0q);
            int i = AnonymousClass8RB.KIND_FIELD_NUMBER;
            r1.kind_ = r4.value;
            r1.bitField0_ |= 2;
            long j = r92.A00;
            AnonymousClass8RB r12 = (AnonymousClass8RB) C90524aI.A0H(A0q);
            r12.bitField0_ |= 8;
            r12.kindNegative_ = j;
            long j2 = r92.A01;
            AnonymousClass8RB r13 = (AnonymousClass8RB) C90524aI.A0H(A0q);
            r13.bitField0_ |= 16;
            r13.kindPositive_ = j2;
            String str2 = r92.A04;
            if (!(str2 == null || str2.length() == 0)) {
                AnonymousClass8RB r14 = (AnonymousClass8RB) C90524aI.A0H(A0q);
                r14.bitField0_ |= 4;
                r14.text_ = str2;
            }
            AnonymousClass8SQ r03 = ((AnonymousClass8SX) r3.A00).protocolMessage_;
            if (r03 == null) {
                r03 = AnonymousClass8SQ.DEFAULT_INSTANCE;
            }
            AnonymousClass8RB r04 = r03.botFeedbackMessage_;
            if (r04 == null) {
                r04 = AnonymousClass8RB.DEFAULT_INSTANCE;
            }
            AnonymousClass8SW r05 = r04.messageKey_;
            if (r05 == null) {
                r05 = AnonymousClass8SW.DEFAULT_INSTANCE;
            }
            AnonymousClass8NG A0Q = C170918Hz.A0Q(r05);
            C64933Qa r15 = r92.A03;
            if (r15 != null) {
                A0Q.A0V(r15.A01);
                A0Q.A0Y(r15.A02);
                AnonymousClass11F r06 = r15.A00;
                if (r06 == null || (str = r06.getRawString()) == null) {
                    str = null;
                }
                A0Q.A0X(str);
            }
            AnonymousClass8SW r07 = (AnonymousClass8SW) A0Q.A0R();
            AnonymousClass8RB r16 = (AnonymousClass8RB) C90524aI.A0H(A0q);
            r07.getClass();
            r16.messageKey_ = r07;
            r16.bitField0_ |= 1;
            AnonymousClass8SQ A0A = AnonymousClass8NN.A0A(A0J);
            AnonymousClass8RB r08 = (AnonymousClass8RB) A0q.A0R();
            r08.getClass();
            A0A.botFeedbackMessage_ = r08;
            A0A.bitField0_ |= 16384;
            r3.A0c(A0J);
            return;
        }
        throw AnonymousClass001.A08("FMessageBotFeedbackProtobuf/not supported message");
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r7) {
        AnonymousClass8SX A00 = AnonymousClass9YL.A00(r7);
        if (A00.A0y()) {
            AnonymousClass8SQ r5 = A00.protocolMessage_;
            if (r5 == null) {
                r5 = AnonymousClass8SQ.DEFAULT_INSTANCE;
            }
            int i = r5.bitField0_;
            if (!AnonymousClass000.A1P(i & 2)) {
                throw C165617ti.A0S(11, "no protocol msg type");
            } else if (C170918Hz.A0K(r5) == AnonymousClass91G.BOT_FEEDBACK_MESSAGE) {
                if ((i & 16384) != 0) {
                    AnonymousClass8RB r0 = r5.botFeedbackMessage_;
                    AnonymousClass8RB r1 = r0;
                    if (r0 == null) {
                        r0 = AnonymousClass8RB.DEFAULT_INSTANCE;
                    }
                    if ((r0.bitField0_ & 2) != 0) {
                        if (r1 == null) {
                            r1 = AnonymousClass8RB.DEFAULT_INSTANCE;
                        }
                        if ((r1.bitField0_ & 1) != 0) {
                            C180828mU r2 = new C180828mU(r7.A0C, r7.A04);
                            AnonymousClass8RB r02 = r5.botFeedbackMessage_;
                            AnonymousClass8RB r12 = r02;
                            if (r02 == null) {
                                r02 = AnonymousClass8RB.DEFAULT_INSTANCE;
                            }
                            AnonymousClass91F A002 = AnonymousClass91F.A00(r02.kind_);
                            if (A002 == null) {
                                A002 = AnonymousClass91F.BOT_FEEDBACK_POSITIVE;
                            }
                            r2.A02 = A002;
                            if (r12 == null) {
                                r12 = AnonymousClass8RB.DEFAULT_INSTANCE;
                            }
                            AnonymousClass8SW r4 = r12.messageKey_;
                            if (r4 == null) {
                                r4 = AnonymousClass8SW.DEFAULT_INSTANCE;
                            }
                            C222713q r03 = AnonymousClass11F.A00;
                            r2.A03 = C165617ti.A0R(C222713q.A01(r4.remoteJid_), r4.id_, r4.fromMe_);
                            AnonymousClass8RB r04 = r5.botFeedbackMessage_;
                            AnonymousClass8RB r3 = r04;
                            if (r04 == null) {
                                r04 = AnonymousClass8RB.DEFAULT_INSTANCE;
                            }
                            if ((r04.bitField0_ & 4) != 0) {
                                AnonymousClass8RB r05 = r3;
                                if (r3 == null) {
                                    r05 = AnonymousClass8RB.DEFAULT_INSTANCE;
                                }
                                r2.A04 = r05.text_;
                            }
                            AnonymousClass8RB r06 = r3;
                            if (r3 == null) {
                                r06 = AnonymousClass8RB.DEFAULT_INSTANCE;
                            }
                            if ((r06.bitField0_ & 16) != 0) {
                                AnonymousClass8RB r07 = r3;
                                if (r3 == null) {
                                    r07 = AnonymousClass8RB.DEFAULT_INSTANCE;
                                }
                                r2.A01 = r07.kindPositive_;
                            }
                            AnonymousClass8RB r08 = r3;
                            if (r3 == null) {
                                r08 = AnonymousClass8RB.DEFAULT_INSTANCE;
                            }
                            if ((r08.bitField0_ & 8) != 0) {
                                if (r3 == null) {
                                    r3 = AnonymousClass8RB.DEFAULT_INSTANCE;
                                }
                                r2.A00 = r3.kindNegative_;
                            }
                            return r2;
                        }
                        throw C165617ti.A0S(11, "no bot feedback msg messageKey");
                    }
                    throw C165617ti.A0S(11, "no bot feedback msg kind");
                }
                throw C165617ti.A0S(11, "no bot feedback msg");
            }
        }
        return null;
    }
}
