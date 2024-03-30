package androidx.compose.ui.draw;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.C114365h6;
import X.C128906Eb;
import X.C137276fs;
import X.C161187mL;
import X.C36351kA;
import X.C36391kE;
import X.C90474aD;
import X.C90484aE;
import androidx.compose.ui.Alignment;

public final class PainterElement extends C137276fs {
    public final float A00;
    public final Alignment A01;
    public final C114365h6 A02;
    public final C128906Eb A03;
    public final C161187mL A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PainterElement) {
                PainterElement painterElement = (PainterElement) obj;
                if (!AnonymousClass00C.A0J(this.A03, painterElement.A03) || !AnonymousClass00C.A0J(this.A01, painterElement.A01) || !AnonymousClass00C.A0J(this.A04, painterElement.A04) || Float.compare(this.A00, painterElement.A00) != 0 || !AnonymousClass00C.A0J(this.A02, painterElement.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90474aD.A02(C36351kA.A05(this.A04, C36351kA.A05(this.A01, (C36391kE.A0A(this.A03) + 1231) * 31)), this.A00) + AnonymousClass000.A0H(this.A02);
    }

    public PainterElement(Alignment alignment, C114365h6 r2, C128906Eb r3, C161187mL r4, float f) {
        this.A03 = r3;
        this.A01 = alignment;
        this.A04 = r4;
        this.A00 = f;
        this.A02 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PainterElement(painter=");
        A0u.append(this.A03);
        C90484aE.A1K(A0u, ", sizeToIntrinsics=");
        A0u.append(", alignment=");
        A0u.append(this.A01);
        A0u.append(", contentScale=");
        A0u.append(this.A04);
        A0u.append(", alpha=");
        A0u.append(this.A00);
        A0u.append(", colorFilter=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
