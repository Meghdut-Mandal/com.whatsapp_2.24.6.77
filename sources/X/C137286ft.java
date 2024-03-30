package X;

/* renamed from: X.6ft  reason: invalid class name and case insensitive filesystem */
public final class C137286ft implements C161267mT {
    public final C161267mT A00;
    public final C161267mT A01;

    public /* synthetic */ C161267mT Bva(C161267mT r2) {
        return AnonymousClass5WL.A00(this, r2);
    }

    public boolean B0v(C006302t r3) {
        if (!this.A01.B0v(r3) || !this.A00.B0v(r3)) {
            return false;
        }
        return true;
    }

    public Object B7V(Object obj, C009003v r4) {
        return this.A00.B7V(this.A01.B7V(obj, r4), r4);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C137286ft) {
            C137286ft r3 = (C137286ft) obj;
            if (!AnonymousClass00C.A0J(this.A01, r3.A01) || !AnonymousClass00C.A0J(this.A00, r3.A00)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.A01.hashCode() + C36391kE.A0A(this.A00);
    }

    public C137286ft(C161267mT r1, C161267mT r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append('[');
        A0u.append((String) B7V("", AnonymousClass7ZJ.A00));
        return AnonymousClass000.A0t(A0u, ']');
    }
}
