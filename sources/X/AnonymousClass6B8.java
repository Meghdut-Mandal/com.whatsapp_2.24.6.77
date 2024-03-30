package X;

import java.util.List;

/* renamed from: X.6B8  reason: invalid class name */
public final class AnonymousClass6B8 {
    public int A00 = 0;
    public List A01;
    public final String A02;

    public AnonymousClass6B8(String str, List list) {
        this.A02 = str;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6B8) {
                AnonymousClass6B8 r5 = (AnonymousClass6B8) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, (C36421kH.A04(this.A02) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AIBotEmbodimentSentimentIntensityData(intensity=");
        A0u.append(this.A02);
        A0u.append(", videoIndex=");
        A0u.append(this.A00);
        A0u.append(", videos=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
