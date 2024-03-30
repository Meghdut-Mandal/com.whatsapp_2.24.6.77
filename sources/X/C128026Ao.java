package X;

import java.util.Arrays;

/* renamed from: X.6Ao  reason: invalid class name and case insensitive filesystem */
public final class C128026Ao {
    public final String A00;
    public final byte[] A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128026Ao) {
                C128026Ao r5 = (C128026Ao) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36421kH.A04(this.A00) + 1880189433) * 31) + Arrays.hashCode(this.A01);
    }

    public C128026Ao(String str, byte[] bArr) {
        this.A00 = str;
        this.A01 = bArr;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Response(recipientNodeId=");
        A0u.append(this.A00);
        A0u.append(", path=");
        A0u.append("/altLinkingPrefillResponse");
        A0u.append(", payload=");
        return C36321k7.A0E(Arrays.toString(this.A01), A0u);
    }
}
