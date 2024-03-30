package X;

/* renamed from: X.8gl  reason: invalid class name and case insensitive filesystem */
public class C178578gl extends ABR implements C22938Ayo {
    public void B24(C196159Xy r5, AnonymousClass3T1 r6) {
        if (r6 instanceof C180978mj) {
            C180838mV r62 = (C180838mV) r6;
            AnonymousClass8NL r2 = r5.A00;
            C172318Nj r0 = ((AnonymousClass8SX) r2.A00).declinePaymentRequestMessage_;
            if (r0 == null) {
                r0 = C172318Nj.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r0.A0q();
            AnonymousClass8SW r02 = ((C172318Nj) A0q.A00).key_;
            if (r02 == null) {
                r02 = AnonymousClass8SW.DEFAULT_INSTANCE;
            }
            AnonymousClass8NG A0Q = C170918Hz.A0Q(r02);
            A00(A0Q, r62);
            C172318Nj r1 = (C172318Nj) C90524aI.A0H(A0q);
            r1.key_ = AnonymousClass8NN.A0G(A0Q);
            r1.bitField0_ |= 1;
            AnonymousClass8SX A0E = AnonymousClass8NN.A0E(r2);
            C172318Nj r03 = (C172318Nj) A0q.A0R();
            r03.getClass();
            A0E.declinePaymentRequestMessage_ = r03;
            A0E.bitField0_ |= 262144;
            return;
        }
        throw AnonymousClass001.A08("FMessagePaymentRequestDeclinedProtobuf/not supported message");
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r6) {
        AnonymousClass8SX r2 = r6.A0A;
        if ((r2.bitField0_ & 262144) == 0) {
            return null;
        }
        C172318Nj r0 = r2.declinePaymentRequestMessage_;
        if (r0 == null) {
            r0 = C172318Nj.DEFAULT_INSTANCE;
        }
        C18740tg.A06(r0);
        C64933Qa r4 = r6.A0C;
        long j = r6.A04;
        AnonymousClass8SW r02 = r0.key_;
        if (r02 == null) {
            r02 = AnonymousClass8SW.DEFAULT_INSTANCE;
        }
        String str = r02.id_;
        C180978mj r03 = new C180978mj(r4, j);
        r03.A00 = str;
        return r03;
    }
}
