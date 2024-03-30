package X;

import java.util.Objects;

/* renamed from: X.Aae  reason: case insensitive filesystem */
public class C21804Aae implements B23 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C199299f5 A03;
    public final C21665AUh A04;
    public final C21806Aag A05;
    public final AUM A06;
    public final byte[] A07;

    public int getType() {
        return 3;
    }

    public C21804Aae(byte[] bArr) {
        Throwable th;
        AUM aum;
        int i;
        try {
            int i2 = (bArr[0] & 255) >> 4;
            this.A02 = i2;
            if (i2 > 3) {
                th = new AnonymousClass18G(AnonymousClass000.A0r("Unknown version: ", AnonymousClass000.A0u(), i2));
            } else if (i2 >= 3) {
                AnonymousClass8RU r2 = (AnonymousClass8RU) C170918Hz.A04(C21674AUx.A01(bArr, 1, bArr.length - 1), AnonymousClass8RU.DEFAULT_INSTANCE);
                int i3 = r2.bitField0_;
                if ((i3 & 4) == 0 || (i3 & 8) == 0 || (i3 & 16) == 0 || (i3 & 32) == 0) {
                    th = new AnonymousClass18B("Incomplete message.");
                } else {
                    this.A07 = bArr;
                    this.A00 = r2.registrationId_;
                    if ((i3 & 2) != 0) {
                        Integer valueOf = Integer.valueOf(r2.preKeyId_);
                        Objects.requireNonNull(valueOf);
                        aum = new C22733Aux(valueOf);
                    } else {
                        aum = C22734Auy.A00;
                    }
                    this.A06 = aum;
                    if ((r2.bitField0_ & 4) != 0) {
                        i = r2.signedPreKeyId_;
                    } else {
                        i = -1;
                    }
                    this.A01 = i;
                    this.A04 = C200529hY.A00(r2.baseKey_);
                    this.A03 = new C199299f5(C200529hY.A00(r2.identityKey_));
                    this.A05 = new C21806Aag(r2.message_.A06());
                    return;
                }
            } else {
                th = new AnonymousClass18A(AnonymousClass000.A0r("Legacy version: ", AnonymousClass000.A0u(), i2));
            }
            throw th;
        } catch (AnonymousClass186 | AnonymousClass18A | AnonymousClass18E e) {
            throw new AnonymousClass18B(e);
        }
    }

    public byte[] Bq0() {
        return this.A07;
    }

    public C21804Aae(C199299f5 r6, C21665AUh aUh, C21806Aag aag, AUM aum, int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A06 = aum;
        this.A01 = i3;
        this.A04 = aUh;
        this.A03 = r6;
        this.A05 = aag;
        AnonymousClass8NN A012 = C170918Hz.A01(AnonymousClass8RU.DEFAULT_INSTANCE);
        AnonymousClass8RU r2 = (AnonymousClass8RU) A012.A00;
        r2.bitField0_ |= 4;
        r2.signedPreKeyId_ = i3;
        AnonymousClass8I5 A0O = C90474aD.A0O(A012, aUh.A00());
        AnonymousClass8RU r22 = (AnonymousClass8RU) A012.A00;
        r22.bitField0_ |= 8;
        r22.baseKey_ = A0O;
        AnonymousClass8I5 A0O2 = C90474aD.A0O(A012, r6.A00.A00());
        AnonymousClass8RU r23 = (AnonymousClass8RU) A012.A00;
        r23.bitField0_ |= 16;
        r23.identityKey_ = A0O2;
        AnonymousClass8I5 A0O3 = C90474aD.A0O(A012, aag.A04);
        AnonymousClass8RU r24 = (AnonymousClass8RU) A012.A00;
        r24.bitField0_ |= 32;
        r24.message_ = A0O3;
        AnonymousClass8RU r25 = (AnonymousClass8RU) C90524aI.A0H(A012);
        r25.bitField0_ |= 1;
        r25.registrationId_ = i2;
        if (aum instanceof C22733Aux) {
            int A0I = AnonymousClass000.A0I(aum.A00());
            AnonymousClass8RU r26 = (AnonymousClass8RU) C90524aI.A0H(A012);
            r26.bitField0_ |= 2;
            r26.preKeyId_ = A0I;
        }
        this.A07 = C200539hZ.A00(new byte[]{(byte) (((i << 4) | 3) & 255)}, AnonymousClass8NN.A0N(A012));
    }
}
