package androidx.car.app.model;

import X.AnonymousClass000;
import X.C165597tg;
import X.C22747AvI;
import X.C90474aD;
import X.C90484aE;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class Row {
    public final List mActions = Collections.emptyList();
    public final CarIcon mImage = null;
    public final boolean mIsBrowsable = false;
    public final boolean mIsEnabled = true;
    public final Metadata mMetadata = Metadata.A00;
    public final int mNumericDecoration = -1;
    public final C22747AvI mOnClickDelegate = null;
    public final int mRowImageType = 1;
    public final List mTexts = Collections.emptyList();
    public final CarText mTitle = null;
    public final Toggle mToggle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Row)) {
            return false;
        }
        Row row = (Row) obj;
        return Objects.equals(this.mTitle, row.mTitle) && Objects.equals(this.mTexts, row.mTexts) && Objects.equals(this.mImage, row.mImage) && Objects.equals(this.mToggle, row.mToggle) && C165597tg.A1S(Boolean.valueOf(AnonymousClass000.A1W(this.mOnClickDelegate)), AnonymousClass000.A1W(row.mOnClickDelegate)) && Objects.equals(this.mMetadata, row.mMetadata) && this.mIsBrowsable == row.mIsBrowsable && this.mRowImageType == row.mRowImageType && this.mIsEnabled == row.mIsEnabled;
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        boolean z = false;
        objArr[0] = this.mTitle;
        objArr[1] = this.mTexts;
        objArr[2] = this.mImage;
        objArr[3] = this.mToggle;
        if (this.mOnClickDelegate == null) {
            z = true;
        }
        objArr[4] = Boolean.valueOf(z);
        objArr[5] = this.mMetadata;
        AnonymousClass000.A1N(objArr, 6, this.mIsBrowsable);
        AnonymousClass000.A1L(objArr, this.mRowImageType, 7);
        AnonymousClass000.A1N(objArr, 8, this.mIsEnabled);
        return Objects.hash(objArr);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[title: ");
        C165597tg.A14(this.mTitle, A0u);
        A0u.append(", text count: ");
        A0u.append(C90484aE.A0F(this.mTexts));
        A0u.append(", image: ");
        A0u.append(this.mImage);
        A0u.append(", isBrowsable: ");
        A0u.append(this.mIsBrowsable);
        A0u.append(", isEnabled: ");
        A0u.append(this.mIsEnabled);
        return C90474aD.A0g(A0u);
    }
}
