package org.whispersystems.curve25519;

import X.AnonymousClass603;
import X.AnonymousClass78O;
import X.C160777lZ;

public class NativeCurve25519Provider implements C160777lZ {
    public AnonymousClass603 A00 = new AnonymousClass603();

    private native boolean smokeCheck(int i);

    public native byte[] calculateAgreement(byte[] bArr, byte[] bArr2);

    public native byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] generatePrivateKey(byte[] bArr);

    public native byte[] generatePublicKey(byte[] bArr);

    public native boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public byte[] B7p() {
        byte[] bArr = new byte[32];
        this.A00.A00(bArr);
        return generatePrivateKey(bArr);
    }

    public byte[] BGQ(int i) {
        byte[] bArr = new byte[64];
        this.A00.A00(bArr);
        return bArr;
    }

    public NativeCurve25519Provider() {
        try {
            smokeCheck(31337);
        } catch (UnsatisfiedLinkError e) {
            throw new AnonymousClass78O(e);
        }
    }
}
