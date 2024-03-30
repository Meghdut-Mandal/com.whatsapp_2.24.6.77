package androidx.car.app.model;

import X.C15640nk;
import X.C165577te;
import X.C165597tg;
import X.C22755AvQ;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class TabTemplate implements C15640nk {
    public final Action mHeaderAction = null;
    public final boolean mIsLoading = false;
    public final C22755AvQ mTabCallbackDelegate = null;
    public final TabContents mTabContents = null;
    public final List mTabs = Collections.emptyList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabTemplate)) {
            return false;
        }
        TabTemplate tabTemplate = (TabTemplate) obj;
        return this.mIsLoading == tabTemplate.mIsLoading && Objects.equals(this.mHeaderAction, tabTemplate.mHeaderAction) && Objects.equals(this.mTabs, tabTemplate.mTabs) && Objects.equals(this.mTabContents, tabTemplate.mTabContents);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        C165577te.A1V(objArr, this.mIsLoading);
        objArr[1] = this.mHeaderAction;
        objArr[2] = this.mTabs;
        return C165597tg.A06(this.mTabContents, objArr, 3);
    }

    public String toString() {
        return "TabTemplate";
    }
}
