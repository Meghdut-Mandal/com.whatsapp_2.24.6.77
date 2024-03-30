package androidx.compose.foundation.text.modifiers;

import X.AnonymousClass00C;
import X.AnonymousClass6V8;
import X.C137276fs;
import X.C157027bi;
import X.C36341k9;
import X.C36351kA;
import X.C36421kH;

public final class TextStringSimpleElement extends C137276fs {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass6V8 A03;
    public final C157027bi A04;
    public final String A05;
    public final boolean A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextStringSimpleElement) {
                TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
                if (!(AnonymousClass00C.A0J(this.A05, textStringSimpleElement.A05) && AnonymousClass00C.A0J(this.A03, textStringSimpleElement.A03) && AnonymousClass00C.A0J(this.A04, textStringSimpleElement.A04) && this.A02 == textStringSimpleElement.A02 && this.A06 == textStringSimpleElement.A06 && this.A00 == textStringSimpleElement.A00 && this.A01 == textStringSimpleElement.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((C36351kA.A05(this.A04, C36351kA.A05(this.A03, C36421kH.A04(this.A05))) + this.A02) * 31) + C36341k9.A01(this.A06 ? 1 : 0)) * 31) + this.A00) * 31) + this.A01) * 31;
    }

    public TextStringSimpleElement(AnonymousClass6V8 r1, C157027bi r2, String str, int i, int i2, int i3, boolean z) {
        this.A05 = str;
        this.A03 = r1;
        this.A04 = r2;
        this.A02 = i;
        this.A06 = z;
        this.A00 = i2;
        this.A01 = i3;
    }
}
