package androidx.compose.foundation.layout;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass72X;
import X.C006302t;
import X.C137276fs;
import X.C90474aD;
import X.C90514aH;

public final class PaddingElement extends C137276fs {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public final C006302t A04;

    public boolean equals(Object obj) {
        PaddingElement paddingElement;
        if (obj instanceof PaddingElement) {
            paddingElement = (PaddingElement) obj;
        } else {
            paddingElement = null;
        }
        if (paddingElement == null || !AnonymousClass000.A1Q(Float.compare(this.A02, paddingElement.A02)) || !AnonymousClass000.A1Q(Float.compare(this.A03, paddingElement.A03)) || !AnonymousClass000.A1Q(Float.compare(this.A01, paddingElement.A01)) || !AnonymousClass000.A1Q(Float.compare(this.A00, paddingElement.A00))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90474aD.A02(C90474aD.A02(C90474aD.A02(C90514aH.A05(this.A02), this.A03), this.A01), this.A00) + 1231;
    }

    public PaddingElement(C006302t r3, float f, float f2, float f3, float f4) {
        this.A02 = f;
        this.A03 = f2;
        this.A01 = f3;
        this.A00 = f4;
        this.A04 = r3;
        if ((f < 0.0f && !AnonymousClass72X.A01(f)) || ((f2 < 0.0f && !AnonymousClass72X.A01(f2)) || ((f3 < 0.0f && !AnonymousClass72X.A01(f3)) || (f4 < 0.0f && !AnonymousClass72X.A01(f4))))) {
            throw AnonymousClass001.A08("Padding must be non-negative");
        }
    }
}
