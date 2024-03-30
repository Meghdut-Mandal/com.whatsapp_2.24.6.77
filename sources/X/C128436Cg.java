package X;

import java.util.List;

/* renamed from: X.6Cg  reason: invalid class name and case insensitive filesystem */
public final class C128436Cg {
    public int A00 = 50;
    public Float A01;
    public List A02;
    public List A03;
    public boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128436Cg) {
                C128436Cg r5 = (C128436Cg) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || this.A04 != r5.A04 || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C128436Cg(Float f, List list, List list2, boolean z) {
        this.A01 = f;
        this.A03 = list;
        this.A02 = list2;
        this.A04 = z;
    }

    public int hashCode() {
        return ((C36351kA.A05(this.A02, ((AnonymousClass000.A0H(this.A01) * 31) + C36411kG.A09(this.A03)) * 31) + C36341k9.A01(this.A04 ? 1 : 0)) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ParametricSliderDataModel(sliderValue=");
        A0u.append(this.A01);
        A0u.append(", gradientColors=");
        A0u.append(this.A03);
        A0u.append(", choicePaths=");
        A0u.append(this.A02);
        A0u.append(", passSliderUpdateToBloksOnTouchUpOnly=");
        A0u.append(this.A04);
        A0u.append(", currentSliderPosition=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
