package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.8X6  reason: invalid class name */
public final class AnonymousClass8X6 extends AnonymousClass9EQ {
    public final List A00;
    public final Map A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8X6) {
                AnonymousClass8X6 r5 = (AnonymousClass8X6) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36391kE.A0A(this.A00));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8X6(List list, Map map) {
        super(list);
        C36321k7.A0x(list, map);
        this.A00 = list;
        this.A01 = map;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CategoryGroupsWithChildItems(catalogCategoryGroups=");
        A0u.append(this.A00);
        A0u.append(", parentCategoryToChildItemMap=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
