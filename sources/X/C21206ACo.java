package X;

/* renamed from: X.ACo  reason: case insensitive filesystem */
public final class C21206ACo implements B14 {
    public void Bd3(AnonymousClass6CO r5, AnonymousClass8NK r6, AnonymousClass3T1 r7) {
        C36321k7.A0w(r7, r6);
        if (C64933Qa.A04(r7)) {
            long j = r7.A1O;
            AnonymousClass8SU A0J = AnonymousClass8NN.A0J(r6);
            A0J.bitField1_ |= 16384;
            A0J.newsletterServerId_ = j;
        }
    }

    public void Bd4(C1275768v r3, AnonymousClass8SU r4, AnonymousClass3T1 r5) {
        C36321k7.A0w(r4, r5);
        if ((r4.bitField1_ & 16384) != 0) {
            r5.A1O = r4.newsletterServerId_;
        }
    }
}
