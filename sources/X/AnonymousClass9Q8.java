package X;

import java.util.Objects;

/* renamed from: X.9Q8  reason: invalid class name */
public final class AnonymousClass9Q8 {
    public final int A00;
    public final String A01;

    public AnonymousClass9Q8(String str, int i) {
        Objects.requireNonNull(str);
        this.A01 = str;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A01);
        A0u.append(", uid: ");
        return C36381kD.A10(A0u, this.A00);
    }
}
