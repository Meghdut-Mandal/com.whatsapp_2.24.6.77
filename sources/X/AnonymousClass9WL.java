package X;

/* renamed from: X.9WL  reason: invalid class name */
public final class AnonymousClass9WL {
    public final C188138z6 A00;
    public final C188208zD A01;
    public final Throwable A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9WL) {
                AnonymousClass9WL r5 = (AnonymousClass9WL) obj;
                if (!(this.A00 == r5.A00 && AnonymousClass00C.A0J(this.A02, r5.A02) && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36351kA.A05(this.A02, C36391kE.A0A(this.A00)));
    }

    public AnonymousClass9WL(C188138z6 r1, C188208zD r2, Throwable th) {
        this.A00 = r1;
        this.A02 = th;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CreatePasskeyClientError(kind=");
        A0u.append(this.A00);
        A0u.append(", throwable=");
        A0u.append(this.A02);
        A0u.append(", suggestedRemedy=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
