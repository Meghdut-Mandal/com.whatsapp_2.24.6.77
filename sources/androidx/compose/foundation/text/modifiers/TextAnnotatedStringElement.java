package androidx.compose.foundation.text.modifiers;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass6V8;
import X.AnonymousClass72L;
import X.C006302t;
import X.C137276fs;
import X.C157027bi;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import java.util.List;

public final class TextAnnotatedStringElement extends C137276fs {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass72L A03;
    public final AnonymousClass6V8 A04;
    public final C157027bi A05;
    public final List A06;
    public final C006302t A07;
    public final C006302t A08;
    public final boolean A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextAnnotatedStringElement) {
                TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
                if (!AnonymousClass00C.A0J(this.A03, textAnnotatedStringElement.A03) || !AnonymousClass00C.A0J(this.A04, textAnnotatedStringElement.A04) || !AnonymousClass00C.A0J(this.A06, textAnnotatedStringElement.A06) || !AnonymousClass00C.A0J(this.A05, textAnnotatedStringElement.A05) || !AnonymousClass00C.A0J(this.A08, textAnnotatedStringElement.A08) || this.A02 != textAnnotatedStringElement.A02 || this.A09 != textAnnotatedStringElement.A09 || this.A00 != textAnnotatedStringElement.A00 || this.A01 != textAnnotatedStringElement.A01 || !AnonymousClass00C.A0J(this.A07, textAnnotatedStringElement.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((C36351kA.A05(this.A05, C36351kA.A05(this.A04, C36391kE.A0A(this.A03))) + AnonymousClass000.A0J(this.A08)) * 31) + this.A02) * 31) + C36341k9.A01(this.A09 ? 1 : 0)) * 31) + this.A00) * 31) + this.A01) * 31) + AnonymousClass000.A0J(this.A06)) * 31) + AnonymousClass000.A0J(this.A07)) * 31 * 31;
    }

    public TextAnnotatedStringElement(AnonymousClass72L r1, AnonymousClass6V8 r2, C157027bi r3, List list, C006302t r5, C006302t r6, int i, int i2, int i3, boolean z) {
        this.A03 = r1;
        this.A04 = r2;
        this.A05 = r3;
        this.A08 = r5;
        this.A02 = i;
        this.A09 = z;
        this.A00 = i2;
        this.A01 = i3;
        this.A06 = list;
        this.A07 = r6;
    }
}
