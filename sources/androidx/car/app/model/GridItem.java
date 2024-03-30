package androidx.car.app.model;

import X.AnonymousClass000;
import X.C165597tg;
import X.C22747AvI;
import X.C36341k9;
import X.C90474aD;
import java.util.Objects;

public final class GridItem {
    public final CarIcon mImage = null;
    public final int mImageType = 2;
    public final boolean mIsLoading = false;
    public final C22747AvI mOnClickDelegate = null;
    public final CarText mText = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridItem)) {
            return false;
        }
        GridItem gridItem = (GridItem) obj;
        return this.mIsLoading == gridItem.mIsLoading && Objects.equals(this.mTitle, gridItem.mTitle) && Objects.equals(this.mText, gridItem.mText) && Objects.equals(this.mImage, gridItem.mImage) && C165597tg.A1S(Boolean.valueOf(AnonymousClass000.A1W(this.mOnClickDelegate)), AnonymousClass000.A1W(gridItem.mOnClickDelegate)) && this.mImageType == gridItem.mImageType;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        boolean z = false;
        objArr[0] = Boolean.valueOf(this.mIsLoading);
        objArr[1] = this.mTitle;
        objArr[2] = this.mImage;
        C36341k9.A1T(objArr, this.mImageType);
        if (this.mOnClickDelegate == null) {
            z = true;
        }
        return C165597tg.A06(Boolean.valueOf(z), objArr, 4);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[title: ");
        C165597tg.A14(this.mTitle, A0u);
        A0u.append(", text: ");
        C165597tg.A14(this.mText, A0u);
        A0u.append(", image: ");
        A0u.append(this.mImage);
        A0u.append(", isLoading: ");
        A0u.append(this.mIsLoading);
        return C90474aD.A0g(A0u);
    }
}
