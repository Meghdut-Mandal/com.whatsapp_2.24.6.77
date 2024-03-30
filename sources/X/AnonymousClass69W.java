package X;

/* renamed from: X.69W  reason: invalid class name */
public final class AnonymousClass69W {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass69W) {
                AnonymousClass69W r5 = (AnonymousClass69W) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A00, C36421kH.A04(this.A01));
    }

    public AnonymousClass69W(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BotPrompt(text=");
        A0u.append(this.A01);
        A0u.append(", emoji=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
