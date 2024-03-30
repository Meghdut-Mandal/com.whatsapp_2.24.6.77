package X;

import java.util.HashMap;

/* renamed from: X.9g9  reason: invalid class name and case insensitive filesystem */
public final class C199869g9 {
    public final C001700s A00;
    public final HashMap A01;
    public final HashMap A02;
    public final HashMap A03;

    public C199869g9() {
        this((C001700s) null, (HashMap) null, (HashMap) null, (HashMap) null, (C05250Oz) null, 0, 0, 127, 0);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C199869g9) {
                C199869g9 r5 = (C199869g9) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, C36351kA.A05(this.A00, C36351kA.A05(this.A01, C36351kA.A05(this.A03, C36321k7.A00(0, 0) * 31))));
    }

    public /* synthetic */ C199869g9(C001700s r5, HashMap hashMap, HashMap hashMap2, HashMap hashMap3, C05250Oz r9, int i, int i2, int i3, long j) {
        HashMap A0J = AnonymousClass001.A0J();
        HashMap A0J2 = AnonymousClass001.A0J();
        C001700s A0Z = C36441kJ.A0Z(0L);
        HashMap A0J3 = AnonymousClass001.A0J();
        this.A03 = A0J;
        this.A01 = A0J2;
        this.A00 = A0Z;
        this.A02 = A0J3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C90514aH.A1S(A0u, "IncomingTransferInfo(numFiles=");
        A0u.append(", totalBytes=");
        A0u.append(0);
        C90514aH.A1S(A0u, ", numFilesTransferred=");
        A0u.append(", payloads=");
        A0u.append(this.A03);
        A0u.append(", filePayloadFileNames=");
        A0u.append(this.A01);
        A0u.append(", transferredBytes=");
        A0u.append(this.A00);
        A0u.append(", payloadTransferUpdates=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
