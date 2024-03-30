package X;

import java.util.Arrays;

/* renamed from: X.9VY  reason: invalid class name */
public final class AnonymousClass9VY {
    public final byte[] A00;
    public final byte[] A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (AnonymousClass00C.A0J(getClass(), C90474aD.A0W(obj))) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.data.MessageStanzaReportingInfo");
                AnonymousClass9VY r5 = (AnonymousClass9VY) obj;
                if (Arrays.equals(this.A00, r5.A00)) {
                    byte[] bArr = this.A01;
                    byte[] bArr2 = r5.A01;
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
        int i;
        int hashCode = Arrays.hashCode(this.A00) * 31;
        byte[] bArr = this.A01;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public AnonymousClass9VY(byte[] bArr, byte[] bArr2) {
        this.A00 = bArr;
        this.A01 = bArr2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MessageStanzaReportingInfo(reportingTag=");
        C90474aD.A1O(A0u, this.A00);
        A0u.append(", reportingToken=");
        return C36321k7.A0E(Arrays.toString(this.A01), A0u);
    }
}
