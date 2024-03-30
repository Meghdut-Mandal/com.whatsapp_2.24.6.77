package X;

import java.util.List;

/* renamed from: X.5EJ  reason: invalid class name */
public final class AnonymousClass5EJ extends AnonymousClass5EQ {
    public final AnonymousClass6QG A00;
    public final C116805lE A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5EJ) {
                AnonymousClass5EJ r5 = (AnonymousClass5EJ) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36351kA.A05(this.A02, C36391kE.A0A(this.A00)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5EJ(AnonymousClass6QG r2, C116805lE r3, List list) {
        super(46);
        C36321k7.A0y(r2, r3);
        this.A00 = r2;
        this.A02 = list;
        this.A01 = r3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NearbyBusinessWidgetListItemData(searchLocation=");
        A0u.append(this.A00);
        A0u.append(", businessProfiles=");
        A0u.append(this.A02);
        A0u.append(", nearbyBusinessClickListener=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
