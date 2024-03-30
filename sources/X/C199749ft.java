package X;

import java.util.HashMap;

/* renamed from: X.9ft  reason: invalid class name and case insensitive filesystem */
public final class C199749ft {
    public HashMap A00;
    public HashMap A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C199749ft) {
                C199749ft r5 = (C199749ft) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36351kA.A05(this.A01, ((C36321k7.A00(0, 0) * 31 * 31) + 1237) * 31));
    }

    public /* synthetic */ C199749ft(HashMap hashMap, HashMap hashMap2, C05250Oz r5, int i, int i2, int i3, int i4, long j, boolean z) {
        HashMap A0J = AnonymousClass001.A0J();
        HashMap A0J2 = AnonymousClass001.A0J();
        this.A01 = A0J;
        this.A00 = A0J2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C90514aH.A1S(A0u, "OutgoingTransferInfo(numFiles=");
        A0u.append(", totalBytes=");
        A0u.append(0);
        C90514aH.A1S(A0u, ", filePayloadsTransferred=");
        C90514aH.A1S(A0u, ", bytePayloadsTransferred=");
        C90474aD.A1N(A0u, ", filePayloadsTransferInitiated=");
        A0u.append(", filePayloads=");
        A0u.append(this.A01);
        A0u.append(", bytePayloads=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }

    public C199749ft() {
        HashMap A0J = AnonymousClass001.A0J();
        HashMap A0J2 = AnonymousClass001.A0J();
        this.A01 = A0J;
        this.A00 = A0J2;
    }
}
