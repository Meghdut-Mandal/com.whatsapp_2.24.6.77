package X;

import java.util.List;

/* renamed from: X.55X  reason: invalid class name */
public final class AnonymousClass55X extends C110665b2 {
    public final Integer A00;
    public final List A01;
    public final List A02;

    public AnonymousClass55X(Integer num, List list, List list2) {
        AnonymousClass00C.A0D(list2, 2);
        this.A02 = list;
        this.A01 = list2;
        this.A00 = num;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass55X) {
                AnonymousClass55X r5 = (AnonymousClass55X) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A01, C36391kE.A0A(this.A02)) + AnonymousClass000.A0H(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EmojiGrid(sections=");
        A0u.append(this.A02);
        A0u.append(", items=");
        A0u.append(this.A01);
        A0u.append(", qplInstanceKey=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
