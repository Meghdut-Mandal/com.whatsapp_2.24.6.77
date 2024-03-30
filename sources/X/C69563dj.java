package X;

/* renamed from: X.3dj  reason: invalid class name and case insensitive filesystem */
public final class C69563dj implements C16200om {
    public final AnonymousClass6E1 A00;
    public final AnonymousClass141 A01;
    public final C1277169j A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69563dj) {
                C69563dj r5 = (C69563dj) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36351kA.A05(this.A00, C36391kE.A0A(this.A02)));
    }

    public C69563dj(AnonymousClass6E1 r1, C1277169j r2, AnonymousClass141 r3) {
        this.A02 = r2;
        this.A00 = r1;
        this.A01 = r3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SmallBot(bot=");
        A0u.append(this.A02);
        A0u.append(", botProfile=");
        A0u.append(this.A00);
        A0u.append(", waContact=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
