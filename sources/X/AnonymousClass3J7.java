package X;

/* renamed from: X.3J7  reason: invalid class name */
public final class AnonymousClass3J7 {
    public final AnonymousClass3IM A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3J7) {
                AnonymousClass3J7 r5 = (AnonymousClass3J7) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((C36341k9.A09(this.A02) * 31) + C36341k9.A09(this.A01)) * 31) + C36411kG.A09(this.A00);
    }

    public AnonymousClass3J7(AnonymousClass3IM r1, String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EventLocation(name=");
        A0u.append(this.A02);
        A0u.append(", address=");
        A0u.append(this.A01);
        A0u.append(", locationPoint=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
