package androidx.compose.foundation.layout;

import X.C137276fs;
import X.C90514aH;

public final class FillElement extends C137276fs {
    public final Integer A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FillElement) && this.A00 == ((FillElement) obj).A00);
    }

    public int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 0:
                str = "Vertical";
                break;
            case 1:
                str = "Horizontal";
                break;
            default:
                str = "Both";
                break;
        }
        return C90514aH.A0C((str.hashCode() + intValue) * 31, 1.0f);
    }

    public FillElement(Integer num) {
        this.A00 = num;
    }
}
