package X;

/* renamed from: X.5Jo  reason: invalid class name and case insensitive filesystem */
public final class C106405Jo extends C132056Ry {
    public final int A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C106405Jo) {
                C106405Jo r5 = (C106405Jo) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A0H(this.A01) * 31) + this.A00;
    }

    public C106405Jo(Object obj, int i) {
        super(obj, i);
        this.A01 = obj;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessSearchItem(value=");
        A0u.append(this.A01);
        A0u.append(", viewType=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
