package X;

/* renamed from: X.Aac  reason: case insensitive filesystem */
public class C21802Aac implements B23 {
    public final int A00;
    public final int A01;
    public final C21665AUh A02;
    public final byte[] A03;
    public final byte[][] A04;

    public int getType() {
        throw null;
    }

    public C21802Aac(C21665AUh aUh, byte[][] bArr, int i, int i2) {
        byte[] bArr2 = {(byte) 51};
        AnonymousClass8NN A012 = C170918Hz.A01(C173178Qr.DEFAULT_INSTANCE);
        C173178Qr r1 = (C173178Qr) A012.A00;
        r1.bitField0_ |= 1;
        r1.id_ = i;
        C173178Qr r12 = (C173178Qr) C90524aI.A0H(A012);
        r12.bitField0_ |= 2;
        r12.iteration_ = i2;
        AnonymousClass8I5 A032 = AnonymousClass8NN.A03(A012, aUh.A00());
        C173178Qr r13 = (C173178Qr) A012.A00;
        r13.bitField0_ |= 4;
        r13.signingKey_ = A032;
        for (byte[] A033 : bArr) {
            AnonymousClass8I5 A034 = AnonymousClass8NN.A03(A012, A033);
            C173178Qr r2 = (C173178Qr) A012.A00;
            C23122B6c b6c = r2.chainKeys_;
            if (!((C21886AcE) b6c).A00) {
                b6c = C170918Hz.A0A(b6c);
                r2.chainKeys_ = b6c;
            }
            b6c.add(A034);
        }
        byte[] A0N = AnonymousClass8NN.A0N(A012);
        this.A00 = i;
        this.A01 = i2;
        this.A04 = bArr;
        this.A02 = aUh;
        this.A03 = C200539hZ.A00(bArr2, A0N);
    }

    public byte[] Bq0() {
        return this.A03;
    }

    public C21802Aac(byte[] bArr) {
        Throwable th;
        try {
            byte[][] A012 = C200539hZ.A01(bArr, 1, bArr.length - 1);
            int i = 0;
            byte b = A012[0][0];
            byte[] bArr2 = A012[1];
            int i2 = (b & 255) >> 4;
            if (i2 < 3) {
                th = new AnonymousClass18A(AnonymousClass000.A0r("Legacy message: ", AnonymousClass000.A0u(), i2));
            } else if (i2 <= 3) {
                C173178Qr r2 = (C173178Qr) C170918Hz.A08(C173178Qr.DEFAULT_INSTANCE, bArr2);
                int i3 = r2.bitField0_;
                if ((i3 & 1) == 0 || (i3 & 2) == 0 || r2.chainKeys_.size() <= 0 || (r2.bitField0_ & 4) == 0) {
                    th = new AnonymousClass18B("Incomplete message.");
                } else {
                    this.A03 = bArr;
                    this.A00 = r2.id_;
                    this.A01 = r2.iteration_;
                    this.A02 = C200529hY.A00(r2.signingKey_);
                    C23122B6c b6c = r2.chainKeys_;
                    this.A04 = new byte[b6c.size()][];
                    while (true) {
                        byte[][] bArr3 = this.A04;
                        if (i < bArr3.length) {
                            bArr3[i] = ((C21674AUx) b6c.get(i)).A06();
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                th = new AnonymousClass18B(AnonymousClass000.A0r("Unknown version: ", AnonymousClass000.A0u(), i2));
            }
            throw th;
        } catch (AnonymousClass186 | AnonymousClass18E e) {
            throw new AnonymousClass18B(e);
        }
    }
}
