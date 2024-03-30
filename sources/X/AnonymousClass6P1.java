package X;

import java.util.List;

/* renamed from: X.6P1  reason: invalid class name */
public final class AnonymousClass6P1 {
    public final List A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6P1) {
                AnonymousClass6P1 r5 = (AnonymousClass6P1) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A0H(this.A00) * 31) + C36411kG.A09(this.A01);
    }

    public AnonymousClass6P1(List list, List list2) {
        this.A00 = list;
        this.A01 = list2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessSearchSuggestion(suggestedSearches=");
        A0u.append(this.A00);
        A0u.append(", popularSearches=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }

    public AnonymousClass6P1() {
        this((List) null, (List) null);
    }
}
