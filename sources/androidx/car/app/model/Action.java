package androidx.car.app.model;

import X.AnonymousClass000;
import X.C165587tf;
import X.C165597tg;
import X.C22747AvI;
import X.C90474aD;
import java.util.Objects;

public final class Action {
    public static final Action A00 = new Action(65538);
    public static final Action A01 = new Action(65539);
    public static final Action A02 = new Action(65540);
    public final CarColor mBackgroundColor;
    public final int mFlags;
    public final CarIcon mIcon;
    public final boolean mIsEnabled;
    public final C22747AvI mOnClickDelegate;
    public final CarText mTitle;
    public final int mType;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return Objects.equals(this.mTitle, action.mTitle) && this.mType == action.mType && Objects.equals(this.mIcon, action.mIcon) && C165597tg.A1S(Boolean.valueOf(AnonymousClass000.A1W(this.mOnClickDelegate)), AnonymousClass000.A1W(action.mOnClickDelegate)) && Objects.equals(Integer.valueOf(this.mFlags), Integer.valueOf(action.mFlags)) && this.mIsEnabled == action.mIsEnabled;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        boolean z = false;
        objArr[0] = this.mTitle;
        AnonymousClass000.A1K(objArr, this.mType);
        C165587tf.A1X(objArr, AnonymousClass000.A1W(this.mOnClickDelegate));
        if (this.mIcon == null) {
            z = true;
        }
        AnonymousClass000.A1N(objArr, 3, z);
        AnonymousClass000.A1N(objArr, 4, this.mIsEnabled);
        return Objects.hash(objArr);
    }

    public Action(int i) {
        this.mTitle = null;
        this.mIcon = null;
        this.mBackgroundColor = CarColor.A00;
        this.mOnClickDelegate = null;
        this.mType = i;
        this.mFlags = 0;
        this.mIsEnabled = true;
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[type: ");
        int i = this.mType;
        if (i != 1) {
            switch (i) {
                case 65538:
                    str = "APP_ICON";
                    break;
                case 65539:
                    str = "BACK";
                    break;
                case 65540:
                    str = "PAN";
                    break;
                default:
                    str = "<unknown>";
                    break;
            }
        } else {
            str = "CUSTOM";
        }
        A0u.append(str);
        A0u.append(", icon: ");
        A0u.append(this.mIcon);
        A0u.append(", bkg: ");
        A0u.append(this.mBackgroundColor);
        A0u.append(", isEnabled: ");
        A0u.append(this.mIsEnabled);
        return C90474aD.A0g(A0u);
    }

    public Action() {
        this.mTitle = null;
        this.mIcon = null;
        this.mBackgroundColor = CarColor.A00;
        this.mOnClickDelegate = null;
        this.mType = 1;
        this.mFlags = 0;
        this.mIsEnabled = true;
    }
}
