package androidx.compose.ui.semantics;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.C006302t;
import X.C137276fs;
import X.C161617nC;
import X.C36341k9;
import X.C36401kF;

public final class AppendedSemanticsElement extends C137276fs implements C161617nC {
    public final C006302t A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AppendedSemanticsElement) {
                AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
                if (this.A01 != appendedSemanticsElement.A01 || !AnonymousClass00C.A0J(this.A00, appendedSemanticsElement.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36341k9.A01(this.A01 ? 1 : 0) * 31);
    }

    public AppendedSemanticsElement(C006302t r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AppendedSemanticsElement(mergeDescendants=");
        A0u.append(this.A01);
        A0u.append(", properties=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
