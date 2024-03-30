package X;

/* renamed from: X.0UL  reason: invalid class name */
public final class AnonymousClass0UL {
    public final Object A00;
    public final String A01;

    public AnonymousClass0UL(Object obj, String str) {
        this.A00 = obj;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0UL) {
                AnonymousClass0UL r5 = (AnonymousClass0UL) obj;
                if (this.A00 != r5.A00 || !this.A01.equals(r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (System.identityHashCode(this.A00) * 31) + this.A01.hashCode();
    }
}
