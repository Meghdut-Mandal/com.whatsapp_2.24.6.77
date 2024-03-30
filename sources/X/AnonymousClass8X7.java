package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.8X7  reason: invalid class name */
public final class AnonymousClass8X7 extends AnonymousClass9EQ {
    public final List A00;
    public final Map A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8X7(List list, Map map) {
        super(list);
        AnonymousClass00C.A0D(list, 1);
        this.A00 = list;
        this.A01 = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8X7) {
                AnonymousClass8X7 r5 = (AnonymousClass8X7) obj;
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

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CategoryGroupsWithLoadingChildItems(catalogCategoryGroups=");
        A0u.append(this.A00);
        A0u.append(", parentCategoryToChildItemMap=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
