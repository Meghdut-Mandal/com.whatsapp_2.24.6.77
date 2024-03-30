package X;

import java.util.List;

/* renamed from: X.9X9  reason: invalid class name */
public final class AnonymousClass9X9 {
    public final int A00;
    public final AnonymousClass3T1 A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9X9) {
                AnonymousClass9X9 r5 = (AnonymousClass9X9) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03) || this.A00 != r5.A00 || this.A05 != r5.A05 || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A042 = C36421kH.A04(this.A02);
        return C36351kA.A05(this.A01, (((C36381kD.A08(this.A03, A042) + this.A00) * 31) + C36341k9.A01(this.A05 ? 1 : 0)) * 31) + AnonymousClass000.A0H(this.A04);
    }

    public AnonymousClass9X9(AnonymousClass3T1 r1, String str, String str2, List list, int i, boolean z) {
        C36321k7.A0x(str, str2);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A05 = z;
        this.A01 = r1;
        this.A04 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ReactionItem(key=");
        A0u.append(this.A02);
        A0u.append(", reaction=");
        A0u.append(this.A03);
        A0u.append(", count=");
        A0u.append(this.A00);
        A0u.append(", hasMyReaction=");
        A0u.append(this.A05);
        A0u.append(", message=");
        A0u.append(this.A01);
        A0u.append(", reactionSenders=");
        return AnonymousClass000.A0m(this.A04, A0u);
    }
}
