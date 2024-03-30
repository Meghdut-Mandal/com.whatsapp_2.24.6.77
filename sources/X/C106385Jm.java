package X;

import java.util.List;

/* renamed from: X.5Jm  reason: invalid class name and case insensitive filesystem */
public final class C106385Jm extends C132056Ry {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C106385Jm) && AnonymousClass00C.A0J(this.A00, ((C106385Jm) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C106385Jm(List list) {
        super(C36381kD.A0m(), 44);
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PopularBusinessesListItem(data=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
