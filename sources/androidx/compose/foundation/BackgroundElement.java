package androidx.compose.foundation;

import X.AnonymousClass00C;
import X.C006302t;
import X.C133336Xx;
import X.C137276fs;
import X.C157657dt;
import X.C36401kF;
import X.C90464aC;
import X.C90474aD;

public final class BackgroundElement extends C137276fs {
    public final long A00;
    public final C157657dt A01;
    public final C006302t A02;

    public boolean equals(Object obj) {
        BackgroundElement backgroundElement;
        if (obj instanceof BackgroundElement) {
            backgroundElement = (BackgroundElement) obj;
        } else {
            backgroundElement = null;
        }
        if (backgroundElement == null) {
            return false;
        }
        long j = this.A00;
        long j2 = backgroundElement.A00;
        long j3 = C133336Xx.A01;
        if (j != j2 || !AnonymousClass00C.A0J(this.A01, backgroundElement.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        long j2 = C133336Xx.A01;
        return C36401kF.A02(this.A01, C90474aD.A02(C90464aC.A08(j) * 31, 1.0f));
    }

    public BackgroundElement(C157657dt r1, C006302t r2, long j) {
        this.A00 = j;
        this.A01 = r1;
        this.A02 = r2;
    }
}
