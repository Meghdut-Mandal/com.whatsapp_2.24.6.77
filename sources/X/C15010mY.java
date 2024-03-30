package X;

/* renamed from: X.0mY  reason: invalid class name and case insensitive filesystem */
public final class C15010mY extends C10990fY implements C17160qp {
    public boolean equals(Object obj) {
        if (!(obj instanceof C15010mY)) {
            return false;
        }
        char c = this.A01;
        if ((AnonymousClass00C.A00(65, c) <= 0 || AnonymousClass00C.A00(65, ((C10990fY) obj).A01) <= 0) && c != ((C10990fY) obj).A01) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        char c = this.A01;
        int i = 2015 + c;
        if (AnonymousClass00C.A00(65, c) > 0) {
            return -1;
        }
        return i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append('A');
        A0u.append("..");
        return AnonymousClass000.A0t(A0u, this.A01);
    }

    public /* bridge */ /* synthetic */ Comparable BBY() {
        throw null;
    }

    public /* bridge */ /* synthetic */ Comparable BHr() {
        throw null;
    }
}
