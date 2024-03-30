package X;

public final class ABC implements B6B {
    public final C202909ms A00;

    public void B25(C192559Hl r8, AnonymousClass3T1 r9) {
        C36331k8.A1I(r9, r8);
        if (r9 instanceof C181798o3) {
            AnonymousClass8NL r4 = r8.A00;
            AnonymousClass8NH A01 = this.A00.A01(C170918Hz.A0O(r4), (C46932bu) r9, r8.A01);
            if (A01 != null) {
                AnonymousClass2bU r1 = (AnonymousClass2bU) r9;
                C65013Qj r0 = r1.A01;
                if (r0 == null || r0.A0a == null) {
                    C165567td.A1A(r9, "FMessageVideo/unable to send encrypted media message due to missing; media_wa_type=", AnonymousClass000.A0u());
                } else {
                    AnonymousClass6Q6 A1Y = r1.A1Y();
                    C18740tg.A06(A1Y);
                    byte[] A05 = A1Y.A05();
                    if (A05 != null) {
                        AnonymousClass8I5 A012 = C21674AUx.A01(A05, 0, A05.length);
                        AnonymousClass8SE A0C = AnonymousClass8NN.A0C(A01);
                        A0C.bitField0_ |= 32768;
                        A0C.streamingSidecar_ = A012;
                    }
                }
                r4.A0i((AnonymousClass8SE) A01.A0R());
                return;
            }
            return;
        }
        throw C165567td.A0K(0);
    }

    public AnonymousClass3T1 BlI(AnonymousClass9XL r6) {
        AnonymousClass00C.A0D(r6, 0);
        AnonymousClass8RS r1 = r6.A02;
        if (!AnonymousClass000.A1P(r1.bitField0_ & 16)) {
            return null;
        }
        AnonymousClass8S8 r3 = r1.videoMessage_;
        if (r3 == null) {
            r3 = AnonymousClass8S8.DEFAULT_INSTANCE;
        }
        if (r3.gifPlayback_) {
            return null;
        }
        C181798o3 r4 = new C181798o3(r6.A03, r6.A01);
        C202909ms.A00(r3, r4);
        return r4;
    }

    public ABC(C202909ms r1) {
        this.A00 = r1;
    }
}
