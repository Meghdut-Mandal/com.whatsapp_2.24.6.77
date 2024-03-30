package X;

/* renamed from: X.69U  reason: invalid class name */
public final class AnonymousClass69U {
    public final AnonymousClass66B A00;
    public final Runnable A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass69U) {
                AnonymousClass69U r5 = (AnonymousClass69U) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A0H(this.A00) * 31) + C36411kG.A09(this.A01);
    }

    public AnonymousClass69U(AnonymousClass66B r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ComponentQueryStoreResult(value=");
        A0u.append(this.A00);
        A0u.append(", cancelToken=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
