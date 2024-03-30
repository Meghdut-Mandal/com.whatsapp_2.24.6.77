package X;

import java.util.List;

/* renamed from: X.5KY  reason: invalid class name */
public final class AnonymousClass5KY extends C111615cZ {
    public final AnonymousClass68B A00;
    public final List A01;

    public AnonymousClass5KY(AnonymousClass68B r2, List list) {
        AnonymousClass00C.A0D(list, 2);
        this.A00 = r2;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5KY) {
                AnonymousClass5KY r5 = (AnonymousClass5KY) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36391kE.A0A(this.A00));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Success(pack=");
        A0u.append(this.A00);
        A0u.append(", stickers=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
