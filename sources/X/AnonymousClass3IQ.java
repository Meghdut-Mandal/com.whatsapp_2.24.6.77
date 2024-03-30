package X;

/* renamed from: X.3IQ  reason: invalid class name */
public final class AnonymousClass3IQ {
    public final AnonymousClass34G A00;
    public final AnonymousClass141 A01;

    public AnonymousClass3IQ(AnonymousClass34G r2, AnonymousClass141 r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IQ) {
                AnonymousClass3IQ r5 = (AnonymousClass3IQ) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36391kE.A0A(this.A01));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GroupParticipantContactAndName(contact=");
        A0u.append(this.A01);
        A0u.append(", displayNameAndType=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
