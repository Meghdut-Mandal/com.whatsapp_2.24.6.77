package X;

/* renamed from: X.2MK  reason: invalid class name */
public final class AnonymousClass2MK extends C588731j {
    public final C51522nx A00;
    public final AnonymousClass2bT A01;
    public final C52292pC A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2MK(C51522nx r2, AnonymousClass2bT r3, C52292pC r4) {
        super(C51532ny.EVENT);
        AnonymousClass00C.A0D(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2MK) {
                AnonymousClass2MK r5 = (AnonymousClass2MK) obj;
                if (!(AnonymousClass00C.A0J(this.A01, r5.A01) && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A00, C36391kE.A0A(this.A01)) + AnonymousClass000.A0H(this.A02);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EventItem(message=");
        A0u.append(this.A01);
        A0u.append(", eventType=");
        A0u.append(this.A00);
        A0u.append(", responseStatus=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
