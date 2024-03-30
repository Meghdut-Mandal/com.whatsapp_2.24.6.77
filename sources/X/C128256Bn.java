package X;

import java.util.Map;

/* renamed from: X.6Bn  reason: invalid class name and case insensitive filesystem */
public final class C128256Bn {
    public final C23931Ak A00;
    public final String A01;
    public final Map A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128256Bn) {
                C128256Bn r5 = (C128256Bn) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, C36351kA.A05(this.A00, C36421kH.A04(this.A01)));
    }

    public C128256Bn(C23931Ak r1, String str, Map map) {
        this.A01 = str;
        this.A00 = r1;
        this.A02 = map;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("XFamilyCrosspostSessionData(sessionId=");
        A0u.append(this.A01);
        A0u.append(", messageToCrosspost=");
        A0u.append(this.A00);
        A0u.append(", cachedDBDataMap=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
