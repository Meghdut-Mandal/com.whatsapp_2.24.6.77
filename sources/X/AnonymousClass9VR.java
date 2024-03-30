package X;

import java.util.List;

/* renamed from: X.9VR  reason: invalid class name */
public final class AnonymousClass9VR {
    public final AnonymousClass9VS A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9VR) {
                AnonymousClass9VR r5 = (AnonymousClass9VR) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36391kE.A0A(this.A01));
    }

    public AnonymousClass9VR(AnonymousClass9VS r1, List list) {
        this.A01 = list;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CatalogCollectionsPage(collections=");
        A0u.append(this.A01);
        A0u.append(", pageInfo=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
