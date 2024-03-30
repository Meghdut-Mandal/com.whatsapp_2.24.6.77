package X;

/* renamed from: X.4yo  reason: invalid class name and case insensitive filesystem */
public final class C102114yo extends AnonymousClass6FN {
    public final C99934uC A00;
    public final byte[] A01;
    public final byte[] A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102114yo(C100094uS r6, byte[] bArr, byte[] bArr2) {
        super(bArr2, bArr);
        AnonymousClass00C.A0D(bArr2, 2);
        this.A02 = bArr;
        this.A01 = bArr2;
        AnonymousClass8NN A0p = C99934uC.DEFAULT_INSTANCE.A0p();
        AnonymousClass5U9 r0 = AnonymousClass5U9.HSM_CONTROLLED;
        C99934uC r1 = (C99934uC) C90524aI.A0H(A0p);
        r1.keyType_ = r0.value;
        r1.bitField0_ |= 1;
        byte[] bArr3 = this.A01;
        AnonymousClass8NN A0p2 = C99794ty.DEFAULT_INSTANCE.A0p();
        AnonymousClass8I5 A0O = C90474aD.A0O(A0p2, bArr3);
        C99794ty r12 = (C99794ty) A0p2.A00;
        r12.bitField0_ |= 1;
        r12.encryptionIv_ = A0O;
        C99794ty r02 = (C99794ty) A0p2.A0R();
        C99934uC r13 = (C99934uC) C90524aI.A0H(A0p);
        r02.getClass();
        r13.hsmControlledKeyData_ = r02;
        r13.bitField0_ |= 4;
        if (r6 != null) {
            C99934uC r14 = (C99934uC) C90524aI.A0H(A0p);
            r14.backupMetadata_ = r6;
            r14.bitField0_ |= 8;
        }
        this.A00 = (C99934uC) A0p.A0R();
    }
}
