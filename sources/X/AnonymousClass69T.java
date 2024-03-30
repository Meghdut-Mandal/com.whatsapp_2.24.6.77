package X;

/* renamed from: X.69T  reason: invalid class name */
public final class AnonymousClass69T {
    public final C128126Az A00;
    public final AnonymousClass69S A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass69T) {
                AnonymousClass69T r5 = (AnonymousClass69T) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, AnonymousClass000.A0H(this.A00) * 31);
    }

    public AnonymousClass69T(C128126Az r1, AnonymousClass69S r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BloksTreeUpdateOperation(treeModification=");
        A0u.append(this.A00);
        A0u.append(", variableUpdate=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
