package androidx.compose.foundation;

import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass68P;
import X.C137276fs;
import X.C161437mu;
import X.C36341k9;
import X.C36391kE;
import X.C36401kF;

public final class ClickableElement extends C137276fs {
    public final C161437mu A00;
    public final AnonymousClass68P A01;
    public final String A02;
    public final AnonymousClass00S A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                ClickableElement clickableElement = (ClickableElement) obj;
                if (!AnonymousClass00C.A0J(this.A00, clickableElement.A00) || this.A04 != clickableElement.A04 || !AnonymousClass00C.A0J(this.A02, clickableElement.A02) || !AnonymousClass00C.A0J(this.A01, clickableElement.A01) || !AnonymousClass00C.A0J(this.A03, clickableElement.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int A0A = (C36391kE.A0A(this.A00) + C36341k9.A01(this.A04 ? 1 : 0)) * 31;
        String str = this.A02;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (A0A + i) * 31;
        AnonymousClass68P r0 = this.A01;
        if (r0 != null) {
            i2 = r0.A00;
        }
        return C36401kF.A02(this.A03, (i3 + i2) * 31);
    }

    public ClickableElement(C161437mu r1, AnonymousClass68P r2, String str, AnonymousClass00S r4, boolean z) {
        this.A00 = r1;
        this.A04 = z;
        this.A02 = str;
        this.A01 = r2;
        this.A03 = r4;
    }
}
