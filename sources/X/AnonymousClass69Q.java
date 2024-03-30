package X;

/* renamed from: X.69Q  reason: invalid class name */
public final class AnonymousClass69Q {
    public final AnonymousClass66B A00;
    public final C128756Dm A01;

    public AnonymousClass69Q(AnonymousClass66B r2, C128756Dm r3) {
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass69Q) {
                AnonymousClass69Q r5 = (AnonymousClass69Q) obj;
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
        A0u.append("PendingResponse(queryDefinition=");
        A0u.append(this.A01);
        A0u.append(", response=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
