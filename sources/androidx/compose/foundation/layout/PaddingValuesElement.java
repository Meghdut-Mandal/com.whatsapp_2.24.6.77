package androidx.compose.foundation.layout;

import X.AnonymousClass00C;
import X.C006302t;
import X.C137276fs;
import X.C156907b9;

public final class PaddingValuesElement extends C137276fs {
    public final C156907b9 A00;
    public final C006302t A01;

    public boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement;
        if (!(obj instanceof PaddingValuesElement) || (paddingValuesElement = (PaddingValuesElement) obj) == null) {
            return false;
        }
        return AnonymousClass00C.A0J(this.A00, paddingValuesElement.A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public PaddingValuesElement(C156907b9 r1, C006302t r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
