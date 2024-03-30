package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass5RU;
import X.C137276fs;
import X.C157497dd;
import X.C160257ki;
import X.C160557lC;
import X.C161157mH;
import X.C161437mu;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36401kF;

public final class ScrollableElement extends C137276fs {
    public final C160257ki A00;
    public final C161157mH A01;
    public final C157497dd A02;
    public final AnonymousClass5RU A03;
    public final C160557lC A04;
    public final C161437mu A05;
    public final boolean A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ScrollableElement) {
                ScrollableElement scrollableElement = (ScrollableElement) obj;
                if (!AnonymousClass00C.A0J(this.A04, scrollableElement.A04) || this.A03 != scrollableElement.A03 || !AnonymousClass00C.A0J(this.A00, scrollableElement.A00) || this.A06 != scrollableElement.A06 || this.A07 != scrollableElement.A07 || !AnonymousClass00C.A0J(this.A02, scrollableElement.A02) || !AnonymousClass00C.A0J(this.A05, scrollableElement.A05) || !AnonymousClass00C.A0J(this.A01, scrollableElement.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A052 = (((((C36351kA.A05(this.A00, C36351kA.A05(this.A03, C36391kE.A0A(this.A04))) + C36341k9.A01(this.A06 ? 1 : 0)) * 31) + C36341k9.A01(this.A07 ? 1 : 0)) * 31) + AnonymousClass000.A0J(this.A02)) * 31;
        C161437mu r0 = this.A05;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return C36401kF.A02(this.A01, (A052 + i) * 31);
    }

    public ScrollableElement(C160257ki r1, C161157mH r2, C157497dd r3, AnonymousClass5RU r4, C160557lC r5, C161437mu r6, boolean z, boolean z2) {
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = r1;
        this.A06 = z;
        this.A07 = z2;
        this.A02 = r3;
        this.A05 = r6;
        this.A01 = r2;
    }
}
