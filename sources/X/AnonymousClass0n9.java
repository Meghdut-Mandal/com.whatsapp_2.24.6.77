package X;

/* renamed from: X.0n9  reason: invalid class name */
public final class AnonymousClass0n9 extends C06340Tf {
    public final Throwable A00;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass0n9) || !AnonymousClass00C.A0J(this.A00, ((AnonymousClass0n9) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0J(this.A00);
    }

    public AnonymousClass0n9(Throwable th) {
        this.A00 = th;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Closed(");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
