package X;

import java.util.List;

/* renamed from: X.6AB  reason: invalid class name */
public final class AnonymousClass6AB {
    public final Integer A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6AB) {
                AnonymousClass6AB r5 = (AnonymousClass6AB) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A01) + AnonymousClass000.A0H(this.A00);
    }

    public AnonymousClass6AB(Integer num, List list) {
        this.A01 = list;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EmojiBatchLoadingTask(emojiTargets=");
        A0u.append(this.A01);
        A0u.append(", qplInstanceKey=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
