package X;

/* renamed from: X.9f6  reason: invalid class name and case insensitive filesystem */
public class C199309f6 {
    public C173208Qu A00;

    public C199389fE A00() {
        C172748Pa r1 = this.A00.senderChainKey_;
        C172748Pa r0 = r1;
        if (r1 == null) {
            r1 = C172748Pa.DEFAULT_INSTANCE;
        }
        int i = r1.iteration_;
        if (r0 == null) {
            r0 = C172748Pa.DEFAULT_INSTANCE;
        }
        return new C199389fE(i, r0.seed_.A06());
    }

    public void A01(C199389fE r5) {
        AnonymousClass8N9 r1 = (AnonymousClass8N9) C172748Pa.DEFAULT_INSTANCE.A0p();
        r1.A0U(r5.A00);
        r1.A0V(C165607th.A0O(r5.A01));
        C172748Pa r3 = (C172748Pa) r1.A0R();
        AnonymousClass8NN A0q = this.A00.A0q();
        C173208Qu r12 = (C173208Qu) C90524aI.A0H(A0q);
        int i = C173208Qu.SENDERCHAINKEY_FIELD_NUMBER;
        r3.getClass();
        r12.senderChainKey_ = r3;
        r12.bitField0_ |= 2;
        this.A00 = (C173208Qu) A0q.A0R();
    }

    public C199309f6(C173208Qu r1) {
        this.A00 = r1;
    }

    public C199309f6(C21665AUh aUh, AUM aum, byte[] bArr, int i, int i2) {
        AnonymousClass8N9 r2 = (AnonymousClass8N9) C172748Pa.DEFAULT_INSTANCE.A0p();
        r2.A0U(i2);
        r2.A0V(C21674AUx.A01(bArr, 0, bArr.length));
        C172748Pa r4 = (C172748Pa) r2.A0R();
        AnonymousClass8NN A0p = C172768Pc.DEFAULT_INSTANCE.A0p();
        AnonymousClass8I5 A03 = AnonymousClass8NN.A03(A0p, aUh.A00());
        C172768Pc r1 = (C172768Pc) A0p.A00;
        r1.bitField0_ |= 1;
        r1.public_ = A03;
        if (aum instanceof C22733Aux) {
            AnonymousClass8I5 A0O = C90474aD.A0O(A0p, ((C118185nT) aum.A00()).A00);
            C172768Pc r12 = (C172768Pc) A0p.A00;
            r12.bitField0_ |= 2;
            r12.private_ = A0O;
        }
        AnonymousClass8NN A01 = C170918Hz.A01(C173208Qu.DEFAULT_INSTANCE);
        C173208Qu r13 = (C173208Qu) A01.A00;
        r13.bitField0_ |= 1;
        r13.senderKeyId_ = i;
        C173208Qu r14 = (C173208Qu) C90524aI.A0H(A01);
        r4.getClass();
        r14.senderChainKey_ = r4;
        r14.bitField0_ |= 2;
        C173208Qu r15 = (C173208Qu) C90524aI.A0H(A01);
        C172768Pc r0 = (C172768Pc) A0p.A0R();
        r0.getClass();
        r15.senderSigningKey_ = r0;
        r15.bitField0_ |= 4;
        this.A00 = (C173208Qu) A01.A0R();
    }
}
