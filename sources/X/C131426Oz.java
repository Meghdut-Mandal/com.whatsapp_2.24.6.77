package X;

import java.util.List;

/* renamed from: X.6Oz  reason: invalid class name and case insensitive filesystem */
public final class C131426Oz {
    public final C135016bz A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C131426Oz) {
                C131426Oz r5 = (C131426Oz) obj;
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

    public C131426Oz(C135016bz r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SERPMapViewResult(mapviewConfig=");
        A0u.append(this.A00);
        A0u.append(", mapBusinesses=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }

    public C131426Oz() {
        this((C135016bz) null, C023409w.A00);
    }
}
