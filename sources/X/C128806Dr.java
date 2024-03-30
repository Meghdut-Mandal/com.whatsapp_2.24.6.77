package X;

import java.util.Arrays;

/* renamed from: X.6Dr  reason: invalid class name and case insensitive filesystem */
public final class C128806Dr {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04 = true;
    public boolean A05;
    public float[] A06;
    public float[] A07;
    public float[] A08;
    public float[] A09;

    public C128806Dr(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, int i, int i2, int i3, int i4, boolean z) {
        this.A00 = i;
        this.A01 = i2;
        this.A05 = z;
        this.A03 = i3;
        this.A02 = i4;
        this.A09 = fArr;
        this.A07 = fArr2;
        this.A08 = fArr3;
        this.A06 = fArr4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128806Dr) {
                C128806Dr r5 = (C128806Dr) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A05 == r5.A05 && this.A03 == r5.A03 && this.A02 == r5.A02 && AnonymousClass00C.A0J(this.A09, r5.A09) && AnonymousClass00C.A0J(this.A07, r5.A07) && AnonymousClass00C.A0J(this.A08, r5.A08) && AnonymousClass00C.A0J(this.A06, r5.A06))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((this.A00 * 31) + this.A01) * 31) + 1231) * 31) + C36341k9.A01(1)) * 31) + C36341k9.A01(this.A05 ? 1 : 0)) * 31) + 1237) * 31) + 1237) * 31) + this.A03) * 31) + this.A02) * 31) + Arrays.hashCode(this.A09)) * 31) + Arrays.hashCode(this.A07)) * 31) + Arrays.hashCode(this.A08)) * 31) + Arrays.hashCode(this.A06)) * 31 * 31;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RenderParameters(colorTransfer=");
        A0u.append(this.A00);
        A0u.append(", outputColorTransfer=");
        A0u.append(this.A01);
        C90484aE.A1K(A0u, ", isClearEnabled=");
        A0u.append(", isDisplayEnabled=");
        A0u.append(true);
        A0u.append(", isOpaque=");
        A0u.append(this.A05);
        C90474aD.A1N(A0u, ", isTransparent=");
        C90474aD.A1N(A0u, ", isBlendEnabled=");
        A0u.append(", outputViewportWidth=");
        A0u.append(this.A03);
        A0u.append(", outputViewportHeight=");
        A0u.append(this.A02);
        A0u.append(", textureTransformMatrix=");
        A0u.append(Arrays.toString(this.A09));
        A0u.append(", cropTransformMatrix=");
        A0u.append(Arrays.toString(this.A07));
        A0u.append(", inContentTransformMatrix=");
        A0u.append(Arrays.toString(this.A08));
        A0u.append(", contentTransformMatrix=");
        A0u.append(Arrays.toString(this.A06));
        C90474aD.A1M(A0u, ", hdrMetadata=");
        A0u.append(", backgroundRenderer=");
        return AnonymousClass000.A0m((Object) null, A0u);
    }
}
