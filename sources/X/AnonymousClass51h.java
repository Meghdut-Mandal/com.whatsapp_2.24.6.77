package X;

import java.util.List;

/* renamed from: X.51h  reason: invalid class name */
public final class AnonymousClass51h extends C110225aK {
    public final List A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass51h) {
                AnonymousClass51h r5 = (AnonymousClass51h) obj;
                if (!(AnonymousClass00C.A0J(this.A00, r5.A00) && this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36391kE.A0A(this.A00) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public AnonymousClass51h(List list, boolean z, boolean z2) {
        this.A00 = list;
        this.A02 = z;
        this.A01 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Success(profiles=");
        A0u.append(this.A00);
        A0u.append(", isFetchedFromNetwork=");
        A0u.append(this.A02);
        A0u.append(", hasMoreBusinesses=");
        return C36321k7.A0H(A0u, this.A01);
    }
}
