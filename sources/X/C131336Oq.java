package X;

/* renamed from: X.6Oq  reason: invalid class name and case insensitive filesystem */
public class C131336Oq {
    public final C160777lZ A00;

    public static C131336Oq A00() {
        try {
            return new C131336Oq((C160777lZ) Class.forName(AnonymousClass000.A0p("org.whispersystems.curve25519.", "OpportunisticCurve25519Provider", AnonymousClass000.A0u())).newInstance());
        } catch (InstantiationException e) {
            throw new AnonymousClass78O(e);
        } catch (IllegalAccessException e2) {
            throw new AnonymousClass78O(e2);
        } catch (ClassNotFoundException e3) {
            throw new AnonymousClass78O(e3);
        }
    }

    public boolean A01(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length != 32) {
            throw AnonymousClass001.A08("Invalid public key!");
        } else if (bArr2 == null || bArr3 == null || bArr3.length != 64) {
            return false;
        } else {
            return this.A00.verifySignature(bArr, bArr2, bArr3);
        }
    }

    public byte[] A02(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            throw AnonymousClass001.A08("Keys must not be null!");
        } else if (bArr.length == 32 && bArr2.length == 32) {
            return this.A00.calculateAgreement(bArr2, bArr);
        } else {
            throw AnonymousClass001.A08("Keys must be 32 bytes!");
        }
    }

    public byte[] A03(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32) {
            throw AnonymousClass001.A08("Invalid private key length!");
        }
        C160777lZ r1 = this.A00;
        return r1.calculateSignature(r1.BGQ(64), bArr, bArr2);
    }

    public C131336Oq(C160777lZ r1) {
        this.A00 = r1;
    }
}
