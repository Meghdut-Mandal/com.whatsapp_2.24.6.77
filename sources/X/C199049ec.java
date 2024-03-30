package X;

import android.graphics.PointF;

/* renamed from: X.9ec  reason: invalid class name and case insensitive filesystem */
public class C199049ec {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public PointF A07;
    public PointF A08;
    public Integer A09;
    public String A0A;
    public String A0B;
    public boolean A0C;

    public int hashCode() {
        return C36321k7.A00((long) Float.floatToRawIntBits(this.A01), ((((((int) (((float) C36381kD.A08(this.A0A, C36421kH.A04(this.A0B))) + this.A02)) * 31) + this.A09.intValue()) * 31) + this.A06) * 31) + this.A04;
    }

    public C199049ec(PointF pointF, PointF pointF2, Integer num, String str, String str2, float f, float f2, float f3, float f4, int i, int i2, int i3, boolean z) {
        this.A0B = str;
        this.A0A = str2;
        this.A02 = f;
        this.A09 = num;
        this.A06 = i;
        this.A01 = f2;
        this.A00 = f3;
        this.A04 = i2;
        this.A05 = i3;
        this.A03 = f4;
        this.A0C = z;
        this.A07 = pointF;
        this.A08 = pointF2;
    }

    public C199049ec() {
    }
}
