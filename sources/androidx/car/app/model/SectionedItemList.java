package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165597tg;
import X.C90474aD;
import java.util.Objects;

public final class SectionedItemList {
    public final CarText mHeader = null;
    public final ItemList mItemList = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionedItemList)) {
            return false;
        }
        SectionedItemList sectionedItemList = (SectionedItemList) obj;
        return Objects.equals(this.mItemList, sectionedItemList.mItemList) && Objects.equals(this.mHeader, sectionedItemList.mHeader);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.mItemList;
        return C165597tg.A06(this.mHeader, A0M, 1);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ items: ");
        A0u.append(this.mItemList);
        A0u.append(", has header: ");
        A0u.append(AnonymousClass000.A1V(this.mHeader));
        return C90474aD.A0g(A0u);
    }
}
