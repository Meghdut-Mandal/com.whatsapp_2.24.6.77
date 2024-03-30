package androidx.car.app.model;

import X.AnonymousClass000;
import X.C165587tf;
import X.C165597tg;
import X.C22751AvM;
import X.C22752AvN;
import X.C36361kB;
import X.C90474aD;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class ItemList {
    public final List mItems = Collections.emptyList();
    public final CarText mNoItemsMessage = null;
    public final C22751AvM mOnItemVisibilityChangedDelegate = null;
    public final C22752AvN mOnSelectedDelegate = null;
    public final int mSelectedIndex = 0;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemList)) {
            return false;
        }
        ItemList itemList = (ItemList) obj;
        return this.mSelectedIndex == itemList.mSelectedIndex && Objects.equals(this.mItems, itemList.mItems) && C165597tg.A1S(Boolean.valueOf(AnonymousClass000.A1W(this.mOnSelectedDelegate)), AnonymousClass000.A1W(itemList.mOnSelectedDelegate)) && C165597tg.A1S(Boolean.valueOf(AnonymousClass000.A1W(this.mOnItemVisibilityChangedDelegate)), AnonymousClass000.A1W(itemList.mOnItemVisibilityChangedDelegate)) && Objects.equals(this.mNoItemsMessage, itemList.mNoItemsMessage);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        boolean A1b = C36361kB.A1b(objArr, this.mSelectedIndex);
        objArr[1] = this.mItems;
        C165587tf.A1X(objArr, AnonymousClass000.A1W(this.mOnSelectedDelegate));
        if (this.mOnItemVisibilityChangedDelegate == null) {
            A1b = true;
        }
        AnonymousClass000.A1N(objArr, 3, A1b);
        return C165597tg.A06(this.mNoItemsMessage, objArr, 4);
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ items: ");
        List list = this.mItems;
        if (list != null) {
            str = list.toString();
        } else {
            str = null;
        }
        A0u.append(str);
        A0u.append(", selected: ");
        A0u.append(this.mSelectedIndex);
        return C90474aD.A0g(A0u);
    }
}
