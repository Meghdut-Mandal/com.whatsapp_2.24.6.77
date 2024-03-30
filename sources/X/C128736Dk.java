package X;

import java.util.Arrays;

/* renamed from: X.6Dk  reason: invalid class name and case insensitive filesystem */
public final class C128736Dk {
    public byte[] A00 = null;
    public byte[] A01 = null;
    public final String A02;
    public final String A03;
    public final byte[] A04;
    public final byte[] A05;
    public final byte[] A06;
    public final byte[] A07;

    public C128736Dk(String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        C36321k7.A1B(bArr, bArr2, str, str2, bArr3);
        AnonymousClass00C.A0D(bArr4, 6);
        this.A06 = bArr;
        this.A07 = bArr2;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = bArr3;
        this.A05 = bArr4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128736Dk) {
                C128736Dk r5 = (C128736Dk) obj;
                if (!AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A07, r5.A07) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int A08 = (((C36381kD.A08(this.A02, C36381kD.A08(this.A03, ((Arrays.hashCode(this.A06) * 31) + Arrays.hashCode(this.A07)) * 31)) + Arrays.hashCode(this.A04)) * 31) + Arrays.hashCode(this.A05)) * 31;
        byte[] bArr = this.A00;
        int i = 0;
        if (bArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(bArr);
        }
        int i2 = (A08 + hashCode) * 31;
        byte[] bArr2 = this.A01;
        if (bArr2 != null) {
            i = Arrays.hashCode(bArr2);
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CrosspostPurposeEncryptionParams(serverPublicEK=");
        C90474aD.A1O(A0u, this.A06);
        A0u.append(", serverPublicIK=");
        C90474aD.A1O(A0u, this.A07);
        A0u.append(", serverPublicIKSignature=");
        A0u.append(this.A03);
        A0u.append(", serverPublicIKCertificate=");
        A0u.append(this.A02);
        A0u.append(", dummyCiphertext=");
        C90474aD.A1O(A0u, this.A04);
        A0u.append(", dummyNonce=");
        C90474aD.A1O(A0u, this.A05);
        A0u.append(", clientPrivateKey=");
        C90474aD.A1O(A0u, this.A00);
        A0u.append(", clientPublicKey=");
        return C36321k7.A0E(Arrays.toString(this.A01), A0u);
    }
}
