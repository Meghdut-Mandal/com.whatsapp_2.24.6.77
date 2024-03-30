package X;

import java.util.Map;

/* renamed from: X.69i  reason: invalid class name and case insensitive filesystem */
public final class C1277069i {
    public final Map A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1277069i) {
                C1277069i r5 = (C1277069i) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36421kH.A04(this.A01));
    }

    public C1277069i(String str, Map map) {
        this.A01 = str;
        this.A00 = map;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AIBotEmbodimentActionData(action=");
        A0u.append(this.A01);
        A0u.append(", sentiments=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
