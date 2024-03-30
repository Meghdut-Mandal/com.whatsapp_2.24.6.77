package X;

import java.text.ParseException;

/* renamed from: X.Aaf  reason: case insensitive filesystem */
public class C21805Aaf implements B23 {
    public final int A00;
    public final int A01;
    public final byte[] A02;
    public final byte[] A03;

    public int getType() {
        throw null;
    }

    public void A00(C21665AUh aUh) {
        try {
            byte[] bArr = this.A03;
            byte[][] A012 = C200539hZ.A01(bArr, bArr.length - 64, 64);
            if (!C131336Oq.A00().A01(aUh.A00, A012[0], A012[1])) {
                throw new AnonymousClass18B("Invalid signature!");
            }
        } catch (AnonymousClass18E e) {
            throw new AnonymousClass18B((Throwable) e);
        }
    }

    public C21805Aaf(C118185nT r10, byte[] bArr, int i, int i2) {
        byte[] bArr2 = {(byte) 51};
        AnonymousClass8NN A012 = C170918Hz.A01(AnonymousClass8QR.DEFAULT_INSTANCE);
        AnonymousClass8QR r1 = (AnonymousClass8QR) A012.A00;
        r1.bitField0_ |= 1;
        r1.id_ = i;
        AnonymousClass8QR r12 = (AnonymousClass8QR) C90524aI.A0H(A012);
        r12.bitField0_ |= 2;
        r12.iteration_ = i2;
        AnonymousClass8I5 A032 = AnonymousClass8NN.A03(A012, bArr);
        AnonymousClass8QR r13 = (AnonymousClass8QR) A012.A00;
        r13.bitField0_ |= 4;
        r13.ciphertext_ = A032;
        byte[] A0N = AnonymousClass8NN.A0N(A012);
        try {
            this.A03 = C200539hZ.A00(bArr2, A0N, C131336Oq.A00().A03(r10.A00, C200539hZ.A00(bArr2, A0N)));
            this.A01 = i;
            this.A00 = i2;
            this.A02 = bArr;
        } catch (AnonymousClass18E e) {
            throw C90524aI.A0Y(e);
        }
    }

    public byte[] Bq0() {
        return this.A03;
    }

    public C21805Aaf(byte[] bArr) {
        Throwable th;
        try {
            byte[][] A022 = C200539hZ.A02(bArr, 1, (bArr.length - 1) - 64, 64);
            byte b = A022[0][0];
            byte[] bArr2 = A022[1];
            int i = (b & 255) >> 4;
            if (i < 3) {
                th = new AnonymousClass18A(AnonymousClass000.A0r("Legacy message: ", AnonymousClass000.A0u(), i));
            } else if (i <= 3) {
                AnonymousClass8QR r2 = (AnonymousClass8QR) C170918Hz.A08(AnonymousClass8QR.DEFAULT_INSTANCE, bArr2);
                int i2 = r2.bitField0_;
                if ((i2 & 1) == 0 || (i2 & 2) == 0 || (i2 & 4) == 0) {
                    th = new AnonymousClass18B("Incomplete message.");
                } else {
                    this.A03 = bArr;
                    this.A01 = r2.id_;
                    this.A00 = r2.iteration_;
                    this.A02 = r2.ciphertext_.A06();
                    return;
                }
            } else {
                th = new AnonymousClass18B(AnonymousClass000.A0r("Unknown version: ", AnonymousClass000.A0u(), i));
            }
            throw th;
        } catch (AnonymousClass186 | ParseException e) {
            throw new AnonymousClass18B(e);
        }
    }
}
