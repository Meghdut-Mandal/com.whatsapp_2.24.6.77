package X;

/* renamed from: X.6PK  reason: invalid class name */
public final class AnonymousClass6PK {
    public final float A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6PK) {
                AnonymousClass6PK r5 = (AnonymousClass6PK) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && Float.compare(this.A00, r5.A00) == 0 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90474aD.A02(((C36341k9.A01(this.A02 ? 1 : 0) * 31) + this.A01) * 31, this.A00) + C36341k9.A01(this.A03 ? 1 : 0);
    }

    public AnonymousClass6PK(float f, int i, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = i;
        this.A00 = f;
        this.A03 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CallTooltipInternalState(isPictureInPicture=");
        A0u.append(this.A02);
        A0u.append(", deviceOrientation=");
        A0u.append(this.A01);
        A0u.append(", bottomSheetSlideRatio=");
        A0u.append(this.A00);
        A0u.append(", isScreenShareButtonVisibleAndEnabled=");
        return C36321k7.A0H(A0u, this.A03);
    }

    public AnonymousClass6PK() {
        this(0.0f, 0, false, false);
    }
}
