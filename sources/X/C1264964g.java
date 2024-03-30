package X;

/* renamed from: X.64g  reason: invalid class name and case insensitive filesystem */
public final class C1264964g {
    public float A00 = -2.14748365E9f;
    public float A01 = -2.14748365E9f;
    public float A02 = -2.14748365E9f;
    public float A03 = -2.14748365E9f;
    public float A04 = -2.14748365E9f;
    public int A05;
    public C134976bv A06;
    public C135076c5 A07;

    public static C1264964g A00(C134976bv r1, float f) {
        C1264964g r0 = new C1264964g();
        r0.A06 = r1;
        r0.A01 = f;
        return r0;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass000.A1C(this, A0u);
        A0u.append("{mLatLng=");
        A0u.append(this.A06);
        A0u.append(", mZoom=");
        A0u.append(this.A01);
        A0u.append(", mZoomBy=");
        A0u.append(this.A02);
        A0u.append(", mZoomX=");
        A0u.append(this.A03);
        A0u.append(", mZoomY=");
        A0u.append(this.A04);
        A0u.append(", mXPixel=");
        A0u.append(-2.14748365E9f);
        A0u.append(", mYPixel=");
        A0u.append(-2.14748365E9f);
        A0u.append(", mRotation = ");
        A0u.append(this.A00);
        A0u.append(", mRendererBounds=");
        A0u.append(this.A07);
        C90514aH.A1S(A0u, ", mWidth=");
        C90514aH.A1S(A0u, ", mHeight=");
        A0u.append(", mPadding=");
        A0u.append(this.A05);
        return AnonymousClass000.A0q("}", A0u);
    }
}
