package X;

/* renamed from: X.4yp  reason: invalid class name and case insensitive filesystem */
public final class C102124yp extends C102134yq {
    public final C99934uC A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102124yp(C1264263x r6, C100094uS r7, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(r6, bArr, bArr2, bArr3);
        AnonymousClass00C.A0D(bArr3, 4);
        AnonymousClass8NN A0p = C99934uC.DEFAULT_INSTANCE.A0p();
        AnonymousClass5U9 r0 = AnonymousClass5U9.WA_PROVIDED;
        C99934uC r1 = (C99934uC) C90524aI.A0H(A0p);
        r1.keyType_ = r0.value;
        r1.bitField0_ |= 1;
        AnonymousClass8NN A0p2 = C99974uG.DEFAULT_INSTANCE.A0p();
        AnonymousClass8I5 A0O = C90474aD.A0O(A0p2, r6.A03);
        C99974uG r12 = (C99974uG) A0p2.A00;
        r12.bitField0_ |= 1;
        r12.backupCipherHeader_ = A0O;
        String str = r6.A00;
        C99974uG r13 = (C99974uG) C90524aI.A0H(A0p2);
        str.getClass();
        r13.bitField0_ |= 2;
        r13.keyVersion_ = str;
        AnonymousClass8I5 A0O2 = C90474aD.A0O(A0p2, r6.A04);
        C99974uG r14 = (C99974uG) A0p2.A00;
        r14.bitField0_ |= 4;
        r14.serverSalt_ = A0O2;
        AnonymousClass8I5 A0O3 = C90474aD.A0O(A0p2, r6.A02);
        C99974uG r15 = (C99974uG) A0p2.A00;
        r15.bitField0_ |= 8;
        r15.googleIdSalt_ = A0O3;
        AnonymousClass8I5 A0O4 = C90474aD.A0O(A0p2, r6.A01);
        C99974uG r16 = (C99974uG) A0p2.A00;
        r16.bitField0_ |= 16;
        r16.encryptionIv_ = A0O4;
        C99974uG r02 = (C99974uG) A0p2.A0R();
        C99934uC r17 = (C99934uC) C90524aI.A0H(A0p);
        r02.getClass();
        r17.waProvidedKeyData_ = r02;
        r17.bitField0_ |= 2;
        if (r7 != null) {
            C99934uC r18 = (C99934uC) C90524aI.A0H(A0p);
            r18.backupMetadata_ = r7;
            r18.bitField0_ |= 8;
        }
        this.A00 = (C99934uC) A0p.A0R();
    }
}
