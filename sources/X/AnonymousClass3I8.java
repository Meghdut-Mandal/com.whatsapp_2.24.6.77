package X;

/* renamed from: X.3I8  reason: invalid class name */
public final class AnonymousClass3I8 {
    public final int A00;
    public final C47002cZ A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3I8) {
                AnonymousClass3I8 r5 = (AnonymousClass3I8) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A01) + this.A00;
    }

    public AnonymousClass3I8(C47002cZ r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MediaSource(message=");
        A0u.append(this.A01);
        A0u.append(", loopCount=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
