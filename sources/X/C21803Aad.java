package X;

/* renamed from: X.Aad  reason: case insensitive filesystem */
public class C21803Aad implements B23 {
    public final int A00;
    public final int A01;
    public final C21665AUh A02;
    public final byte[] A03;
    public final byte[] A04;

    public int getType() {
        throw null;
    }

    public C21803Aad(C21665AUh aUh, byte[] bArr, int i, int i2) {
        AnonymousClass8NN A012 = C170918Hz.A01(C173188Qs.DEFAULT_INSTANCE);
        C173188Qs r1 = (C173188Qs) A012.A00;
        r1.bitField0_ |= 1;
        r1.id_ = i;
        C173188Qs r12 = (C173188Qs) C90524aI.A0H(A012);
        r12.bitField0_ |= 2;
        r12.iteration_ = i2;
        AnonymousClass8I5 A032 = AnonymousClass8NN.A03(A012, bArr);
        C173188Qs r13 = (C173188Qs) A012.A00;
        r13.bitField0_ |= 4;
        r13.chainKey_ = A032;
        AnonymousClass8I5 A033 = AnonymousClass8NN.A03(A012, aUh.A00());
        C173188Qs r14 = (C173188Qs) A012.A00;
        r14.bitField0_ |= 8;
        r14.signingKey_ = A033;
        byte[] A0N = AnonymousClass8NN.A0N(A012);
        this.A00 = i;
        this.A01 = i2;
        this.A03 = bArr;
        this.A02 = aUh;
        this.A04 = C200539hZ.A00(new byte[]{(byte) 51}, A0N);
    }

    public byte[] Bq0() {
        return this.A04;
    }

    public C21803Aad(byte[] bArr) {
        Throwable th;
        try {
            byte[][] A012 = C200539hZ.A01(bArr, 1, bArr.length - 1);
            byte b = A012[0][0];
            byte[] bArr2 = A012[1];
            int i = (b & 255) >> 4;
            if (i < 3) {
                th = new AnonymousClass18A(AnonymousClass000.A0r("Legacy message: ", AnonymousClass000.A0u(), i));
            } else if (i <= 3) {
                C173188Qs r2 = (C173188Qs) C170918Hz.A08(C173188Qs.DEFAULT_INSTANCE, bArr2);
                int i2 = r2.bitField0_;
                if ((i2 & 1) == 0 || (i2 & 2) == 0 || (i2 & 4) == 0 || (i2 & 8) == 0) {
                    th = new AnonymousClass18B("Incomplete message.");
                } else {
                    this.A04 = bArr;
                    this.A00 = r2.id_;
                    this.A01 = r2.iteration_;
                    this.A03 = r2.chainKey_.A06();
                    this.A02 = C200529hY.A00(r2.signingKey_);
                    return;
                }
            } else {
                th = new AnonymousClass18B(AnonymousClass000.A0r("Unknown version: ", AnonymousClass000.A0u(), i));
            }
            throw th;
        } catch (AnonymousClass186 | AnonymousClass18E e) {
            throw new AnonymousClass18B(e);
        }
    }
}
