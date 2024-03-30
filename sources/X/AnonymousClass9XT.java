package X;

/* renamed from: X.9XT  reason: invalid class name */
public final class AnonymousClass9XT {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass00T A04 = C36431kI.A1I(new C22202AiP(this));
    public final AnonymousClass00T A05 = C36431kI.A1I(new C22203AiQ(this));
    public final AnonymousClass00T A06 = C36431kI.A1I(new C22204AiR(this));
    public final AnonymousClass00T A07 = C36431kI.A1I(new C22205AiS(this));
    public final AnonymousClass00T A08 = C36431kI.A1I(new C22206AiT(this));
    public final boolean A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9XT) {
                AnonymousClass9XT r5 = (AnonymousClass9XT) obj;
                if (!(this.A03 == r5.A03 && this.A02 == r5.A02 && this.A09 == r5.A09 && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((this.A03 * 31) + this.A02) * 31) + C36341k9.A01(this.A09 ? 1 : 0)) * 31) + this.A00) * 31) + this.A01;
    }

    public AnonymousClass9XT(boolean z, int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A02 = i2;
        this.A09 = z;
        this.A00 = i3;
        this.A01 = i4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CameraProcessorProperties(originalWidth=");
        A0u.append(this.A03);
        A0u.append(", originalHeight=");
        A0u.append(this.A02);
        A0u.append(", isFrontFacing=");
        A0u.append(this.A09);
        A0u.append(", cameraOrientationDegrees=");
        A0u.append(this.A00);
        A0u.append(", deviceOrientationDegrees=");
        return C36321k7.A0G(A0u, this.A01);
    }
}
