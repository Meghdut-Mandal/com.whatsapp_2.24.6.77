package X;

/* renamed from: X.0iT  reason: invalid class name and case insensitive filesystem */
public final class C12670iT implements C019208e {
    public final Class A00;

    public boolean equals(Object obj) {
        if (!(obj instanceof C12670iT) || !AnonymousClass00C.A0J(this.A00, ((C12670iT) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C12670iT(Class cls) {
        this.A00 = cls;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A00.toString());
        return AnonymousClass000.A0q(" (Kotlin reflection is not available)", A0u);
    }

    public Class BDB() {
        return this.A00;
    }
}
