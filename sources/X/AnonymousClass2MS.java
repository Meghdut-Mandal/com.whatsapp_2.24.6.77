package X;

/* renamed from: X.2MS  reason: invalid class name */
public final class AnonymousClass2MS extends C588831k {
    public final AnonymousClass2bT A00;
    public final C51282nZ A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2MS(AnonymousClass2bT r2, C51282nZ r3) {
        super(C51862oV.EVENT_NAME_AND_DESCRIPTION);
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2MS) {
                AnonymousClass2MS r5 = (AnonymousClass2MS) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || this.A01 != r5.A01) {
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
        A0u.append("EventNameAndDescription(message=");
        A0u.append(this.A00);
        A0u.append(", source=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
