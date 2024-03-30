package X;

/* renamed from: X.9di  reason: invalid class name and case insensitive filesystem */
public class C198529di {
    public AnonymousClass8QS A00;

    public void A00(C202549mA r8) {
        byte[][] bArr = r8.A01;
        int i = r8.A00;
        int length = bArr.length;
        int[] A002 = AnonymousClass98F.A00(i, length);
        C172208My r3 = (C172208My) this.A00.A0q();
        int i2 = AnonymousClass8QS.SENDERCHAINKEYS_FIELD_NUMBER;
        ((AnonymousClass8QS) C90524aI.A0H(r3)).senderChainKeys_ = AnonymousClass8I2.A02;
        for (int i3 = 0; i3 < length; i3++) {
            AnonymousClass8N9 r1 = (AnonymousClass8N9) C172748Pa.DEFAULT_INSTANCE.A0p();
            r1.A0U(A002[i3]);
            r1.A0V(C165607th.A0O(bArr[i3]));
            r3.A0U((C172748Pa) r1.A0R());
        }
        this.A00 = (AnonymousClass8QS) r3.A0R();
    }

    public C198529di(AnonymousClass8QS r1) {
        this.A00 = r1;
    }

    public C198529di(C21665AUh aUh, AUM aum, byte[][] bArr, int i, int i2) {
        AnonymousClass8NN A0p = C172768Pc.DEFAULT_INSTANCE.A0p();
        AnonymousClass8I5 A0O = C90474aD.A0O(A0p, aUh.A00());
        C172768Pc r1 = (C172768Pc) A0p.A00;
        r1.bitField0_ |= 1;
        r1.public_ = A0O;
        if (aum instanceof C22733Aux) {
            AnonymousClass8I5 A0O2 = C90474aD.A0O(A0p, ((C118185nT) aum.A00()).A00);
            C172768Pc r12 = (C172768Pc) A0p.A00;
            r12.bitField0_ |= 2;
            r12.private_ = A0O2;
        }
        C172208My r5 = (C172208My) AnonymousClass8QS.DEFAULT_INSTANCE.A0p();
        AnonymousClass8QS r13 = (AnonymousClass8QS) C90524aI.A0H(r5);
        r13.bitField0_ |= 1;
        r13.senderKeyId_ = i;
        AnonymousClass8QS r14 = (AnonymousClass8QS) C90524aI.A0H(r5);
        C172768Pc r0 = (C172768Pc) A0p.A0R();
        r0.getClass();
        r14.senderSigningKey_ = r0;
        r14.bitField0_ |= 2;
        int length = bArr.length;
        int[] A002 = AnonymousClass98F.A00(i2, length);
        for (int i3 = 0; i3 < length; i3++) {
            AnonymousClass8N9 r15 = (AnonymousClass8N9) C172748Pa.DEFAULT_INSTANCE.A0p();
            r15.A0U(A002[i3]);
            r15.A0V(C165607th.A0O(bArr[i3]));
            r5.A0U((C172748Pa) r15.A0R());
        }
        this.A00 = (AnonymousClass8QS) r5.A0R();
    }
}
