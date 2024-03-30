package org.whispersystems.curve25519;

import X.AnonymousClass78O;
import X.C160777lZ;

public class OpportunisticCurve25519Provider implements C160777lZ {
    public C160777lZ A00;

    public byte[] B7p() {
        return this.A00.B7p();
    }

    public byte[] BGQ(int i) {
        return this.A00.BGQ(64);
    }

    public byte[] calculateAgreement(byte[] bArr, byte[] bArr2) {
        return this.A00.calculateAgreement(bArr, bArr2);
    }

    public byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.A00.calculateSignature(bArr, bArr2, bArr3);
    }

    public byte[] generatePublicKey(byte[] bArr) {
        return this.A00.generatePublicKey(bArr);
    }

    public boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.A00.verifySignature(bArr, bArr2, bArr3);
    }

    public OpportunisticCurve25519Provider() {
        try {
            this.A00 = new NativeCurve25519Provider();
        } catch (AnonymousClass78O unused) {
            this.A00 = new JavaCurve25519Provider();
        }
    }
}
