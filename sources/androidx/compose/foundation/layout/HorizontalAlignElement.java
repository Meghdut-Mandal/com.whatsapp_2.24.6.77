package androidx.compose.foundation.layout;

import X.AnonymousClass00C;
import X.C137276fs;
import X.C157627dq;

public final class HorizontalAlignElement extends C137276fs {
    public final C157627dq A00;

    public boolean equals(Object obj) {
        HorizontalAlignElement horizontalAlignElement;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalAlignElement) || (horizontalAlignElement = (HorizontalAlignElement) obj) == null) {
            return false;
        }
        return AnonymousClass00C.A0J(this.A00, horizontalAlignElement.A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public HorizontalAlignElement(C157627dq r1) {
        this.A00 = r1;
    }
}
