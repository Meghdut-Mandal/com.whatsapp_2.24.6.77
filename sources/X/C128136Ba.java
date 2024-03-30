package X;

/* renamed from: X.6Ba  reason: invalid class name and case insensitive filesystem */
public final class C128136Ba {
    public final AnonymousClass5SN A00;
    public final Object A01;
    public final Exception A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128136Ba) {
                C128136Ba r5 = (C128136Ba) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36391kE.A0A(this.A00) + AnonymousClass000.A0H(this.A01)) * 31) + C36411kG.A09(this.A02);
    }

    public C128136Ba(AnonymousClass5SN r1, Exception exc, Object obj) {
        this.A00 = r1;
        this.A01 = obj;
        this.A02 = exc;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Resource(status=");
        A0u.append(this.A00);
        A0u.append(", data=");
        A0u.append(this.A01);
        A0u.append(", error=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
