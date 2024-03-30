package androidx.compose.foundation.layout;

import X.AnonymousClass000;
import X.C006302t;
import X.C137276fs;
import X.C90474aD;
import X.C90514aH;

public final class SizeElement extends C137276fs {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final C006302t A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SizeElement) {
                SizeElement sizeElement = (SizeElement) obj;
                if (!AnonymousClass000.A1Q(Float.compare(this.A03, sizeElement.A03)) || !AnonymousClass000.A1Q(Float.compare(this.A02, sizeElement.A02)) || !AnonymousClass000.A1Q(Float.compare(this.A01, sizeElement.A01)) || !AnonymousClass000.A1Q(Float.compare(this.A00, sizeElement.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90474aD.A02(C90474aD.A02(C90474aD.A02(C90514aH.A05(this.A03), this.A02), this.A01), this.A00) + 1231;
    }

    public SizeElement(C006302t r1, float f, float f2, float f3, float f4) {
        this.A03 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A00 = f4;
        this.A04 = r1;
    }
}
