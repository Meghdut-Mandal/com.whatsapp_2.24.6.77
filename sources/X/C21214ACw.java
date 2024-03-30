package X;

import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.ACw  reason: case insensitive filesystem */
public final class C21214ACw implements B14 {
    public final C29621Xi A00;
    public final C20810yC A01;

    public void Bd4(C1275768v r9, AnonymousClass8SU r10, AnonymousClass3T1 r11) {
        C21674AUx aUx;
        boolean A1a = C36341k9.A1a(r10, r11);
        AnonymousClass00C.A0D(r9, 2);
        AnonymousClass5SH r7 = r9.A00;
        if (this.A01.A0E(6578)) {
            C172488Oa r0 = r10.reportingTokenInfo_;
            if (r0 == null) {
                r0 = C172488Oa.DEFAULT_INSTANCE;
            }
            if (r0 != null && (aUx = r0.reportingTag_) != null) {
                byte[] A06 = aUx.A06();
                if (A06.length != 0) {
                    int i = -1;
                    int ordinal = r7.ordinal();
                    if (ordinal == A1a) {
                        i = -3;
                    } else if (ordinal == 2) {
                        i = -4;
                    } else if (ordinal != 0) {
                        i = -5;
                    }
                    r11.A0y(new AnonymousClass9WK(Integer.valueOf(i), A06, (byte[]) null));
                }
            }
        }
    }

    public C21214ACw(C29621Xi r1, C20810yC r2) {
        C36321k7.A0x(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public void Bd3(AnonymousClass6CO r5, AnonymousClass8NK r6, AnonymousClass3T1 r7) {
        C36331k8.A1I(r7, r6);
        if (this.A01.A0E(6578)) {
            this.A00.A01(r7);
            AnonymousClass9WK r0 = r7.A0Z;
            if (r0 != null) {
                byte[] bArr = r0.A01;
                if (bArr.length != 0) {
                    AnonymousClass8NN A0p = C172488Oa.DEFAULT_INSTANCE.A0p();
                    AnonymousClass8I5 A03 = AnonymousClass8NN.A03(A0p, bArr);
                    C172488Oa r1 = (C172488Oa) A0p.A00;
                    r1.bitField0_ |= 1;
                    r1.reportingTag_ = A03;
                    C172488Oa r02 = (C172488Oa) A0p.A0R();
                    AnonymousClass8SU A0J = AnonymousClass8NN.A0J(r6);
                    r02.getClass();
                    A0J.reportingTokenInfo_ = r02;
                    A0J.bitField1_ |= DefaultCrypto.BUFFER_SIZE;
                }
            }
        }
    }
}
