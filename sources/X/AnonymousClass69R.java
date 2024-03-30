package X;

import java.util.Map;

/* renamed from: X.69R  reason: invalid class name */
public final class AnonymousClass69R {
    public final Map A00;
    public final C160377ku A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass69R) {
                AnonymousClass69R r5 = (AnonymousClass69R) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00) + AnonymousClass000.A0H(this.A01);
    }

    public AnonymousClass69R(C160377ku r1, Map map) {
        this.A00 = map;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BloksComponentQueryParseResult(components=");
        A0u.append(this.A00);
        A0u.append(", prefetchScript=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
