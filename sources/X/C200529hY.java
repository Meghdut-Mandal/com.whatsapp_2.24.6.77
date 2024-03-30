package X;

/* renamed from: X.9hY  reason: invalid class name and case insensitive filesystem */
public abstract class C200529hY {
    public static C21665AUh A01(byte[] bArr) {
        byte b = bArr[0] & 255;
        if (b == 5) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 1, bArr2, 0, 32);
            return new C21665AUh(bArr2);
        }
        throw new AnonymousClass18E(AnonymousClass000.A0r("Bad key type: ", AnonymousClass000.A0u(), b));
    }

    public static C21665AUh A00(C21674AUx aUx) {
        return A01(aUx.A06());
    }

    public static C120595rl A02() {
        C160777lZ r0 = C131336Oq.A00().A00;
        byte[] B7p = r0.B7p();
        return new C120595rl(new C118185nT(B7p), new C21665AUh(r0.generatePublicKey(B7p)));
    }

    public static byte[] A03(C118185nT r3, C21665AUh aUh) {
        return C131336Oq.A00().A02(aUh.A00, r3.A00);
    }
}
