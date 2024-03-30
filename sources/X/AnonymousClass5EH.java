package X;

import java.util.List;

/* renamed from: X.5EH  reason: invalid class name */
public final class AnonymousClass5EH extends AnonymousClass5EQ {
    public final List A00;
    public final C006302t A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5EH) {
                AnonymousClass5EH r5 = (AnonymousClass5EH) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36351kA.A05(this.A00, 0));
    }

    public AnonymousClass5EH(List list, C006302t r3) {
        super(51);
        this.A00 = list;
        this.A01 = r3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C90514aH.A1S(A0u, "SuggestedSearchListItemData(suggestionType=");
        A0u.append(", suggestedSearch=");
        A0u.append(this.A00);
        A0u.append(", clickListener=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
