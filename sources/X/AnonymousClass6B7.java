package X;

import java.util.Map;

/* renamed from: X.6B7  reason: invalid class name */
public final class AnonymousClass6B7 {
    public final Map A00;
    public final String A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6B7) {
                AnonymousClass6B7 r5 = (AnonymousClass6B7) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A02 != r5.A02 || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, (C36421kH.A04(this.A01) + C36341k9.A01(this.A02 ? 1 : 0)) * 31);
    }

    public AnonymousClass6B7(String str, Map map, boolean z) {
        this.A01 = str;
        this.A02 = z;
        this.A00 = map;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AIBotEmbodimentSentimentData(sentiment=");
        A0u.append(this.A01);
        A0u.append(", isDefault=");
        A0u.append(this.A02);
        A0u.append(", intensities=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
