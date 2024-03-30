package androidx.car.app.model;

import X.AnonymousClass000;
import X.C165597tg;
import X.C90474aD;
import java.util.Objects;

public final class Tab {
    public final String mContentId = "EMPTY_TAB_CONTENT_ID";
    public final CarIcon mIcon = null;
    public final boolean mIsActive = false;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tab)) {
            return false;
        }
        Tab tab = (Tab) obj;
        return Objects.equals(this.mTitle, tab.mTitle) && Objects.equals(this.mContentId, tab.mContentId) && Objects.equals(this.mIcon, tab.mIcon) && this.mIsActive == tab.mIsActive;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.mTitle;
        objArr[1] = this.mContentId;
        objArr[2] = this.mIcon;
        return C165597tg.A06(Boolean.valueOf(this.mIsActive), objArr, 3);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[title: ");
        C165597tg.A14(this.mTitle, A0u);
        A0u.append(", contentId: ");
        A0u.append(this.mContentId);
        A0u.append(", icon: ");
        A0u.append(this.mIcon);
        A0u.append(", isActive ");
        A0u.append(this.mIsActive);
        return C90474aD.A0g(A0u);
    }
}
