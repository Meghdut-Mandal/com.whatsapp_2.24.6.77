package X;

/* renamed from: X.6Az  reason: invalid class name and case insensitive filesystem */
public final class C128126Az {
    public final AnonymousClass6XK A00;
    public final AnonymousClass7fI A01;
    public final AnonymousClass65X A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128126Az) {
                C128126Az r5 = (C128126Az) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36351kA.A05(this.A02, C36391kE.A0A(this.A01)));
    }

    public C128126Az(AnonymousClass6XK r1, AnonymousClass7fI r2, AnonymousClass65X r3) {
        C36321k7.A0x(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BloksTreeManagerModification(target=");
        A0u.append(this.A01);
        A0u.append(", updateOperation=");
        A0u.append(this.A02);
        A0u.append(", parseResult=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
