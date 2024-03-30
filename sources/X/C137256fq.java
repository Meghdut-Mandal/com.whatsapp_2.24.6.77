package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.6fq  reason: invalid class name and case insensitive filesystem */
public final class C137256fq implements Alignment {
    public final float A00;
    public final float A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C137256fq) {
                C137256fq r5 = (C137256fq) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public long B0u(AnonymousClass5RW r7, long j, long j2) {
        float f;
        float f2 = ((float) (((int) (j2 >> 32)) - ((int) (j >> 32)))) / 2.0f;
        float f3 = ((float) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) / 2.0f;
        if (r7 == AnonymousClass5RW.Ltr) {
            f = this.A00;
        } else {
            f = ((float) -1) * this.A00;
        }
        float f4 = (float) 1;
        return C90484aE.A0J(C14960mT.A01(f2 * (f + f4)), C14960mT.A01(f3 * (f4 + this.A01)));
    }

    public int hashCode() {
        return C90514aH.A0C(C90514aH.A05(this.A00), this.A01);
    }

    public C137256fq(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BiasAlignment(horizontalBias=");
        A0u.append(this.A00);
        A0u.append(", verticalBias=");
        return C90464aC.A0g(A0u, this.A01);
    }
}
