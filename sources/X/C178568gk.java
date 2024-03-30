package X;

/* renamed from: X.8gk  reason: invalid class name and case insensitive filesystem */
public class C178568gk extends ABR implements C22938Ayo {
    public void B24(C196159Xy r5, AnonymousClass3T1 r6) {
        if (r6 instanceof C180968mi) {
            C180838mV r62 = (C180838mV) r6;
            AnonymousClass8NL r2 = r5.A00;
            C172308Ni r0 = ((AnonymousClass8SX) r2.A00).cancelPaymentRequestMessage_;
            if (r0 == null) {
                r0 = C172308Ni.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r0.A0q();
            AnonymousClass8SW r02 = ((C172308Ni) A0q.A00).key_;
            if (r02 == null) {
                r02 = AnonymousClass8SW.DEFAULT_INSTANCE;
            }
            AnonymousClass8NG A0Q = C170918Hz.A0Q(r02);
            A00(A0Q, r62);
            C172308Ni r1 = (C172308Ni) C90524aI.A0H(A0q);
            r1.key_ = AnonymousClass8NN.A0G(A0Q);
            r1.bitField0_ |= 1;
            AnonymousClass8SX A0E = AnonymousClass8NN.A0E(r2);
            C172308Ni r03 = (C172308Ni) A0q.A0R();
            r03.getClass();
            A0E.cancelPaymentRequestMessage_ = r03;
            A0E.bitField0_ |= 524288;
            return;
        }
        throw AnonymousClass001.A08("FMessagePaymentRequestCancelledProtobuf/not supported message");
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r6) {
        AnonymousClass8SX r2 = r6.A0A;
        if ((r2.bitField0_ & 524288) == 0) {
            return null;
        }
        C172308Ni r0 = r2.cancelPaymentRequestMessage_;
        if (r0 == null) {
            r0 = C172308Ni.DEFAULT_INSTANCE;
        }
        C18740tg.A06(r0);
        C64933Qa r4 = r6.A0C;
        long j = r6.A04;
        AnonymousClass8SW r02 = r0.key_;
        if (r02 == null) {
            r02 = AnonymousClass8SW.DEFAULT_INSTANCE;
        }
        String str = r02.id_;
        C180968mi r03 = new C180968mi(r4, j);
        r03.A00 = str;
        return r03;
    }
}
