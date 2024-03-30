package androidx.compose.foundation.layout;

import X.AnonymousClass000;
import X.C137276fs;
import X.C90514aH;

public final class UnspecifiedConstraintsElement extends C137276fs {
    public final float A00;
    public final float A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        if (!AnonymousClass000.A1Q(Float.compare(this.A01, unspecifiedConstraintsElement.A01)) || !AnonymousClass000.A1Q(Float.compare(this.A00, unspecifiedConstraintsElement.A00))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90514aH.A0C(C90514aH.A05(this.A01), this.A00);
    }

    public UnspecifiedConstraintsElement(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }
}
