package X;

import java.util.Arrays;

/* renamed from: X.9WK  reason: invalid class name */
public final class AnonymousClass9WK {
    public final Integer A00;
    public final byte[] A01;
    public final byte[] A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (AnonymousClass00C.A0J(getClass(), C90474aD.A0W(obj))) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.protocol.FMessageReportingInfo");
                AnonymousClass9WK r5 = (AnonymousClass9WK) obj;
                if (Arrays.equals(this.A01, r5.A01) && AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    byte[] bArr = this.A02;
                    byte[] bArr2 = r5.A02;
                    if (bArr != null) {
                        if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                            return false;
                        }
                    } else if (bArr2 != null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((Arrays.hashCode(this.A01) * 31) + C90484aE.A0B(this.A00)) * 31;
        byte[] bArr = this.A02;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        }
        return hashCode + i;
    }

    public AnonymousClass9WK(Integer num, byte[] bArr, byte[] bArr2) {
        this.A01 = bArr;
        this.A02 = bArr2;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FMessageReportingInfo(reportingTag=");
        C90474aD.A1O(A0u, this.A01);
        A0u.append(", reportingTokenContent=");
        C90474aD.A1O(A0u, this.A02);
        A0u.append(", reportingTokenVersion=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
