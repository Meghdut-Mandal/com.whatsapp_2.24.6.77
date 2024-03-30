package X;

import java.util.List;

/* renamed from: X.3JL  reason: invalid class name */
public final class AnonymousClass3JL {
    public boolean A00;
    public final Integer A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3JL) {
                AnonymousClass3JL r5 = (AnonymousClass3JL) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass000.A0H(this.A02) * 31) + C36411kG.A09(this.A01)) * 31) + C36341k9.A01(this.A00 ? 1 : 0);
    }

    public AnonymousClass3JL(Integer num, List list, boolean z) {
        this.A02 = list;
        this.A01 = num;
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BotSuggestedPromptMetadata(prompts=");
        A0u.append(this.A02);
        A0u.append(", selectedPromptIndex=");
        A0u.append(this.A01);
        A0u.append(", impressionLogged=");
        return C36321k7.A0H(A0u, this.A00);
    }
}
