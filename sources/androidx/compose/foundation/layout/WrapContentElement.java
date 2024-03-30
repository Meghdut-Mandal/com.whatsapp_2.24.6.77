package androidx.compose.foundation.layout;

import X.AnonymousClass00C;
import X.C009003v;
import X.C137276fs;
import X.C36401kF;

public final class WrapContentElement extends C137276fs {
    public final Integer A00;
    public final C009003v A01;
    public final Object A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                WrapContentElement wrapContentElement = (WrapContentElement) obj;
                if (this.A00 != wrapContentElement.A00 || !AnonymousClass00C.A0J(this.A02, wrapContentElement.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
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
        return C36401kF.A02(this.A02, (((str.hashCode() + intValue) * 31) + 1237) * 31);
    }

    public WrapContentElement(Integer num, Object obj, C009003v r3) {
        this.A00 = num;
        this.A01 = r3;
        this.A02 = obj;
    }
}
